/*
 * generated by Xtext 2.21.0
 */
package org.palladiosimulator.textual.tpcm.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.palladiosimulator.textual.tpcm.language.Fragment
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.EObject
import java.util.ArrayList
import org.palladiosimulator.textual.tpcm.language.MappingContent
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.common.util.URI
import java.util.List

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class TPCMGenerator extends AbstractGenerator {
    val filenameProvider = GenerationFileNameProvider.getInstance()

    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        val resourceSet = new ResourceSetImpl()
        val mapping = resource.allContents.filter(MappingContent).toList
        val fragments = resource.allContents.filter(Fragment).toList
        val registry = GeneratorTransformationRegistry.INSTANCE;
        registry.withContext(createProvidedMappings(resourceSet, mapping)) [
            val mappedFragments = new ArrayList(fragments.map [
                val filename = filenameProvider.generateFileNameFor(it)
                val mapped = registry.map(it) as EObject
                new MappingInformation(mapped, filename)
            ].toList)
            mappedFragments.forEach[saveFragment(resourceSet, it.mappedValue, it.fileName, fsa, context)]
        ]
    }
    
    private def List<ProvidedMapping> createProvidedMappings(ResourceSet parent, List<MappingContent> content) {
        return content.map[
            val splitFullUri = it.absoluteUri.split("#")
            val filePath = splitFullUri.get(0)
            val id = splitFullUri.get(1)
            val resolved = resolveObject(filePath, id, parent)
            return new ProvidedMapping(it.imported, resolved)
        ]
    }
    
    private def EObject resolveObject(String absolutePath, String resourceId, ResourceSet parentSet) {
        val resource = parentSet.getResource(URI.createURI(absolutePath), true);
        return resource.getEObject(resourceId)
    }

    def saveFragment(ResourceSet containerSet, EObject resource, String fileName, IFileSystemAccess2 fsa, IGeneratorContext context) {
        val targetFile = fsa.getURI(fileName)
        val targetResource = containerSet.createResource(targetFile)
        targetResource.getContents().add(resource)
        targetResource.save({
        })
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
