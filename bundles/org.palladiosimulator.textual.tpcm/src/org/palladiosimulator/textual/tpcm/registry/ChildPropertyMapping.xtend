package org.palladiosimulator.textual.tpcm.registry

interface ChildPropertyMapping<S, OT> {
    def void run(S element, OT mappedParent, GeneratorTransformationRegistry registry)
}