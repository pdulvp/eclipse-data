/**
 */
package org.pdulvp.data.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.NamedItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.impl.NamedItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.NamedItemImpl#getName_frFR <em>Name fr FR</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NamedItemImpl extends EObjectImpl implements NamedItem {
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
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected NamedItemImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return DataPackage.Literals.NAMED_ITEM;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.NAMED_ITEM__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.NAMED_ITEM__NAME_FR_FR, oldName_frFR, name_frFR));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case DataPackage.NAMED_ITEM__NAME:
        return getName();
      case DataPackage.NAMED_ITEM__NAME_FR_FR:
        return getName_frFR();
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
      case DataPackage.NAMED_ITEM__NAME:
        setName((String)newValue);
        return;
      case DataPackage.NAMED_ITEM__NAME_FR_FR:
        setName_frFR((String)newValue);
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
      case DataPackage.NAMED_ITEM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DataPackage.NAMED_ITEM__NAME_FR_FR:
        setName_frFR(NAME_FR_FR_EDEFAULT);
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
      case DataPackage.NAMED_ITEM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DataPackage.NAMED_ITEM__NAME_FR_FR:
        return NAME_FR_FR_EDEFAULT == null ? name_frFR != null : !NAME_FR_FR_EDEFAULT.equals(name_frFR);
    }
    return super.eIsSet(featureID);
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
    result.append(')');
    return result.toString();
  }

} //NamedItemImpl
