package org.palladiosimulator.textual.tpcm.generator

interface ChildPropertyMapping<S, OT> {
    def void run(S element, OT mappedParent, GeneratorTransformationRegistry registry)
}