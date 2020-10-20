package org.palladiosimulator.textual.commons.generator.rules.impl

import java.util.List
import java.util.function.Consumer
import java.util.function.Function
import java.util.function.Predicate
import org.palladiosimulator.textual.commons.generator.rules.GeneratorRuleBuilder

class GeneratorRuleBuilderImpl<S, T> implements GeneratorRuleBuilder<S, T> {

    final Registration<S, T> registration;

    new(Class<S> source, Class<T> target) {
        registration = new Registration(source, target);
    }

    override <PS, PT> map(Function<S, PS> contentProvider) {
        return new SingleValueApplierRule<PS, PT, S, T>(contentProvider, registration);
    }

    override <PS, PT> mapAll(Function<S, ? extends List<PS>> contentProvider) {
        return new ListValueApplierRule<PS, PT, S, T>(contentProvider, registration);
    }

    override setCreate(Function<S, T> factory) {
        registration.factory = factory;
    }

    override setWhen(Predicate<S> guard) {
        registration.predicate = guard;
    }
    
    override <PS,PT> map(Function<S, PS> contentProvider, Class<PT> target) {
        return new SingleValueApplierRule<PS, PT, S, T>(contentProvider, target, registration);
    }
    
    override <PS,PT> mapAll(Function<S, ? extends List<PS>> contentProvider, Class<PT> target) {
        return new ListValueApplierRule<PS, PT, S, T>(contentProvider, target, registration);
    }
    
    override setAfter(Consumer<T> callback) {
        registration.callback = callback
    }
    
    override build() {
        if(!registration.hasFactory) {
            throw new IllegalStateException("No factory was configured for a transformation.")
        } else registration
    }

}