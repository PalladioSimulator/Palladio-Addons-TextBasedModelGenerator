package org.palladiosimulator.textual.commons.generator.registry.impl

import java.util.function.Function
import java.util.List
import java.util.function.BiConsumer
import org.palladiosimulator.textual.commons.generator.registry.ChildPropertyMapping
import org.palladiosimulator.textual.commons.generator.registry.GeneratorTransformationRegistry

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
