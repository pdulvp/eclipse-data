/**
 */
package org.pdulvp.data.table.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pdulvp.data.table.DFeature;
import org.pdulvp.data.table.DKeyValue;
import org.pdulvp.data.table.DTable;
import org.pdulvp.data.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DKey Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.table.impl.DKeyValueImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.pdulvp.data.table.impl.DKeyValueImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.pdulvp.data.table.impl.DKeyValueImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DKeyValueImpl extends DNamedElementImpl implements DKeyValue {
  /**
   * The cached value of the '{@link #getTable() <em>Table</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTable()
   * @generated
   * @ordered
   */
	protected DTable table;

		/**
   * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature()
   * @generated
   * @ordered
   */
  protected DFeature feature;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;
  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DKeyValueImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return TablePackage.Literals.DKEY_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DTable getTable() {
    if (table != null && table.eIsProxy()) {
      InternalEObject oldTable = (InternalEObject)table;
      table = (DTable)eResolveProxy(oldTable);
      if (table != oldTable) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TablePackage.DKEY_VALUE__TABLE, oldTable, table));
      }
    }
    return table;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DTable basicGetTable() {
    return table;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTable(DTable newTable) {
    DTable oldTable = table;
    table = newTable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DKEY_VALUE__TABLE, oldTable, table));
  }

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DFeature getFeature() {
    if (feature != null && feature.eIsProxy()) {
      InternalEObject oldFeature = (InternalEObject)feature;
      feature = (DFeature)eResolveProxy(oldFeature);
      if (feature != oldFeature) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TablePackage.DKEY_VALUE__FEATURE, oldFeature, feature));
      }
    }
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DFeature basicGetFeature() {
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeature(DFeature newFeature) {
    DFeature oldFeature = feature;
    feature = newFeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DKEY_VALUE__FEATURE, oldFeature, feature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue() {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setValue(String newValue) {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DKEY_VALUE__VALUE, oldValue, value));
  }

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case TablePackage.DKEY_VALUE__TABLE:
        if (resolve) return getTable();
        return basicGetTable();
      case TablePackage.DKEY_VALUE__FEATURE:
        if (resolve) return getFeature();
        return basicGetFeature();
      case TablePackage.DKEY_VALUE__VALUE:
        return getValue();
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
      case TablePackage.DKEY_VALUE__TABLE:
        setTable((DTable)newValue);
        return;
      case TablePackage.DKEY_VALUE__FEATURE:
        setFeature((DFeature)newValue);
        return;
      case TablePackage.DKEY_VALUE__VALUE:
        setValue((String)newValue);
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
      case TablePackage.DKEY_VALUE__TABLE:
        setTable((DTable)null);
        return;
      case TablePackage.DKEY_VALUE__FEATURE:
        setFeature((DFeature)null);
        return;
      case TablePackage.DKEY_VALUE__VALUE:
        setValue(VALUE_EDEFAULT);
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
      case TablePackage.DKEY_VALUE__TABLE:
        return table != null;
      case TablePackage.DKEY_VALUE__FEATURE:
        return feature != null;
      case TablePackage.DKEY_VALUE__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
    result.append(" (value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //DKeyValueImpl
