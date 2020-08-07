package org.palladiosimulator.textual.tpcm.configuration

import org.palladiosimulator.textual.tpcm.registry.GeneratorTransformationRegistry
import org.palladiosimulator.textual.tpcm.language.Repository
import org.palladiosimulator.pcm.repository.RepositoryFactory
import org.palladiosimulator.textual.tpcm.language.Datatype
import org.palladiosimulator.textual.tpcm.language.FailureType
import org.palladiosimulator.textual.tpcm.language.Component
import org.palladiosimulator.textual.tpcm.language.Interface
import org.palladiosimulator.pcm.repository.BasicComponent
import org.palladiosimulator.textual.tpcm.language.DomainInterfaceProvidedRole
import org.palladiosimulator.textual.tpcm.language.InterfaceRequiredRole
import org.palladiosimulator.pcm.repository.RequiredRole
import org.palladiosimulator.pcm.core.entity.ResourceRequiredRole
import org.palladiosimulator.textual.tpcm.language.InternalInterfaceProvidedRole
import org.palladiosimulator.textual.tpcm.language.ResourceTypeRepository
import org.palladiosimulator.pcm.repository.PassiveResource
import org.palladiosimulator.textual.tpcm.language.SEFF
import org.palladiosimulator.pcm.repository.InfrastructureProvidedRole
import org.palladiosimulator.pcm.core.PCMRandomVariable
import org.palladiosimulator.pcm.repository.OperationProvidedRole
import org.palladiosimulator.textual.tpcm.language.EventSignature
import org.palladiosimulator.pcm.repository.SinkRole
import org.palladiosimulator.pcm.repository.OperationRequiredRole
import org.palladiosimulator.pcm.repository.SourceRole
import org.palladiosimulator.pcm.core.entity.EntityFactory
import org.palladiosimulator.pcm.resourcetype.ResourceInterface
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF
import org.palladiosimulator.pcm.seff.SeffFactory
import org.palladiosimulator.textual.tpcm.language.SEFFCallAction
import org.palladiosimulator.pcm.seff.AcquireAction
import org.palladiosimulator.pcm.seff.ReleaseAction
import org.palladiosimulator.textual.tpcm.language.SEFFProbabilisticAction
import org.palladiosimulator.pcm.seff.BranchAction
import org.palladiosimulator.textual.tpcm.language.SEFFProbabilisticBranch
import org.palladiosimulator.pcm.seff.ProbabilisticBranchTransition
import org.palladiosimulator.textual.tpcm.language.SEFFLoopAction
import org.palladiosimulator.pcm.seff.LoopAction
import org.palladiosimulator.textual.tpcm.language.SEFFConditionalAction
import org.palladiosimulator.pcm.seff.GuardedBranchTransition
import org.palladiosimulator.pcm.core.CoreFactory
import org.palladiosimulator.textual.tpcm.language.SEFFConditionalElseIf
import org.palladiosimulator.textual.tpcm.language.SEFFConditionalElse
import org.palladiosimulator.textual.tpcm.language.SEFFAssignment
import org.palladiosimulator.pcm.seff.SetVariableAction
import de.uka.ipd.sdq.stoex.StoexFactory
import org.palladiosimulator.pcm.seff.EmitEventAction
import org.palladiosimulator.pcm.repository.EventType
import org.palladiosimulator.pcm.seff.ExternalCallAction
import org.palladiosimulator.textual.tpcm.language.OperationSignature
import org.palladiosimulator.textual.tpcm.language.ComplexResultAssignment
import org.palladiosimulator.textual.tpcm.language.PrimitiveResultAssignment
import org.palladiosimulator.pcm.parameter.VariableUsage
import org.palladiosimulator.textual.tpcm.language.AbsoluteReference
import org.palladiosimulator.textual.tpcm.language.RelativeReference
import org.palladiosimulator.textual.tpcm.language.ResultSpecification
import org.palladiosimulator.pcm.seff.InternalAction
import org.palladiosimulator.pcm.seff.seff_performance.SeffPerformanceFactory
import org.palladiosimulator.pcm.resourcetype.ResourceSignature
import org.palladiosimulator.textual.tpcm.language.ParameterSpecification
import org.palladiosimulator.pcm.parameter.ParameterFactory
import de.uka.ipd.sdq.stoex.Expression
import org.palladiosimulator.textual.tpcm.language.SEFFIterateAction
import org.palladiosimulator.pcm.seff.CollectionIteratorAction
import org.palladiosimulator.textual.tpcm.language.PrimitiveDatatype
import org.palladiosimulator.pcm.repository.PrimitiveDataType
import org.palladiosimulator.pcm.repository.PrimitiveTypeEnum
import org.palladiosimulator.textual.tpcm.language.CollectionDatatype
import org.palladiosimulator.pcm.repository.CollectionDataType
import org.palladiosimulator.textual.tpcm.language.ComposedDatatype
import org.palladiosimulator.pcm.repository.CompositeDataType
import org.palladiosimulator.textual.tpcm.language.ComposedDatatypeElement
import org.palladiosimulator.pcm.repository.InnerDeclaration
import org.palladiosimulator.pcm.repository.DataType
import org.palladiosimulator.pcm.seff.ResourceDemandingBehaviour
import org.palladiosimulator.pcm.seff.AbstractBranchTransition
import java.util.List
import org.palladiosimulator.pcm.seff.AbstractAction
import org.palladiosimulator.textual.tpcm.language.SEFFConditionalAlternative
import java.util.ArrayList
import org.eclipse.emf.common.util.EList
import org.palladiosimulator.pcm.parameter.VariableCharacterisationType
import de.uka.ipd.sdq.stoex.VariableReference
import de.uka.ipd.sdq.stoex.AbstractNamedReference
import de.uka.ipd.sdq.stoex.NamespaceReference
import java.util.Collections
import org.palladiosimulator.textual.tpcm.language.DomainInterface

