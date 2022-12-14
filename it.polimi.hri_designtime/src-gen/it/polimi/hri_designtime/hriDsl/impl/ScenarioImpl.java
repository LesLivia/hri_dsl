/**
 * generated by Xtext 2.25.0
 */
package it.polimi.hri_designtime.hriDsl.impl;

import it.polimi.hri_designtime.hriDsl.Floor;
import it.polimi.hri_designtime.hriDsl.HriDslPackage;
import it.polimi.hri_designtime.hriDsl.Humans;
import it.polimi.hri_designtime.hriDsl.Mission;
import it.polimi.hri_designtime.hriDsl.Robots;
import it.polimi.hri_designtime.hriDsl.Scenario;

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
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.hri_designtime.hriDsl.impl.ScenarioImpl#getFloor <em>Floor</em>}</li>
 *   <li>{@link it.polimi.hri_designtime.hriDsl.impl.ScenarioImpl#getRobots <em>Robots</em>}</li>
 *   <li>{@link it.polimi.hri_designtime.hriDsl.impl.ScenarioImpl#getHumans <em>Humans</em>}</li>
 *   <li>{@link it.polimi.hri_designtime.hriDsl.impl.ScenarioImpl#getMissions <em>Missions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends MinimalEObjectImpl.Container implements Scenario
{
  /**
   * The cached value of the '{@link #getFloor() <em>Floor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFloor()
   * @generated
   * @ordered
   */
  protected Floor floor;

  /**
   * The cached value of the '{@link #getRobots() <em>Robots</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRobots()
   * @generated
   * @ordered
   */
  protected Robots robots;

  /**
   * The cached value of the '{@link #getHumans() <em>Humans</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHumans()
   * @generated
   * @ordered
   */
  protected Humans humans;

  /**
   * The cached value of the '{@link #getMissions() <em>Missions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMissions()
   * @generated
   * @ordered
   */
  protected EList<Mission> missions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScenarioImpl()
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
    return HriDslPackage.Literals.SCENARIO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Floor getFloor()
  {
    return floor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFloor(Floor newFloor, NotificationChain msgs)
  {
    Floor oldFloor = floor;
    floor = newFloor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HriDslPackage.SCENARIO__FLOOR, oldFloor, newFloor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFloor(Floor newFloor)
  {
    if (newFloor != floor)
    {
      NotificationChain msgs = null;
      if (floor != null)
        msgs = ((InternalEObject)floor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HriDslPackage.SCENARIO__FLOOR, null, msgs);
      if (newFloor != null)
        msgs = ((InternalEObject)newFloor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HriDslPackage.SCENARIO__FLOOR, null, msgs);
      msgs = basicSetFloor(newFloor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HriDslPackage.SCENARIO__FLOOR, newFloor, newFloor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Robots getRobots()
  {
    return robots;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRobots(Robots newRobots, NotificationChain msgs)
  {
    Robots oldRobots = robots;
    robots = newRobots;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HriDslPackage.SCENARIO__ROBOTS, oldRobots, newRobots);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRobots(Robots newRobots)
  {
    if (newRobots != robots)
    {
      NotificationChain msgs = null;
      if (robots != null)
        msgs = ((InternalEObject)robots).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HriDslPackage.SCENARIO__ROBOTS, null, msgs);
      if (newRobots != null)
        msgs = ((InternalEObject)newRobots).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HriDslPackage.SCENARIO__ROBOTS, null, msgs);
      msgs = basicSetRobots(newRobots, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HriDslPackage.SCENARIO__ROBOTS, newRobots, newRobots));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Humans getHumans()
  {
    return humans;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHumans(Humans newHumans, NotificationChain msgs)
  {
    Humans oldHumans = humans;
    humans = newHumans;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HriDslPackage.SCENARIO__HUMANS, oldHumans, newHumans);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHumans(Humans newHumans)
  {
    if (newHumans != humans)
    {
      NotificationChain msgs = null;
      if (humans != null)
        msgs = ((InternalEObject)humans).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HriDslPackage.SCENARIO__HUMANS, null, msgs);
      if (newHumans != null)
        msgs = ((InternalEObject)newHumans).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HriDslPackage.SCENARIO__HUMANS, null, msgs);
      msgs = basicSetHumans(newHumans, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HriDslPackage.SCENARIO__HUMANS, newHumans, newHumans));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Mission> getMissions()
  {
    if (missions == null)
    {
      missions = new EObjectContainmentEList<Mission>(Mission.class, this, HriDslPackage.SCENARIO__MISSIONS);
    }
    return missions;
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
      case HriDslPackage.SCENARIO__FLOOR:
        return basicSetFloor(null, msgs);
      case HriDslPackage.SCENARIO__ROBOTS:
        return basicSetRobots(null, msgs);
      case HriDslPackage.SCENARIO__HUMANS:
        return basicSetHumans(null, msgs);
      case HriDslPackage.SCENARIO__MISSIONS:
        return ((InternalEList<?>)getMissions()).basicRemove(otherEnd, msgs);
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
      case HriDslPackage.SCENARIO__FLOOR:
        return getFloor();
      case HriDslPackage.SCENARIO__ROBOTS:
        return getRobots();
      case HriDslPackage.SCENARIO__HUMANS:
        return getHumans();
      case HriDslPackage.SCENARIO__MISSIONS:
        return getMissions();
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
      case HriDslPackage.SCENARIO__FLOOR:
        setFloor((Floor)newValue);
        return;
      case HriDslPackage.SCENARIO__ROBOTS:
        setRobots((Robots)newValue);
        return;
      case HriDslPackage.SCENARIO__HUMANS:
        setHumans((Humans)newValue);
        return;
      case HriDslPackage.SCENARIO__MISSIONS:
        getMissions().clear();
        getMissions().addAll((Collection<? extends Mission>)newValue);
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
      case HriDslPackage.SCENARIO__FLOOR:
        setFloor((Floor)null);
        return;
      case HriDslPackage.SCENARIO__ROBOTS:
        setRobots((Robots)null);
        return;
      case HriDslPackage.SCENARIO__HUMANS:
        setHumans((Humans)null);
        return;
      case HriDslPackage.SCENARIO__MISSIONS:
        getMissions().clear();
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
      case HriDslPackage.SCENARIO__FLOOR:
        return floor != null;
      case HriDslPackage.SCENARIO__ROBOTS:
        return robots != null;
      case HriDslPackage.SCENARIO__HUMANS:
        return humans != null;
      case HriDslPackage.SCENARIO__MISSIONS:
        return missions != null && !missions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ScenarioImpl
