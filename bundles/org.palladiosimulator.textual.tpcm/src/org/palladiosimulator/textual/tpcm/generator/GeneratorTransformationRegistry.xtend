package org.palladiosimulator.textual.tpcm.generator

import java.util.function.Consumer
import java.util.List
import java.util.ArrayList

interface GeneratorTransformationRegistry {
    
    GeneratorTransformationRegistry INSTANCE = new GeneratorTransformationRegistryImpl;
    
    def <S, T> void configure(Class<S> source, Class<T> target, Consumer<RegistrationConfigurer<S, T>> mapping);

    def <S, T> T map(S source);
    
    def <S,T> T map(S source, Class<T> target);

    def void withContext(Runnable runnable) {
        withContext(new ArrayList<ProvidedMapping>(), runnable);
    }
    
    def void withContext(List<ProvidedMapping> contextElements, Runnable runnable);
}
