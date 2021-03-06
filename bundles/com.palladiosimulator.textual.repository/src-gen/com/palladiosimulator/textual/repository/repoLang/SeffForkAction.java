/**
 * generated by Xtext 2.22.0
 */
package com.palladiosimulator.textual.repository.repoLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seff Fork Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.palladiosimulator.textual.repository.repoLang.SeffForkAction#isSync <em>Sync</em>}</li>
 *   <li>{@link com.palladiosimulator.textual.repository.repoLang.SeffForkAction#getForks <em>Forks</em>}</li>
 * </ul>
 *
 * @see com.palladiosimulator.textual.repository.repoLang.RepoLangPackage#getSeffForkAction()
 * @model
 * @generated
 */
public interface SeffForkAction extends SeffAction
{
  /**
   * Returns the value of the '<em><b>Sync</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sync</em>' attribute.
   * @see #setSync(boolean)
   * @see com.palladiosimulator.textual.repository.repoLang.RepoLangPackage#getSeffForkAction_Sync()
   * @model
   * @generated
   */
  boolean isSync();

  /**
   * Sets the value of the '{@link com.palladiosimulator.textual.repository.repoLang.SeffForkAction#isSync <em>Sync</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sync</em>' attribute.
   * @see #isSync()
   * @generated
   */
  void setSync(boolean value);

  /**
   * Returns the value of the '<em><b>Forks</b></em>' containment reference list.
   * The list contents are of type {@link com.palladiosimulator.textual.repository.repoLang.SeffFork}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forks</em>' containment reference list.
   * @see com.palladiosimulator.textual.repository.repoLang.RepoLangPackage#getSeffForkAction_Forks()
   * @model containment="true"
   * @generated
   */
  EList<SeffFork> getForks();

} // SeffForkAction
