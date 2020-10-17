package org.palladiosimulator.textual.tpcm.generator.pcm;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.textual.commons.generator.ModelFileExtensionRegistrationDelegate;
import org.palladiosimulator.textual.commons.generator.ModelFileExtensionRegistrationFacade;
import org.palladiosimulator.textual.tpcm.language.LanguagePackage;

public class TCPMModelFileExtensionRegistrationDelegate implements ModelFileExtensionRegistrationDelegate {

    @Override
    public void doFileRegistration(ModelFileExtensionRegistrationFacade facade) {
        collectFileExtensions().entrySet()
            .forEach(e -> facade.registerFileExtension(e.getKey(), e.getValue()));
    }

    Map<EClass, String> collectFileExtensions() {
        return Map.of(LanguagePackage.eINSTANCE.getRepository(), "repository",
                LanguagePackage.eINSTANCE.getResourceTypeRepository(), "resourcerepository",
                LanguagePackage.eINSTANCE.getSystem(), "system", 
                LanguagePackage.eINSTANCE.getUsage(), "usagemodel",
                LanguagePackage.eINSTANCE.getAllocation(), "allocation",
                LanguagePackage.eINSTANCE.getResourceEnvironment(), "resourceenvironment");
    }

}
