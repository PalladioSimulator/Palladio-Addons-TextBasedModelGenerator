package org.palladiosimulator.textual.tpcm.generator

import java.util.ArrayList
import org.palladiosimulator.textual.tpcm.language.Repository
import org.palladiosimulator.textual.tpcm.language.Allocation
import org.palladiosimulator.textual.tpcm.language.ResourceEnvironment
import org.palladiosimulator.textual.tpcm.language.Fragment
import org.palladiosimulator.textual.tpcm.language.ResourceTypeRepository

class GenerationFileNameProvider {
    static val FILE_EXTESION_SEPARATOR = "."
    static val INSTANCE = new GenerationFileNameProvider();
    
    val typeDefinitions = new ArrayList<TypeNameDefinition>();
    
    new() {
        typeDefinitions.add(new TypeNameDefinition(Repository, "repository"))
        typeDefinitions.add(new TypeNameDefinition(org.palladiosimulator.textual.tpcm.language.System, "system"))
        typeDefinitions.add(new TypeNameDefinition(Allocation, "allocation"))
        typeDefinitions.add(new TypeNameDefinition(ResourceEnvironment, "resourceenvironment"))
        typeDefinitions.add(new TypeNameDefinition(ResourceTypeRepository, "resourcetyperepository"))
    }
    
    def String generateFileNameFor(Fragment resource) {
        var definition = typeDefinitions.findFirst[ it.appliesTo(resource) ]
        if(definition === null) {
            definition = new TypeNameDefinition(resource.class, resource.class.simpleName)
        }
        
        return definition.formatName(resource)
    }
    
    static def getInstance() {
        INSTANCE
    }
    
    static class TypeNameDefinition {
        val Class<? extends Fragment> type
        val String fileExtension
        
        new(Class<? extends Fragment> type, String ext) {
            this.type = type
            this.fileExtension = ext
        }
        
        def appliesTo(Fragment obj) {
            return this.type.isInstance(obj)
        }
        
        def String formatName(Fragment obj) {
            return obj.name + FILE_EXTESION_SEPARATOR + this.fileExtension
        }
    }
}