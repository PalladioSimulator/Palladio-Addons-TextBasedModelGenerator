package org.palladiosimulator.textual.tpcm.generator

import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.function.Consumer

interface GeneratorTransformationRegistry {
    def <S, T> void configure(Class<S> source, Class<T> target, Consumer<RegistrationConfigurer<S, T>> mapping);

    def <S, T> T map(S source);
    
    def <S,T> T map(S source, Class<T> target);

    def void withContext(Runnable runnable);
}

class GeneratorTransformationRegistryImpl implements GeneratorTransformationRegistry {

    private List<Registration<?, ?>> registrations = new ArrayList
    private Map<Integer, Object> mappedObjects = new HashMap

    override map(Object source) {
        return map(source, null)
    }

    override withContext(Runnable runnable) {
        mappedObjects.clear()
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
        if (mappedObjects.containsKey(referenceId)) {
            // TODO this does not play well with allowing to map the same source to multiple types.
            // Thus probably needs a more complicated key
            return mappedObjects.get(referenceId) as T
        }

        val Registration<S,T> reg = registrations.findFirst[it.doesMap(source, target)] as Registration<S,T>
        if(reg === null) {
            throw new RuntimeException("Couldn't find a mapping for " + source.class.simpleName + " to " + target?.simpleName);
        }
        val mapped = reg.applyTo(source, this)
        mappedObjects.put(referenceId, mapped)
        return mapped as T
    }

}
