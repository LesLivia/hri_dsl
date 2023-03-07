/**
 * generated by Xtext 2.29.0
 */
package it.polimi.hri_designtime.hriDsl.impl;

import it.polimi.hri_designtime.hriDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HriDslFactoryImpl extends EFactoryImpl implements HriDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static HriDslFactory init()
  {
    try
    {
      HriDslFactory theHriDslFactory = (HriDslFactory)EPackage.Registry.INSTANCE.getEFactory(HriDslPackage.eNS_URI);
      if (theHriDslFactory != null)
      {
        return theHriDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new HriDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HriDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case HriDslPackage.MODEL: return createModel();
      case HriDslPackage.PARAMETER: return createParameter();
      case HriDslPackage.SCENARIO: return createScenario();
      case HriDslPackage.FLOOR: return createFloor();
      case HriDslPackage.SURFACE: return createSurface();
      case HriDslPackage.VERTICES: return createVertices();
      case HriDslPackage.POINT: return createPoint();
      case HriDslPackage.ROBOTS: return createRobots();
      case HriDslPackage.ROBOT: return createRobot();
      case HriDslPackage.HUMANS: return createHumans();
      case HriDslPackage.HUMAN: return createHuman();
      case HriDslPackage.MISSION: return createMission();
      case HriDslPackage.ASSIGNMENT: return createAssignment();
      case HriDslPackage.QUERIES: return createQueries();
      case HriDslPackage.QUERY: return createQuery();
      case HriDslPackage.COORDINATES: return createCoordinates();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case HriDslPackage.FREE_WILL_MODEL:
        return createFree_will_modelFromString(eDataType, initialValue);
      case HriDslPackage.LENGTH_UNIT:
        return createLength_unitFromString(eDataType, initialValue);
      case HriDslPackage.TYPE:
        return createTypeFromString(eDataType, initialValue);
      case HriDslPackage.FATIGUE_PROFILE:
        return createFatigue_profileFromString(eDataType, initialValue);
      case HriDslPackage.FREE_WILL_PROFILE:
        return createFree_will_profileFromString(eDataType, initialValue);
      case HriDslPackage.PATTERN:
        return createPatternFromString(eDataType, initialValue);
      case HriDslPackage.QUERY_TYPE:
        return createQuery_typeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case HriDslPackage.FREE_WILL_MODEL:
        return convertFree_will_modelToString(eDataType, instanceValue);
      case HriDslPackage.LENGTH_UNIT:
        return convertLength_unitToString(eDataType, instanceValue);
      case HriDslPackage.TYPE:
        return convertTypeToString(eDataType, instanceValue);
      case HriDslPackage.FATIGUE_PROFILE:
        return convertFatigue_profileToString(eDataType, instanceValue);
      case HriDslPackage.FREE_WILL_PROFILE:
        return convertFree_will_profileToString(eDataType, instanceValue);
      case HriDslPackage.PATTERN:
        return convertPatternToString(eDataType, instanceValue);
      case HriDslPackage.QUERY_TYPE:
        return convertQuery_typeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Scenario createScenario()
  {
    ScenarioImpl scenario = new ScenarioImpl();
    return scenario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Floor createFloor()
  {
    FloorImpl floor = new FloorImpl();
    return floor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Surface createSurface()
  {
    SurfaceImpl surface = new SurfaceImpl();
    return surface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Vertices createVertices()
  {
    VerticesImpl vertices = new VerticesImpl();
    return vertices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Point createPoint()
  {
    PointImpl point = new PointImpl();
    return point;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Robots createRobots()
  {
    RobotsImpl robots = new RobotsImpl();
    return robots;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Robot createRobot()
  {
    RobotImpl robot = new RobotImpl();
    return robot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Humans createHumans()
  {
    HumansImpl humans = new HumansImpl();
    return humans;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Human createHuman()
  {
    HumanImpl human = new HumanImpl();
    return human;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Mission createMission()
  {
    MissionImpl mission = new MissionImpl();
    return mission;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Queries createQueries()
  {
    QueriesImpl queries = new QueriesImpl();
    return queries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Query createQuery()
  {
    QueryImpl query = new QueryImpl();
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Coordinates createCoordinates()
  {
    CoordinatesImpl coordinates = new CoordinatesImpl();
    return coordinates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Free_will_model createFree_will_modelFromString(EDataType eDataType, String initialValue)
  {
    Free_will_model result = Free_will_model.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFree_will_modelToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Length_unit createLength_unitFromString(EDataType eDataType, String initialValue)
  {
    Length_unit result = Length_unit.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLength_unitToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createTypeFromString(EDataType eDataType, String initialValue)
  {
    Type result = Type.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fatigue_profile createFatigue_profileFromString(EDataType eDataType, String initialValue)
  {
    Fatigue_profile result = Fatigue_profile.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFatigue_profileToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Free_will_profile createFree_will_profileFromString(EDataType eDataType, String initialValue)
  {
    Free_will_profile result = Free_will_profile.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFree_will_profileToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pattern createPatternFromString(EDataType eDataType, String initialValue)
  {
    Pattern result = Pattern.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPatternToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Query_type createQuery_typeFromString(EDataType eDataType, String initialValue)
  {
    Query_type result = Query_type.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertQuery_typeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public HriDslPackage getHriDslPackage()
  {
    return (HriDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static HriDslPackage getPackage()
  {
    return HriDslPackage.eINSTANCE;
  }

} //HriDslFactoryImpl
