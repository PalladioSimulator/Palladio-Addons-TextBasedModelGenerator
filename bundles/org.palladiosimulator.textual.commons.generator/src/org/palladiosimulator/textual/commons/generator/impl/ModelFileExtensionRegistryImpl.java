package org.palladiosimulator.textual.commons.generator.impl;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import com.google.inject.Inject;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.textual.commons.generator.ModelFileExtensionRegistrationFacade;
import org.palladiosimulator.textual.commons.generator.ModelFileExtensionRegistry;
import org.palladiosimulator.textual.commons.generator.MultiModelGeneratorFragment;
import org.palladiosimulator.textual.commons.generator.MultiModelGeneratorFragmentCollector;

import com.google.common.collect.Streams;

public class ModelFileExtensionRegistryImpl
        implements ModelFileExtensionRegistrationFacade, ModelFileExtensionRegistry {
    static final String FALLBACK_FILE_EXTENSION = "xmi";

    Map<EClassifier, String> fileExtensions = new ConcurrentHashMap<>();

    @Inject
    public ModelFileExtensionRegistryImpl(MultiModelGeneratorFragmentCollector providerCollector) {
        Streams.stream(providerCollector.getGeneratorFragments())
            .map(MultiModelGeneratorFragment::getFileExtensionRegistrationDelegate)
            .forEach(delegate -> delegate.doFileRegistration(this));
    }

    @Override
    public void registerFileExtension(EClassifier clazz, String fileExtension) {
        var conflict = fileExtensions.put(clazz, fileExtension);

        if (conflict != null && !conflict.equals(fileExtension)) {
            throw new RuntimeException(
                    String.format("Conflicting registration of extensions \".%s\" and \".%s\" for class %s",
                            fileExtension, conflict, clazz.getName()));
        }
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
