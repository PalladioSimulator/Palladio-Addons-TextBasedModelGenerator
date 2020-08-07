package org.palladiosimulator.textual.tpcm.configuration

import org.palladiosimulator.textual.tpcm.registry.GeneratorTransformationRegistry
import org.palladiosimulator.textual.tpcm.language.ResourceEnvironment
import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentFactory
import org.palladiosimulator.textual.tpcm.language.ResourceContainer
import org.palladiosimulator.textual.tpcm.language.LinkingResource
import org.palladiosimulator.textual.tpcm.language.ProcessingResource
import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification
import org.palladiosimulator.pcm.core.PCMRandomVariable

import static org.palladiosimulator.textual.tpcm.configuration.ConfigurerHelper.getInitPropertyExpression;

class ResourceEnvironmentConfigurer {
    static val PROCESSING_RATE_PROPERTY_NAME = "processingRate"
    static val SCHEDULING_POLICY_PROPERTY_NAME = "schedulingPolicy"
    static val LATENCY_PROPERTY_NAME = "latency"
    static val THROUGHPUT_PROPERTY_NAME = "throughput"

    static def configureResourceEnvironmentTransformations(GeneratorTransformationRegistry registry) {
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
            map([getInitPropertyExpression(it.initialization, PROCESSING_RATE_PROPERTY_NAME)], PCMRandomVariable).
                thenSet [ resource, rate |
                    resource.processingRate_ProcessingResourceSpecification = rate
                    rate.processingResourceSpecification_processingRate_PCMRandomVariable = resource
                ]
            map([getInitPropertyExpression(it.initialization, SCHEDULING_POLICY_PROPERTY_NAME)]).thenSet [ resource, policy |
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
                    it.linkingResource_CommunicationLinkResourceSpecification = link
                ]
                link.communicationLinkResourceSpecifications_LinkingResource = spec
            ]
            map([getInitPropertyExpression(it.initialization, LATENCY_PROPERTY_NAME)], PCMRandomVariable).thenSet [ link, latency |
                val spec = link.communicationLinkResourceSpecifications_LinkingResource
                spec.latency_CommunicationLinkResourceSpecification = latency
                latency.communicationLinkResourceSpecification_latency_PCMRandomVariable = spec
            ]
            map([getInitPropertyExpression(it.initialization, THROUGHPUT_PROPERTY_NAME)]).thenSet [ link, throughput |
                val spec = link.communicationLinkResourceSpecifications_LinkingResource
                spec.throughput_CommunicationLinkResourceSpecification = throughput
                throughput.communicationLinkResourceSpecifcation_throughput_PCMRandomVariable = spec
            ]
            mapAll([it.connected]).thenSet [ link, connected |
                link.connectedResourceContainers_LinkingResource.addAll(connected)
            ]
        ]
    }
}