/**
 * generated by Xtext 2.25.0
 */
package it.polimi.hri_designtime.hriDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Humans</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.hri_designtime.hriDsl.Humans#getHumans <em>Humans</em>}</li>
 * </ul>
 *
 * @see it.polimi.hri_designtime.hriDsl.HriDslPackage#getHumans()
 * @model
 * @generated
 */
public interface Humans extends EObject
{
  /**
   * Returns the value of the '<em><b>Humans</b></em>' containment reference list.
   * The list contents are of type {@link it.polimi.hri_designtime.hriDsl.Human}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Humans</em>' containment reference list.
   * @see it.polimi.hri_designtime.hriDsl.HriDslPackage#getHumans_Humans()
   * @model containment="true"
   * @generated
   */
  EList<Human> getHumans();

} // Humans
