package org.palladiosimulator.textual.tpcm.registry

import java.util.function.Function
import java.util.function.BiConsumer

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