/**
 * generated by Xtext 2.22.0
 */
package com.palladiosimulator.textual.repository.repoLang.util;

import com.palladiosimulator.textual.repository.repoLang.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.palladiosimulator.textual.repository.repoLang.RepoLangPackage
 * @generated
 */
public class RepoLangAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RepoLangPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepoLangAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = RepoLangPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RepoLangSwitch<Adapter> modelSwitch =
    new RepoLangSwitch<Adapter>()
    {
      @Override
      public Adapter caseRepository(Repository object)
      {
        return createRepositoryAdapter();
      }
      @Override
      public Adapter caseImportedRepository(ImportedRepository object)
      {
        return createImportedRepositoryAdapter();
      }
      @Override
      public Adapter caseNamedElement(NamedElement object)
      {
        return createNamedElementAdapter();
      }
      @Override
      public Adapter caseInterface(Interface object)
      {
        return createInterfaceAdapter();
      }
      @Override
      public Adapter caseSignature(Signature object)
      {
        return createSignatureAdapter();
      }
      @Override
      public Adapter caseSignatureParameter(SignatureParameter object)
      {
        return createSignatureParameterAdapter();
      }
      @Override
      public Adapter caseComponent(Component object)
      {
        return createComponentAdapter();
      }
      @Override
      public Adapter caseRoleSpecification(RoleSpecification object)
      {
        return createRoleSpecificationAdapter();
      }
      @Override
      public Adapter caseCompositeComponent(CompositeComponent object)
      {
        return createCompositeComponentAdapter();
      }
      @Override
      public Adapter caseSeff(Seff object)
      {
        return createSeffAdapter();
      }
      @Override
      public Adapter caseSeffAction(SeffAction object)
      {
        return createSeffActionAdapter();
      }
      @Override
      public Adapter caseSeffInternalAction(SeffInternalAction object)
      {
        return createSeffInternalActionAdapter();
      }
      @Override
      public Adapter caseSeffAcquireAction(SeffAcquireAction object)
      {
        return createSeffAcquireActionAdapter();
      }
      @Override
      public Adapter caseSeffReleaseAction(SeffReleaseAction object)
      {
        return createSeffReleaseActionAdapter();
      }
      @Override
      public Adapter caseSeffLoopAction(SeffLoopAction object)
      {
        return createSeffLoopActionAdapter();
      }
      @Override
      public Adapter caseSeffSetReturnAction(SeffSetReturnAction object)
      {
        return createSeffSetReturnActionAdapter();
      }
      @Override
      public Adapter caseSeffSetVariableAction(SeffSetVariableAction object)
      {
        return createSeffSetVariableActionAdapter();
      }
      @Override
      public Adapter caseSeffExternalCallAction(SeffExternalCallAction object)
      {
        return createSeffExternalCallActionAdapter();
      }
      @Override
      public Adapter caseSeffCallParameter(SeffCallParameter object)
      {
        return createSeffCallParameterAdapter();
      }
      @Override
      public Adapter caseSeffReferenceParameter(SeffReferenceParameter object)
      {
        return createSeffReferenceParameterAdapter();
      }
      @Override
      public Adapter caseSeffReturnParameter(SeffReturnParameter object)
      {
        return createSeffReturnParameterAdapter();
      }
      @Override
      public Adapter caseSeffVariableChar(SeffVariableChar object)
      {
        return createSeffVariableCharAdapter();
      }
      @Override
      public Adapter caseSeffProbabilisticBranchAction(SeffProbabilisticBranchAction object)
      {
        return createSeffProbabilisticBranchActionAdapter();
      }
      @Override
      public Adapter caseSeffBranch(SeffBranch object)
      {
        return createSeffBranchAdapter();
      }
      @Override
      public Adapter caseSeffProbabilisticBranch(SeffProbabilisticBranch object)
      {
        return createSeffProbabilisticBranchAdapter();
      }
      @Override
      public Adapter caseSeffGuardedBranchAction(SeffGuardedBranchAction object)
      {
        return createSeffGuardedBranchActionAdapter();
      }
      @Override
      public Adapter caseSeffGuardedBranch(SeffGuardedBranch object)
      {
        return createSeffGuardedBranchAdapter();
      }
      @Override
      public Adapter caseSeffForkAction(SeffForkAction object)
      {
        return createSeffForkActionAdapter();
      }
      @Override
      public Adapter caseSeffFork(SeffFork object)
      {
        return createSeffForkAdapter();
      }
      @Override
      public Adapter caseSubSeff(SubSeff object)
      {
        return createSubSeffAdapter();
      }
      @Override
      public Adapter casePassiveResource(PassiveResource object)
      {
        return createPassiveResourceAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.palladiosimulator.textual.repository.repoLang.Repository <em>Repository</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.palladiosimulator.textual.repository.repoLang.Repository
   * @generated
   */
  public Adapter createRepositoryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.palladiosimulator.textual.repository.repoLang.ImportedRepository <em>Imported Repository</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.palladiosimulator.textual.repository.repoLang.ImportedRepository
   * @generated
   */
  public Adapter createImportedRepositoryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.palladiosimulator.textual.repository.repoLang.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.palladiosimulator.textual.repository.repoLang.NamedElement
   * @generated
   */
  public Adapter createNamedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.palladiosimulator.textual.repository.repoLang.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.palladiosimulator.textual.repository.repoLang.Interface
   * @generated
   */
  public Adapter createInterfaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.palladiosimulator.textual.repository.repoLang.Signature <em>Signature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.palladiosimulator.textual.repository.repoLang.Signature
   * @generated
   */
  public Adapter createSignatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.palladiosimulator.textual.repository.repoLang.SignatureParameter <em>Signature Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.palladiosimulator.textual.repository.repoLang.SignatureParameter
   * @generated
   */
  public Adapter createSignatureParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.palladiosimulator.textual.repository.repoLang.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.palladiosimulator.textual.repository.repoLang.Component
   * @generated
   */
  public Adapter createComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.palladiosimulator.textual.repository.repoLang.RoleSpecification <em>Role Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.palladiosimulator.textual.repository.repoLang.RoleSpecification
   * @generated
   */
  public Adapter createRoleSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.palladiosimulator.textual.repository.repoLang.CompositeComponent <em>Composite Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.palladiosimulator.textual.repository.repoLang.CompositeComponent
   * @generated
   */
  public Adapter createCompositeComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.palladiosimulator.textual.repository.repoLang.Seff <em>Seff</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.palladiosimulator.textual.repository.repoLang.Seff
   * @generated
   */
  public Adapter createSeffAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.palladiosimulator.textual.repository.repoLang.SeffAction <em>Seff Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.palladiosimulator.textual.repository.repoLang.SeffAction
   * @generated
   */
  public Adapter createSeffActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.palladiosimulator.textual.repository.repoLang.SeffInternalAction <em>Seff Internal Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.palladiosimulator.textual.repository.repoLang.SeffInternalAction
   * @generated
   */
  public Adapter createSeffInternalActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.palladiosimulator.textual.repository.repoLang.SeffAcquireAction <em>Seff Acquire Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.palladiosimulator.textual.repository.repoLang.SeffAcquireAction
   * @generated
   */
  public Adapter createSeffAcquireActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.palladiosimulator.textual.repository.repoLang.SeffReleaseAction <em>Seff Release Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.palladiosimulator.textual.repository.repoLang.SeffReleaseAction
   * @generated
   */
  public Adapter createSeffReleaseActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.palladiosimulator.textual.repository.repoLang.SeffLoopAction <em>Seff Loop Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.palladiosimulator.textual.repository.repoLang.SeffLoopAction
   * @generated
   */
  public Adapter createSeffLoopActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.palladiosimulator.textual.repository.repoLang.SeffSetReturnAction <em>Seff Set Return Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.palladiosimulator.textual.repository.repoLang.SeffSetReturnAction
   * @generated
   */
  public Adapter createSeffSetReturnActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.palladiosimulator.textual.repository.repoLang.SeffSetVariableAction <em>Seff Set Variable Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.palladiosimulator.textual.repository.repoLang.SeffSetVariableAction
   * @generated
   */
  public Adapter createSeffSetVariableActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.palladiosimulator.textual.repository.repoLang.SeffExternalCallAction <em>Seff External Call Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.palladiosimulator.textual.repository.repoLang.SeffExternalCallAction
   * @generated
   */
  public Adapter createSeffExternalCallActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.palladiosimulator.textual.repository.repoLang.SeffCallParameter <em>Seff Call Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.palladiosimulator.textual.repository.repoLang.SeffCallParameter
   * @generated
   */
  public Adapter createSeffCallParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.palladiosimulator.textual.repository.repoLang.SeffReferenceParameter <em>Seff Reference Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.palladiosimulator.textual.repository.repoLang.SeffReferenceParameter
   * @generated
   */
  public Adapter createSeffReferenceParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.palladiosimulator.textual.repository.repoLang.SeffReturnParameter <em>Seff Return Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.palladiosimulator.textual.repository.repoLang.SeffReturnParameter
   * @generated
   */
  public Adapter createSeffReturnParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.palladiosimulator.textual.repository.repoLang.SeffVariableChar <em>Seff Variable Char</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.palladiosimulator.textual.repository.repoLang.SeffVariableChar
   * @generated
   */
  public Adapter createSeffVariableCharAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.palladiosimulator.textual.repository.repoLang.SeffProbabilisticBranchAction <em>Seff Probabilistic Branch Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.palladiosimulator.textual.repository.repoLang.SeffProbabilisticBranchAction
   * @generated
   */
  public Adapter createSeffProbabilisticBranchActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.palladiosimulator.textual.repository.repoLang.SeffBranch <em>Seff Branch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.palladiosimulator.textual.repository.repoLang.SeffBranch
   * @generated
   */
  public Adapter createSeffBranchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.palladiosimulator.textual.repository.repoLang.SeffProbabilisticBranch <em>Seff Probabilistic Branch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.palladiosimulator.textual.repository.repoLang.SeffProbabilisticBranch
   * @generated
   */
  public Adapter createSeffProbabilisticBranchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.palladiosimulator.textual.repository.repoLang.SeffGuardedBranchAction <em>Seff Guarded Branch Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.palladiosimulator.textual.repository.repoLang.SeffGuardedBranchAction
   * @generated
   */
  public Adapter createSeffGuardedBranchActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.palladiosimulator.textual.repository.repoLang.SeffGuardedBranch <em>Seff Guarded Branch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.palladiosimulator.textual.repository.repoLang.SeffGuardedBranch
   * @generated
   */
  public Adapter createSeffGuardedBranchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.palladiosimulator.textual.repository.repoLang.SeffForkAction <em>Seff Fork Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.palladiosimulator.textual.repository.repoLang.SeffForkAction
   * @generated
   */
  public Adapter createSeffForkActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.palladiosimulator.textual.repository.repoLang.SeffFork <em>Seff Fork</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.palladiosimulator.textual.repository.repoLang.SeffFork
   * @generated
   */
  public Adapter createSeffForkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.palladiosimulator.textual.repository.repoLang.SubSeff <em>Sub Seff</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.palladiosimulator.textual.repository.repoLang.SubSeff
   * @generated
   */
  public Adapter createSubSeffAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.palladiosimulator.textual.repository.repoLang.PassiveResource <em>Passive Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.palladiosimulator.textual.repository.repoLang.PassiveResource
   * @generated
   */
  public Adapter createPassiveResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //RepoLangAdapterFactory
