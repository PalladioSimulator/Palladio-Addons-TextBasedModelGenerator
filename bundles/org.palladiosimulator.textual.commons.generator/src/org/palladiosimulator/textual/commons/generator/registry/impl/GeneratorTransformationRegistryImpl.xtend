package org.palladiosimulator.textual.commons.generator.registry.impl

import java.util.ArrayList
import java.util.Collection
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.Objects
import java.util.function.Consumer
import java.util.stream.Collectors
import com.google.inject.Inject
import org.palladiosimulator.textual.commons.generator.registry.GeneratorRuleRegistrationFacade
import org.palladiosimulator.textual.commons.generator.registry.GeneratorRulesRegistrationDelegate
import org.palladiosimulator.textual.commons.generator.registry.GeneratorTransformationRegistry
import org.palladiosimulator.textual.commons.generator.registry.ProvidedMapping
import org.palladiosimulator.textual.commons.generator.rules.ExecutableRule
import org.palladiosimulator.textual.commons.generator.rules.GeneratorRuleBuilder
import org.palladiosimulator.textual.commons.generator.rules.impl.GeneratorRuleBuilderImpl
import org.palladiosimulator.textual.commons.generator.rules.impl.Registration
import org.palladiosimulator.textual.commons.generator.MultiModelGeneratorFragmentCollector

class GeneratorTransformationRegistryImpl implements GeneratorTransformationRegistry, GeneratorRuleRegistrationFacade {

    /**
     * Defines a key that identifies a mapped object. This key contains the source object id
     * as well as the type it was mapped to. Thus, if an object is mapped to two or more 
     * different types, this uniquely identifies the mapped objects by that target type.
     */
    private static class MappedObjectKey {
        final Class<?> targetType;
        final int objectId;

        new(Class<?> targetType, int id) {
            this.targetType = targetType;
            this.objectId = id;
        }

        override boolean equals(Object other) {
            if (!(other instanceof MappedObjectKey)) {
                return false;
            }
            val otherKey = other as MappedObjectKey;
            return otherKey.objectId == this.objectId &&
                (this.targetType !== null ? this.targetType == otherKey.targetType : otherKey.targetType === null);
        }

        override int hashCode() {
            return Objects.hash(this.targetType, this.objectId);
        }
    }

    final List<ExecutableRule<?, ?>> rules = new ArrayList
    final Map<MappedObjectKey, Object> mappedObjects = new HashMap
    
    @Inject
    new (MultiModelGeneratorFragmentCollector providerCollector) {
        providerCollector.generatorFragments.map[rulesRegistrationDelegate].forEach[doRegistration(this)]
    }

    override map(Object source) {
        return map(source, null)
    }

    override withContext(Runnable runnable) {
        this.withContext(new ArrayList<ProvidedMapping>(), runnable);
    }

    override withContext(Collection<ProvidedMapping> provided, Runnable runnable) {
        mappedObjects.clear()
        provided.forEach [
            val referenceId = System.identityHashCode(it.sourceObject)
            val key = new MappedObjectKey(it.targetObject.class.interfaces.get(0), referenceId)
            mappedObjects.put(key, it.targetObject)
        ]
        runnable.run()
        mappedObjects.clear()
    }

    override <S, T> configure(Class<S> source, Class<T> target, Consumer<GeneratorRuleBuilder<S, T>> mapping) {
        val builder = new GeneratorRuleBuilderImpl(source, target);
        mapping.accept(builder)
        
        val rule = builder.build

        if (rules.exists [it.conflictsWith(rule)]){
            throw new IllegalStateException(
                '''Trying to register duplicated transformation for «source.simpleName» to «target.simpleName»''');
        }

        rules.add(rule);
    }

    override <S, T> map(S source, Class<T> target) {
        val referenceId = System.identityHashCode(source)
        val key = new MappedObjectKey(target, referenceId)
        if (mappedObjects.containsKey(key)) {
            return mappedObjects.get(key) as T
        } else if (target === null) {
            val existing = mappedObjects.entrySet.stream.filter [ it.key.objectId == referenceId ].collect(Collectors.toList)
            if(existing.size == 1) {
                return existing.get(0).value as T
            }
        }

        val List<Registration<S, T>> possibleRegistrations = rules.filter[it.appliesTo(source, target)].map [
            it as Registration<S, T>
        ].toList
        if (possibleRegistrations.size == 0) {
            throw new RuntimeException("Couldn't find a mapping for " + source.class.simpleName + " to " +
                target?.simpleName);
        }

        if (possibleRegistrations.size > 1) {
            throw new IllegalStateException("Found multiple matching transformations for " + source.class.simpleName);
        }

        val registrationToApply = possibleRegistrations.get(0)
        val targetMapped = registrationToApply.create(source)
        mappedObjects.put(key, targetMapped)
        registrationToApply.applyTo(source, targetMapped, this)
        return targetMapped
    }

}
