package org.palladiosimulator.textual.tpcm.generator

import java.util.ArrayList
import java.util.function.Function
import java.util.function.Predicate
import java.util.List
import java.util.function.Consumer

class Registration<S, T> {
    final Class<S> mappingSource;
    final Class<T> mappingTarget;
    Function<S, T> factory;
    Predicate<S> predicate = [true];
    Consumer<T> callback = [];
    final List<ChildPropertyMapping<S, T>> contents = new ArrayList;

    new(Class<S> source, Class<T> target, Function<S, T> factory) {
        this(source, target)
        this.factory = factory;
    }

    new(Class<S> source, Class<T> target) {
        this.mappingSource = source;
        this.mappingTarget = target;
    }

    def boolean doesMap(Object instance) {
        return mappingSource.isAssignableFrom(instance.class) && predicate.test(mappingSource.cast(instance));
    }
    
    def boolean doesMap(Object instance, Class<?> target) {
        return (target === null || mappingTarget === target) && doesMap(instance);
    }

    def T create(S source) {
        return factory.apply(source);
    }

    def addPropertyMapping(ChildPropertyMapping<S, T> mapping) {
        contents.add(mapping)
    }

    def setPredicate(Predicate<S> pred) {
        predicate = pred;
    }

    def setFactory(Function<S, T> factory) {
        this.factory = factory;
    }
    
    def setCallback(Consumer<T> callback) {
        this.callback = callback
    }

    def T applyTo(S source, GeneratorTransformationRegistry registry) {
        val target = create(source)
        contents.forEach [
            it.run(source, target, registry)
        ]
        callback.accept(target)
        return target
    }
}