package org.palladiosimulator.textual.tpcm.configuration

import org.palladiosimulator.textual.tpcm.registry.GeneratorTransformationRegistry
import org.palladiosimulator.textual.tpcm.language.DomainInterface
import org.palladiosimulator.pcm.repository.OperationInterface
import org.palladiosimulator.textual.tpcm.language.OperationSignature
import org.palladiosimulator.pcm.repository.RepositoryFactory
import org.palladiosimulator.pcm.repository.EventGroup
import org.palladiosimulator.textual.tpcm.language.EventSignature
import org.palladiosimulator.pcm.repository.EventType
import org.palladiosimulator.textual.tpcm.language.FailureType
import org.palladiosimulator.pcm.reliability.ReliabilityFactory
import org.palladiosimulator.textual.tpcm.language.ResourceTypeRepository
import org.palladiosimulator.pcm.resourcetype.ResourceRepository
import org.palladiosimulator.pcm.resourcetype.ResourcetypeFactory
import org.palladiosimulator.textual.tpcm.language.Interface
import org.palladiosimulator.pcm.resourcetype.ResourceInterface
import org.palladiosimulator.pcm.resourcetype.ResourceSignature
import org.palladiosimulator.textual.tpcm.language.InternalConfigurableInterface
import org.palladiosimulator.textual.tpcm.language.Parameter
import org.palladiosimulator.textual.tpcm.language.ProcessingResourceType
import org.palladiosimulator.textual.tpcm.language.ResourceInterfaceProvidedRole
import org.palladiosimulator.pcm.core.entity.ResourceProvidedRole
import org.palladiosimulator.pcm.core.entity.EntityFactory
import org.palladiosimulator.textual.tpcm.language.CommunicationLinkType
import org.palladiosimulator.pcm.resourcetype.CommunicationLinkResourceType

class ResourceTypesConfigurer {
    static def configureResourceTypesTransformations(GeneratorTransformationRegistry registry) {
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
                param.eventType__Parameter = sig
            ]
        ]

        registry.configure(FailureType, org.palladiosimulator.pcm.reliability.FailureType) [
            create = [ReliabilityFactory.eINSTANCE.createSoftwareInducedFailureType => [f|f.entityName = it.name]]
        ]

        registry.configure(ResourceTypeRepository, ResourceRepository) [
            create = [ResourcetypeFactory.eINSTANCE.createResourceRepository]
            mapAll([it.contents.filter(Interface).toList], ResourceInterface).thenSet [ resourceTypes, interfaces |
                val newInterfaces = interfaces.filter[it.resourceRepository__ResourceInterface === null].toList
                resourceTypes.resourceInterfaces__ResourceRepository.addAll(newInterfaces)
                newInterfaces.forEach[it.resourceRepository__ResourceInterface = resourceTypes]
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
}
