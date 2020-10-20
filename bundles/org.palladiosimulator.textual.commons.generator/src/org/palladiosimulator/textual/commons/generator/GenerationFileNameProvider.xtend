package org.palladiosimulator.textual.commons.generator

import com.google.inject.ImplementedBy
import org.eclipse.emf.ecore.EObject
import org.palladiosimulator.textual.commons.generator.impl.GenerationFileNameProviderImpl

@ImplementedBy(GenerationFileNameProviderImpl)
interface GenerationFileNameProvider {
    def String generateFileNameFor(EObject resource, String originalFileName);
}