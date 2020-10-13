package org.palladiosimulator.textual.commons.generator.impl;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.textual.commons.generator.ModelFileExtensionRegistrationFacade;
import org.palladiosimulator.textual.commons.generator.ModelFileExtensionRegistry;

public class ModelFileExtensionRegistryImpl
        implements ModelFileExtensionRegistrationFacade, ModelFileExtensionRegistry {
    static final String FALLBACK_FILE_EXTENSION = "xmi";

    Map<EClass, String> fileExtensions = new ConcurrentHashMap<>();

    @Override
    public void registerFileExtension(EClass clazz, String fileExtension) {
        fileExtensions.put(clazz, fileExtension);
    }

    @Override
    public String getModelFileExtension(EObject rootElement) {
        var clazz = rootElement.eClass();
        return Optional.ofNullable(fileExtensions.get(clazz))
            .orElseGet(() -> clazz.getEAllSuperTypes()
                .stream()
                .flatMap(cls -> Optional.ofNullable(fileExtensions.get(cls))
                    .stream())
                .findFirst()
                .orElse(FALLBACK_FILE_EXTENSION));

    }

}