import static extension org.palladiosimulator.textual.tpcm.configuration.ConfigurerHelper.hasEmptyName;
import static org.palladiosimulator.textual.tpcm.configuration.ConfigurerHelper.getInitPropertyExpression;

class RepositoryConfigurer {
    static val CAPACITY_PROPERTY_NAME = "capacity"
    static val ACQUIRE_SIGNATURE_NAME = "acquire"
    static val RELEASE_SIGNATURE_NAME = "release"

    static def configureRepositoryTransformations(GeneratorTransformationRegistry registry) {
        registry.configure(Repository, org.palladiosimulator.pcm.repository.Repository) [
            create = [repo|RepositoryFactory.eINSTANCE.createRepository => [it.entityName = repo.name]]

            mapAll([it.contents.filter(Datatype).toList]).thenSet [ repo, types |
                repo.dataTypes__Repository.addAll(types)
                types.forEach[it.assignRepository(repo)]
            ]
            mapAll([it.contents.filter(FailureType).toList]).thenSet [ repo, failures |
                repo.failureTypes__Repository.addAll(failures)
                failures.forEach[it.repository__FailureType = repo]
            ]
            mapAll([it.contents.filter(Component).toList]).thenSet [ repo, components |
                repo.components__Repository.addAll(components)
                components.forEach[it.repository__RepositoryComponent = repo]
            ]
            mapAll([it.contents.filter(Interface).toList]).thenSet [ repo, interfaces |
                repo.interfaces__Repository.addAll(interfaces)
                interfaces.forEach[it.repository__Interface = repo]
            ]
        ]

        registry.configureRepositoryDatatypes()
        registry.configureRepositoryComponent()
    }

