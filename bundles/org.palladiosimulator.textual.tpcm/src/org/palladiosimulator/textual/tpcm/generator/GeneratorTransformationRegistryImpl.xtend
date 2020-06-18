package org.palladiosimulator.textual.tpcm.generator

import java.util.List
import java.util.ArrayList
import java.util.Map
import java.util.HashMap
import java.util.function.Consumer
import java.util.Objects

class GeneratorTransformationRegistryImpl implements GeneratorTransformationRegistry {
    
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
            if(!(other instanceof MappedObjectKey)) {
                return false;
            }
            val otherKey = other as MappedObjectKey;
            return otherKey.objectId == this.objectId && (this.targetType !== null ? this.targetType == otherKey.targetType : otherKey.targetType === null);
        }
        
        override int hashCode() {
            return Objects.hash(this.targetType, this.objectId);
        }
    }
    
    final List<Registration<?, ?>> registrations = new ArrayList
    final Map<MappedObjectKey, Object> mappedObjects = new HashMap

    override map(Object source) {
        return map(source, null)
    }

    override withContext(List<ProvidedMapping> provided, Runnable runnable) {
        mappedObjects.clear()
        provided.forEach [
            val referenceId = System.identityHashCode(it.sourceObject)
            val key = new MappedObjectKey(null, referenceId)
            mappedObjects.put(key, it.targetObject)
        ]
        runnable.run()
        mappedObjects.clear()
    }
    
    override <S,T> configure(Class<S> source, Class<T> target, Consumer<RegistrationConfigurer<S, T>> mapping) {
        val registration = new Registration(source, target);
        mapping.accept(new RegistrationConfigurerImpl(registration))
        registrations.add(registration);
    }
    
    override <S,T> map(S source, Class<T> target) {
        val referenceId = System.identityHashCode(source)
        val key = new MappedObjectKey(target, referenceId)
        if (mappedObjects.containsKey(key)) {
            return mappedObjects.get(key) as T
        }

        val Registration<S,T> reg = registrations.findFirst[it.doesMap(source, target)] as Registration<S,T>
        if(reg === null) {
            throw new RuntimeException("Couldn't find a mapping for " + source.class.simpleName + " to " + target?.simpleName);
        }
        val mapped = reg.applyTo(source, this)
        mappedObjects.put(key, mapped)
        return mapped as T
    }

}