/**
 * generated by Xtext 2.25.0
 */
package it.polimi.hri_designtime.hriDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.hri_designtime.hriDsl.Scenario#getFloor <em>Floor</em>}</li>
 *   <li>{@link it.polimi.hri_designtime.hriDsl.Scenario#getRobots <em>Robots</em>}</li>
 *   <li>{@link it.polimi.hri_designtime.hriDsl.Scenario#getHumans <em>Humans</em>}</li>
 *   <li>{@link it.polimi.hri_designtime.hriDsl.Scenario#getMissions <em>Missions</em>}</li>
 * </ul>
 *
 * @see it.polimi.hri_designtime.hriDsl.HriDslPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject
{
  /**
   * Returns the value of the '<em><b>Floor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Floor</em>' containment reference.
   * @see #setFloor(Floor)
   * @see it.polimi.hri_designtime.hriDsl.HriDslPackage#getScenario_Floor()
   * @model containment="true"
   * @generated
   */
  Floor getFloor();

  /**
   * Sets the value of the '{@link it.polimi.hri_designtime.hriDsl.Scenario#getFloor <em>Floor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Floor</em>' containment reference.
   * @see #getFloor()
   * @generated
   */
  void setFloor(Floor value);

  /**
   * Returns the value of the '<em><b>Robots</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Robots</em>' containment reference.
   * @see #setRobots(Robots)
   * @see it.polimi.hri_designtime.hriDsl.HriDslPackage#getScenario_Robots()
   * @model containment="true"
   * @generated
   */
  Robots getRobots();

  /**
   * Sets the value of the '{@link it.polimi.hri_designtime.hriDsl.Scenario#getRobots <em>Robots</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Robots</em>' containment reference.
   * @see #getRobots()
   * @generated
   */
  void setRobots(Robots value);

  /**
   * Returns the value of the '<em><b>Humans</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Humans</em>' containment reference.
   * @see #setHumans(Humans)
   * @see it.polimi.hri_designtime.hriDsl.HriDslPackage#getScenario_Humans()
   * @model containment="true"
   * @generated
   */
  Humans getHumans();

  /**
   * Sets the value of the '{@link it.polimi.hri_designtime.hriDsl.Scenario#getHumans <em>Humans</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Humans</em>' containment reference.
   * @see #getHumans()
   * @generated
   */
  void setHumans(Humans value);

  /**
   * Returns the value of the '<em><b>Missions</b></em>' containment reference list.
   * The list contents are of type {@link it.polimi.hri_designtime.hriDsl.Mission}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Missions</em>' containment reference list.
   * @see it.polimi.hri_designtime.hriDsl.HriDslPackage#getScenario_Missions()
   * @model containment="true"
   * @generated
   */
  EList<Mission> getMissions();

} // Scenario
