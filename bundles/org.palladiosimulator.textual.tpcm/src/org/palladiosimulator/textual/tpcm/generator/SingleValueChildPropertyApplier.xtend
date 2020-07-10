package org.palladiosimulator.textual.tpcm.generator

import java.util.function.Function
import java.util.function.BiConsumer

class SingleValueChildPropertyApplier<S, T, OS, OT> implements ChildPropertyMapping<OS, OT> {
    final Function<OS, S> provider;
    final BiConsumer<OT, T> applier;
    final Class<T> requiredType;

    new(Function<OS, S> provider, Class<T> target, BiConsumer<OT, T> applier) {
        this.provider = provider;
        this.applier = applier;
        requiredType = target;
    }

    override run(OS element, OT mappedParent, GeneratorTransformationRegistry registry) {
        val providedObject = provider.apply(element)
        val mappedObject = if (providedObject !== null) {
                registry.map(providedObject, requiredType)
            } else {
                null
            }
        if (mappedObject !== null) {
            applier.accept(mappedParent, mappedObject)
        }
    }
}
