/**
 * generated by Xtext 2.22.0
 */
package com.palladiosimulator.textual.repository.repoLang.impl;

import com.palladiosimulator.textual.repository.repoLang.RepoLangPackage;
import com.palladiosimulator.textual.repository.repoLang.SeffFork;
import com.palladiosimulator.textual.repository.repoLang.SubSeff;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seff Fork</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.palladiosimulator.textual.repository.repoLang.impl.SeffForkImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.palladiosimulator.textual.repository.repoLang.impl.SeffForkImpl#getSeff <em>Seff</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeffForkImpl extends MinimalEObjectImpl.Container implements SeffFork
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSeff() <em>Seff</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeff()
   * @generated
   * @ordered
   */
  protected SubSeff seff;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SeffForkImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RepoLangPackage.Literals.SEFF_FORK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepoLangPackage.SEFF_FORK__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SubSeff getSeff()
  {
    return seff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSeff(SubSeff newSeff, NotificationChain msgs)
  {
    SubSeff oldSeff = seff;
    seff = newSeff;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RepoLangPackage.SEFF_FORK__SEFF, oldSeff, newSeff);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSeff(SubSeff newSeff)
  {
    if (newSeff != seff)
    {
      NotificationChain msgs = null;
      if (seff != null)
        msgs = ((InternalEObject)seff).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RepoLangPackage.SEFF_FORK__SEFF, null, msgs);
      if (newSeff != null)
        msgs = ((InternalEObject)newSeff).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RepoLangPackage.SEFF_FORK__SEFF, null, msgs);
      msgs = basicSetSeff(newSeff, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepoLangPackage.SEFF_FORK__SEFF, newSeff, newSeff));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RepoLangPackage.SEFF_FORK__SEFF:
        return basicSetSeff(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RepoLangPackage.SEFF_FORK__NAME:
        return getName();
      case RepoLangPackage.SEFF_FORK__SEFF:
        return getSeff();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RepoLangPackage.SEFF_FORK__NAME:
        setName((String)newValue);
        return;
      case RepoLangPackage.SEFF_FORK__SEFF:
        setSeff((SubSeff)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RepoLangPackage.SEFF_FORK__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RepoLangPackage.SEFF_FORK__SEFF:
        setSeff((SubSeff)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RepoLangPackage.SEFF_FORK__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RepoLangPackage.SEFF_FORK__SEFF:
        return seff != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //SeffForkImpl
