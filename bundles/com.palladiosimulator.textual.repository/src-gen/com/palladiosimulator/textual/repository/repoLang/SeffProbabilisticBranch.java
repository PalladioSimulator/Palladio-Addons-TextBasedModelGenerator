/**
 * generated by Xtext 2.22.0
 */
package com.palladiosimulator.textual.repository.repoLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seff Probabilistic Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.palladiosimulator.textual.repository.repoLang.SeffProbabilisticBranch#getProbability <em>Probability</em>}</li>
 * </ul>
 *
 * @see com.palladiosimulator.textual.repository.repoLang.RepoLangPackage#getSeffProbabilisticBranch()
 * @model
 * @generated
 */
public interface SeffProbabilisticBranch extends SeffBranch
{
  /**
   * Returns the value of the '<em><b>Probability</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Probability</em>' attribute.
   * @see #setProbability(double)
   * @see com.palladiosimulator.textual.repository.repoLang.RepoLangPackage#getSeffProbabilisticBranch_Probability()
   * @model
   * @generated
   */
  double getProbability();

  /**
   * Sets the value of the '{@link com.palladiosimulator.textual.repository.repoLang.SeffProbabilisticBranch#getProbability <em>Probability</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Probability</em>' attribute.
   * @see #getProbability()
   * @generated
   */
  void setProbability(double value);

} // SeffProbabilisticBranch
