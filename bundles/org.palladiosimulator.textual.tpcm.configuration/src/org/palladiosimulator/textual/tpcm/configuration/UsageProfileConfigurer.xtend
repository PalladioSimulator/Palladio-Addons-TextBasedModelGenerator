package org.palladiosimulator.textual.tpcm.configuration

import org.palladiosimulator.textual.tpcm.registry.GeneratorTransformationRegistry
import org.palladiosimulator.textual.tpcm.language.Usage
import org.palladiosimulator.pcm.usagemodel.UsageModel
import org.palladiosimulator.pcm.usagemodel.UsagemodelFactory
import org.palladiosimulator.textual.tpcm.language.UsageScenario
import org.palladiosimulator.textual.tpcm.language.OpenWorkload
import org.palladiosimulator.pcm.core.PCMRandomVariable
import org.palladiosimulator.textual.tpcm.language.ClosedWorkload
import org.palladiosimulator.textual.tpcm.language.ScenarioLoopAction
import org.palladiosimulator.pcm.usagemodel.Loop
import org.palladiosimulator.textual.tpcm.language.ScenarioBranchAction
import org.palladiosimulator.pcm.usagemodel.Branch
import org.palladiosimulator.textual.tpcm.language.ScenarioBranch
import org.palladiosimulator.pcm.usagemodel.BranchTransition
import org.palladiosimulator.textual.tpcm.language.ScenarioDelayAction
import org.palladiosimulator.pcm.usagemodel.Delay
import org.palladiosimulator.textual.tpcm.language.EntryLevelSystemCallAction
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall
import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector
import org.palladiosimulator.textual.tpcm.language.ComplexResultAssignment
import java.util.List
import org.palladiosimulator.pcm.usagemodel.AbstractUserAction
import org.eclipse.emf.common.util.EList

import static extension org.palladiosimulator.textual.tpcm.configuration.EObjectExtensions.addAllUnOwned

