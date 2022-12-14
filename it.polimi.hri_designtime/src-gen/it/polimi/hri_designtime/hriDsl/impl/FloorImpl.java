/**
 * generated by Xtext 2.25.0
 */
package it.polimi.hri_designtime.hriDsl.impl;

import it.polimi.hri_designtime.hriDsl.Floor;
import it.polimi.hri_designtime.hriDsl.HriDslPackage;
import it.polimi.hri_designtime.hriDsl.Point;
import it.polimi.hri_designtime.hriDsl.Surface;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Floor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.hri_designtime.hriDsl.impl.FloorImpl#getFloor_name <em>Floor name</em>}</li>
 *   <li>{@link it.polimi.hri_designtime.hriDsl.impl.FloorImpl#getSurfaces <em>Surfaces</em>}</li>
 *   <li>{@link it.polimi.hri_designtime.hriDsl.impl.FloorImpl#getPoints <em>Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FloorImpl extends MinimalEObjectImpl.Container implements Floor
{
  /**
   * The default value of the '{@link #getFloor_name() <em>Floor name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFloor_name()
   * @generated
   * @ordered
   */
  protected static final String FLOOR_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFloor_name() <em>Floor name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFloor_name()
   * @generated
   * @ordered
   */
  protected String floor_name = FLOOR_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSurfaces() <em>Surfaces</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSurfaces()
   * @generated
   * @ordered
   */
  protected EList<Surface> surfaces;

  /**
   * The cached value of the '{@link #getPoints() <em>Points</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPoints()
   * @generated
   * @ordered
   */
  protected EList<Point> points;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FloorImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return HriDslPackage.Literals.FLOOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFloor_name()
  {
    return floor_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFloor_name(String newFloor_name)
  {
    String oldFloor_name = floor_name;
    floor_name = newFloor_name;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HriDslPackage.FLOOR__FLOOR_NAME, oldFloor_name, floor_name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Surface> getSurfaces()
  {
    if (surfaces == null)
    {
      surfaces = new EObjectContainmentEList<Surface>(Surface.class, this, HriDslPackage.FLOOR__SURFACES);
    }
    return surfaces;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Point> getPoints()
  {
    if (points == null)
    {
      points = new EObjectContainmentEList<Point>(Point.class, this, HriDslPackage.FLOOR__POINTS);
    }
    return points;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case HriDslPackage.FLOOR__SURFACES:
        return ((InternalEList<?>)getSurfaces()).basicRemove(otherEnd, msgs);
      case HriDslPackage.FLOOR__POINTS:
        return ((InternalEList<?>)getPoints()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case HriDslPackage.FLOOR__FLOOR_NAME:
        return getFloor_name();
      case HriDslPackage.FLOOR__SURFACES:
        return getSurfaces();
      case HriDslPackage.FLOOR__POINTS:
        return getPoints();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HriDslPackage.FLOOR__FLOOR_NAME:
        setFloor_name((String)newValue);
        return;
      case HriDslPackage.FLOOR__SURFACES:
        getSurfaces().clear();
        getSurfaces().addAll((Collection<? extends Surface>)newValue);
        return;
      case HriDslPackage.FLOOR__POINTS:
        getPoints().clear();
        getPoints().addAll((Collection<? extends Point>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case HriDslPackage.FLOOR__FLOOR_NAME:
        setFloor_name(FLOOR_NAME_EDEFAULT);
        return;
      case HriDslPackage.FLOOR__SURFACES:
        getSurfaces().clear();
        return;
      case HriDslPackage.FLOOR__POINTS:
        getPoints().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case HriDslPackage.FLOOR__FLOOR_NAME:
        return FLOOR_NAME_EDEFAULT == null ? floor_name != null : !FLOOR_NAME_EDEFAULT.equals(floor_name);
      case HriDslPackage.FLOOR__SURFACES:
        return surfaces != null && !surfaces.isEmpty();
      case HriDslPackage.FLOOR__POINTS:
        return points != null && !points.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (floor_name: ");
    result.append(floor_name);
    result.append(')');
    return result.toString();
  }

} //FloorImpl
