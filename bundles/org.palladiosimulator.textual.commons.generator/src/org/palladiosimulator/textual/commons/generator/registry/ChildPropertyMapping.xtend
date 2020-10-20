package org.palladiosimulator.textual.commons.generator.registry

interface ChildPropertyMapping<S, OT> {
    def void run(S element, OT mappedParent, GeneratorTransformationRegistry registry)
}