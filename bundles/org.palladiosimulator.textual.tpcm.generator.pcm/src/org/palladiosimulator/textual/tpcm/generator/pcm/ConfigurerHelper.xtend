package org.palladiosimulator.textual.tpcm.generator.pcm

import org.palladiosimulator.pcm.core.entity.NamedElement
import org.eclipse.emf.ecore.EObject
import org.palladiosimulator.textual.tpcm.language.Initialization

class ConfigurerHelper {
    static def boolean hasEmptyName(NamedElement entity) {
        return entity.entityName === null || entity.entityName.isEmpty || entity.entityName == "aName"
    }
    
    static def EObject getInitPropertyExpression(Initialization init, String propertyName) {
        val prop = init?.contents?.findFirst[it.property.name == propertyName]
        return prop?.specification ?: prop?.referencedElement
    }
}
