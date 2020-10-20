package org.palladiosimulator.textual.commons.generator.rules;

import org.palladiosimulator.textual.commons.generator.registry.GeneratorTransformationRegistry;

public interface ExecutableRule<S, T> {

    void applyTo(S source, T target, GeneratorTransformationRegistry registry);
    
    boolean appliesTo(Object instance, Class<?> target);
    
    <U, V> boolean conflictsWith(ExecutableRule<U, V> conflictCandidate);

}
