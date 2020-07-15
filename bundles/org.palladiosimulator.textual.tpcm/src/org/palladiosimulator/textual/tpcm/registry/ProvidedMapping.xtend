package org.palladiosimulator.textual.tpcm.registry

import org.eclipse.emf.ecore.EObject

class ProvidedMapping {
    final EObject sourceObject;
    final EObject targetObject;
    
    new(EObject source, EObject target) {
        sourceObject = source;
        targetObject = target;
    }
    
    def EObject getSourceObject() {
        return sourceObject;
    }
    
    def EObject getTargetObject() {
        return targetObject;
    }
}