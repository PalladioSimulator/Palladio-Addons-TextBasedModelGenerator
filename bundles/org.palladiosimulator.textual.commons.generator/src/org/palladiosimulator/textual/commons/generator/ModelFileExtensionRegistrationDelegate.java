package org.palladiosimulator.textual.commons.generator;

@FunctionalInterface
public interface ModelFileExtensionRegistrationDelegate {
    
    void doFileRegistration(ModelFileExtensionRegistrationFacade facade);

}
