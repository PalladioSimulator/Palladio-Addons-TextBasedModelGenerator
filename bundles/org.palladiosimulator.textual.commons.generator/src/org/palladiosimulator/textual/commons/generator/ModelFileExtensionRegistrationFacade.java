package org.palladiosimulator.textual.commons.generator;

import org.eclipse.emf.ecore.EClassifier;

public interface ModelFileExtensionRegistrationFacade {
    
    void registerFileExtension(EClassifier clazz, String fileExtension);

}