    protected static def void configureRepositoryComponent(GeneratorTransformationRegistry registry) {
        registry.configure(Component, BasicComponent) [
            create = [
                RepositoryFactory.eINSTANCE.createBasicComponent => [c|c.entityName = it.name]
            ]
            mapAll([it.contents.filter(DomainInterfaceProvidedRole).toList]).thenSet [ component, provided |
                component.providedRoles_InterfaceProvidingEntity.addAll(provided)
                provided.forEach[it.providingEntity_ProvidedRole = component]
            ]
            mapAll([it.contents.filter(InterfaceRequiredRole).toList]).thenSet [ component, required |
                component.requiredRoles_InterfaceRequiringEntity.addAll(required.filter(RequiredRole))
                component.resourceRequiredRoles__ResourceInterfaceRequiringEntity.addAll(
                    required.filter(ResourceRequiredRole))
            ]
            mapAll([
                it.contents.filter(InternalInterfaceProvidedRole).filter [
                    it.type.eContainer instanceof ResourceTypeRepository
                ].toList
            ], PassiveResource).thenSet [ component, resources |
                component.passiveResource_BasicComponent.addAll(resources)
                resources.forEach[it.basicComponent_PassiveResource = component]
            ]
            mapAll([it.contents.filter(SEFF).toList]).thenSet [ component, seffs |
                component.serviceEffectSpecifications__BasicComponent.addAll(seffs)
                seffs.forEach[it.basicComponent_ServiceEffectSpecification = component]
            ]
        ]

        registry.configure(InternalInterfaceProvidedRole, InfrastructureProvidedRole) [
            create = [
                RepositoryFactory.eINSTANCE.createInfrastructureProvidedRole => [r|r.entityName = it.name]
            ]
            when = [!(it.type.eContainer instanceof ResourceTypeRepository)]
            map([it.type]).thenSet [ role, iface |
                role.providedInterface__InfrastructureProvidedRole = iface
            ]
        ]

        registry.configure(InternalInterfaceProvidedRole, PassiveResource) [
            create = [RepositoryFactory.eINSTANCE.createPassiveResource => [r|r.entityName = it.name]]
            when = [it.type.eContainer instanceof ResourceTypeRepository]
            map([getInitPropertyExpression(it.initialization, CAPACITY_PROPERTY_NAME)], PCMRandomVariable).thenSet [ resource, capacity |
                resource.capacity_PassiveResource = capacity
                capacity.passiveResource_capacity_PCMRandomVariable = resource
            ]
        ]

        registry.configureRepositoryComponentSEFF()

        registry.configure(DomainInterfaceProvidedRole, OperationProvidedRole) [
            create = [RepositoryFactory.eINSTANCE.createOperationProvidedRole => [r|r.entityName = it.name]]
            when = [!it.type.contents.exists[it instanceof EventSignature]]
            map([it.type]).thenSet [ role, iface |
                role.providedInterface__OperationProvidedRole = iface
            ]
        ]

        registry.configure(DomainInterfaceProvidedRole, SinkRole) [
            create = [RepositoryFactory.eINSTANCE.createSinkRole => [r|r.entityName = it.name]]
            when = [it.type.contents.exists[it instanceof EventSignature]]
            map([it.type]).thenSet [ role, iface |
                role.eventGroup__SinkRole = iface
            ]
        ]

        registry.configure(InterfaceRequiredRole, OperationRequiredRole) [
            create = [RepositoryFactory.eINSTANCE.createOperationRequiredRole => [r|r.entityName = it.name]]
            when = [
                !it.type.contents.exists[it instanceof EventSignature] &&
                    !(it.type instanceof org.palladiosimulator.textual.tpcm.language.ResourceInterface)
            ]
            map([it.type]).thenSet [ role, iface |
                role.requiredInterface__OperationRequiredRole = iface
            ]
        ]

        registry.configure(InterfaceRequiredRole, SourceRole) [
            create = [RepositoryFactory.eINSTANCE.createSourceRole => [r|r.entityName = it.name]]
            when = [
                it.type.contents.exists[it instanceof EventSignature] &&
                    !(it.type instanceof org.palladiosimulator.textual.tpcm.language.ResourceInterface)
            ]
            map([it.type]).thenSet [ role, iface |
                role.eventGroup__SourceRole = iface
            ]
        ]

        registry.configure(InterfaceRequiredRole, ResourceRequiredRole) [
            create = [EntityFactory.eINSTANCE.createResourceRequiredRole => [r|r.entityName = it.name]]
            when = [it.type instanceof org.palladiosimulator.textual.tpcm.language.ResourceInterface]
            map([it.type], ResourceInterface).thenSet [ role, iface |
                role.requiredResourceInterface__ResourceRequiredRole = iface
            ]
        ]
    }

