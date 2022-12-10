/**
 * generated by Xtext 2.25.0
 */
package it.polimi.hri_designtime.hriDsl.impl;

import it.polimi.hri_designtime.hriDsl.Assignment;
import it.polimi.hri_designtime.hriDsl.Coordinates;
import it.polimi.hri_designtime.hriDsl.Fatigue_profile;
import it.polimi.hri_designtime.hriDsl.Floor;
import it.polimi.hri_designtime.hriDsl.Free_will_profile;
import it.polimi.hri_designtime.hriDsl.HriDslFactory;
import it.polimi.hri_designtime.hriDsl.HriDslPackage;
import it.polimi.hri_designtime.hriDsl.Human;
import it.polimi.hri_designtime.hriDsl.Humans;
import it.polimi.hri_designtime.hriDsl.Length_unit;
import it.polimi.hri_designtime.hriDsl.Mission;
import it.polimi.hri_designtime.hriDsl.Model;
import it.polimi.hri_designtime.hriDsl.Parameter;
import it.polimi.hri_designtime.hriDsl.Pattern;
import it.polimi.hri_designtime.hriDsl.Point;
import it.polimi.hri_designtime.hriDsl.Queries;
import it.polimi.hri_designtime.hriDsl.Query;
import it.polimi.hri_designtime.hriDsl.Query_type;
import it.polimi.hri_designtime.hriDsl.Robot;
import it.polimi.hri_designtime.hriDsl.Robots;
import it.polimi.hri_designtime.hriDsl.Scenario;
import it.polimi.hri_designtime.hriDsl.Surface;
import it.polimi.hri_designtime.hriDsl.Type;
import it.polimi.hri_designtime.hriDsl.Vertices;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HriDslPackageImpl extends EPackageImpl implements HriDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scenarioEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass floorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass surfaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass verticesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pointEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass robotsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass robotEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass humansEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass humanEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass missionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass queriesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass queryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass coordinatesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum length_unitEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum typeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum fatigue_profileEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum free_will_profileEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum patternEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum query_typeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see it.polimi.hri_designtime.hriDsl.HriDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private HriDslPackageImpl()
  {
    super(eNS_URI, HriDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link HriDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static HriDslPackage init()
  {
    if (isInited) return (HriDslPackage)EPackage.Registry.INSTANCE.getEPackage(HriDslPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredHriDslPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    HriDslPackageImpl theHriDslPackage = registeredHriDslPackage instanceof HriDslPackageImpl ? (HriDslPackageImpl)registeredHriDslPackage : new HriDslPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theHriDslPackage.createPackageContents();

    // Initialize created meta-data
    theHriDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theHriDslPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(HriDslPackage.eNS_URI, theHriDslPackage);
    return theHriDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_Parameter()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_Scenarios()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getParameter_Length_unit()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getScenario()
  {
    return scenarioEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getScenario_Floor()
  {
    return (EReference)scenarioEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getScenario_Robots()
  {
    return (EReference)scenarioEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getScenario_Humans()
  {
    return (EReference)scenarioEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getScenario_Missions()
  {
    return (EReference)scenarioEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFloor()
  {
    return floorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFloor_Floor_name()
  {
    return (EAttribute)floorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFloor_Surfaces()
  {
    return (EReference)floorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFloor_Points()
  {
    return (EReference)floorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSurface()
  {
    return surfaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSurface_Name()
  {
    return (EAttribute)surfaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSurface_Vertices()
  {
    return (EReference)surfaceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getVertices()
  {
    return verticesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getVertices_Vertex_A()
  {
    return (EReference)verticesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getVertices_Vertex_C()
  {
    return (EReference)verticesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPoint()
  {
    return pointEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPoint_Name()
  {
    return (EAttribute)pointEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPoint_Coordinates()
  {
    return (EReference)pointEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRobots()
  {
    return robotsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getRobots_Robots()
  {
    return (EReference)robotsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRobot()
  {
    return robotEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRobot_Name()
  {
    return (EAttribute)robotEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getRobot_Coordinates()
  {
    return (EReference)robotEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRobot_Type()
  {
    return (EAttribute)robotEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRobot_Charge_percentage()
  {
    return (EAttribute)robotEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getHumans()
  {
    return humansEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getHumans_Humans()
  {
    return (EReference)humansEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getHuman()
  {
    return humanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getHuman_Name()
  {
    return (EAttribute)humanEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getHuman_Coordinates()
  {
    return (EReference)humanEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getHuman_Speed()
  {
    return (EAttribute)humanEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getHuman_Dext()
  {
    return (EAttribute)humanEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getHuman_Fatigue_profile()
  {
    return (EAttribute)humanEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getHuman_Free_will_profile()
  {
    return (EAttribute)humanEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMission()
  {
    return missionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMission_Name()
  {
    return (EAttribute)missionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMission_Assignments()
  {
    return (EReference)missionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMission_Queries()
  {
    return (EReference)missionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAssignment()
  {
    return assignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAssignment_Pattern()
  {
    return (EAttribute)assignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAssignment_Client()
  {
    return (EAttribute)assignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAssignment_Target()
  {
    return (EAttribute)assignmentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getQueries()
  {
    return queriesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getQueries_Mission()
  {
    return (EAttribute)queriesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getQueries_Queries()
  {
    return (EReference)queriesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getQuery()
  {
    return queryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getQuery_Query_type()
  {
    return (EAttribute)queryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getQuery_Duration()
  {
    return (EAttribute)queryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getQuery_Runs()
  {
    return (EAttribute)queryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCoordinates()
  {
    return coordinatesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCoordinates_X()
  {
    return (EAttribute)coordinatesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCoordinates_Y()
  {
    return (EAttribute)coordinatesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getLength_unit()
  {
    return length_unitEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getType()
  {
    return typeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getFatigue_profile()
  {
    return fatigue_profileEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getFree_will_profile()
  {
    return free_will_profileEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getPattern()
  {
    return patternEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getQuery_type()
  {
    return query_typeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public HriDslFactory getHriDslFactory()
  {
    return (HriDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__PARAMETER);
    createEReference(modelEClass, MODEL__SCENARIOS);

    parameterEClass = createEClass(PARAMETER);
    createEAttribute(parameterEClass, PARAMETER__LENGTH_UNIT);

    scenarioEClass = createEClass(SCENARIO);
    createEReference(scenarioEClass, SCENARIO__FLOOR);
    createEReference(scenarioEClass, SCENARIO__ROBOTS);
    createEReference(scenarioEClass, SCENARIO__HUMANS);
    createEReference(scenarioEClass, SCENARIO__MISSIONS);

    floorEClass = createEClass(FLOOR);
    createEAttribute(floorEClass, FLOOR__FLOOR_NAME);
    createEReference(floorEClass, FLOOR__SURFACES);
    createEReference(floorEClass, FLOOR__POINTS);

    surfaceEClass = createEClass(SURFACE);
    createEAttribute(surfaceEClass, SURFACE__NAME);
    createEReference(surfaceEClass, SURFACE__VERTICES);

    verticesEClass = createEClass(VERTICES);
    createEReference(verticesEClass, VERTICES__VERTEX_A);
    createEReference(verticesEClass, VERTICES__VERTEX_C);

    pointEClass = createEClass(POINT);
    createEAttribute(pointEClass, POINT__NAME);
    createEReference(pointEClass, POINT__COORDINATES);

    robotsEClass = createEClass(ROBOTS);
    createEReference(robotsEClass, ROBOTS__ROBOTS);

    robotEClass = createEClass(ROBOT);
    createEAttribute(robotEClass, ROBOT__NAME);
    createEReference(robotEClass, ROBOT__COORDINATES);
    createEAttribute(robotEClass, ROBOT__TYPE);
    createEAttribute(robotEClass, ROBOT__CHARGE_PERCENTAGE);

    humansEClass = createEClass(HUMANS);
    createEReference(humansEClass, HUMANS__HUMANS);

    humanEClass = createEClass(HUMAN);
    createEAttribute(humanEClass, HUMAN__NAME);
    createEReference(humanEClass, HUMAN__COORDINATES);
    createEAttribute(humanEClass, HUMAN__SPEED);
    createEAttribute(humanEClass, HUMAN__DEXT);
    createEAttribute(humanEClass, HUMAN__FATIGUE_PROFILE);
    createEAttribute(humanEClass, HUMAN__FREE_WILL_PROFILE);

    missionEClass = createEClass(MISSION);
    createEAttribute(missionEClass, MISSION__NAME);
    createEReference(missionEClass, MISSION__ASSIGNMENTS);
    createEReference(missionEClass, MISSION__QUERIES);

    assignmentEClass = createEClass(ASSIGNMENT);
    createEAttribute(assignmentEClass, ASSIGNMENT__PATTERN);
    createEAttribute(assignmentEClass, ASSIGNMENT__CLIENT);
    createEAttribute(assignmentEClass, ASSIGNMENT__TARGET);

    queriesEClass = createEClass(QUERIES);
    createEAttribute(queriesEClass, QUERIES__MISSION);
    createEReference(queriesEClass, QUERIES__QUERIES);

    queryEClass = createEClass(QUERY);
    createEAttribute(queryEClass, QUERY__QUERY_TYPE);
    createEAttribute(queryEClass, QUERY__DURATION);
    createEAttribute(queryEClass, QUERY__RUNS);

    coordinatesEClass = createEClass(COORDINATES);
    createEAttribute(coordinatesEClass, COORDINATES__X);
    createEAttribute(coordinatesEClass, COORDINATES__Y);

    // Create enums
    length_unitEEnum = createEEnum(LENGTH_UNIT);
    typeEEnum = createEEnum(TYPE);
    fatigue_profileEEnum = createEEnum(FATIGUE_PROFILE);
    free_will_profileEEnum = createEEnum(FREE_WILL_PROFILE);
    patternEEnum = createEEnum(PATTERN);
    query_typeEEnum = createEEnum(QUERY_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Parameter(), this.getParameter(), null, "parameter", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Scenarios(), this.getScenario(), null, "scenarios", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameter_Length_unit(), this.getLength_unit(), "length_unit", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getScenario_Floor(), this.getFloor(), null, "floor", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScenario_Robots(), this.getRobots(), null, "robots", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScenario_Humans(), this.getHumans(), null, "humans", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScenario_Missions(), this.getMission(), null, "missions", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(floorEClass, Floor.class, "Floor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFloor_Floor_name(), ecorePackage.getEString(), "floor_name", null, 0, 1, Floor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFloor_Surfaces(), this.getSurface(), null, "surfaces", null, 0, -1, Floor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFloor_Points(), this.getPoint(), null, "points", null, 0, -1, Floor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(surfaceEClass, Surface.class, "Surface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSurface_Name(), ecorePackage.getEString(), "name", null, 0, 1, Surface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSurface_Vertices(), this.getVertices(), null, "vertices", null, 0, 1, Surface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(verticesEClass, Vertices.class, "Vertices", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVertices_Vertex_A(), this.getCoordinates(), null, "vertex_A", null, 0, 1, Vertices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVertices_Vertex_C(), this.getCoordinates(), null, "vertex_C", null, 0, 1, Vertices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPoint_Name(), ecorePackage.getEString(), "name", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPoint_Coordinates(), this.getCoordinates(), null, "coordinates", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(robotsEClass, Robots.class, "Robots", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRobots_Robots(), this.getRobot(), null, "robots", null, 0, -1, Robots.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(robotEClass, Robot.class, "Robot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRobot_Name(), ecorePackage.getEString(), "name", null, 0, 1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRobot_Coordinates(), this.getCoordinates(), null, "coordinates", null, 0, 1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRobot_Type(), this.getType(), "type", null, 0, 1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRobot_Charge_percentage(), ecorePackage.getEInt(), "charge_percentage", null, 0, 1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(humansEClass, Humans.class, "Humans", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHumans_Humans(), this.getHuman(), null, "humans", null, 0, -1, Humans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(humanEClass, Human.class, "Human", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHuman_Name(), ecorePackage.getEString(), "name", null, 0, 1, Human.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHuman_Coordinates(), this.getCoordinates(), null, "coordinates", null, 0, 1, Human.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHuman_Speed(), ecorePackage.getEFloat(), "speed", null, 0, 1, Human.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHuman_Dext(), ecorePackage.getEInt(), "dext", null, 0, 1, Human.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHuman_Fatigue_profile(), this.getFatigue_profile(), "fatigue_profile", null, 0, 1, Human.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHuman_Free_will_profile(), this.getFree_will_profile(), "free_will_profile", null, 0, 1, Human.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(missionEClass, Mission.class, "Mission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMission_Name(), ecorePackage.getEString(), "name", null, 0, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMission_Assignments(), this.getAssignment(), null, "assignments", null, 0, -1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMission_Queries(), this.getQueries(), null, "queries", null, 0, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAssignment_Pattern(), this.getPattern(), "pattern", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssignment_Client(), ecorePackage.getEString(), "client", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssignment_Target(), ecorePackage.getEString(), "target", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(queriesEClass, Queries.class, "Queries", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQueries_Mission(), ecorePackage.getEString(), "mission", null, 0, 1, Queries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQueries_Queries(), this.getQuery(), null, "queries", null, 0, -1, Queries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(queryEClass, Query.class, "Query", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQuery_Query_type(), this.getQuery_type(), "query_type", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuery_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuery_Runs(), ecorePackage.getEString(), "runs", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(coordinatesEClass, Coordinates.class, "Coordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCoordinates_X(), ecorePackage.getEFloat(), "x", null, 0, 1, Coordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCoordinates_Y(), ecorePackage.getEFloat(), "y", null, 0, 1, Coordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(length_unitEEnum, Length_unit.class, "Length_unit");
    addEEnumLiteral(length_unitEEnum, Length_unit.METER);
    addEEnumLiteral(length_unitEEnum, Length_unit.KILOMETER);
    addEEnumLiteral(length_unitEEnum, Length_unit.CENTIMETER);

    initEEnum(typeEEnum, Type.class, "Type");
    addEEnumLiteral(typeEEnum, Type.TURTLEBOT3_BURGER);
    addEEnumLiteral(typeEEnum, Type.TURTLEBOT3_WAFFLEPI);
    addEEnumLiteral(typeEEnum, Type.TIAGO);
    addEEnumLiteral(typeEEnum, Type.PEPPER);

    initEEnum(fatigue_profileEEnum, Fatigue_profile.class, "Fatigue_profile");
    addEEnumLiteral(fatigue_profileEEnum, Fatigue_profile.YOUNG_HEALTHY);
    addEEnumLiteral(fatigue_profileEEnum, Fatigue_profile.YOUNG_SICK);
    addEEnumLiteral(fatigue_profileEEnum, Fatigue_profile.ELDERLY_HEALTHY);
    addEEnumLiteral(fatigue_profileEEnum, Fatigue_profile.ELDERLY_SICK);
    addEEnumLiteral(fatigue_profileEEnum, Fatigue_profile.COVID_PATIENT);

    initEEnum(free_will_profileEEnum, Free_will_profile.class, "Free_will_profile");
    addEEnumLiteral(free_will_profileEEnum, Free_will_profile.NORMAL);
    addEEnumLiteral(free_will_profileEEnum, Free_will_profile.HIGH);
    addEEnumLiteral(free_will_profileEEnum, Free_will_profile.LOW);
    addEEnumLiteral(free_will_profileEEnum, Free_will_profile.DISABLED);

    initEEnum(patternEEnum, Pattern.class, "Pattern");
    addEEnumLiteral(patternEEnum, Pattern.ROBOT_LEADER);
    addEEnumLiteral(patternEEnum, Pattern.ROBOT_FOLLOWER);
    addEEnumLiteral(patternEEnum, Pattern.ROBOT_TRANSPORTER);
    addEEnumLiteral(patternEEnum, Pattern.ROBOT_COMPETITOR);
    addEEnumLiteral(patternEEnum, Pattern.ROBOT_RESCUER);
    addEEnumLiteral(patternEEnum, Pattern.ROBOT_ASSISTANT);

    initEEnum(query_typeEEnum, Query_type.class, "Query_type");
    addEEnumLiteral(query_typeEEnum, Query_type.SIMULATION);
    addEEnumLiteral(query_typeEEnum, Query_type.PROBABILITY_OF_SUCCESS);
    addEEnumLiteral(query_typeEEnum, Query_type.EXPECTED_FATIGUE);
    addEEnumLiteral(query_typeEEnum, Query_type.EXPECTED_CHARGE);
    addEEnumLiteral(query_typeEEnum, Query_type.PROBABILITY_OF_FAILURE);

    // Create resource
    createResource(eNS_URI);
  }

} //HriDslPackageImpl
