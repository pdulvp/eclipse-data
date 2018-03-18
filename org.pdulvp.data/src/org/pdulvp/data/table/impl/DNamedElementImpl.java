/**
 */
package org.pdulvp.data.table.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pdulvp.data.impl.AbstractItemImpl;
import org.pdulvp.data.table.DNamedElement;
import org.pdulvp.data.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DNamed Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.table.impl.DNamedElementImpl#getDbName <em>Db Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DNamedElementImpl extends AbstractItemImpl implements DNamedElement {
  /**
   * The default value of the '{@link #getDbName() <em>Db Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbName()
   * @generated
   * @ordered
   */
  protected static final String DB_NAME_EDEFAULT = null;
  /**
   * The cached value of the '{@link #getDbName() <em>Db Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbName()
   * @generated
   * @ordered
   */
  protected String dbName = DB_NAME_EDEFAULT;
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DNamedElementImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return TablePackage.Literals.DNAMED_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDbName() {
    return dbName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbName(String newDbName) {
    String oldDbName = dbName;
    dbName = newDbName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DNAMED_ELEMENT__DB_NAME, oldDbName, dbName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case TablePackage.DNAMED_ELEMENT__DB_NAME:
        return getDbName();
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
      case TablePackage.DNAMED_ELEMENT__DB_NAME:
        setDbName((String)newValue);
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
      case TablePackage.DNAMED_ELEMENT__DB_NAME:
        setDbName(DB_NAME_EDEFAULT);
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
      case TablePackage.DNAMED_ELEMENT__DB_NAME:
        return DB_NAME_EDEFAULT == null ? dbName != null : !DB_NAME_EDEFAULT.equals(dbName);
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
    result.append(" (dbName: ");
    result.append(dbName);
    result.append(')');
    return result.toString();
  }

} //DNamedElementImpl
