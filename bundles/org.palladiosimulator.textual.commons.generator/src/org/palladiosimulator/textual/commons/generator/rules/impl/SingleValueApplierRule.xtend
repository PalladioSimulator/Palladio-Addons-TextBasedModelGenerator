package org.palladiosimulator.textual.commons.generator.rules.impl

import java.util.function.BiConsumer
import java.util.function.Function
import org.palladiosimulator.textual.commons.generator.registry.impl.SingleValueChildPropertyApplier
import org.palladiosimulator.textual.commons.generator.rules.ValueApplierRule

class SingleValueApplierRule<S, T, OS, OT> implements ValueApplierRule<T, OT> {

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