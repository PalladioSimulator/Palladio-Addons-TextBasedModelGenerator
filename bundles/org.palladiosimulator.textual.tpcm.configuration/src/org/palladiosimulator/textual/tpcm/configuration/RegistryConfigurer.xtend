package org.palladiosimulator.textual.tpcm.configuration

import org.palladiosimulator.textual.tpcm.generator.GeneratorTransformationRegistry
import org.palladiosimulator.pcm.repository.DataType
import org.palladiosimulator.pcm.repository.CompositeDataType
import org.palladiosimulator.pcm.repository.CollectionDataType
import org.eclipse.emf.common.util.EList
import java.util.List
import org.palladiosimulator.textual.tpcm.language.SEFFConditionalAlternative
import org.palladiosimulator.textual.tpcm.language.SEFFConditionalAction
import java.util.ArrayList
import org.palladiosimulator.textual.tpcm.language.SEFFConditionalElseIf
import org.palladiosimulator.pcm.seff.AbstractBranchTransition
import org.palladiosimulator.pcm.seff.SeffFactory
import org.palladiosimulator.pcm.seff.ResourceDemandingInternalBehaviour
import org.palladiosimulator.pcm.repository.RepositoryFactory
import org.palladiosimulator.textual.tpcm.language.Repository
import org.palladiosimulator.pcm.seff.AbstractAction
import org.palladiosimulator.textual.tpcm.language.Datatype
import org.palladiosimulator.textual.tpcm.language.FailureType
import org.palladiosimulator.textual.tpcm.language.Component
import org.palladiosimulator.textual.tpcm.language.PrimitiveDatatype
import org.palladiosimulator.pcm.repository.PrimitiveDataType
import org.palladiosimulator.pcm.repository.PrimitiveTypeEnum
import org.palladiosimulator.textual.tpcm.language.CollectionDatatype
import org.palladiosimulator.textual.tpcm.language.ComposedDatatype
import org.palladiosimulator.textual.tpcm.language.ComposedDatatypeElement
import org.palladiosimulator.pcm.repository.InnerDeclaration
import org.palladiosimulator.textual.tpcm.language.DomainInterface
import org.palladiosimulator.pcm.repository.OperationInterface
import org.palladiosimulator.textual.tpcm.language.OperationSignature
import org.palladiosimulator.pcm.repository.EventGroup
import org.palladiosimulator.textual.tpcm.language.EventSignature
import org.palladiosimulator.pcm.repository.EventType
import org.palladiosimulator.pcm.reliability.ReliabilityFactory
import org.palladiosimulator.textual.tpcm.language.ResourceTypeRepository
import org.palladiosimulator.pcm.resourcetype.ResourceRepository
import org.palladiosimulator.pcm.resourcetype.ResourcetypeFactory
import org.palladiosimulator.textual.tpcm.language.Interface
import org.palladiosimulator.pcm.resourcetype.ResourceInterface
import org.palladiosimulator.pcm.resourcetype.ResourceSignature
import org.palladiosimulator.textual.tpcm.language.InternalInterface
import org.palladiosimulator.textual.tpcm.language.Parameter
import org.palladiosimulator.textual.tpcm.language.ProcessingResourceType
import org.palladiosimulator.textual.tpcm.language.ResourceInterfaceProvidedRole
import org.palladiosimulator.pcm.core.entity.ResourceProvidedRole
import org.palladiosimulator.pcm.core.entity.EntityFactory
import org.palladiosimulator.textual.tpcm.language.CommunicationLinkType
import org.palladiosimulator.pcm.resourcetype.CommunicationLinkResourceType
import org.palladiosimulator.textual.tpcm.language.SchedulingPolicy
import org.palladiosimulator.textual.tpcm.language.ResourceEnvironment
import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentFactory
import org.palladiosimulator.textual.tpcm.language.ResourceContainer
import org.palladiosimulator.textual.tpcm.language.LinkingResource
import org.palladiosimulator.textual.tpcm.language.ProcessingResource
import org.palladiosimulator.textual.tpcm.language.HDDResource
import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification
import org.palladiosimulator.textual.tpcm.language.Allocation
import org.palladiosimulator.pcm.allocation.AllocationFactory
import org.palladiosimulator.textual.tpcm.language.AllocationContext
import org.palladiosimulator.pcm.system.SystemFactory
import org.palladiosimulator.textual.tpcm.language.AssemblyContext
import org.palladiosimulator.textual.tpcm.language.Connector
import org.palladiosimulator.pcm.core.composition.AssemblyConnector
import org.palladiosimulator.pcm.core.composition.CompositionFactory
import org.palladiosimulator.pcm.repository.BasicComponent
import org.palladiosimulator.textual.tpcm.language.InternalInterfaceProvidedRole
import org.palladiosimulator.textual.tpcm.language.SEFF
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF
import org.palladiosimulator.textual.tpcm.language.SEFFCallAction
import org.palladiosimulator.pcm.seff.AcquireAction
import org.palladiosimulator.pcm.seff.ReleaseAction
import org.palladiosimulator.textual.tpcm.language.SEFFProbabilisticAction
import org.palladiosimulator.pcm.seff.BranchAction
import org.palladiosimulator.textual.tpcm.language.SEFFProbabilisticBranch
import org.palladiosimulator.pcm.seff.ProbabilisticBranchTransition
import org.palladiosimulator.textual.tpcm.language.SEFFLoopAction
import org.palladiosimulator.pcm.seff.LoopAction
import org.palladiosimulator.pcm.core.PCMRandomVariable
import org.palladiosimulator.pcm.seff.GuardedBranchTransition
import org.palladiosimulator.textual.tpcm.language.SEFFConditionalElse
import org.palladiosimulator.textual.tpcm.language.SEFFAssignment
import org.palladiosimulator.pcm.seff.SetVariableAction
import org.palladiosimulator.textual.tpcm.language.PrimitiveResultAssignment
import org.palladiosimulator.pcm.parameter.VariableUsage
import org.palladiosimulator.pcm.parameter.ParameterFactory
import org.palladiosimulator.textual.tpcm.language.SEFFIterateAction
import org.palladiosimulator.pcm.seff.CollectionIteratorAction
import org.palladiosimulator.textual.tpcm.language.DomainInterfaceProvidedRole
import org.palladiosimulator.pcm.repository.OperationProvidedRole
import org.palladiosimulator.pcm.repository.SinkRole
import org.palladiosimulator.textual.tpcm.language.InterfaceRequiredRole
import org.palladiosimulator.pcm.repository.OperationRequiredRole
import org.palladiosimulator.pcm.repository.SourceRole

