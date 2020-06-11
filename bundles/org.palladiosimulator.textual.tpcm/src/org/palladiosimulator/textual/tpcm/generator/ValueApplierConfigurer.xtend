package org.palladiosimulator.textual.tpcm.generator

import java.util.function.BiConsumer

interface ValueApplierConfigurer<T, OT> {
    def void thenSet(BiConsumer<OT, T> apply);
}

