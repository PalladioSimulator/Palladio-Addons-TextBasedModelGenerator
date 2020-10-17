package org.palladiosimulator.textual.tpcm.generator.pcm

import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.palladiosimulator.pcm.repository.BasicComponent
import org.palladiosimulator.pcm.repository.OperationInterface
import org.palladiosimulator.pcm.repository.OperationProvidedRole
import org.palladiosimulator.pcm.repository.Repository
import org.palladiosimulator.pcm.repository.RepositoryPackage

import static org.junit.jupiter.api.Assertions.*
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF
import org.palladiosimulator.pcm.seff.StartAction
import org.palladiosimulator.pcm.seff.StopAction
import org.palladiosimulator.textual.commons.generator.CommonGeneratorTest

@ExtendWith(InjectionExtension)
@InjectWith(TPCMStandaloneGeneratorInjectorProvider)
class RepositoryGeneratorTest extends CommonGeneratorTest {

    @Test def testEmptyRepository() throws Exception {
        val rs = parseAndGenerate('''
            repository TestRepo        
        ''')

        var repos = rs.allContents.filter[RepositoryPackage.eINSTANCE.repository.isInstance(it)].toList
        assertEquals(1, repos.size)
        assertEquals("TestRepo", (repos.get(0) as Repository).entityName)
    }

    @Test def void testRepoWithComponentAndInterface() throws Exception {
        val rs = parseAndGenerate('''
            repository TestRepo {
                interface IFoo {
                    op doFoo
                }
                
                component Foo {
                    provides foo1 IFoo
                    
                    seff foo1.doFoo {
                    }
                }
            }        
        ''')
        
        rs.allContents.filter(Repository).toList => [
            assertEquals(1, size)
            head => [
                interfaces__Repository => [
                    assertEquals(1, size)
                    filter(OperationInterface).head => [
                        assertEquals("IFoo", entityName)
                        signatures__OperationInterface => [
                            assertEquals(1, size)
                            head => [
                                assertEquals("doFoo", entityName)
                            ]
                        ]
                    ]
                ]

                components__Repository => [
                    assertEquals(1, size)
                    filter(BasicComponent).head => [
                        assertEquals("Foo", entityName)
                        serviceEffectSpecifications__BasicComponent => [
                            assertEquals(1, size)
                            filter(ResourceDemandingSEFF).head => [
                                assertEquals(
                                    rs.allContents.filter(Repository).head.interfaces__Repository.filter(
                                        OperationInterface).head.signatures__OperationInterface.head,
                                    describedService__SEFF)
                                steps_Behaviour => [
                                    assertEquals(2, size)
                                    assertEquals(1, filter(StartAction).size)
                                    assertEquals(1, filter(StopAction).size)
                                    assertEquals(
                                        filter(StartAction).head.successor_AbstractAction,
                                        filter(StopAction).head)
                                ]
                            ]
                        ]
                        providedRoles_InterfaceProvidingEntity => [
                            assertEquals(1, size)
                            filter(OperationProvidedRole).head => [
                                assertEquals(
                                    rs.allContents.filter(Repository).head.interfaces__Repository.filter(
                                        OperationInterface).head, providedInterface__OperationProvidedRole)
                            ]
                        ]
                    ]
                ]
            ]
        ]
    }
}
