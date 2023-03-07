/**
 * generated by Xtext 2.29.0
 */
package it.polimi.hri_designtime.hriDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Query type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.polimi.hri_designtime.hriDsl.HriDslPackage#getQuery_type()
 * @model
 * @generated
 */
public enum Query_type implements Enumerator
{
  /**
   * The '<em><b>SIMULATION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SIMULATION_VALUE
   * @generated
   * @ordered
   */
  SIMULATION(0, "SIMULATION", "simulation"),

  /**
   * The '<em><b>PROBABILITY OF SUCCESS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROBABILITY_OF_SUCCESS_VALUE
   * @generated
   * @ordered
   */
  PROBABILITY_OF_SUCCESS(1, "PROBABILITY_OF_SUCCESS", "probability_of_success"),

  /**
   * The '<em><b>EXPECTED FATIGUE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EXPECTED_FATIGUE_VALUE
   * @generated
   * @ordered
   */
  EXPECTED_FATIGUE(2, "EXPECTED_FATIGUE", "expected_fatigue"),

  /**
   * The '<em><b>EXPECTED CHARGE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EXPECTED_CHARGE_VALUE
   * @generated
   * @ordered
   */
  EXPECTED_CHARGE(3, "EXPECTED_CHARGE", "expected_charge"),

  /**
   * The '<em><b>PROBABILITY OF FAILURE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROBABILITY_OF_FAILURE_VALUE
   * @generated
   * @ordered
   */
  PROBABILITY_OF_FAILURE(4, "PROBABILITY_OF_FAILURE", "probability_of_failure");

  /**
   * The '<em><b>SIMULATION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SIMULATION
   * @model literal="simulation"
   * @generated
   * @ordered
   */
  public static final int SIMULATION_VALUE = 0;

  /**
   * The '<em><b>PROBABILITY OF SUCCESS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROBABILITY_OF_SUCCESS
   * @model literal="probability_of_success"
   * @generated
   * @ordered
   */
  public static final int PROBABILITY_OF_SUCCESS_VALUE = 1;

  /**
   * The '<em><b>EXPECTED FATIGUE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EXPECTED_FATIGUE
   * @model literal="expected_fatigue"
   * @generated
   * @ordered
   */
  public static final int EXPECTED_FATIGUE_VALUE = 2;

  /**
   * The '<em><b>EXPECTED CHARGE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EXPECTED_CHARGE
   * @model literal="expected_charge"
   * @generated
   * @ordered
   */
  public static final int EXPECTED_CHARGE_VALUE = 3;

  /**
   * The '<em><b>PROBABILITY OF FAILURE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROBABILITY_OF_FAILURE
   * @model literal="probability_of_failure"
   * @generated
   * @ordered
   */
  public static final int PROBABILITY_OF_FAILURE_VALUE = 4;

  /**
   * An array of all the '<em><b>Query type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Query_type[] VALUES_ARRAY =
    new Query_type[]
    {
      SIMULATION,
      PROBABILITY_OF_SUCCESS,
      EXPECTED_FATIGUE,
      EXPECTED_CHARGE,
      PROBABILITY_OF_FAILURE,
    };

  /**
   * A public read-only list of all the '<em><b>Query type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Query_type> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Query type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Query_type get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Query_type result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Query type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Query_type getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Query_type result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Query type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Query_type get(int value)
  {
    switch (value)
    {
      case SIMULATION_VALUE: return SIMULATION;
      case PROBABILITY_OF_SUCCESS_VALUE: return PROBABILITY_OF_SUCCESS;
      case EXPECTED_FATIGUE_VALUE: return EXPECTED_FATIGUE;
      case EXPECTED_CHARGE_VALUE: return EXPECTED_CHARGE;
      case PROBABILITY_OF_FAILURE_VALUE: return PROBABILITY_OF_FAILURE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Query_type(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Query_type