class RegistryConfigurer {

    static def void assignRepository(DataType type, org.palladiosimulator.pcm.repository.Repository repo) {
        type.repository__DataType = repo
        if (type instanceof CompositeDataType) {
            (type as CompositeDataType).innerDeclaration_CompositeDataType.forEach [ inner |
                inner.datatype_InnerDeclaration.assignRepository(repo)
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
    }

    static def ResourceDemandingInternalBehaviour addActions(List<AbstractAction> steps) {
        val behavior = SeffFactory.eINSTANCE.createResourceDemandingInternalBehaviour
        behavior.steps_Behaviour.addAll(steps)
        steps.forEach[it.resourceDemandingBehaviour_AbstractAction = behavior]
        behavior.steps_Behaviour.updatePreviousAssignments()
        return behavior
    }

    def void setupRegistry(GeneratorTransformationRegistry registry) {
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
        ]

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
            mapAll([it.contents.filter(Interface).toList]).thenSet [ resourceTypes, interfaces |
                resourceTypes.resourceInterfaces__ResourceRepository.addAll(interfaces)
            ]
        ]

        registry.configure(org.palladiosimulator.textual.tpcm.language.ResourceInterface, ResourceInterface) [
            create = [ResourcetypeFactory.eINSTANCE.createResourceInterface => [i|i.entityName = it.name]]
            mapAll([it.contents], ResourceSignature).thenSet [ iface, signatures |
                iface.resourceSignatures__ResourceInterface.addAll(signatures)
                signatures.forEach[it.resourceInterface__ResourceSignature = iface]
            ]
        ]

        registry.configure(InternalInterface, ResourceInterface) [
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
//            mapAll([it.contents.filter(ResourceFailureSpecification).map[it.failureType].toList]).thenSet [type, failures |
//                // TODO this requires a hardware failure ... which doesn't seem to make sense
//            ]
        ]

        registry.configure(ResourceInterfaceProvidedRole, ResourceProvidedRole) [
            create = [EntityFactory.eINSTANCE.createResourceProvidedRole]
            map([it.type]).thenSet [ role, type |
                role.providedResourceInterface__ResourceProvidedRole = type
            ]
        ]

        registry.configure(CommunicationLinkType, CommunicationLinkResourceType) [
            create = [ResourcetypeFactory.eINSTANCE.createCommunicationLinkResourceType => [t|t.entityName = it.name]]
        ]

        registry.configure(SchedulingPolicy, org.palladiosimulator.pcm.resourcetype.SchedulingPolicy) [
            create = [ResourcetypeFactory.eINSTANCE.createSchedulingPolicy => [s|s.entityName = it.name]]
        ]

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
            mapAll([it.contents.filter(HDDResource).toList]).thenSet [ container, resources |
                container.hddResourceSpecifications.addAll(resources)
                resources.forEach[it.resourceContainer_ProcessingResourceSpecification = container]
            ]
        ]

