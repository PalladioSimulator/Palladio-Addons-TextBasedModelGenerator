package org.palladiosimulator.textual.commons.generator.registry;

import java.util.function.Consumer;

import org.palladiosimulator.textual.commons.generator.rules.GeneratorRuleBuilder;

public interface GeneratorRuleRegistrationFacade {
    /**
     * Defines a new transformation from source to target.
     * 
     * @param source The source type
     * @param target The target type
     * @param mapping A callback that configures this transformation.
     * 
     * @see GeneratorRuleBuilder how to configure the registration
     */
    <S, T> void configure(Class<S> source, Class<T> target, Consumer<GeneratorRuleBuilder<S, T>> mapping);
}
