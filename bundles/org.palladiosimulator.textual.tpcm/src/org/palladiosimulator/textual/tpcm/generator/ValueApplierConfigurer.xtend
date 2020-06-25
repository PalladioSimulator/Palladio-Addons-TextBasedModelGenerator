package org.palladiosimulator.textual.tpcm.generator

import java.util.function.BiConsumer

interface ValueApplierConfigurer<T, OT> {
    /**
     * Define how to set the transformed element(s) on the target object.
     * This gets the target element, on which these should be set, as a first parameter and
     * the object(s) to set as the second.
     */
    def void thenSet(BiConsumer<OT, T> apply);
}

