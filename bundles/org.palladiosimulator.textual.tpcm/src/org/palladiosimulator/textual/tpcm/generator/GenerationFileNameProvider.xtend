package org.palladiosimulator.textual.tpcm.generator

import java.util.ArrayList
import org.palladiosimulator.textual.tpcm.language.Repository
import org.palladiosimulator.textual.tpcm.language.Allocation
import org.palladiosimulator.textual.tpcm.language.ResourceEnvironment
import org.palladiosimulator.textual.tpcm.language.Fragment
import org.palladiosimulator.textual.tpcm.language.ResourceTypeRepository

class GenerationFileNameProvider {
    static val FILE_EXTESION_SEPARATOR = "."
    static val SOURCE_NAME_SEPARATOR = "_"
    static val INSTANCE = new GenerationFileNameProvider();
    
    val typeDefinitions = new ArrayList<TypeNameDefinition>();
    
    new() {
        typeDefinitions.add(new TypeNameDefinition(Repository, "repository"))
        typeDefinitions.add(new TypeNameDefinition(org.palladiosimulator.textual.tpcm.language.System, "system"))
        typeDefinitions.add(new TypeNameDefinition(Allocation, "allocation"))
        typeDefinitions.add(new TypeNameDefinition(ResourceEnvironment, "resourceenvironment"))
        typeDefinitions.add(new TypeNameDefinition(ResourceTypeRepository, "resourcetyperepository"))
    }
    
    def String generateFileNameFor(Fragment resource, String originalFileName) {
        var definition = typeDefinitions.findFirst[ it.appliesTo(resource) ]
        if(definition === null) {
            definition = new TypeNameDefinition(resource.class, resource.class.simpleName)
        }
        
        return definition.formatName(resource, originalFileName)
    }
    
    static def getInstance() {
        INSTANCE
    }
    
    static class TypeNameDefinition {
        val Class<? extends Fragment> type
        val String fileExtension
        val String defaultName
        
        new(Class<? extends Fragment> type, String ext) {
            this.type = type
            this.fileExtension = ext
            this.defaultName = this.type.simpleName
        }
        
        def appliesTo(Fragment obj) {
            return this.type.isInstance(obj)
        }
        
        def String formatName(Fragment obj, String sourceFileName) {
            val fragmentName = if (obj.name === null || obj.name.isEmpty) {
                defaultName
            } else {
                obj.name
            }
            return fragmentName + SOURCE_NAME_SEPARATOR + sourceFileName + FILE_EXTESION_SEPARATOR + this.fileExtension
        }
    }
}