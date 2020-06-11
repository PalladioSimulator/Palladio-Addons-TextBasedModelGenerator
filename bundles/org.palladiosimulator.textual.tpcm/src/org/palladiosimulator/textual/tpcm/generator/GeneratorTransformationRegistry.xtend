package org.palladiosimulator.textual.tpcm.generator

import java.util.function.Consumer

interface GeneratorTransformationRegistry {
    def <S, T> void configure(Class<S> source, Class<T> target, Consumer<RegistrationConfigurer<S, T>> mapping);

    def <S, T> T map(S source);
    
    def <S,T> T map(S source, Class<T> target);

    def void withContext(Runnable runnable);
}
