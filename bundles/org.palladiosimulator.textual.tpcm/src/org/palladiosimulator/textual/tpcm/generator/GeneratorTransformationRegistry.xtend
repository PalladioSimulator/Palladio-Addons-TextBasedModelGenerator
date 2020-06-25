package org.palladiosimulator.textual.tpcm.generator

import java.util.function.Consumer
import java.util.List

interface GeneratorTransformationRegistry {
    
    GeneratorTransformationRegistry INSTANCE = new GeneratorTransformationRegistryImpl;
    
    /**
     * Defines a new transformation from source to target.
     * 
     * @param source The source type
     * @param target The target type
     * @param mapping A callback that configures this transformation.
     * 
     * @see RegistrationConfigurer how to configure the registration
     */
    def <S, T> void configure(Class<S> source, Class<T> target, Consumer<RegistrationConfigurer<S, T>> mapping);

    /**
     * Executes a transformation on the given object. This will use the first matching transformation that
     * was configured using configure().
     * 
     * @param source The object to transform
     * @return The result of the transformation
     */
    def <S, T> T map(S source);
    
    /**
     * Executes a transformation on the given object. This, in comparison to map(S), makes sure that the type of
     * the target is the provided type. This is necessary if there are two transformations configured for the same 
     * source but with different targets.
     * 
     * @param source The object to transform
     * @param target The specific type of the target
     * @return The result of the transformation
     */
    def <S,T> T map(S source, Class<T> target);

    /**
     * Creates a context in which one can run multiple transformations. Inside this context, transformed objects
     * will be cached and reused. Once a context is over, this cache will be emptied, thus resulting in new objects
     * being created.
     * 
     * @param runnable Callback for running the transformations
     */
    def void withContext(Runnable runnable);
    
    /**
     * Creates a context in which one can run multiple transformations. Inside this context, transformed objects
     * will be cached and reused. Once a context is over, this cache will be emptied, thus resulting in new objects
     * being created.
     * Additionally, this allows for providing a set of already finished transformations that will be inserted into 
     * the cache. This can be used to inject predefined references to objects for given objects. Similarly, these 
     * will also be cleared once the context is over.
     *
     * @param contextElements Predefined set of transformations that should be inserted into the context 
     * @param runnable Callback for running the transformations
     */
    def void withContext(List<ProvidedMapping> contextElements, Runnable runnable);
}
