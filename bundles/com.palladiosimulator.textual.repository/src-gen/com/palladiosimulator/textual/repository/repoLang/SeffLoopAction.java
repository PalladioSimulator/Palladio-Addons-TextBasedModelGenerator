/**
 * generated by Xtext 2.22.0
 */
package com.palladiosimulator.textual.repository.repoLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seff Loop Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.palladiosimulator.textual.repository.repoLang.SeffLoopAction#getCount <em>Count</em>}</li>
 *   <li>{@link com.palladiosimulator.textual.repository.repoLang.SeffLoopAction#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see com.palladiosimulator.textual.repository.repoLang.RepoLangPackage#getSeffLoopAction()
 * @model
 * @generated
 */
public interface SeffLoopAction extends SeffAction
{
  /**
   * Returns the value of the '<em><b>Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Count</em>' attribute.
   * @see #setCount(String)
   * @see com.palladiosimulator.textual.repository.repoLang.RepoLangPackage#getSeffLoopAction_Count()
   * @model
   * @generated
   */
  String getCount();

  /**
   * Sets the value of the '{@link com.palladiosimulator.textual.repository.repoLang.SeffLoopAction#getCount <em>Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Count</em>' attribute.
   * @see #getCount()
   * @generated
   */
  void setCount(String value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference.
   * @see #setActions(SubSeff)
   * @see com.palladiosimulator.textual.repository.repoLang.RepoLangPackage#getSeffLoopAction_Actions()
   * @model containment="true"
   * @generated
   */
  SubSeff getActions();

  /**
   * Sets the value of the '{@link com.palladiosimulator.textual.repository.repoLang.SeffLoopAction#getActions <em>Actions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actions</em>' containment reference.
   * @see #getActions()
   * @generated
   */
  void setActions(SubSeff value);

} // SeffLoopAction
