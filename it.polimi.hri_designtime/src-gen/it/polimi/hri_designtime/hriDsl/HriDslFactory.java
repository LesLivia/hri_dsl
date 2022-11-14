/**
 * generated by Xtext 2.28.0
 */
package it.polimi.hri_designtime.hriDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.polimi.hri_designtime.hriDsl.HriDslPackage
 * @generated
 */
public interface HriDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HriDslFactory eINSTANCE = it.polimi.hri_designtime.hriDsl.impl.HriDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Scenario</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scenario</em>'.
   * @generated
   */
  Scenario createScenario();

  /**
   * Returns a new object of class '<em>Floor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Floor</em>'.
   * @generated
   */
  Floor createFloor();

  /**
   * Returns a new object of class '<em>Surface</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Surface</em>'.
   * @generated
   */
  Surface createSurface();

  /**
   * Returns a new object of class '<em>Vertices</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vertices</em>'.
   * @generated
   */
  Vertices createVertices();

  /**
   * Returns a new object of class '<em>Point</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Point</em>'.
   * @generated
   */
  Point createPoint();

  /**
   * Returns a new object of class '<em>Robots</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Robots</em>'.
   * @generated
   */
  Robots createRobots();

  /**
   * Returns a new object of class '<em>Robot</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Robot</em>'.
   * @generated
   */
  Robot createRobot();

  /**
   * Returns a new object of class '<em>Humans</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Humans</em>'.
   * @generated
   */
  Humans createHumans();

  /**
   * Returns a new object of class '<em>Human</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Human</em>'.
   * @generated
   */
  Human createHuman();

  /**
   * Returns a new object of class '<em>Mission</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mission</em>'.
   * @generated
   */
  Mission createMission();

  /**
   * Returns a new object of class '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignment</em>'.
   * @generated
   */
  Assignment createAssignment();

  /**
   * Returns a new object of class '<em>Queries</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Queries</em>'.
   * @generated
   */
  Queries createQueries();

  /**
   * Returns a new object of class '<em>Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Query</em>'.
   * @generated
   */
  Query createQuery();

  /**
   * Returns a new object of class '<em>Coordinates</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Coordinates</em>'.
   * @generated
   */
  Coordinates createCoordinates();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  HriDslPackage getHriDslPackage();

} //HriDslFactory