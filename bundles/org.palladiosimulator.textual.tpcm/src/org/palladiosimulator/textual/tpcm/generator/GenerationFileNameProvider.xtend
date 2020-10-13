package org.palladiosimulator.textual.tpcm.generator

import org.palladiosimulator.textual.tpcm.language.Fragment

interface GenerationFileNameProvider {
    def String generateFileNameFor(Fragment resource, String originalFileName);
}