    protected static def void configureRepositoryComponentSEFF(GeneratorTransformationRegistry registry) {
        registry.configure(SEFF, ResourceDemandingSEFF) [
            create = [
                SeffFactory.eINSTANCE.createResourceDemandingSEFF
            ]
            map([it.signatur], org.palladiosimulator.pcm.repository.OperationSignature).thenSet [ seff, sig |
                seff.describedService__SEFF = sig
            ]
            mapAll([it.contents]).thenSet [ seff, calls |
                seff.steps_Behaviour.add(SeffFactory.eINSTANCE.createStartAction)
                seff.steps_Behaviour.addAll(calls)
                seff.steps_Behaviour.add(SeffFactory.eINSTANCE.createStopAction)
                seff.steps_Behaviour.forEach[it.resourceDemandingBehaviour_AbstractAction = seff]
                seff.steps_Behaviour.updatePreviousAssignments();
                seff.steps_Behaviour.updateSuccessorAssignments();
            ]
        ]

        registry.configure(SEFFCallAction, AcquireAction) [
            create = [SeffFactory.eINSTANCE.createAcquireAction]
            when = [
                it.signature.name == ACQUIRE_SIGNATURE_NAME && it.role instanceof InternalInterfaceProvidedRole &&
                    it.role.type.eContainer instanceof ResourceTypeRepository
            ]
            map([it.role], PassiveResource).thenSet [ action, resource |
                action.passiveresource_AcquireAction = resource
            ]
        ]

        registry.configure(SEFFCallAction, ReleaseAction) [
            create = [SeffFactory.eINSTANCE.createReleaseAction]
            when = [
                it.signature.name == RELEASE_SIGNATURE_NAME && it.role instanceof InternalInterfaceProvidedRole &&
                    it.role.type.eContainer instanceof ResourceTypeRepository
            ]
            map([it.role], PassiveResource).thenSet [ action, resource |
                action.passiveResource_ReleaseAction = resource
            ]
        ]

        registry.configure(SEFFProbabilisticAction, BranchAction) [
            create = [
                SeffFactory.eINSTANCE.createBranchAction => [ b |
                    val totalProbability = it.branches.stream.mapToDouble([it.probability]).sum
                    if (totalProbability < 1.0) {
                        val remainingProbablity = 1.0 - totalProbability
                        val noopBranch = SeffFactory.eINSTANCE.createProbabilisticBranchTransition => [ t |
                            t.branchProbability = remainingProbablity
                            t.entityName = "" + remainingProbablity
                            val behavior = createEmptyBehavior => [ be |
                                be.steps_Behaviour.updatePreviousAssignments()
                                be.steps_Behaviour.updateSuccessorAssignments()
                                be.abstractBranchTransition_ResourceDemandingBehaviour = t
                            ]
                            t.branchBehaviour_BranchTransition = behavior
                        ]
                        b.branches_Branch.add(noopBranch)
                        noopBranch.branchAction_AbstractBranchTransition = b
                    }
                ]
            ]
            mapAll([it.branches]).thenSet [ action, branches |
                action.branches_Branch.addAll(0, branches)
                branches.forEach[it.branchAction_AbstractBranchTransition = action]
            ]
        ]

        registry.configure(SEFFProbabilisticBranch, ProbabilisticBranchTransition) [
            create = [
                SeffFactory.eINSTANCE.createProbabilisticBranchTransition => [ t |
                    t.branchProbability = it.probability
                    val behavior = SeffFactory.eINSTANCE.createResourceDemandingBehaviour
                    t.branchBehaviour_BranchTransition = behavior
                    behavior.abstractBranchTransition_ResourceDemandingBehaviour = t
                    t.entityName = "" + it.probability
                ]
            ]
            mapAll([it.contents]).thenSet [ branch, actions |
                branch.addStepsToBranch(actions)
            ]
        ]

        registry.configure(SEFFLoopAction, LoopAction) [
            create = [
                SeffFactory.eINSTANCE.createLoopAction => [ l |
                    val behavior = createEmptyBehavior
                    l.bodyBehaviour_Loop = behavior
                    behavior.abstractLoopAction_ResourceDemandingBehaviour = l
                ]
            ]
            map([it.condition], PCMRandomVariable).thenSet [ loop, variable |
                loop.iterationCount_LoopAction = variable
                variable.loopAction_PCMRandomVariable = loop
            ]
            mapAll([it.contents]).thenSet [ loop, actions |
                val behavior = loop.bodyBehaviour_Loop
                behavior.steps_Behaviour.addAll(1, actions)
                behavior.steps_Behaviour.updatePreviousAssignments();
                behavior.steps_Behaviour.updateSuccessorAssignments();
                behavior.steps_Behaviour.forEach[it.resourceDemandingBehaviour_AbstractAction = behavior]
            ]
        ]

        registry.configure(SEFFConditionalAction, BranchAction) [
            create = [
                SeffFactory.eINSTANCE.createBranchAction => [
                    val branch = SeffFactory.eINSTANCE.createGuardedBranchTransition
                    it.branches_Branch.add(branch)
                    branch.branchAction_AbstractBranchTransition = it

                    val behavior = SeffFactory.eINSTANCE.createResourceDemandingBehaviour
                    branch.branchBehaviour_BranchTransition = behavior
                    behavior.abstractBranchTransition_ResourceDemandingBehaviour = branch
                ]
            ]
            map([it.condition], PCMRandomVariable).thenSet [ action, condition |
                val branch = action.branches_Branch.get(0) as GuardedBranchTransition
                branch.branchCondition_GuardedBranchTransition = condition
                condition.guardedBranchTransition_PCMRandomVariable = branch
                branch.entityName = condition.specification
            ]
            mapAll([it.contents]).thenSet [ action, contents |
                val branch = action.branches_Branch.get(0) as GuardedBranchTransition
                branch.addStepsToBranch(contents)
            ]
            mapAll([collectAllBranches]).thenSet [ action, alternatives |
                action.branches_Branch.addAll(alternatives)
                alternatives.forEach[it.branchAction_AbstractBranchTransition = action]
            ]
            after = [
                val hasElseBranch = it.branches_Branch.filter(GuardedBranchTransition).exists [ branch |
                    branch.branchCondition_GuardedBranchTransition.specification == "true"
                ]
                if (!hasElseBranch) {
                    val elseBranch = SeffFactory.eINSTANCE.createGuardedBranchTransition => [ t |
                        val spec = CoreFactory.eINSTANCE.createPCMRandomVariable => [it.specification = "true"]
                        t.branchCondition_GuardedBranchTransition = spec
                        val behavior = SeffFactory.eINSTANCE.createResourceDemandingBehaviour
                        t.branchBehaviour_BranchTransition = behavior
                        behavior.abstractBranchTransition_ResourceDemandingBehaviour = t
                        t.entityName = "else"
                    ]
                    elseBranch.addStepsToBranch(Collections.emptyList)
                    it.branches_Branch.add(elseBranch)
                    elseBranch.branchAction_AbstractBranchTransition = it
                }
            ]
        ]

        registry.configure(SEFFConditionalElseIf, GuardedBranchTransition) [
            create = [
                SeffFactory.eINSTANCE.createGuardedBranchTransition => [ g |
                    val behavior = SeffFactory.eINSTANCE.createResourceDemandingBehaviour
                    g.branchBehaviour_BranchTransition = behavior
                    behavior.abstractBranchTransition_ResourceDemandingBehaviour = g
                ]
            ]
            map([it.condition], PCMRandomVariable).thenSet [ transition, variable |
                transition.branchCondition_GuardedBranchTransition = variable
                variable.guardedBranchTransition_PCMRandomVariable = transition
                transition.entityName = variable.specification
            ]
            mapAll([it.contents]).thenSet [ branch, actions |
                branch.addStepsToBranch(actions)
            ]
        ]

        registry.configure(SEFFConditionalElse, GuardedBranchTransition) [
            create = [
                SeffFactory.eINSTANCE.createGuardedBranchTransition => [ t |
                    val spec = CoreFactory.eINSTANCE.createPCMRandomVariable => [it.specification = "true"]
                    t.branchCondition_GuardedBranchTransition = spec
                    val behavior = SeffFactory.eINSTANCE.createResourceDemandingBehaviour
                    t.branchBehaviour_BranchTransition = behavior
                    behavior.abstractBranchTransition_ResourceDemandingBehaviour = t
                    t.entityName = "else"
                ]
            ]
            mapAll([it.contents]).thenSet [ branch, actions |
                branch.addStepsToBranch(actions)
            ]
        ]

        registry.configure(SEFFAssignment, SetVariableAction) [
            create = [SeffFactory.eINSTANCE.createSetVariableAction]
            map([it.result]).thenSet [ action, result |
                action.localVariableUsages_SetVariableAction.add(result)
                result.setVariableAction_VariableUsage = action
            ]
            map([it.specification], PCMRandomVariable).thenSet [ action, spec |
                val usage = action.localVariableUsages_SetVariableAction.get(0)
                val characterization = usage.variableCharacterisation_VariableUsage.get(0)
                characterization.specification_VariableCharacterisation = spec
                spec.variableCharacterisation_Specification = characterization
            ]
            after = [
                it.localVariableUsages_SetVariableAction.forEach [ usage |
                    if (usage.namedReference__VariableUsage === null) {
                        val returnReference = StoexFactory.eINSTANCE.createVariableReference => [ r |
                            r.referenceName = "RETURN"
                        ]
                        usage.namedReference__VariableUsage = returnReference
                    }
                ]

                if (it.hasEmptyName) {
                    it.entityName = it.localVariableUsages_SetVariableAction.join(", ") [
                        it.namedReference__VariableUsage.referenceName
                    ]
                }
            ]
        ]

        registry.configure(SEFFCallAction, EmitEventAction) [
            create = [
                SeffFactory.eINSTANCE.createEmitEventAction
            ]
            when = [it.signature instanceof EventSignature]
            map([it.role]).thenSet [ action, role |
                action.sourceRole__EmitEventAction = role
            ]
            map([it.signature], EventType).thenSet [ action, signature |
                action.eventType__EmitEventAction = signature
            ]
        ]

        registry.configure(SEFFCallAction, ExternalCallAction) [
            create = [SeffFactory.eINSTANCE.createExternalCallAction => [c|c.entityName = it.signature.name]]
            when = [
                it.role instanceof InterfaceRequiredRole && it.signature instanceof OperationSignature &&
                    it.role.type instanceof DomainInterface
            ]
            map([it.role]).thenSet [ action, role |
                action.role_ExternalService = role
            ]
            map([it.signature], org.palladiosimulator.pcm.repository.OperationSignature).thenSet [ action, signature |
                action.calledService_ExternalService = signature
            ]
            mapAll([
                it.result instanceof ComplexResultAssignment
                    ? (it.result as ComplexResultAssignment).specification
                    : emptyList
            ]).thenSet [ action, specs |
                action.returnVariableUsage__CallReturnAction.addAll(specs)
                specs.forEach[it.callReturnAction__VariableUsage = action]
            ]
            map([it.result instanceof ComplexResultAssignment ? null : it.result]).thenSet [ action, result |
                action.returnVariableUsage__CallReturnAction.add(result)
                result.callReturnAction__VariableUsage = action
            ]
            mapAll([it.parameters]).thenSet [ call, params |
                call.inputVariableUsages__CallAction.addAll(params)
                params.forEach[it.callAction__VariableUsage = call]

                call.inputVariableUsages__CallAction.forEach [ usage, index |
                    if (usage.namedReference__VariableUsage === null) {
                        val param = call.calledService_ExternalService.parameters__OperationSignature.get(index)
                        val reference = StoexFactory.eINSTANCE.createVariableReference => [ r |
                            r.referenceName = param.parameterName
                        ]
                        usage.namedReference__VariableUsage = reference
                    }
                ]
            ]
            after = [
                it.returnVariableUsage__CallReturnAction.forEach [ usage |
                    if (usage.namedReference__VariableUsage === null) {
                        val returnReference = StoexFactory.eINSTANCE.createVariableReference => [ r |
                            r.referenceName = "RETURN"
                        ]
                        usage.namedReference__VariableUsage = returnReference
                    }

                    usage.variableCharacterisation_VariableUsage.forEach [ characterisation |
                        if (characterisation.specification_VariableCharacterisation === null) {
                            val spec = "RETURN." + characterisation.type.literal
                            characterisation.specification_VariableCharacterisation = CoreFactory.eINSTANCE.
                                createPCMRandomVariable => [it.specification = spec]
                        }
                    ]
                ]
            ]
        ]

        registry.configure(PrimitiveResultAssignment, VariableUsage) [
            create = [
                switch (it.reference) {
                    AbsoluteReference: createForReference(it.reference as AbsoluteReference)
                    RelativeReference: createForReference(it.reference as RelativeReference)
                }
            ]
        ]

        registry.configure(ResultSpecification, VariableUsage) [
            create = [createForReference(it.characteristic as AbsoluteReference)]
            when = [it.characteristic instanceof AbsoluteReference]
        ]

        registry.configure(ResultSpecification, VariableUsage) [
            create = [createForReference(it.characteristic as RelativeReference)]
            when = [it.characteristic instanceof RelativeReference]
            map([it.specification], PCMRandomVariable).thenSet [ usage, spec |
                val character = usage.variableCharacterisation_VariableUsage.get(0)
                character.specification_VariableCharacterisation = spec
                spec.variableCharacterisation_Specification = character
            ]
        ]

        registry.configure(SEFFCallAction, InternalAction) [
            create = [SeffFactory.eINSTANCE.createInternalAction]
            when = [
                it.role.type.eContainer instanceof ResourceTypeRepository &&
                    !(it.signature.name == ACQUIRE_SIGNATURE_NAME || it.signature.name == RELEASE_SIGNATURE_NAME)
            ]
            map([it.role]).thenSet [ action, resource |
                val call = SeffPerformanceFactory.eINSTANCE.createResourceCall
                call.resourceRequiredRole__ResourceCall = resource
                action.resourceCall__Action.add(call)
                call.action__ResourceCall = action
            ]
            map([it.signature], ResourceSignature).thenSet [ action, signature |
                val call = action.resourceCall__Action.get(0)
                call.signature__ResourceCall = signature
            ]
            map([it.parameters.get(0).specification], PCMRandomVariable).thenSet [ action, variable |
                val call = action.resourceCall__Action.get(0)
                call.numberOfCalls__ResourceCall = variable
                variable.resourceCall__PCMRandomVariable = call
            ]
        ]

        registry.configure(ParameterSpecification, VariableUsage) [
            create = [createForReference(it.reference as AbsoluteReference)]
            when = [it.reference instanceof AbsoluteReference]
            map([it.specification]).thenSet [ usage, spec |
                val characterization = usage.variableCharacterisation_VariableUsage.get(0)
                characterization.specification_VariableCharacterisation = spec
                spec.variableCharacterisation_Specification = characterization
            ]
        ]

        registry.configure(ParameterSpecification, VariableUsage) [
            create = [createForReference(it.reference as RelativeReference)]
            when = [it.reference instanceof RelativeReference]
            map([it.specification]).thenSet [ usage, spec |
                val characteristic = usage.variableCharacterisation_VariableUsage.get(0)
                characteristic.specification_VariableCharacterisation = spec
                spec.variableCharacterisation_Specification = characteristic
            ]
        ]

        registry.configure(ParameterSpecification, VariableUsage) [
            when = [it.reference === null]
            create = [ParameterFactory.eINSTANCE.createVariableUsage]
            map([it.specification]).thenSet [ usage, spec |
                val characteristic = ParameterFactory.eINSTANCE.createVariableCharacterisation
                characteristic.specification_VariableCharacterisation = spec
                spec.variableCharacterisation_Specification = characteristic
                usage.variableCharacterisation_VariableUsage.add(characteristic)
            ]
        ]

        registry.configure(Expression, PCMRandomVariable) [
            create = [
                CoreFactory.eINSTANCE.createPCMRandomVariable => [ v |
                    v.specification = ExpressionConverter.getOriginalExpressionString(it)
                ]
            ]
        ]

        registry.configure(SEFFIterateAction, CollectionIteratorAction) [
            create = [SeffFactory.eINSTANCE.createCollectionIteratorAction]
            map([it.iterable]).thenSet [ action, iterable |
                action.parameter_CollectionIteratorAction = iterable
            ]
            mapAll([it.contents]).thenSet [ action, contents |
                val behavior = addActions(contents)
                action.bodyBehaviour_Loop = behavior
                behavior.abstractLoopAction_ResourceDemandingBehaviour = action
            ]
        ]
    }

