package org.palladiosimulator.textual.tpcm.generator

import java.util.function.Function
import java.util.List
import java.util.function.Predicate
import java.util.function.Consumer

interface RegistrationConfigurer<S, T> {
    def <PS, PT> ValueApplierConfigurer<PT, T> map(Function<S, PS> contentProvider, Class<PT> target);
    
    def <PS, PT> ValueApplierConfigurer<PT, T> map(Function<S, PS> contentProvider);

    def <PS, PT> ValueApplierConfigurer<List<PT>, T> mapAll(Function<S, ? extends List<PS>> contentProvider);
   
    def <PS, PT> ValueApplierConfigurer<List<PT>, T> mapAll(Function<S, ? extends List<PS>> contentProvider, Class<PT> target);

    def void setCreate(Function<S, T> factory);

    def void setWhen(Predicate<S> guard);
    
    def void setAfter(Consumer<T> callback);
}