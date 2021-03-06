/**
 * generated by Xtext 2.22.0
 */
package com.palladiosimulator.textual.repository.repoLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passive Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.palladiosimulator.textual.repository.repoLang.PassiveResource#getName <em>Name</em>}</li>
 *   <li>{@link com.palladiosimulator.textual.repository.repoLang.PassiveResource#getCapacity <em>Capacity</em>}</li>
 * </ul>
 *
 * @see com.palladiosimulator.textual.repository.repoLang.RepoLangPackage#getPassiveResource()
 * @model
 * @generated
 */
public interface PassiveResource extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.palladiosimulator.textual.repository.repoLang.RepoLangPackage#getPassiveResource_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.palladiosimulator.textual.repository.repoLang.PassiveResource#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Capacity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Capacity</em>' attribute.
   * @see #setCapacity(int)
   * @see com.palladiosimulator.textual.repository.repoLang.RepoLangPackage#getPassiveResource_Capacity()
   * @model
   * @generated
   */
  int getCapacity();

  /**
   * Sets the value of the '{@link com.palladiosimulator.textual.repository.repoLang.PassiveResource#getCapacity <em>Capacity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Capacity</em>' attribute.
   * @see #getCapacity()
   * @generated
   */
  void setCapacity(int value);

} // PassiveResource