class UsageProfileConfigurer {
    static def configureUsageProfileTransformations(GeneratorTransformationRegistry registry) {
        registry.configure(Usage, UsageModel) [
            create = [UsagemodelFactory.eINSTANCE.createUsageModel]
            mapAll([it.contents.filter(UsageScenario).toList]).thenSet [ model, scenarios |
                model.usageScenario_UsageModel.addAllUnOwned(scenarios)
                scenarios.forEach[it.usageModel_UsageScenario = model]
            ]
        ]

        registry.configure(UsageScenario, org.palladiosimulator.pcm.usagemodel.UsageScenario) [
            create = [UsagemodelFactory.eINSTANCE.createUsageScenario => [m|m.entityName = it.name]]
            map([it.workload]).thenSet [ scenario, workload |
                scenario.workload_UsageScenario = workload
                workload.usageScenario_Workload = scenario
            ]
            mapAll([it.contents]).thenSet [ scenario, actions |
                val behavior = createScenarioBehavior(actions)
                scenario.scenarioBehaviour_UsageScenario = behavior
                behavior.usageScenario_SenarioBehaviour = scenario
            ]
        ]

        registry.configure(OpenWorkload, org.palladiosimulator.pcm.usagemodel.OpenWorkload) [
            create = [UsagemodelFactory.eINSTANCE.createOpenWorkload]
            map([it.interArrivalTime], PCMRandomVariable).thenSet [ workload, arrivalTime |
                workload.interArrivalTime_OpenWorkload = arrivalTime
                arrivalTime.openWorkload_PCMRandomVariable = workload
            ]
        ]

        registry.configure(ClosedWorkload, org.palladiosimulator.pcm.usagemodel.ClosedWorkload) [
            create = [
                UsagemodelFactory.eINSTANCE.createClosedWorkload => [ w |
                    w.population = it.numberOfUsers
                ]
            ]
            map([it.thinkTime], PCMRandomVariable).thenSet [ workload, time |
                workload.thinkTime_ClosedWorkload = time
                time.closedWorkload_PCMRandomVariable = workload
            ]
        ]

        registry.configure(ScenarioLoopAction, Loop) [
            create = [UsagemodelFactory.eINSTANCE.createLoop]
            map([it.condition], PCMRandomVariable).thenSet [ loop, condition |
                loop.loopIteration_Loop = condition
                condition.loop_LoopIteration = loop
            ]
            mapAll([it.contents]).thenSet [ loop, actions |
                val behavior = createScenarioBehavior(actions)
                loop.bodyBehaviour_Loop = behavior
                behavior.loop_ScenarioBehaviour = loop
            ]
        ]

        registry.configure(ScenarioBranchAction, Branch) [
            create = [UsagemodelFactory.eINSTANCE.createBranch]
            mapAll([it.branches]).thenSet [ branch, branches |
                branch.branchTransitions_Branch.addAllUnOwned(branches)
                branches.forEach[it.branch_BranchTransition = branch]
            ]
        ]

        registry.configure(ScenarioBranch, BranchTransition) [
            create = [UsagemodelFactory.eINSTANCE.createBranchTransition => [b|b.branchProbability = it.probability]]
            mapAll([it.contents]).thenSet [ branch, actions |
                val behavior = createScenarioBehavior(actions)
                branch.branchedBehaviour_BranchTransition = behavior
                behavior.branchTransition_ScenarioBehaviour = branch
            ]
        ]

        registry.configure(ScenarioDelayAction, Delay) [
            create = [UsagemodelFactory.eINSTANCE.createDelay]
            map([it.duration], PCMRandomVariable).thenSet [ delay, duration |
                delay.timeSpecification_Delay = duration
                duration.delay_TimeSpecification = delay
            ]
        ]

        registry.configure(EntryLevelSystemCallAction, EntryLevelSystemCall) [
            create = [UsagemodelFactory.eINSTANCE.createEntryLevelSystemCall => [c|c.entityName = it.signature.name]]
            map([it.role], ProvidedDelegationConnector).thenSet [ call, role |
                call.providedRole_EntryLevelSystemCall = role.outerProvidedRole_ProvidedDelegationConnector
            ]
            map([it.signature]).thenSet [ call, signature |
                call.operationSignature__EntryLevelSystemCall = signature
            ]
            mapAll([it.parameters]).thenSet [ call, params |
                call.inputParameterUsages_EntryLevelSystemCall.addAllUnOwned(params)
                params.forEach[it.entryLevelSystemCall_InputParameterUsage = call]
            ]
            mapAll([
                it.result instanceof ComplexResultAssignment
                    ? (it.result as ComplexResultAssignment).specification
                    : emptyList
            ]).thenSet [ action, specs |
                action.outputParameterUsages_EntryLevelSystemCall.addAllUnOwned(specs)
                specs.forEach[it.entryLevelSystemCall_OutputParameterUsage = action]
            ]
            map([it.result instanceof ComplexResultAssignment ? null : it.result]).thenSet [ action, result |
                action.outputParameterUsages_EntryLevelSystemCall.add(result)
                result.entryLevelSystemCall_OutputParameterUsage = action
            ]
        ]
    }
    
    

    private static def createScenarioBehavior(List<? extends AbstractUserAction> actions) {
        val behavior = UsagemodelFactory.eINSTANCE.createScenarioBehaviour
        behavior.actions_ScenarioBehaviour.add(UsagemodelFactory.eINSTANCE.createStart)
        behavior.actions_ScenarioBehaviour.addAll(actions)
        behavior.actions_ScenarioBehaviour.add(UsagemodelFactory.eINSTANCE.createStop)
        actions.forEach[it.scenarioBehaviour_AbstractUserAction = behavior]
        behavior.actions_ScenarioBehaviour.updatePreviousAssignmentsForUser()
        behavior.actions_ScenarioBehaviour.updateSuccessorAssignmentsforUser()
        return behavior
    }
    
    
    private static def void updatePreviousAssignmentsForUser(EList<? extends AbstractUserAction> actions) {
        for (var i = 1; i < actions.length; i++) {
            actions.get(i).predecessor = actions.get(i - 1);
        }
    }

    private static def void updateSuccessorAssignmentsforUser(EList<? extends AbstractUserAction> actions) {
        for (var i = 0; i < actions.length - 1; i++) {
            actions.get(i).successor = actions.get(i + 1);
        }
    }
}