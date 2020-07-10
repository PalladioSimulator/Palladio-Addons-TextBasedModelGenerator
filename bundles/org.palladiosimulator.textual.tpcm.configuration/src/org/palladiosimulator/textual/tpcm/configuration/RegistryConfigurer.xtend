package org.palladiosimulator.textual.tpcm.configuration

import de.uka.ipd.sdq.stoex.Expression
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.common.util.EList
import org.palladiosimulator.pcm.allocation.AllocationFactory
import org.palladiosimulator.pcm.core.CoreFactory
import org.palladiosimulator.pcm.core.PCMRandomVariable
import org.palladiosimulator.pcm.core.composition.AssemblyConnector
import org.palladiosimulator.pcm.core.composition.CompositionFactory
import org.palladiosimulator.pcm.core.entity.EntityFactory
import org.palladiosimulator.pcm.core.entity.ResourceProvidedRole
import org.palladiosimulator.pcm.core.entity.ResourceRequiredRole
import org.palladiosimulator.pcm.parameter.ParameterFactory
import org.palladiosimulator.pcm.parameter.VariableCharacterisationType
import org.palladiosimulator.pcm.parameter.VariableUsage
import org.palladiosimulator.pcm.reliability.ReliabilityFactory
import org.palladiosimulator.pcm.repository.BasicComponent
import org.palladiosimulator.pcm.repository.CollectionDataType
import org.palladiosimulator.pcm.repository.CompositeDataType
import org.palladiosimulator.pcm.repository.DataType
import org.palladiosimulator.pcm.repository.EventGroup
import org.palladiosimulator.pcm.repository.EventType
import org.palladiosimulator.pcm.repository.InfrastructureProvidedRole
import org.palladiosimulator.pcm.repository.InfrastructureRequiredRole
import org.palladiosimulator.pcm.repository.InnerDeclaration
import org.palladiosimulator.pcm.repository.OperationInterface
import org.palladiosimulator.pcm.repository.OperationProvidedRole
import org.palladiosimulator.pcm.repository.OperationRequiredRole
import org.palladiosimulator.pcm.repository.PrimitiveDataType
import org.palladiosimulator.pcm.repository.PrimitiveTypeEnum
import org.palladiosimulator.pcm.repository.ProvidedRole
import org.palladiosimulator.pcm.repository.RepositoryFactory
import org.palladiosimulator.pcm.repository.RequiredRole
import org.palladiosimulator.pcm.repository.SinkRole
import org.palladiosimulator.pcm.repository.SourceRole
import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification
import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentFactory
import org.palladiosimulator.pcm.resourcetype.CommunicationLinkResourceType
import org.palladiosimulator.pcm.resourcetype.ResourceInterface
import org.palladiosimulator.pcm.resourcetype.ResourceRepository
import org.palladiosimulator.pcm.resourcetype.ResourceSignature
import org.palladiosimulator.pcm.resourcetype.ResourcetypeFactory
import org.palladiosimulator.pcm.seff.AbstractAction
import org.palladiosimulator.pcm.seff.AbstractBranchTransition
import org.palladiosimulator.pcm.seff.AcquireAction
import org.palladiosimulator.pcm.seff.BranchAction
import org.palladiosimulator.pcm.seff.CollectionIteratorAction
import org.palladiosimulator.pcm.seff.GuardedBranchTransition
import org.palladiosimulator.pcm.seff.InternalAction
import org.palladiosimulator.pcm.seff.LoopAction
import org.palladiosimulator.pcm.seff.ProbabilisticBranchTransition
import org.palladiosimulator.pcm.seff.ReleaseAction
import org.palladiosimulator.pcm.seff.ResourceDemandingInternalBehaviour
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF
import org.palladiosimulator.pcm.seff.SeffFactory
import org.palladiosimulator.pcm.seff.SetVariableAction
import org.palladiosimulator.pcm.seff.seff_performance.SeffPerformanceFactory
import org.palladiosimulator.pcm.system.SystemFactory
import org.palladiosimulator.textual.tpcm.generator.GeneratorTransformationRegistry
import org.palladiosimulator.textual.tpcm.generator.TransformationRegistryConfigurer
import org.palladiosimulator.textual.tpcm.language.AbsoluteReference
import org.palladiosimulator.textual.tpcm.language.Allocation
import org.palladiosimulator.textual.tpcm.language.AllocationContext
import org.palladiosimulator.textual.tpcm.language.AssemblyContext
import org.palladiosimulator.textual.tpcm.language.CollectionDatatype
import org.palladiosimulator.textual.tpcm.language.CommunicationLinkType
import org.palladiosimulator.textual.tpcm.language.Component
import org.palladiosimulator.textual.tpcm.language.ComposedDatatype
import org.palladiosimulator.textual.tpcm.language.ComposedDatatypeElement
import org.palladiosimulator.textual.tpcm.language.Connector
import org.palladiosimulator.textual.tpcm.language.Datatype
import org.palladiosimulator.textual.tpcm.language.DomainInterface
import org.palladiosimulator.textual.tpcm.language.DomainInterfaceProvidedRole
import org.palladiosimulator.textual.tpcm.language.EventSignature
import org.palladiosimulator.textual.tpcm.language.FailureType
import org.palladiosimulator.textual.tpcm.language.Interface
import org.palladiosimulator.textual.tpcm.language.InterfaceRequiredRole
import org.palladiosimulator.textual.tpcm.language.InternalInterfaceProvidedRole
import org.palladiosimulator.textual.tpcm.language.LinkingResource
import org.palladiosimulator.textual.tpcm.language.OperationSignature
import org.palladiosimulator.textual.tpcm.language.Parameter
import org.palladiosimulator.textual.tpcm.language.ParameterSpecification
import org.palladiosimulator.textual.tpcm.language.PrimitiveDatatype
import org.palladiosimulator.textual.tpcm.language.PrimitiveResultAssignment
import org.palladiosimulator.textual.tpcm.language.ProcessingResource
import org.palladiosimulator.textual.tpcm.language.ProcessingResourceType
import org.palladiosimulator.textual.tpcm.language.RelativeReference
import org.palladiosimulator.textual.tpcm.language.Repository
import org.palladiosimulator.textual.tpcm.language.ResourceContainer
import org.palladiosimulator.textual.tpcm.language.ResourceEnvironment
import org.palladiosimulator.textual.tpcm.language.ResourceInterfaceProvidedRole
import org.palladiosimulator.textual.tpcm.language.ResourceTypeRepository
import org.palladiosimulator.textual.tpcm.language.SEFF
import org.palladiosimulator.textual.tpcm.language.SEFFAssignment
import org.palladiosimulator.textual.tpcm.language.SEFFCallAction
import org.palladiosimulator.textual.tpcm.language.SEFFConditionalAction
import org.palladiosimulator.textual.tpcm.language.SEFFConditionalAlternative
import org.palladiosimulator.textual.tpcm.language.SEFFConditionalElse
import org.palladiosimulator.textual.tpcm.language.SEFFConditionalElseIf
import org.palladiosimulator.textual.tpcm.language.SEFFIterateAction
import org.palladiosimulator.textual.tpcm.language.SEFFLoopAction
import org.palladiosimulator.textual.tpcm.language.SEFFProbabilisticAction
import org.palladiosimulator.textual.tpcm.language.SEFFProbabilisticBranch
import org.palladiosimulator.pcm.repository.PassiveResource
import org.palladiosimulator.pcm.seff.ExternalCallAction
import org.palladiosimulator.pcm.seff.InternalCallAction
import org.palladiosimulator.textual.tpcm.language.ComplexResultAssignment
import org.palladiosimulator.textual.tpcm.language.ResultSpecification
import org.palladiosimulator.pcm.seff.EmitEventAction
import org.palladiosimulator.textual.tpcm.language.InternalConfigurableInterface
import org.palladiosimulator.textual.tpcm.language.Initialization

