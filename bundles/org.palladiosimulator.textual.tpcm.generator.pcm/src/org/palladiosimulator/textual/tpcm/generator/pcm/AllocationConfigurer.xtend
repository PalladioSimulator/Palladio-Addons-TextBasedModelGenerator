package org.palladiosimulator.textual.tpcm.generator.pcm

import org.palladiosimulator.textual.tpcm.language.Allocation
import org.palladiosimulator.pcm.allocation.AllocationFactory
import org.palladiosimulator.textual.tpcm.language.AllocationContext
import org.palladiosimulator.textual.tpcm.language.ResourceEnvironment

import static extension org.palladiosimulator.textual.tpcm.generator.pcm.EObjectExtensions.addAllUnOwned
import org.palladiosimulator.textual.commons.generator.registry.GeneratorRuleRegistrationFacade
import org.palladiosimulator.textual.commons.generator.registry.GeneratorRulesRegistrationDelegate

class AllocationConfigurer implements GeneratorRulesRegistrationDelegate {
    override doRegistration(GeneratorRuleRegistrationFacade registry) {
        registry.configure(Allocation, org.palladiosimulator.pcm.allocation.Allocation) [
            create = [AllocationFactory.eINSTANCE.createAllocation => [a|a.entityName = it.name]]
            mapAll([it.contents.filter(AllocationContext).flatMap[SingleAssemblyAllocation.getAllFrom(it)].toList]).
                thenSet [ allocation, contexts |
                    allocation.allocationContexts_Allocation.addAllUnOwned(contexts)
                ]
            map([
                it.contents.filter(AllocationContext).map[it.spec.container.eContainer].findFirst [
                    it instanceof ResourceEnvironment
                ]
            ]).thenSet [ alloc, env |
                alloc.targetResourceEnvironment_Allocation = env
            ]
            map([
                it.contents.filter(AllocationContext).flatMap[SingleAssemblyAllocation.getAllFrom(it)].map [
                    it.context.eContainer
                ].findFirst[it instanceof org.palladiosimulator.textual.tpcm.language.System]
            ]).thenSet [ alloc, sys |
                alloc.system_Allocation = sys
            ]
        ]

        registry.configure(SingleAssemblyAllocation, org.palladiosimulator.pcm.allocation.AllocationContext) [
            create = [AllocationFactory.eINSTANCE.createAllocationContext => [a|a.entityName = it.name]]
            map([it.context]).thenSet [ context, assembly |
                context.assemblyContext_AllocationContext = assembly;
            ]
            map([it.container]).thenSet [ context, container |
                context.resourceContainer_AllocationContext = container;
            ]
        ]
    }
}