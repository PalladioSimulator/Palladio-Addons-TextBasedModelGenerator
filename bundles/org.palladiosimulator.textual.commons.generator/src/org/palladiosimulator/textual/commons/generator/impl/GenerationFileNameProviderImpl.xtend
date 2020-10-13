package org.palladiosimulator.textual.commons.generator.impl

import javax.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.palladiosimulator.textual.commons.generator.GenerationFileNameProvider
import org.palladiosimulator.textual.commons.generator.ModelFileExtensionRegistry

class GenerationFileNameProviderImpl implements GenerationFileNameProvider {
    static val FILE_EXTENSION_SEPARATOR = "."
    static val SOURCE_NAME_SEPARATOR = "_"

    @Inject
    IQualifiedNameProvider nameProvider

    @Inject
    ModelFileExtensionRegistry extensionRegistry
/*
    val typeDefinitions = new ArrayList<TypeNameDefinition>();

    new() {
        typeDefinitions.add(new TypeNameDefinition(Repository, "repository"))
        typeDefinitions.add(new TypeNameDefinition(org.palladiosimulator.textual.tpcm.language.System, "system"))
        typeDefinitions.add(new TypeNameDefinition(Allocation, "allocation"))
        typeDefinitions.add(new TypeNameDefinition(ResourceEnvironment, "resourceenvironment"))
        typeDefinitions.add(new TypeNameDefinition(ResourceTypeRepository, "resourcetyperepository"))
        typeDefinitions.add(new TypeNameDefinition(Usage, "usagemodel"))
    }*/

    override String generateFileNameFor(EObject resource, String originalFileName) {
        val name = nameProvider.getFullyQualifiedName(resource);
        val finalName = if (name === null || name.isEmpty) {
                resource.eClass.name
            } else {
                name
            }
        '''«finalName»«SOURCE_NAME_SEPARATOR»«originalFileName»«FILE_EXTENSION_SEPARATOR»«extensionRegistry.getModelFileExtension(resource)»'''
    }

}