    protected static def void configureRepositoryDatatypes(GeneratorTransformationRegistry registry) {
        registry.configure(PrimitiveDatatype, PrimitiveDataType) [
            create = [ dt |
                RepositoryFactory.eINSTANCE.createPrimitiveDataType => [
                    it.type = PrimitiveTypeEnum.valueOf(dt.type.getName)
                ]
            ]
        ]

        registry.configure(CollectionDatatype, CollectionDataType) [
            create = [RepositoryFactory.eINSTANCE.createCollectionDataType => [d|d.entityName = it.name]]
            map([it.collectionType]).thenSet [ collectionType, dataType |
                collectionType.innerType_CollectionDataType = dataType
            ]
        ]

        registry.configure(ComposedDatatype, CompositeDataType) [
            create = [RepositoryFactory.eINSTANCE.createCompositeDataType => [d|d.entityName = it.name]]
            mapAll([it.elements]).thenSet [ compositeType, elements |
                compositeType.innerDeclaration_CompositeDataType.addAll(elements)
            ]
        ]

        registry.configure(ComposedDatatypeElement, InnerDeclaration) [
            create = [RepositoryFactory.eINSTANCE.createInnerDeclaration => [d|d.entityName = it.name]]
            map([it.type]).thenSet [ parent, DataType dataType |
                parent.datatype_InnerDeclaration = dataType
                if (dataType instanceof CompositeDataType) {
                    parent.compositeDataType_InnerDeclaration = dataType as CompositeDataType
                }
            ]
            map([it.reference]).thenSet [ parent, dataType |
                parent.datatype_InnerDeclaration = dataType
            ]
        ]
    }

