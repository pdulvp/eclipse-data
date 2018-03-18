/**
 */
package org.pdulvp.data.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.NamedItem;
import org.pdulvp.data.Trigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.impl.TriggerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.TriggerImpl#getName_frFR <em>Name fr FR</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.TriggerImpl#getSchedule <em>Schedule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriggerImpl extends AbstractItemImpl implements Trigger {
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
   * The default value of the '{@link #getName_frFR() <em>Name fr FR</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName_frFR()
   * @generated
   * @ordered
   */
  protected static final String NAME_FR_FR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName_frFR() <em>Name fr FR</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName_frFR()
   * @generated
   * @ordered
   */
  protected String name_frFR = NAME_FR_FR_EDEFAULT;

  /**
   * The default value of the '{@link #getSchedule() <em>Schedule</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSchedule()
   * @generated
   * @ordered
   */
  protected static final String SCHEDULE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSchedule()
   * @generated
   * @ordered
   */
  protected String schedule = SCHEDULE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TriggerImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return DataPackage.Literals.TRIGGER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.TRIGGER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName_frFR() {
    return name_frFR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName_frFR(String newName_frFR) {
    String oldName_frFR = name_frFR;
    name_frFR = newName_frFR;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.TRIGGER__NAME_FR_FR, oldName_frFR, name_frFR));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSchedule() {
    return schedule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSchedule(String newSchedule) {
    String oldSchedule = schedule;
    schedule = newSchedule;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.TRIGGER__SCHEDULE, oldSchedule, schedule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case DataPackage.TRIGGER__NAME:
        return getName();
      case DataPackage.TRIGGER__NAME_FR_FR:
        return getName_frFR();
      case DataPackage.TRIGGER__SCHEDULE:
        return getSchedule();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case DataPackage.TRIGGER__NAME:
        setName((String)newValue);
        return;
      case DataPackage.TRIGGER__NAME_FR_FR:
        setName_frFR((String)newValue);
        return;
      case DataPackage.TRIGGER__SCHEDULE:
        setSchedule((String)newValue);
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
  public void eUnset(int featureID) {
    switch (featureID) {
      case DataPackage.TRIGGER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DataPackage.TRIGGER__NAME_FR_FR:
        setName_frFR(NAME_FR_FR_EDEFAULT);
        return;
      case DataPackage.TRIGGER__SCHEDULE:
        setSchedule(SCHEDULE_EDEFAULT);
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
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case DataPackage.TRIGGER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DataPackage.TRIGGER__NAME_FR_FR:
        return NAME_FR_FR_EDEFAULT == null ? name_frFR != null : !NAME_FR_FR_EDEFAULT.equals(name_frFR);
      case DataPackage.TRIGGER__SCHEDULE:
        return SCHEDULE_EDEFAULT == null ? schedule != null : !SCHEDULE_EDEFAULT.equals(schedule);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
    if (baseClass == NamedItem.class) {
      switch (derivedFeatureID) {
        case DataPackage.TRIGGER__NAME: return DataPackage.NAMED_ITEM__NAME;
        case DataPackage.TRIGGER__NAME_FR_FR: return DataPackage.NAMED_ITEM__NAME_FR_FR;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
    if (baseClass == NamedItem.class) {
      switch (baseFeatureID) {
        case DataPackage.NAMED_ITEM__NAME: return DataPackage.TRIGGER__NAME;
        case DataPackage.NAMED_ITEM__NAME_FR_FR: return DataPackage.TRIGGER__NAME_FR_FR;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", name_frFR: ");
    result.append(name_frFR);
    result.append(", schedule: ");
    result.append(schedule);
    result.append(')');
    return result.toString();
  }

} //TriggerImpl
