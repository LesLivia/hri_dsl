/**
 * generated by Xtext 2.29.0
 */
package it.polimi.hri_designtime.hriDsl.impl;

import it.polimi.hri_designtime.hriDsl.HriDslPackage;
import it.polimi.hri_designtime.hriDsl.Model;
import it.polimi.hri_designtime.hriDsl.Parameter;
import it.polimi.hri_designtime.hriDsl.Scenario;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.hri_designtime.hriDsl.impl.ModelImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link it.polimi.hri_designtime.hriDsl.impl.ModelImpl#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter()
   * @generated
   * @ordered
   */
  protected EList<Parameter> parameter;

  /**
   * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScenarios()
   * @generated
   * @ordered
   */
  protected EList<Scenario> scenarios;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return HriDslPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Parameter> getParameter()
  {
    if (parameter == null)
    {
      parameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, HriDslPackage.MODEL__PARAMETER);
    }
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Scenario> getScenarios()
  {
    if (scenarios == null)
    {
      scenarios = new EObjectContainmentEList<Scenario>(Scenario.class, this, HriDslPackage.MODEL__SCENARIOS);
    }
    return scenarios;
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
      case HriDslPackage.MODEL__PARAMETER:
        return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
      case HriDslPackage.MODEL__SCENARIOS:
        return ((InternalEList<?>)getScenarios()).basicRemove(otherEnd, msgs);
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
      case HriDslPackage.MODEL__PARAMETER:
        return getParameter();
      case HriDslPackage.MODEL__SCENARIOS:
        return getScenarios();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HriDslPackage.MODEL__PARAMETER:
        getParameter().clear();
        getParameter().addAll((Collection<? extends Parameter>)newValue);
        return;
      case HriDslPackage.MODEL__SCENARIOS:
        getScenarios().clear();
        getScenarios().addAll((Collection<? extends Scenario>)newValue);
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
      case HriDslPackage.MODEL__PARAMETER:
        getParameter().clear();
        return;
      case HriDslPackage.MODEL__SCENARIOS:
        getScenarios().clear();
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
      case HriDslPackage.MODEL__PARAMETER:
        return parameter != null && !parameter.isEmpty();
      case HriDslPackage.MODEL__SCENARIOS:
        return scenarios != null && !scenarios.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