    static def PCMRandomVariable createVariableWithSpecification(Expression exp) {
        val spec = ExpressionConverter.getOriginalExpressionString(exp)
        return CoreFactory.eINSTANCE.createPCMRandomVariable => [it.specification = spec]
    }

    static def AbstractNamedReference copyReferences(NamespaceReference reference) {
        if (reference.innerReference_NamespaceReference instanceof NamespaceReference) {
            return StoexFactory.eINSTANCE.createNamespaceReference => [ r |
                r.referenceName = reference.referenceName
                if (reference.innerReference_NamespaceReference instanceof NamespaceReference) {
                    r.innerReference_NamespaceReference = copyReferences(
                        reference.innerReference_NamespaceReference as NamespaceReference)
                }
            ]
        } else {
            return StoexFactory.eINSTANCE.createVariableReference => [ v |
                v.referenceName = reference.referenceName
            ]
        }

    }

    static def VariableReference findVariableReference(AbstractNamedReference reference) {
        return switch (reference) {
            NamespaceReference: findVariableReference(reference.innerReference_NamespaceReference)
            VariableReference: reference
            default: null
        }
    }

    static def VariableUsage createForReference(RelativeReference reference) {
        return ParameterFactory.eINSTANCE.createVariableUsage => [ v |
            val variable = ParameterFactory.eINSTANCE.createVariableCharacterisation => [ vc |
                vc.type = VariableCharacterisationType.getByName(reference.characteristic.referenceName)
            ]
            v.variableCharacterisation_VariableUsage.add(variable)
            variable.variableUsage_VariableCharacterisation = v
        ]
    }

