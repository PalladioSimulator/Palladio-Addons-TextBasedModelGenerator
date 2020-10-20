package org.palladiosimulator.textual.commons.generator;

import org.eclipse.emf.ecore.EObject;

public interface ModelFileExtensionRegistry {
    
    String getModelFileExtension(EObject rootElement);

}
