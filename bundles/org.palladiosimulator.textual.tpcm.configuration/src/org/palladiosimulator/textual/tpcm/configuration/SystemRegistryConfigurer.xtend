package org.palladiosimulator.textual.tpcm.configuration

import org.palladiosimulator.textual.tpcm.registry.GeneratorTransformationRegistry
import org.palladiosimulator.pcm.system.SystemFactory
import org.palladiosimulator.textual.tpcm.language.AssemblyContext
import org.palladiosimulator.textual.tpcm.language.Connector
import java.util.List
import org.palladiosimulator.pcm.core.composition.AssemblyConnector
import org.palladiosimulator.textual.tpcm.language.SystemProvidedRole
import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector
import java.util.ArrayList
import org.palladiosimulator.pcm.repository.OperationProvidedRole
import org.palladiosimulator.pcm.repository.OperationRequiredRole
import org.palladiosimulator.pcm.core.composition.CompositionFactory
import org.palladiosimulator.pcm.repository.RepositoryFactory
import org.palladiosimulator.pcm.repository.OperationInterface

import static extension org.palladiosimulator.textual.tpcm.configuration.ConfigurerHelper.hasEmptyName;
import static extension org.palladiosimulator.textual.tpcm.configuration.EObjectExtensions.addAllUnOwned

class SystemRegistryConfigurer {
    static def configureSystemTransformations(GeneratorTransformationRegistry registry) {
        registry.configure(org.palladiosimulator.textual.tpcm.language.System, org.palladiosimulator.pcm.system.System) [
            create = [SystemFactory.eINSTANCE.createSystem => [s|s.entityName = it.name]]
            mapAll([it.contents.filter(AssemblyContext).toList]).thenSet [ system, assemblies |
                system.assemblyContexts__ComposedStructure.addAllUnOwned(assemblies)
            ]

            mapAll([it.contents.filter(Connector).toList]).thenSet [ system, connector |
                system.connectors__ComposedStructure.addAllUnOwned(connector)
            ]

            mapAll([it.contents.filter(SystemProvidedRole).toList], ProvidedDelegationConnector).thenSet [ system, roles |
                system.connectors__ComposedStructure.addAll(roles)
                roles.forEach [
                    it.parentStructure__Connector = system
                    system.providedRoles_InterfaceProvidingEntity.add(it.outerProvidedRole_ProvidedDelegationConnector)
                ]
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

                it.connectors__ComposedStructure.filter(ProvidedDelegationConnector).forEach [ connector |
                    if (connector.assemblyContext_ProvidedDelegationConnector.parentStructure__AssemblyContext ===
                        null) {
                        val context = connector.assemblyContext_ProvidedDelegationConnector
                        it.assemblyContexts__ComposedStructure.add(context)
                    }
                ]

                it.connectors__ComposedStructure.filter(AssemblyConnector).forEach [ connector |
                    if (!it.assemblyContexts__ComposedStructure.contains(
                        connector.providingAssemblyContext_AssemblyConnector)) {
                        val provided = connector.providingAssemblyContext_AssemblyConnector;
                        it.assemblyContexts__ComposedStructure.add(provided)
                    } else if (!it.assemblyContexts__ComposedStructure.contains(
                        connector.requiringAssemblyContext_AssemblyConnector)) {
                        val required = connector.requiringAssemblyContext_AssemblyConnector;
                        it.assemblyContexts__ComposedStructure.add(required)
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
            after = [
                if (it.hasEmptyName) {
                    it.entityName = it.providingAssemblyContext_AssemblyConnector.entityName + "->" +
                        it.requiringAssemblyContext_AssemblyConnector.entityName
                }
            ]
        ]

        registry.configure(AssemblyContext, org.palladiosimulator.pcm.core.composition.AssemblyContext) [
            create = [CompositionFactory.eINSTANCE.createAssemblyContext => [a|a.entityName = it.name]]
            map([it.component]).thenSet [ context, component |
                context.encapsulatedComponent__AssemblyContext = component
            ]
        ]

        registry.configure(SystemProvidedRole, ProvidedDelegationConnector) [
            create = [CompositionFactory.eINSTANCE.createProvidedDelegationConnector => [c|c.entityName = it.name]]
            map([it.type]).thenSet [ connector, OperationInterface iface |
                val role = RepositoryFactory.eINSTANCE.createOperationProvidedRole => [ r |
                    r.entityName = iface.entityName
                ]
                role.providedInterface__OperationProvidedRole = iface
                connector.outerProvidedRole_ProvidedDelegationConnector = role
            ]
            map([it.to]).thenSet [ connector, to |
                connector.assemblyContext_ProvidedDelegationConnector = to
                val requiredInterface = connector.outerProvidedRole_ProvidedDelegationConnector.
                    providedInterface__OperationProvidedRole
                val providedRoles = to.encapsulatedComponent__AssemblyContext.providedRoles_InterfaceProvidingEntity
                val matchedRole = providedRoles.filter(OperationProvidedRole).findFirst [
                    it.providedInterface__OperationProvidedRole === requiredInterface
                ]
                connector.innerProvidedRole_ProvidedDelegationConnector = matchedRole
            ]
            map([it.target]).thenSet [ connector, to |
                connector.assemblyContext_ProvidedDelegationConnector = to
                val requiredInterface = connector.outerProvidedRole_ProvidedDelegationConnector.
                    providedInterface__OperationProvidedRole
                val providedRoles = to.encapsulatedComponent__AssemblyContext.providedRoles_InterfaceProvidingEntity
                val matchedRole = providedRoles.filter(OperationProvidedRole).findFirst [
                    it.providedInterface__OperationProvidedRole === requiredInterface
                ]
                connector.innerProvidedRole_ProvidedDelegationConnector = matchedRole
            ]
        ]
    }
    
    private static def AssemblyConnector copyConnector(AssemblyConnector connector) {
        CompositionFactory.eINSTANCE.createAssemblyConnector => [
            it.entityName = connector.entityName
            it.parentStructure__Connector = connector.parentStructure__Connector
            it.providingAssemblyContext_AssemblyConnector = connector.providingAssemblyContext_AssemblyConnector
            it.requiringAssemblyContext_AssemblyConnector = connector.requiringAssemblyContext_AssemblyConnector
        ]
    }

    private static def List<RoleMatch> findMatchingRoles(List<OperationProvidedRole> providingRoles,
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