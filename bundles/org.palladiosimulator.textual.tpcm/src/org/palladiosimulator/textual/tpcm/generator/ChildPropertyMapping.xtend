package org.palladiosimulator.textual.tpcm.generator

import java.util.function.Function
import java.util.function.BiConsumer
import java.util.List

interface ChildPropertyMapping<S, OT> {
    def void run(S element, OT mappedParent, GeneratorTransformationRegistry registry)
}

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
        applier.accept(mappedParent, mappedObject)
    }
}

class ListValueChildPropertyApplier<S, T, OS, OT> implements ChildPropertyMapping<OS, OT> {
    final Function<OS, ? extends List<S>> provider;
    final BiConsumer<OT, List<T>> applier;
    final Class<T> requiredType;

    new(Function<OS, ? extends List<S>> provider, Class<T> type, BiConsumer<OT, List<T>> applier) {
        this.provider = provider;
        this.applier = applier;
        requiredType = type;
    }

    override run(OS element, OT mappedParent, GeneratorTransformationRegistry registry) {
        val providedObject = provider.apply(element)
        val mappedObject = providedObject.map[registry.map(it, requiredType)]
        applier.accept(mappedParent, mappedObject)
    }
}
