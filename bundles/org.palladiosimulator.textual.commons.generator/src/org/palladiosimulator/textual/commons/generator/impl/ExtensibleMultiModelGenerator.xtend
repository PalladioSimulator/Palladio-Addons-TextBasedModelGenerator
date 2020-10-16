/*
 * generated by Xtext 2.21.0
 */
package org.palladiosimulator.textual.commons.generator.impl

import com.google.inject.Inject
import java.util.ArrayList
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.palladiosimulator.textual.commons.generator.GenerationFileNameProvider
import org.palladiosimulator.textual.commons.generator.registry.GeneratorTransformationRegistry
import org.palladiosimulator.textual.commons.generator.registry.RegisteredMappingProvider
import org.palladiosimulator.textual.commons.generator.registry.RootElementFilter
import javax.inject.Named
import org.palladiosimulator.textual.commons.generator.MultiModelGeneratorFragment

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ExtensibleMultiModelGenerator extends AbstractMultiSourceGenerator {
    @Inject
    GenerationFileNameProvider filenameProvider
    
    @Inject
    @Named(MultiModelGeneratorFragment.NAMED_DELEGATE)
    RegisteredMappingProvider mappingProvider;
    
    @Inject
    @Named(MultiModelGeneratorFragment.NAMED_DELEGATE)
    RootElementFilter elementFilter;
    
    @Inject
    GeneratorTransformationRegistry registry;
    
    override doGenerate(ResourceSet resources, IFileSystemAccess2 fsa, IGeneratorContext context) {
        var allMappings = mappingProvider.retrieveMappings(resources)
        val outputResources = new ResourceSetImpl();
        registry.withContext(allMappings) [
            val createdResources = new ArrayList<Resource>();
            for(resource : resources.resources) {
                val fragments = resource.allContents.filter[elementFilter.translatesToRootElement(it)]
                val sourceFileName = resource.sourceFileName
                val mappedFragments = new ArrayList(fragments.map [
                    val filename = filenameProvider.generateFileNameFor(it, sourceFileName)
                    val mapped = registry.map(it) as EObject
                    new MappingInformation(mapped, filename)
                ].toList)
                createdResources.addAll(mappedFragments.map [
                    createResource(outputResources, it.mappedValue, it.fileName, fsa, context)
                ].toList)
            }
            
            createdResources.forEach[it.save({})]
        ]
    }
    
    private def String getSourceFileName(Resource resource) {
        val fileNameWithExtension = resource.URI.lastSegment
        val extensionDotIndex = fileNameWithExtension.lastIndexOf(".")
        return fileNameWithExtension.substring(0, extensionDotIndex)
    }

    def createResource(ResourceSet containerSet, EObject resource, String fileName, IFileSystemAccess2 fsa,
        IGeneratorContext context) {
        val targetFile = fsa.getURI(fileName)
        val targetResource = containerSet.createResource(targetFile)
        targetResource.getContents().add(resource)
        return targetResource
    }

    static class MappingInformation {
        public final EObject mappedValue;
        public final String fileName;

        new(EObject mappedValue, String filename) {
            this.mappedValue = mappedValue;
            this.fileName = filename;
        }
    }

}
