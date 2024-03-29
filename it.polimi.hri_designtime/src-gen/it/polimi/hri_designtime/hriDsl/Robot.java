/**
 * generated by Xtext 2.25.0
 */
package it.polimi.hri_designtime.hriDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.hri_designtime.hriDsl.Robot#getName <em>Name</em>}</li>
 *   <li>{@link it.polimi.hri_designtime.hriDsl.Robot#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link it.polimi.hri_designtime.hriDsl.Robot#getType <em>Type</em>}</li>
 *   <li>{@link it.polimi.hri_designtime.hriDsl.Robot#getCharge_percentage <em>Charge percentage</em>}</li>
 * </ul>
 *
 * @see it.polimi.hri_designtime.hriDsl.HriDslPackage#getRobot()
 * @model
 * @generated
 */
public interface Robot extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see it.polimi.hri_designtime.hriDsl.HriDslPackage#getRobot_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link it.polimi.hri_designtime.hriDsl.Robot#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Coordinates</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Coordinates</em>' containment reference.
   * @see #setCoordinates(Coordinates)
   * @see it.polimi.hri_designtime.hriDsl.HriDslPackage#getRobot_Coordinates()
   * @model containment="true"
   * @generated
   */
  Coordinates getCoordinates();

  /**
   * Sets the value of the '{@link it.polimi.hri_designtime.hriDsl.Robot#getCoordinates <em>Coordinates</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Coordinates</em>' containment reference.
   * @see #getCoordinates()
   * @generated
   */
  void setCoordinates(Coordinates value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link it.polimi.hri_designtime.hriDsl.Type}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see it.polimi.hri_designtime.hriDsl.Type
   * @see #setType(Type)
   * @see it.polimi.hri_designtime.hriDsl.HriDslPackage#getRobot_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link it.polimi.hri_designtime.hriDsl.Robot#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see it.polimi.hri_designtime.hriDsl.Type
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Charge percentage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Charge percentage</em>' attribute.
   * @see #setCharge_percentage(float)
   * @see it.polimi.hri_designtime.hriDsl.HriDslPackage#getRobot_Charge_percentage()
   * @model
   * @generated
   */
  float getCharge_percentage();

  /**
   * Sets the value of the '{@link it.polimi.hri_designtime.hriDsl.Robot#getCharge_percentage <em>Charge percentage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Charge percentage</em>' attribute.
   * @see #getCharge_percentage()
   * @generated
   */
  void setCharge_percentage(float value);

} // Robot
