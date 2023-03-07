/**
 * generated by Xtext 2.29.0
 */
package it.polimi.hri_designtime.hriDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Surface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.hri_designtime.hriDsl.Surface#getName <em>Name</em>}</li>
 *   <li>{@link it.polimi.hri_designtime.hriDsl.Surface#getVertices <em>Vertices</em>}</li>
 * </ul>
 *
 * @see it.polimi.hri_designtime.hriDsl.HriDslPackage#getSurface()
 * @model
 * @generated
 */
public interface Surface extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see it.polimi.hri_designtime.hriDsl.HriDslPackage#getSurface_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link it.polimi.hri_designtime.hriDsl.Surface#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Vertices</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vertices</em>' containment reference.
   * @see #setVertices(Vertices)
   * @see it.polimi.hri_designtime.hriDsl.HriDslPackage#getSurface_Vertices()
   * @model containment="true"
   * @generated
   */
  Vertices getVertices();

  /**
   * Sets the value of the '{@link it.polimi.hri_designtime.hriDsl.Surface#getVertices <em>Vertices</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vertices</em>' containment reference.
   * @see #getVertices()
   * @generated
   */
  void setVertices(Vertices value);

} // Surface