        registry.configure(ProcessingResource, ProcessingResourceSpecification) [
            create = [ResourceenvironmentFactory.eINSTANCE.createProcessingResourceSpecification => [s|s.id = it.name]]
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
            mapAll([it.connected]).thenSet [ link, connected |
                link.connectedResourceContainers_LinkingResource.addAll(connected)
            ]
        ]

        registry.configure(Allocation, org.palladiosimulator.pcm.allocation.Allocation) [
            create = [AllocationFactory.eINSTANCE.createAllocation => [a|a.entityName = it.name]]
            mapAll([it.contents.filter(AllocationContext).toList]).thenSet [ allocation, contexts |
                allocation.allocationContexts_Allocation.addAll(contexts)
                contexts.forEach[it.allocation_AllocationContext = allocation]
            ]
        ]

        registry.configure(AllocationContext, org.palladiosimulator.pcm.allocation.AllocationContext) [
            create = [AllocationFactory.eINSTANCE.createAllocationContext => [a|a.entityName = it.name]]
        // TODO
        ]

        registry.configure(org.palladiosimulator.textual.tpcm.language.System, org.palladiosimulator.pcm.system.System) [
            create = [SystemFactory.eINSTANCE.createSystem => [s|s.entityName = it.name]]
            mapAll([it.contents.filter(AssemblyContext).toList]).thenSet [ system, assemblies |
                system.assemblyContexts__ComposedStructure.addAll(assemblies)
                assemblies.forEach[it.parentStructure__AssemblyContext = system]
            ]

            mapAll([it.contents.filter(Connector).toList]).thenSet [ system, connector |
                system.connectors__ComposedStructure.addAll(connector)
                connector.forEach[it.parentStructure__Connector = system]
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

        // TODO what about target?
        // TODO is from / to correctly assigned here
        ]

        registry.configure(AssemblyContext, org.palladiosimulator.pcm.core.composition.AssemblyContext) [
            create = [CompositionFactory.eINSTANCE.createAssemblyContext => [a|a.entityName = it.name]]
            map([it.component]).thenSet [ context, component |
                context.encapsulatedComponent__AssemblyContext = component
            ]
        ]

        registry.configure(Component, BasicComponent) [
            create = [
                RepositoryFactory.eINSTANCE.createBasicComponent => [c|c.entityName = it.name]
            ]
//            mapAll([it.contents.filter(DomainInterfaceProvidedRole).toList]).thenSet [ component, provided |
//                component.providedRoles_InterfaceProvidingEntity.addAll(provided)
//            ]
//            mapAll([it.contents.filter(InterfaceRequiredRole).toList]).thenSet [ component, required |
//                component.requiredRoles_InterfaceRequiringEntity.addAll(required)
//            ]
            mapAll([it.contents.filter(InternalInterfaceProvidedRole).map[it.type].toList]).thenSet [ component, resources |
                component.passiveResource_BasicComponent.addAll(resources)
            ]
            mapAll([it.contents.filter(SEFF).toList]).thenSet [ component, seffs |
                component.serviceEffectSpecifications__BasicComponent.addAll(seffs)
                seffs.forEach[it.basicComponent_ServiceEffectSpecification = component]
            ]
        // TODO SEFF
        ]

        registry.configure(SEFF, ResourceDemandingSEFF) [
            create = [
                SeffFactory.eINSTANCE.createResourceDemandingSEFF
            ]
            map([it.signatur]).thenSet [ seff, sig |
                seff.describedService__SEFF = sig
            ]
            mapAll([it.contents]).thenSet [ seff, calls |
                seff.steps_Behaviour.addAll(calls)
                calls.forEach[it.resourceDemandingBehaviour_AbstractAction = seff]
                seff.steps_Behaviour.updatePreviousAssignments();
            ]
        ]

        registry.configure(SEFFCallAction, AcquireAction) [
            create = [SeffFactory.eINSTANCE.createAcquireAction]
            when = [it.signature.name == "acquire"]
            map([it.role]).thenSet [ action, role |
                action.passiveresource_AcquireAction = role
            ]
        ]

        registry.configure(SEFFCallAction, ReleaseAction) [
            create = [SeffFactory.eINSTANCE.createReleaseAction]
            when = [it.signature.name == "release"]
            map([it.role]).thenSet [ action, role |
                action.passiveResource_ReleaseAction = role
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
            map([it.condition], PCMRandomVariable).thenSet [ loop, variable | // TODO how to map?
                loop.iterationCount_LoopAction = variable
                variable.loopAction_PCMRandomVariable = loop
            ]
            mapAll([it.contents]).thenSet [ loop, actions |
                val behavior = SeffFactory.eINSTANCE.createResourceDemandingInternalBehaviour
                behavior.steps_Behaviour.addAll(actions)
                behavior.steps_Behaviour.updatePreviousAssignments();
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

        ]

        registry.configure(SEFFCallAction, SetVariableAction) [
            create = [
                SeffFactory.eINSTANCE.createSetVariableAction => [action |
                    
                ]
            ]
            when = [it.result !== null]
            map([it.result]).thenSet [ action, result |
                action.localVariableUsages_SetVariableAction.add(result)
            ]
        ]

        registry.configure(PrimitiveResultAssignment, VariableUsage) [
            create = [ParameterFactory.eINSTANCE.createVariableUsage]
            map([it.reference]).thenSet [ usage, reference |
                usage.namedReference__VariableUsage = reference
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
            when = [!it.type.contents.exists[it instanceof EventSignature]]
            map([it.type]).thenSet [ role, iface |
                role.requiredInterface__OperationRequiredRole = iface
            ]
        ]

        registry.configure(InterfaceRequiredRole, SourceRole) [
            create = [RepositoryFactory.eINSTANCE.createSourceRole => [r|r.entityName = it.name]]
            when = [it.type.contents.exists[it instanceof EventSignature]]
            map([it.type]).thenSet [ role, iface |
                role.eventGroup__SourceRole = iface
            ]
        ]
    }
}
