/**
 * generated by Xtext 2.25.0
 */
package it.polimi.hri_designtime.hriDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.hri_designtime.hriDsl.Model#getParameter <em>Parameter</em>}</li>
 *   <li>{@link it.polimi.hri_designtime.hriDsl.Model#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 *
 * @see it.polimi.hri_designtime.hriDsl.HriDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
   * The list contents are of type {@link it.polimi.hri_designtime.hriDsl.Parameter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference list.
   * @see it.polimi.hri_designtime.hriDsl.HriDslPackage#getModel_Parameter()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameter();

  /**
   * Returns the value of the '<em><b>Scenarios</b></em>' containment reference list.
   * The list contents are of type {@link it.polimi.hri_designtime.hriDsl.Scenario}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scenarios</em>' containment reference list.
   * @see it.polimi.hri_designtime.hriDsl.HriDslPackage#getModel_Scenarios()
   * @model containment="true"
   * @generated
   */
  EList<Scenario> getScenarios();

} // Model
