package org.palladiosimulator.textual.tpcm.generator

import java.util.function.Function
import java.util.List
import java.util.function.Predicate

interface RegistrationConfigurer<S, T> {
    def <PS, PT> ValueApplierConfigurer<PT, T> map(Function<S, PS> contentProvider, Class<PT> target);
    
    def <PS, PT> ValueApplierConfigurer<PT, T> map(Function<S, PS> contentProvider);

    def <PS, PT> ValueApplierConfigurer<List<PT>, T> mapAll(Function<S, ? extends List<PS>> contentProvider);
   
    def <PS, PT> ValueApplierConfigurer<List<PT>, T> mapAll(Function<S, ? extends List<PS>> contentProvider, Class<PT> target);

    def void setCreate(Function<S, T> factory);

    def void setWhen(Predicate<S> guard);
}

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

}