    static def VariableUsage createForReference(AbsoluteReference reference) {
        return ParameterFactory.eINSTANCE.createVariableUsage => [ v |
            v.namedReference__VariableUsage = copyReferences(reference.reference)
            val characteristic = findVariableReference(reference.reference)
            if (characteristic !== null) {
                val variable = ParameterFactory.eINSTANCE.createVariableCharacterisation => [ vc |
                    vc.type = VariableCharacterisationType.getByName(characteristic.referenceName)
                ]
                v.variableCharacterisation_VariableUsage.add(variable)
                variable.variableUsage_VariableCharacterisation = v
            }
        ]
    }

    static def void assignRepository(DataType type, org.palladiosimulator.pcm.repository.Repository repo) {
        type.repository__DataType = repo
        if (type instanceof CompositeDataType) {
            (type as CompositeDataType).innerDeclaration_CompositeDataType.forEach [ inner |
                if (inner.datatype_InnerDeclaration !== null &&
                    inner.datatype_InnerDeclaration.repository__DataType === null) {
                    inner.datatype_InnerDeclaration.assignRepository(repo)
                } else if (inner.compositeDataType_InnerDeclaration !== null &&
                    inner.compositeDataType_InnerDeclaration.repository__DataType === null) {
                    inner.compositeDataType_InnerDeclaration.assignRepository(repo)
                } else {
                    // TODO this should never happen.
                    return;
                }
            ]
        } else if (type instanceof CollectionDataType) {
            (type as CollectionDataType).innerType_CollectionDataType.assignRepository(repo)
        }
    }

