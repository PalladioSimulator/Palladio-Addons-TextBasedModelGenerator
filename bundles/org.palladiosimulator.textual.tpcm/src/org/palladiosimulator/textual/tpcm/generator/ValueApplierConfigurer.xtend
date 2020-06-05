package org.palladiosimulator.textual.tpcm.generator

import java.util.function.BiConsumer
import java.util.function.Function
import java.util.List

interface ValueApplierConfigurer<T, OT> {
    def void thenSet(BiConsumer<OT, T> apply);
}

class SingleValueApplierConfigurer<S, T, OS, OT> implements ValueApplierConfigurer<T, OT> {

    final Function<OS, S> applier;
    final Registration<OS, OT> registration;
    final Class<T> specifiedTarget;

    new(Function<OS, S> setterOnTarget, Registration<OS, OT> regi) {
        this(setterOnTarget, null, regi)
    }
    
    new(Function<OS, S> setterOnTarget, Class<T> target, Registration<OS, OT> regi) {
        applier = setterOnTarget;
        specifiedTarget = target;
        registration = regi;
    }

    override thenSet(BiConsumer<OT, T> apply) {
        registration.addPropertyMapping(new SingleValueChildPropertyApplier(applier, specifiedTarget, apply))
    }

}

class ListValueApplierConfigurer<S, T, OS, OT> implements ValueApplierConfigurer<List<T>, OT> {

    final Function<OS, ? extends List<S>> provider;
    final Registration<OS, OT> registration;
    final Class<T> specifiedTarget;

    new(Function<OS, ? extends List<S>> targetType, Registration<OS, OT> regi) {
        this(targetType, null, regi)
    }
    
    new(Function<OS, ? extends List<S>> targetType, Class<T> target, Registration<OS, OT> regi) {
        provider = targetType;
        specifiedTarget = target;
        registration = regi;
    }

    override thenSet(BiConsumer<OT, List<T>> apply) {
        registration.addPropertyMapping(new ListValueChildPropertyApplier(provider, specifiedTarget, apply))
    }

}