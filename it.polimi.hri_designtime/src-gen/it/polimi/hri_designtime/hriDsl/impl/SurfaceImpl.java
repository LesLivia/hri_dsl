/**
 * generated by Xtext 2.25.0
 */
package it.polimi.hri_designtime.hriDsl.impl;

import it.polimi.hri_designtime.hriDsl.HriDslPackage;
import it.polimi.hri_designtime.hriDsl.Surface;
import it.polimi.hri_designtime.hriDsl.Vertices;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Surface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.hri_designtime.hriDsl.impl.SurfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.polimi.hri_designtime.hriDsl.impl.SurfaceImpl#getVertices <em>Vertices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SurfaceImpl extends MinimalEObjectImpl.Container implements Surface
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getVertices() <em>Vertices</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVertices()
   * @generated
   * @ordered
   */
  protected Vertices vertices;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SurfaceImpl()
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
    return HriDslPackage.Literals.SURFACE;
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
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HriDslPackage.SURFACE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Vertices getVertices()
  {
    return vertices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVertices(Vertices newVertices, NotificationChain msgs)
  {
    Vertices oldVertices = vertices;
    vertices = newVertices;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HriDslPackage.SURFACE__VERTICES, oldVertices, newVertices);
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
  public void setVertices(Vertices newVertices)
  {
    if (newVertices != vertices)
    {
      NotificationChain msgs = null;
      if (vertices != null)
        msgs = ((InternalEObject)vertices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HriDslPackage.SURFACE__VERTICES, null, msgs);
      if (newVertices != null)
        msgs = ((InternalEObject)newVertices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HriDslPackage.SURFACE__VERTICES, null, msgs);
      msgs = basicSetVertices(newVertices, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HriDslPackage.SURFACE__VERTICES, newVertices, newVertices));
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
      case HriDslPackage.SURFACE__VERTICES:
        return basicSetVertices(null, msgs);
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
      case HriDslPackage.SURFACE__NAME:
        return getName();
      case HriDslPackage.SURFACE__VERTICES:
        return getVertices();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HriDslPackage.SURFACE__NAME:
        setName((String)newValue);
        return;
      case HriDslPackage.SURFACE__VERTICES:
        setVertices((Vertices)newValue);
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
      case HriDslPackage.SURFACE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HriDslPackage.SURFACE__VERTICES:
        setVertices((Vertices)null);
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
      case HriDslPackage.SURFACE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HriDslPackage.SURFACE__VERTICES:
        return vertices != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //SurfaceImpl
