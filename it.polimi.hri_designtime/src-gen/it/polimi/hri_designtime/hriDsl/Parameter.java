/**
 * generated by Xtext 2.29.0
 */
package it.polimi.hri_designtime.hriDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.hri_designtime.hriDsl.Parameter#getLength_unit <em>Length unit</em>}</li>
 *   <li>{@link it.polimi.hri_designtime.hriDsl.Parameter#getFree_will_model <em>Free will model</em>}</li>
 * </ul>
 *
 * @see it.polimi.hri_designtime.hriDsl.HriDslPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Length unit</b></em>' attribute.
   * The literals are from the enumeration {@link it.polimi.hri_designtime.hriDsl.Length_unit}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Length unit</em>' attribute.
   * @see it.polimi.hri_designtime.hriDsl.Length_unit
   * @see #setLength_unit(Length_unit)
   * @see it.polimi.hri_designtime.hriDsl.HriDslPackage#getParameter_Length_unit()
   * @model
   * @generated
   */
  Length_unit getLength_unit();

  /**
   * Sets the value of the '{@link it.polimi.hri_designtime.hriDsl.Parameter#getLength_unit <em>Length unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Length unit</em>' attribute.
   * @see it.polimi.hri_designtime.hriDsl.Length_unit
   * @see #getLength_unit()
   * @generated
   */
  void setLength_unit(Length_unit value);

  /**
   * Returns the value of the '<em><b>Free will model</b></em>' attribute.
   * The literals are from the enumeration {@link it.polimi.hri_designtime.hriDsl.Free_will_model}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Free will model</em>' attribute.
   * @see it.polimi.hri_designtime.hriDsl.Free_will_model
   * @see #setFree_will_model(Free_will_model)
   * @see it.polimi.hri_designtime.hriDsl.HriDslPackage#getParameter_Free_will_model()
   * @model
   * @generated
   */
  Free_will_model getFree_will_model();

  /**
   * Sets the value of the '{@link it.polimi.hri_designtime.hriDsl.Parameter#getFree_will_model <em>Free will model</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Free will model</em>' attribute.
   * @see it.polimi.hri_designtime.hriDsl.Free_will_model
   * @see #getFree_will_model()
   * @generated
   */
  void setFree_will_model(Free_will_model value);

} // Parameter
