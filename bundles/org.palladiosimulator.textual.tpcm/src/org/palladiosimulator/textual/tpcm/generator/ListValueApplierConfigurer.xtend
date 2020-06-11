package org.palladiosimulator.textual.tpcm.generator

import java.util.List
import java.util.function.Function
import java.util.function.BiConsumer

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