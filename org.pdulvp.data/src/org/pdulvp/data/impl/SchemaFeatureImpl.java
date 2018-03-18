/**
 */
package org.pdulvp.data.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.SchemaFeature;
import org.pdulvp.data.table.DTable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.impl.SchemaFeatureImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.SchemaFeatureImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaFeatureImpl extends EObjectImpl implements SchemaFeature {
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
  protected EStructuralFeature feature;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SchemaFeatureImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return DataPackage.Literals.SCHEMA_FEATURE;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.SCHEMA_FEATURE__TABLE, oldTable, table));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCHEMA_FEATURE__TABLE, oldTable, table));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EStructuralFeature getFeature() {
    if (feature != null && feature.eIsProxy()) {
      InternalEObject oldFeature = (InternalEObject)feature;
      feature = (EStructuralFeature)eResolveProxy(oldFeature);
      if (feature != oldFeature) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.SCHEMA_FEATURE__FEATURE, oldFeature, feature));
      }
    }
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EStructuralFeature basicGetFeature() {
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeature(EStructuralFeature newFeature) {
    EStructuralFeature oldFeature = feature;
    feature = newFeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCHEMA_FEATURE__FEATURE, oldFeature, feature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case DataPackage.SCHEMA_FEATURE__TABLE:
        if (resolve) return getTable();
        return basicGetTable();
      case DataPackage.SCHEMA_FEATURE__FEATURE:
        if (resolve) return getFeature();
        return basicGetFeature();
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
      case DataPackage.SCHEMA_FEATURE__TABLE:
        setTable((DTable)newValue);
        return;
      case DataPackage.SCHEMA_FEATURE__FEATURE:
        setFeature((EStructuralFeature)newValue);
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
      case DataPackage.SCHEMA_FEATURE__TABLE:
        setTable((DTable)null);
        return;
      case DataPackage.SCHEMA_FEATURE__FEATURE:
        setFeature((EStructuralFeature)null);
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
      case DataPackage.SCHEMA_FEATURE__TABLE:
        return table != null;
      case DataPackage.SCHEMA_FEATURE__FEATURE:
        return feature != null;
    }
    return super.eIsSet(featureID);
  }

} //SchemaFeatureImpl
