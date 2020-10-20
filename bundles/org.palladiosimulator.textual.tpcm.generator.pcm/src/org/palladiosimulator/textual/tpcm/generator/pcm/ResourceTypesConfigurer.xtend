package org.palladiosimulator.textual.tpcm.generator.pcm

import org.palladiosimulator.pcm.core.entity.EntityFactory
import org.palladiosimulator.pcm.core.entity.ResourceProvidedRole
import org.palladiosimulator.pcm.reliability.ReliabilityFactory
import org.palladiosimulator.pcm.repository.EventGroup
import org.palladiosimulator.pcm.repository.EventType
import org.palladiosimulator.pcm.repository.OperationInterface
import org.palladiosimulator.pcm.repository.RepositoryFactory
import org.palladiosimulator.pcm.resourcetype.CommunicationLinkResourceType
import org.palladiosimulator.pcm.resourcetype.ResourceInterface
import org.palladiosimulator.pcm.resourcetype.ResourceRepository
import org.palladiosimulator.pcm.resourcetype.ResourceSignature
import org.palladiosimulator.pcm.resourcetype.ResourcetypeFactory
import org.palladiosimulator.textual.commons.generator.registry.GeneratorRuleRegistrationFacade
import org.palladiosimulator.textual.commons.generator.registry.GeneratorRulesRegistrationDelegate
import org.palladiosimulator.textual.tpcm.language.CommunicationLinkType
import org.palladiosimulator.textual.tpcm.language.DomainInterface
import org.palladiosimulator.textual.tpcm.language.EventSignature
import org.palladiosimulator.textual.tpcm.language.FailureType
import org.palladiosimulator.textual.tpcm.language.Interface
import org.palladiosimulator.textual.tpcm.language.InternalConfigurableInterface
import org.palladiosimulator.textual.tpcm.language.OperationSignature
import org.palladiosimulator.textual.tpcm.language.Parameter
import org.palladiosimulator.textual.tpcm.language.ProcessingResourceType
import org.palladiosimulator.textual.tpcm.language.ResourceInterfaceProvidedRole
import org.palladiosimulator.textual.tpcm.language.ResourceTypeRepository

import static extension org.palladiosimulator.textual.tpcm.generator.pcm.EObjectExtensions.addAllUnOwned

class ResourceTypesConfigurer implements GeneratorRulesRegistrationDelegate {
    override doRegistration(GeneratorRuleRegistrationFacade registry) {
        registry.configure(DomainInterface, OperationInterface) [
            when = [it.contents.forall[it instanceof OperationSignature]]
            create = [RepositoryFactory.eINSTANCE.createOperationInterface => [i|i.entityName = it.name]]
            mapAll([it.contents.filter(OperationSignature).toList],
                org.palladiosimulator.pcm.repository.OperationSignature).thenSet [ iface, signatures |
                iface.signatures__OperationInterface.addAllUnOwned(signatures)
            ]
        ]

        registry.configure(DomainInterface, EventGroup) [
            when = [it.contents.forall[it instanceof EventSignature]]
            create = [RepositoryFactory.eINSTANCE.createEventGroup => [i|i.entityName = it.name]]
            mapAll([it.contents.filter(EventSignature).toList], EventType).thenSet [ iface, signatures |
                iface.eventTypes__EventGroup.addAllUnOwned(signatures)
            ]
        ]

        registry.configure(OperationSignature, org.palladiosimulator.pcm.repository.OperationSignature) [
            create = [RepositoryFactory.eINSTANCE.createOperationSignature => [s|s.entityName = it.name]]
            mapAll([it.parameters]).thenSet [ sig, params |
                sig.parameters__OperationSignature.addAllUnOwned(params)
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
            ]
        ]

        registry.configure(FailureType, org.palladiosimulator.pcm.reliability.FailureType) [
            create = [ReliabilityFactory.eINSTANCE.createSoftwareInducedFailureType => [f|f.entityName = it.name]]
        ]

        registry.configure(ResourceTypeRepository, ResourceRepository) [
            create = [ResourcetypeFactory.eINSTANCE.createResourceRepository]
            mapAll([it.contents.filter(Interface).toList], ResourceInterface).thenSet [ resourceTypes, interfaces |
                resourceTypes.resourceInterfaces__ResourceRepository.addAllUnOwned(interfaces)
            ]
        ]

        registry.configure(org.palladiosimulator.textual.tpcm.language.ResourceInterface, ResourceInterface) [
            create = [ResourcetypeFactory.eINSTANCE.createResourceInterface => [i|i.entityName = it.name]]
            mapAll([it.contents], ResourceSignature).thenSet [ iface, signatures |
                iface.resourceSignatures__ResourceInterface.addAllUnOwned(signatures)
            ]
        ]

        registry.configure(InternalConfigurableInterface, ResourceInterface) [
            create = [ResourcetypeFactory.eINSTANCE.createResourceInterface => [i|i.entityName = it.name]]
            mapAll([it.contents], ResourceSignature).thenSet [ iface, signatures |
                iface.resourceSignatures__ResourceInterface.addAllUnOwned(signatures)
            ]
        ]

        registry.configure(OperationSignature, ResourceSignature) [
            create = [ResourcetypeFactory.eINSTANCE.createResourceSignature => [s|s.entityName = it.name]]
            mapAll([it.parameters]).thenSet [ signature, params |
                signature.parameter__ResourceSignature.addAllUnOwned(params)
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
                type.resourceProvidedRoles__ResourceInterfaceProvidingEntity.addAllUnOwned(roles)
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