    static def void updatePreviousAssignments(EList<? extends AbstractAction> actions) {
        for (var i = 1; i < actions.length; i++) {
            actions.get(i).predecessor_AbstractAction = actions.get(i - 1);
        }
    }

    static def void updateSuccessorAssignments(EList<? extends AbstractAction> actions) {
        for (var i = 0; i < actions.length - 1; i++) {
            actions.get(i).successor_AbstractAction = actions.get(i + 1);
        }
    }

    static def List<SEFFConditionalAlternative> collectAllBranches(SEFFConditionalAction action) {
        val all = new ArrayList<SEFFConditionalAlternative>();
        collectAllBranches(action.alternative, all);
        return all;
    }

    static def void collectAllBranches(SEFFConditionalAlternative alternative,
        List<SEFFConditionalAlternative> current) {
        if (alternative !== null) {
            current.add(alternative);
            if (alternative instanceof SEFFConditionalElseIf) {
                val elseif = alternative as SEFFConditionalElseIf
                collectAllBranches(elseif.alternative, current)
            }
        }
    }

    static def ResourceDemandingBehaviour createEmptyBehavior() {
        val behavior = SeffFactory.eINSTANCE.createResourceDemandingBehaviour
        behavior.steps_Behaviour.add(SeffFactory.eINSTANCE.createStartAction)
        behavior.steps_Behaviour.add(SeffFactory.eINSTANCE.createStopAction)
        return behavior
    }

    static def void addStepsToBranch(AbstractBranchTransition branch, List<AbstractAction> steps) {
        val behavior = branch.branchBehaviour_BranchTransition
        behavior.steps_Behaviour.add(SeffFactory.eINSTANCE.createStartAction)
        behavior.steps_Behaviour.addAll(steps)
        behavior.steps_Behaviour.add(SeffFactory.eINSTANCE.createStopAction)
        behavior.steps_Behaviour.forEach[it.resourceDemandingBehaviour_AbstractAction = behavior]
        behavior.steps_Behaviour.updatePreviousAssignments()
        behavior.steps_Behaviour.updateSuccessorAssignments()
    }

    static def ResourceDemandingBehaviour addActions(List<AbstractAction> steps) {
        val behavior = createEmptyBehavior
        behavior.steps_Behaviour.addAll(1, steps)
        behavior.steps_Behaviour.forEach[it.resourceDemandingBehaviour_AbstractAction = behavior]
        behavior.steps_Behaviour.updatePreviousAssignments()
        behavior.steps_Behaviour.updateSuccessorAssignments()
        return behavior
    }
}
