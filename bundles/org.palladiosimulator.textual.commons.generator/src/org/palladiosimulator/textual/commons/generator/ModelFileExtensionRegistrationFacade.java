package org.palladiosimulator.textual.commons.generator;

import org.eclipse.emf.ecore.EClass;

public interface ModelFileExtensionRegistrationFacade {
    
    void registerFileExtension(EClass clazz, String fileExtension);

}
