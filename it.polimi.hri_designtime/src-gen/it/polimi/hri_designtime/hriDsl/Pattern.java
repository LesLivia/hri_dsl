/**
 * generated by Xtext 2.28.0
 */
package it.polimi.hri_designtime.hriDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Pattern</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.polimi.hri_designtime.hriDsl.HriDslPackage#getPattern()
 * @model
 * @generated
 */
public enum Pattern implements Enumerator
{
  /**
   * The '<em><b>ROBOT LEADER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROBOT_LEADER_VALUE
   * @generated
   * @ordered
   */
  ROBOT_LEADER(0, "ROBOT_LEADER", "robot_leader"),

  /**
   * The '<em><b>ROBOT FOLLOWER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROBOT_FOLLOWER_VALUE
   * @generated
   * @ordered
   */
  ROBOT_FOLLOWER(1, "ROBOT_FOLLOWER", "robot_follower"),

  /**
   * The '<em><b>ROBOT TRANSPORTER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROBOT_TRANSPORTER_VALUE
   * @generated
   * @ordered
   */
  ROBOT_TRANSPORTER(2, "ROBOT_TRANSPORTER", "robot_transporter"),

  /**
   * The '<em><b>ROBOT COMPETITOR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROBOT_COMPETITOR_VALUE
   * @generated
   * @ordered
   */
  ROBOT_COMPETITOR(3, "ROBOT_COMPETITOR", "robot_competitor"),

  /**
   * The '<em><b>ROBOT RESCUER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROBOT_RESCUER_VALUE
   * @generated
   * @ordered
   */
  ROBOT_RESCUER(4, "ROBOT_RESCUER", "robot_rescuer"),

  /**
   * The '<em><b>ROBOT ASSISTANT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROBOT_ASSISTANT_VALUE
   * @generated
   * @ordered
   */
  ROBOT_ASSISTANT(5, "ROBOT_ASSISTANT", "robot_client");

  /**
   * The '<em><b>ROBOT LEADER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROBOT_LEADER
   * @model literal="robot_leader"
   * @generated
   * @ordered
   */
  public static final int ROBOT_LEADER_VALUE = 0;

  /**
   * The '<em><b>ROBOT FOLLOWER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROBOT_FOLLOWER
   * @model literal="robot_follower"
   * @generated
   * @ordered
   */
  public static final int ROBOT_FOLLOWER_VALUE = 1;

  /**
   * The '<em><b>ROBOT TRANSPORTER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROBOT_TRANSPORTER
   * @model literal="robot_transporter"
   * @generated
   * @ordered
   */
  public static final int ROBOT_TRANSPORTER_VALUE = 2;

  /**
   * The '<em><b>ROBOT COMPETITOR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROBOT_COMPETITOR
   * @model literal="robot_competitor"
   * @generated
   * @ordered
   */
  public static final int ROBOT_COMPETITOR_VALUE = 3;

  /**
   * The '<em><b>ROBOT RESCUER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROBOT_RESCUER
   * @model literal="robot_rescuer"
   * @generated
   * @ordered
   */
  public static final int ROBOT_RESCUER_VALUE = 4;

  /**
   * The '<em><b>ROBOT ASSISTANT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROBOT_ASSISTANT
   * @model literal="robot_client"
   * @generated
   * @ordered
   */
  public static final int ROBOT_ASSISTANT_VALUE = 5;

  /**
   * An array of all the '<em><b>Pattern</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Pattern[] VALUES_ARRAY =
    new Pattern[]
    {
      ROBOT_LEADER,
      ROBOT_FOLLOWER,
      ROBOT_TRANSPORTER,
      ROBOT_COMPETITOR,
      ROBOT_RESCUER,
      ROBOT_ASSISTANT,
    };

  /**
   * A public read-only list of all the '<em><b>Pattern</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Pattern> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Pattern</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Pattern get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Pattern result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Pattern</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Pattern getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Pattern result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Pattern</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Pattern get(int value)
  {
    switch (value)
    {
      case ROBOT_LEADER_VALUE: return ROBOT_LEADER;
      case ROBOT_FOLLOWER_VALUE: return ROBOT_FOLLOWER;
      case ROBOT_TRANSPORTER_VALUE: return ROBOT_TRANSPORTER;
      case ROBOT_COMPETITOR_VALUE: return ROBOT_COMPETITOR;
      case ROBOT_RESCUER_VALUE: return ROBOT_RESCUER;
      case ROBOT_ASSISTANT_VALUE: return ROBOT_ASSISTANT;
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
  private Pattern(int value, String name, String literal)
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
  
} //Pattern