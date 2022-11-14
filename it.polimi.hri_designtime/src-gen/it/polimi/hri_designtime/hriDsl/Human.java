/**
 * generated by Xtext 2.28.0
 */
package it.polimi.hri_designtime.hriDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Human</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.hri_designtime.hriDsl.Human#getName <em>Name</em>}</li>
 *   <li>{@link it.polimi.hri_designtime.hriDsl.Human#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link it.polimi.hri_designtime.hriDsl.Human#getSpeed <em>Speed</em>}</li>
 *   <li>{@link it.polimi.hri_designtime.hriDsl.Human#getDext <em>Dext</em>}</li>
 *   <li>{@link it.polimi.hri_designtime.hriDsl.Human#getFatigue_profile <em>Fatigue profile</em>}</li>
 *   <li>{@link it.polimi.hri_designtime.hriDsl.Human#getFree_will_profile <em>Free will profile</em>}</li>
 * </ul>
 *
 * @see it.polimi.hri_designtime.hriDsl.HriDslPackage#getHuman()
 * @model
 * @generated
 */
public interface Human extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see it.polimi.hri_designtime.hriDsl.HriDslPackage#getHuman_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link it.polimi.hri_designtime.hriDsl.Human#getName <em>Name</em>}' attribute.
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
   * @see it.polimi.hri_designtime.hriDsl.HriDslPackage#getHuman_Coordinates()
   * @model containment="true"
   * @generated
   */
  Coordinates getCoordinates();

  /**
   * Sets the value of the '{@link it.polimi.hri_designtime.hriDsl.Human#getCoordinates <em>Coordinates</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Coordinates</em>' containment reference.
   * @see #getCoordinates()
   * @generated
   */
  void setCoordinates(Coordinates value);

  /**
   * Returns the value of the '<em><b>Speed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Speed</em>' attribute.
   * @see #setSpeed(float)
   * @see it.polimi.hri_designtime.hriDsl.HriDslPackage#getHuman_Speed()
   * @model
   * @generated
   */
  float getSpeed();

  /**
   * Sets the value of the '{@link it.polimi.hri_designtime.hriDsl.Human#getSpeed <em>Speed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Speed</em>' attribute.
   * @see #getSpeed()
   * @generated
   */
  void setSpeed(float value);

  /**
   * Returns the value of the '<em><b>Dext</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dext</em>' attribute.
   * @see #setDext(int)
   * @see it.polimi.hri_designtime.hriDsl.HriDslPackage#getHuman_Dext()
   * @model
   * @generated
   */
  int getDext();

  /**
   * Sets the value of the '{@link it.polimi.hri_designtime.hriDsl.Human#getDext <em>Dext</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dext</em>' attribute.
   * @see #getDext()
   * @generated
   */
  void setDext(int value);

  /**
   * Returns the value of the '<em><b>Fatigue profile</b></em>' attribute.
   * The literals are from the enumeration {@link it.polimi.hri_designtime.hriDsl.Fatigue_profile}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fatigue profile</em>' attribute.
   * @see it.polimi.hri_designtime.hriDsl.Fatigue_profile
   * @see #setFatigue_profile(Fatigue_profile)
   * @see it.polimi.hri_designtime.hriDsl.HriDslPackage#getHuman_Fatigue_profile()
   * @model
   * @generated
   */
  Fatigue_profile getFatigue_profile();

  /**
   * Sets the value of the '{@link it.polimi.hri_designtime.hriDsl.Human#getFatigue_profile <em>Fatigue profile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fatigue profile</em>' attribute.
   * @see it.polimi.hri_designtime.hriDsl.Fatigue_profile
   * @see #getFatigue_profile()
   * @generated
   */
  void setFatigue_profile(Fatigue_profile value);

  /**
   * Returns the value of the '<em><b>Free will profile</b></em>' attribute.
   * The literals are from the enumeration {@link it.polimi.hri_designtime.hriDsl.Free_will_profile}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Free will profile</em>' attribute.
   * @see it.polimi.hri_designtime.hriDsl.Free_will_profile
   * @see #setFree_will_profile(Free_will_profile)
   * @see it.polimi.hri_designtime.hriDsl.HriDslPackage#getHuman_Free_will_profile()
   * @model
   * @generated
   */
  Free_will_profile getFree_will_profile();

  /**
   * Sets the value of the '{@link it.polimi.hri_designtime.hriDsl.Human#getFree_will_profile <em>Free will profile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Free will profile</em>' attribute.
   * @see it.polimi.hri_designtime.hriDsl.Free_will_profile
   * @see #getFree_will_profile()
   * @generated
   */
  void setFree_will_profile(Free_will_profile value);

} // Human
