package org.palladiosimulator.textual.tpcm.registry

import java.util.function.Function
import java.util.List
import java.util.function.Predicate
import java.util.function.Consumer

class RegistrationConfigurerImpl<S, T> implements RegistrationConfigurer<S, T> {

    final Registration<S, T> registration;

    new(Registration<S, T> reg) {
        registration = reg;
    }

    override <PS, PT> map(Function<S, PS> contentProvider) {
        return new SingleValueApplierConfigurer<PS, PT, S, T>(contentProvider, registration);
    }

    override <PS, PT> mapAll(Function<S, ? extends List<PS>> contentProvider) {
        return new ListValueApplierConfigurer<PS, PT, S, T>(contentProvider, registration);
    }

    override setCreate(Function<S, T> factory) {
        registration.factory = factory;
    }

    override setWhen(Predicate<S> guard) {
        registration.predicate = guard;
    }
    
    override <PS,PT> map(Function<S, PS> contentProvider, Class<PT> target) {
        return new SingleValueApplierConfigurer<PS, PT, S, T>(contentProvider, target, registration);
    }
    
    override <PS,PT> mapAll(Function<S, ? extends List<PS>> contentProvider, Class<PT> target) {
        return new ListValueApplierConfigurer<PS, PT, S, T>(contentProvider, target, registration);
    }
    
    override setAfter(Consumer<T> callback) {
        registration.callback = callback
    }

}