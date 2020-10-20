package org.palladiosimulator.textual.tpcm.generator.pcm

import org.palladiosimulator.textual.tpcm.language.AssemblyContext
import org.palladiosimulator.textual.tpcm.language.ResourceContainer
import org.palladiosimulator.textual.tpcm.language.AllocationContext
import java.util.List

class SingleAssemblyAllocation {
    public final String name;
    public final AssemblyContext context;
    public final ResourceContainer container;
    
    private new(String name, AssemblyContext context, ResourceContainer container) {
        this.name = name;
        this.context = context;
        this.container = container;
    }
    
    def static List<SingleAssemblyAllocation> getAllFrom(AllocationContext sourceContext) {
        val name = sourceContext.name
        val container = sourceContext.spec.container
        return sourceContext.spec.assemblies.map[
            new SingleAssemblyAllocation(name, it, container)
        ].toList
    }
}