class RegistryConfigurer implements TransformationRegistryConfigurer {

    static def PCMRandomVariable createVariableWithSpecification(Expression exp) {
        val spec = ExpressionConverter.getOriginalExpressionString(exp)
        return CoreFactory.eINSTANCE.createPCMRandomVariable => [it.specification = spec]
    }

    static def Expression getInitPropertyExpression(Initialization init, String propertyName) {
        val prop = init?.contents?.findFirst[it.property.name == propertyName]
        return prop?.specification
    }

    static def void assignRepository(DataType type, org.palladiosimulator.pcm.repository.Repository repo) {
        type.repository__DataType = repo
        if (type instanceof CompositeDataType) {
            (type as CompositeDataType).innerDeclaration_CompositeDataType.forEach [ inner |
                if (inner.datatype_InnerDeclaration !== null) {
                    inner.datatype_InnerDeclaration.assignRepository(repo)
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

    static def void addStepsToBranch(AbstractBranchTransition branch, List<AbstractAction> steps) {
        val behavior = SeffFactory.eINSTANCE.createResourceDemandingInternalBehaviour
        branch.branchBehaviour_BranchTransition = behavior
        behavior.abstractBranchTransition_ResourceDemandingBehaviour = branch
        behavior.steps_Behaviour.addAll(steps)
        steps.forEach[it.resourceDemandingBehaviour_AbstractAction = behavior]
        behavior.steps_Behaviour.updatePreviousAssignments()
        behavior.steps_Behaviour.updateSuccessorAssignments()
    }

    static def ResourceDemandingInternalBehaviour addActions(List<AbstractAction> steps) {
        val behavior = SeffFactory.eINSTANCE.createResourceDemandingInternalBehaviour
        behavior.steps_Behaviour.addAll(steps)
        steps.forEach[it.resourceDemandingBehaviour_AbstractAction = behavior]
        behavior.steps_Behaviour.updatePreviousAssignments()
        behavior.steps_Behaviour.updateSuccessorAssignments()
        return behavior
    }

    override void configure(GeneratorTransformationRegistry registry) {
        registry.configureRepository()
        registry.configureResourceTypes()
        registry.configureResourceEnvironment()
        registry.configureAllocation()
        registry.configureSystem()
    }

    protected def void configureRepository(GeneratorTransformationRegistry registry) {
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

    protected def void configureRepositoryComponent(GeneratorTransformationRegistry registry) {
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
            mapAll([
                it.contents.filter(InternalInterfaceProvidedRole).filter [
                    !(it.type.eContainer instanceof ResourceTypeRepository)
                ].toList
            ]).thenSet [ component, resources |
                component.providedRoles_InterfaceProvidingEntity.addAll(resources.filter(ProvidedRole))
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
            map([getInitPropertyExpression(it.initialization, "capacity")], PCMRandomVariable).thenSet [ resource, capacity |
                resource.capacity_PassiveResource = capacity;
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

    protected def void configureRepositoryComponentSEFF(GeneratorTransformationRegistry registry) {
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
                it.signature.name == "acquire" && it.role instanceof InternalInterfaceProvidedRole &&
                    it.role.type.eContainer instanceof ResourceTypeRepository
            ]
            map([it.role], PassiveResource).thenSet [ action, resource |
                action.passiveresource_AcquireAction = resource
            ]
        ]

        registry.configure(SEFFCallAction, ReleaseAction) [
            create = [SeffFactory.eINSTANCE.createReleaseAction]
            when = [
                it.signature.name == "release" && it.role instanceof InternalInterfaceProvidedRole &&
                    it.role.type.eContainer instanceof ResourceTypeRepository
            ]
            map([it.role], PassiveResource).thenSet [ action, resource |
                action.passiveResource_ReleaseAction = resource
            ]
        ]

        registry.configure(SEFFProbabilisticAction, BranchAction) [
            create = [SeffFactory.eINSTANCE.createBranchAction]
            mapAll([it.branches]).thenSet [ action, branches |
                action.branches_Branch.addAll(branches)
                branches.forEach[it.branchAction_AbstractBranchTransition = action]
            ]
        ]

        registry.configure(SEFFProbabilisticBranch, ProbabilisticBranchTransition) [
            create = [
                SeffFactory.eINSTANCE.createProbabilisticBranchTransition => [t|t.branchProbability = it.probability]
            ]
            mapAll([it.contents]).thenSet [ branch, actions |
                branch.addStepsToBranch(actions)
            ]
        ]

        registry.configure(SEFFLoopAction, LoopAction) [
            create = [SeffFactory.eINSTANCE.createLoopAction]
            map([it.condition], PCMRandomVariable).thenSet [ loop, variable |
                loop.iterationCount_LoopAction = variable
                variable.loopAction_PCMRandomVariable = loop
            ]
            mapAll([it.contents]).thenSet [ loop, actions |
                val behavior = SeffFactory.eINSTANCE.createResourceDemandingInternalBehaviour
                behavior.steps_Behaviour.addAll(actions)
                behavior.steps_Behaviour.updatePreviousAssignments();
                behavior.steps_Behaviour.updateSuccessorAssignments();
                behavior.steps_Behaviour.forEach[it.resourceDemandingBehaviour_AbstractAction = behavior]
                loop.bodyBehaviour_Loop = behavior
            ]
        ]

        registry.configure(SEFFConditionalAction, BranchAction) [
            create = [
                SeffFactory.eINSTANCE.createBranchAction => [
                    val branch = SeffFactory.eINSTANCE.createGuardedBranchTransition
                    it.branches_Branch.add(branch)
                    branch.branchAction_AbstractBranchTransition = it
                ]
            ]
            map([it.condition], PCMRandomVariable).thenSet [ action, condition |
                val branch = action.branches_Branch.get(0) as GuardedBranchTransition
                branch.branchCondition_GuardedBranchTransition = condition
            ]
            mapAll([it.contents]).thenSet [ action, contents |
                val branch = action.branches_Branch.get(0) as GuardedBranchTransition
                branch.addStepsToBranch(contents)
            ]
            map([collectAllBranches]).thenSet [ action, alternatives |
                action.branches_Branch.addAll(alternatives)
                alternatives.forEach[it.branchAction_AbstractBranchTransition = action]
            ]
        ]

        registry.configure(SEFFConditionalElseIf, GuardedBranchTransition) [
            create = [SeffFactory.eINSTANCE.createGuardedBranchTransition]
            map([it.condition], PCMRandomVariable).thenSet [ transition, variable |
                transition.branchCondition_GuardedBranchTransition = variable
            ]
            mapAll([it.contents]).thenSet [ branch, actions |
                branch.addStepsToBranch(actions)
            ]
        ]

        registry.configure(SEFFConditionalElse, GuardedBranchTransition) [
            create = [SeffFactory.eINSTANCE.createGuardedBranchTransition]
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
            map([it.specification]).thenSet [action, spec |
//                action.localVariableUsages_SetVariableAction.get(0).variableCharacterisation_VariableUsage.add(spec)
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
            create = [SeffFactory.eINSTANCE.createExternalCallAction]
            when = [it.result !== null]
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
        ]

        registry.configure(PrimitiveResultAssignment, VariableUsage) [
            create = [
                ParameterFactory.eINSTANCE.createVariableUsage => [ v |
                    v.namedReference__VariableUsage = (it.reference as AbsoluteReference).reference
                ]
            ]
            when = [it.reference instanceof AbsoluteReference]
        ]

        registry.configure(PrimitiveResultAssignment, VariableUsage) [
            create = [
                ParameterFactory.eINSTANCE.createVariableUsage => [ v |
                    val characterization = VariableCharacterisationType.getByName(
                        (it.reference as RelativeReference).characteristic.referenceName)
                    val variable = ParameterFactory.eINSTANCE.createVariableCharacterisation => [ vc |
                        vc.type = characterization
                    ]
                    v.variableCharacterisation_VariableUsage.add(variable)
                    variable.variableUsage_VariableCharacterisation = v
                ]
            ]
            when = [it.reference instanceof RelativeReference]
        ]

        registry.configure(ResultSpecification, VariableUsage) [
            create = [
                ParameterFactory.eINSTANCE.createVariableUsage => [ v |
                    v.namedReference__VariableUsage = (it.characteristic as AbsoluteReference).reference
                ]
            ]
            when = [it.characteristic instanceof AbsoluteReference]
        ]

        registry.configure(ResultSpecification, VariableUsage) [
            create = [
                ParameterFactory.eINSTANCE.createVariableUsage => [ v |
                    val characterization = VariableCharacterisationType.getByName(
                        (it.characteristic as RelativeReference).characteristic.referenceName)
                    val variable = ParameterFactory.eINSTANCE.createVariableCharacterisation => [ vc |
                        vc.type = characterization
                    ]
                    v.variableCharacterisation_VariableUsage.add(variable)
                    variable.variableUsage_VariableCharacterisation = v
                ]
            ]
            when = [it.characteristic instanceof RelativeReference]
        ]

        registry.configure(SEFFCallAction, InternalAction) [
            create = [SeffFactory.eINSTANCE.createInternalAction]
            when = [
                it.role instanceof InternalInterfaceProvidedRole &&
                    !(it.role.type.eContainer instanceof ResourceTypeRepository)
            ]
            map([it.role]).thenSet [ action, role |
                val call = SeffPerformanceFactory.eINSTANCE.createInfrastructureCall
                call.requiredRole__InfrastructureCall = role as InfrastructureRequiredRole
                action.infrastructureCall__Action.add(call);
            ]
            map([it.signature]).thenSet [action, sig |
                
            ]
            mapAll([it.parameters]).thenSet [ action, params |
                val call = action.resourceCall__Action.get(0)
                call.inputVariableUsages__CallAction.addAll(params)
                params.forEach[it.callAction__VariableUsage = call]
            ]
        ]

        registry.configure(SEFFCallAction, InternalAction) [
            create = [SeffFactory.eINSTANCE.createInternalAction]
            when = [
                it.role.type.eContainer instanceof ResourceTypeRepository &&
                    !(it.signature.name == "acquire" || it.signature.name == "release")
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
            ]
        ]

        registry.configure(SEFFCallAction, InternalCallAction) [ // TODO how can I make a call to provided interfaces?
            create = [SeffFactory.eINSTANCE.createInternalCallAction]
            when = [it.role instanceof DomainInterfaceProvidedRole]
//            map([it.role]).thenSet [ action, role |
////                val call = SeffPerformanceFactory.eINSTANCE.createInfrastructureCall
////                call.
////                action.infrastructureCall__Action.
////                action.role_ExternalService = role
//            ]
        ]

        registry.configure(ParameterSpecification, VariableUsage) [
            create = [ParameterFactory.eINSTANCE.createVariableUsage]
            when = [it.reference instanceof AbsoluteReference]
            map([it.reference]).thenSet [ usage, reference |
                usage.namedReference__VariableUsage = reference
            ]
            map([it.specification]).thenSet [ usage, spec |
                val characteristic = ParameterFactory.eINSTANCE.createVariableCharacterisation
                characteristic.specification_VariableCharacterisation = spec
                spec.variableCharacterisation_Specification = characteristic
                usage.variableCharacterisation_VariableUsage.add(characteristic)
            ]
        ]

        registry.configure(ParameterSpecification, VariableUsage) [
            when = [it.reference instanceof RelativeReference]
            create = [
                ParameterFactory.eINSTANCE.createVariableUsage => [ u |
                    val reference = it.reference as RelativeReference
                    if (reference.characteristic !== null && reference.characteristic.referenceName !== null) {
                        val characteristic = ParameterFactory.eINSTANCE.createVariableCharacterisation
                        val characteristicName = (it.reference as RelativeReference).characteristic.referenceName
                        characteristic.type = VariableCharacterisationType.getByName(characteristicName)
                        u.variableCharacterisation_VariableUsage.add(characteristic)
                        characteristic.variableUsage_VariableCharacterisation = u
                    }
                ]
            ]
            map([it.reference]).thenSet [ usage, reference |
                usage.namedReference__VariableUsage = reference
            ]
            map([it.specification]).thenSet [ usage, spec |
                val characteristic = usage.variableCharacterisation_VariableUsage.get(0)
                characteristic.specification_VariableCharacterisation = spec
                spec.variableCharacterisation_Specification = characteristic
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

    protected def void configureRepositoryDatatypes(GeneratorTransformationRegistry registry) {
        registry.configure(PrimitiveDatatype, PrimitiveDataType) [
            create = [ dt |
                RepositoryFactory.eINSTANCE.createPrimitiveDataType => [
                    it.type = PrimitiveTypeEnum.valueOf(dt.type.getName)
                ]
            ]
        ]

        registry.configure(CollectionDatatype, CollectionDataType) [
            create = [RepositoryFactory.eINSTANCE.createCollectionDataType]
            map([it.collectionType]).thenSet [ collectionType, dataType |
                collectionType.innerType_CollectionDataType = dataType
            ]
        ]

        registry.configure(ComposedDatatype, CompositeDataType) [
            create = [RepositoryFactory.eINSTANCE.createCompositeDataType]
            mapAll([it.elements]).thenSet [ compositeType, elements |
                compositeType.innerDeclaration_CompositeDataType.addAll(elements)
            ]
        ]

        registry.configure(ComposedDatatypeElement, InnerDeclaration) [
            create = [RepositoryFactory.eINSTANCE.createInnerDeclaration]
            when = [it.type !== null]
            map([it.type]).thenSet [ parent, dataType |
                parent.compositeDataType_InnerDeclaration = dataType
            ]
        ]

        registry.configure(ComposedDatatypeElement, InnerDeclaration) [
            create = [RepositoryFactory.eINSTANCE.createInnerDeclaration]
            when = [it.reference !== null]
            map([it.reference]).thenSet [ parent, dataType |
                parent.datatype_InnerDeclaration = dataType
            ]
        ]
    }

    protected def void configureResourceTypes(GeneratorTransformationRegistry registry) {
        registry.configure(DomainInterface, OperationInterface) [
            when = [it.contents.forall[it instanceof OperationSignature]]
            create = [RepositoryFactory.eINSTANCE.createOperationInterface => [i|i.entityName = it.name]]
            mapAll([it.contents.filter(OperationSignature).toList],
                org.palladiosimulator.pcm.repository.OperationSignature).thenSet [ iface, signatures |
                iface.signatures__OperationInterface.addAll(signatures)
                signatures.forEach[it.interface__OperationSignature = iface]
            ]
        ]

        registry.configure(DomainInterface, EventGroup) [
            when = [it.contents.forall[it instanceof EventSignature]]
            create = [RepositoryFactory.eINSTANCE.createEventGroup => [i|i.entityName = it.name]]
            mapAll([it.contents.filter(EventSignature).toList], EventType).thenSet [ iface, signatures |
                iface.eventTypes__EventGroup.addAll(signatures)
                signatures.forEach[it.eventGroup__EventType = iface]
            ]
        ]

        registry.configure(OperationSignature, org.palladiosimulator.pcm.repository.OperationSignature) [
            create = [RepositoryFactory.eINSTANCE.createOperationSignature => [s|s.entityName = it.name]]
            mapAll([it.parameters]).thenSet [ sig, params |
                sig.parameters__OperationSignature.addAll(params)
                params.forEach[it.operationSignature__Parameter = sig]
            ]
            map([it.^return]).thenSet [ sig, ret |
                sig.returnType__OperationSignature = ret
            ]
        ]

        registry.configure(EventSignature, EventType) [
            create = [RepositoryFactory.eINSTANCE.createEventType => [e|e.entityName = it.name]]
            // in the language parameters can be multiple, but the event type only allows one!?
            map([it.parameters.head]).thenSet [ sig, param |
                sig.parameter__EventType = param
                if (param !== null) {
                    param.eventType__Parameter = sig
                }
            ]
        ]

        registry.configure(FailureType, org.palladiosimulator.pcm.reliability.FailureType) [
            create = [ReliabilityFactory.eINSTANCE.createSoftwareInducedFailureType => [f|f.entityName = it.name]]
        ]

        registry.configure(ResourceTypeRepository, ResourceRepository) [
            create = [ResourcetypeFactory.eINSTANCE.createResourceRepository]
            mapAll([it.contents.filter(Interface).toList], ResourceInterface).thenSet [ resourceTypes, interfaces |
                resourceTypes.resourceInterfaces__ResourceRepository.addAll(interfaces)
                interfaces.forEach[it.resourceRepository__ResourceInterface = resourceTypes]
            ]
        ]

        registry.configure(org.palladiosimulator.textual.tpcm.language.ResourceInterface, ResourceInterface) [
            create = [ResourcetypeFactory.eINSTANCE.createResourceInterface => [i|i.entityName = it.name]]
            mapAll([it.contents], ResourceSignature).thenSet [ iface, signatures |
                iface.resourceSignatures__ResourceInterface.addAll(signatures)
                signatures.forEach[it.resourceInterface__ResourceSignature = iface]
            ]
        ]

        registry.configure(InternalConfigurableInterface, ResourceInterface) [
            create = [ResourcetypeFactory.eINSTANCE.createResourceInterface => [i|i.entityName = it.name]]
            mapAll([it.contents], ResourceSignature).thenSet [ iface, signatures |
                iface.resourceSignatures__ResourceInterface.addAll(signatures)
                signatures.forEach[it.resourceInterface__ResourceSignature = iface]
            ]
        ]

        registry.configure(OperationSignature, ResourceSignature) [
            create = [ResourcetypeFactory.eINSTANCE.createResourceSignature => [s|s.entityName = it.name]]
            mapAll([it.parameters]).thenSet [ signature, params |
                signature.parameter__ResourceSignature.addAll(params)
                params.forEach[it.resourceSignature__Parameter = signature]
            ]
        ]

        registry.configure(Parameter, org.palladiosimulator.pcm.repository.Parameter) [
            create = [RepositoryFactory.eINSTANCE.createParameter => [p|p.parameterName = it.name]]
            map([it.type]).thenSet [ param, type |
                param.dataType__Parameter = type
            ]
        ]

        registry.configure(ProcessingResourceType, org.palladiosimulator.pcm.resourcetype.ProcessingResourceType) [
            create = [ResourcetypeFactory.eINSTANCE.createProcessingResourceType => [t|t.entityName = it.name]]
            mapAll([it.contents.filter(ResourceInterfaceProvidedRole).toList]).thenSet [ type, roles |
                type.resourceProvidedRoles__ResourceInterfaceProvidingEntity.addAll(roles)
                roles.forEach[it.resourceInterfaceProvidingEntity__ResourceProvidedRole = type]
            ]
        // mapAll([it.contents.filter(ResourceFailureSpecification).map[it.failureType].toList]).thenSet [type, failures |
        // // TODO this requires a hardware failure ... which doesn't seem to make sense
        // ]
        ]

        registry.configure(ResourceInterfaceProvidedRole, ResourceProvidedRole) [
            create = [EntityFactory.eINSTANCE.createResourceProvidedRole]
            map([it.type], ResourceInterface).thenSet [ role, type |
                role.providedResourceInterface__ResourceProvidedRole = type
            ]
        ]

        registry.configure(CommunicationLinkType, CommunicationLinkResourceType) [
            create = [ResourcetypeFactory.eINSTANCE.createCommunicationLinkResourceType => [t|t.entityName = it.name]]
        ]
    }

    protected def void configureResourceEnvironment(GeneratorTransformationRegistry registry) {
        registry.configure(ResourceEnvironment, org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment) [
            create = [ResourceenvironmentFactory.eINSTANCE.createResourceEnvironment => [e|e.entityName = it.name]]
            mapAll([it.contents.filter(ResourceContainer).toList]).thenSet [ environment, container |
                environment.resourceContainer_ResourceEnvironment.addAll(container)
                container.forEach[it.resourceEnvironment_ResourceContainer = environment]
            ]
            mapAll([it.contents.filter(LinkingResource).toList]).thenSet [ environment, links |
                environment.linkingResources__ResourceEnvironment.addAll(links)
                links.forEach[it.resourceEnvironment_LinkingResource = environment]
            ]
        ]

        registry.configure(ResourceContainer, org.palladiosimulator.pcm.resourceenvironment.ResourceContainer) [
            create = [ResourceenvironmentFactory.eINSTANCE.createResourceContainer => [e|e.entityName = it.name]]
            mapAll([it.contents.filter(ProcessingResource).toList]).thenSet [ container, resources |
                container.activeResourceSpecifications_ResourceContainer.addAll(resources)
                resources.forEach[it.resourceContainer_ProcessingResourceSpecification = container]
            ]
        ]

        registry.configure(ProcessingResource, ProcessingResourceSpecification) [
            create = [ResourceenvironmentFactory.eINSTANCE.createProcessingResourceSpecification]
            map([getInitPropertyExpression(it.initialization, "processingRate")], PCMRandomVariable).thenSet [ resource, rate |
                resource.processingRate_ProcessingResourceSpecification = rate
            ]
            map([getInitPropertyExpression(it.initialization, "schedulingPolicy")],
                org.palladiosimulator.pcm.resourcetype.SchedulingPolicy).thenSet [ resource, policy |
                resource.schedulingPolicy = policy
            ]
            map([it.type]).thenSet [ resource, type |
                resource.activeResourceType_ActiveResourceSpecification = type
            ]
        ]

        registry.configure(LinkingResource, org.palladiosimulator.pcm.resourceenvironment.LinkingResource) [
            create = [ResourceenvironmentFactory.eINSTANCE.createLinkingResource => [e|e.entityName = it.name]]
            map([it.type]).thenSet [ link, type |
                var spec = ResourceenvironmentFactory.eINSTANCE.createCommunicationLinkResourceSpecification => [
                    it.communicationLinkResourceType_CommunicationLinkResourceSpecification = type
                ]
                link.communicationLinkResourceSpecifications_LinkingResource = spec
                spec.linkingResource_CommunicationLinkResourceSpecification = link
            ]
            map([getInitPropertyExpression(it.initialization, "latency")], PCMRandomVariable).thenSet [ link, latency |
                link.
                    communicationLinkResourceSpecifications_LinkingResource.latency_CommunicationLinkResourceSpecification = latency
            ]
            map([getInitPropertyExpression(it.initialization, "throughput")]).thenSet [ link, throughput |
                link.
                    communicationLinkResourceSpecifications_LinkingResource.throughput_CommunicationLinkResourceSpecification = throughput
            ]
            mapAll([it.connected]).thenSet [ link, connected |
                link.connectedResourceContainers_LinkingResource.addAll(connected)
            ]
        ]
    }

    protected def void configureSystem(GeneratorTransformationRegistry registry) {
        registry.configure(org.palladiosimulator.textual.tpcm.language.System, org.palladiosimulator.pcm.system.System) [
            create = [SystemFactory.eINSTANCE.createSystem => [s|s.entityName = it.name]]
            mapAll([it.contents.filter(AssemblyContext).toList]).thenSet [ system, assemblies |
                system.assemblyContexts__ComposedStructure.addAll(assemblies)
                assemblies.forEach[it.parentStructure__AssemblyContext = system]
            ]

            mapAll([it.contents.filter(Connector).toList]).thenSet [ system, List<AssemblyConnector> connector |
                system.connectors__ComposedStructure.addAll(connector)
                connector.forEach[it.parentStructure__Connector = system]
            ]

            after = [
                val newConnectors = new ArrayList<AssemblyConnector>();
                for (connector : it.connectors__ComposedStructure.filter(AssemblyConnector).filter [
                    it.providedRole_AssemblyConnector === null
                ]) {

                    val providedRoles = connector.providingAssemblyContext_AssemblyConnector.
                        encapsulatedComponent__AssemblyContext.providedRoles_InterfaceProvidingEntity.filter(
                            OperationProvidedRole).toList
                    val requiredRoles = connector.requiringAssemblyContext_AssemblyConnector.
                        encapsulatedComponent__AssemblyContext.requiredRoles_InterfaceRequiringEntity.filter(
                            OperationRequiredRole).toList
                    val matches = findMatchingRoles(providedRoles, requiredRoles)
                    if (matches.size == 1) {
                        val match = matches.get(0)
                        connector.providedRole_AssemblyConnector = match.providingRole
                        connector.requiredRole_AssemblyConnector = match.requiringRole
                    } else {
                        val firstMatch = matches.get(0)
                        connector.providedRole_AssemblyConnector = firstMatch.providingRole
                        connector.requiredRole_AssemblyConnector = firstMatch.requiringRole
                        for (var i = 1; i < matches.size; i++) {
                            val copy = copyConnector(connector)
                            val match = matches.get(i)
                            copy.providedRole_AssemblyConnector = match.providingRole
                            copy.requiredRole_AssemblyConnector = match.requiringRole
                            newConnectors.add(copy)
                        }
                    }
                }
                it.connectors__ComposedStructure.addAll(newConnectors)

                it.connectors__ComposedStructure.filter(AssemblyConnector).forEach [ connector |
                    if (!it.assemblyContexts__ComposedStructure.contains(
                        connector.providingAssemblyContext_AssemblyConnector)) {
                        val provided = connector.providingAssemblyContext_AssemblyConnector;
                        it.assemblyContexts__ComposedStructure.add(provided);
                        provided.parentStructure__AssemblyContext = it;
                    } else if (!it.assemblyContexts__ComposedStructure.contains(
                        connector.requiringAssemblyContext_AssemblyConnector)) {
                        val required = connector.requiringAssemblyContext_AssemblyConnector;
                        it.assemblyContexts__ComposedStructure.add(required);
                        required.parentStructure__AssemblyContext = it;
                    }
                ]
            ]
        ]

        registry.configure(Connector, AssemblyConnector) [
            create = [CompositionFactory.eINSTANCE.createAssemblyConnector => [a|a.entityName = it.name]]
            map([it.from]).thenSet [ connector, from |
                connector.providingAssemblyContext_AssemblyConnector = from
            ]

            map([it.to]).thenSet [ connector, to |
                connector.requiringAssemblyContext_AssemblyConnector = to
            ]
            map([it.target]).thenSet [ connector, to |
                connector.requiringAssemblyContext_AssemblyConnector = to
            ]
            map([it.requiringRole]).thenSet [ connector, requiringRole |
                connector.requiredRole_AssemblyConnector = requiringRole
                val providingRole = connector.providingAssemblyContext_AssemblyConnector.
                    encapsulatedComponent__AssemblyContext.providedRoles_InterfaceProvidingEntity.filter(
                        OperationProvidedRole).findFirst [
                        it.providedInterface__OperationProvidedRole ===
                            requiringRole.requiredInterface__OperationRequiredRole
                    ]
                connector.providedRole_AssemblyConnector = providingRole
            ]
        ]

        registry.configure(AssemblyContext, org.palladiosimulator.pcm.core.composition.AssemblyContext) [
            create = [CompositionFactory.eINSTANCE.createAssemblyContext => [a|a.entityName = it.name]]
            map([it.component]).thenSet [ context, component |
                context.encapsulatedComponent__AssemblyContext = component
            ]
        ]
    }

    protected def void configureAllocation(GeneratorTransformationRegistry registry) {
        registry.configure(Allocation, org.palladiosimulator.pcm.allocation.Allocation) [
            create = [AllocationFactory.eINSTANCE.createAllocation => [a|a.entityName = it.name]]
            mapAll([it.contents.filter(AllocationContext).flatMap[SingleAssemblyAllocation.getAllFrom(it)].toList]).
                thenSet [ allocation, contexts |
                    allocation.allocationContexts_Allocation.addAll(contexts)
                    contexts.forEach[it.allocation_AllocationContext = allocation]
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

    private def AssemblyConnector copyConnector(AssemblyConnector connector) {
        CompositionFactory.eINSTANCE.createAssemblyConnector => [
            it.entityName = connector.entityName
            it.parentStructure__Connector = connector.parentStructure__Connector
            it.providingAssemblyContext_AssemblyConnector = connector.providingAssemblyContext_AssemblyConnector
            it.requiringAssemblyContext_AssemblyConnector = connector.requiringAssemblyContext_AssemblyConnector
        ]
    }

    private def List<RoleMatch> findMatchingRoles(List<OperationProvidedRole> providingRoles,
        List<OperationRequiredRole> requiringRole) {
        val matches = new ArrayList<RoleMatch>();
        for (provided : providingRoles) {
            val allRequiring = requiringRole.filter [
                it.requiredInterface__OperationRequiredRole === provided.providedInterface__OperationProvidedRole
            ].toList
            if (allRequiring.size > 1) {
                throw new IllegalStateException("Got a connector that isn't specific enough.");
            } else if (allRequiring.size == 1) {
                matches.add(new RoleMatch(provided, allRequiring.get(0)))
            }
        }

        return matches;
    }

    private static class RoleMatch {
        public final OperationProvidedRole providingRole;
        public final OperationRequiredRole requiringRole;

        new(OperationProvidedRole providingRole, OperationRequiredRole requiringRole) {
            this.providingRole = providingRole;
            this.requiringRole = requiringRole;
        }
    }
}
