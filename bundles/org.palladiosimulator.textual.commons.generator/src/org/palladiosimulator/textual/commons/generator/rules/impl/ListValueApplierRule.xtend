package org.palladiosimulator.textual.commons.generator.rules.impl

import java.util.List
import java.util.function.BiConsumer
import java.util.function.Function
import org.palladiosimulator.textual.commons.generator.registry.impl.ListValueChildPropertyApplier
import org.palladiosimulator.textual.commons.generator.rules.ValueApplierRule

class ListValueApplierRule<S, T, OS, OT> implements ValueApplierRule<List<T>, OT> {

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