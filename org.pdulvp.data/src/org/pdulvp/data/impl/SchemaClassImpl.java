/**
 */
package org.pdulvp.data.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.SchemaClass;
import org.pdulvp.data.SchemaFeature;
import org.pdulvp.data.table.DTable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.impl.SchemaClassImpl#getClazz <em>Clazz</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.SchemaClassImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.SchemaClassImpl#getExternalFeatures <em>External Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaClassImpl extends EObjectImpl implements SchemaClass {
  /**
   * The cached value of the '{@link #getClazz() <em>Clazz</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClazz()
   * @generated
   * @ordered
   */
  protected EClass clazz;

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
   * The cached value of the '{@link #getExternalFeatures() <em>External Features</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExternalFeatures()
   * @generated
   * @ordered
   */
  protected EList<SchemaFeature> externalFeatures;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SchemaClassImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return DataPackage.Literals.SCHEMA_CLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClazz() {
    if (clazz != null && clazz.eIsProxy()) {
      InternalEObject oldClazz = (InternalEObject)clazz;
      clazz = (EClass)eResolveProxy(oldClazz);
      if (clazz != oldClazz) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.SCHEMA_CLASS__CLAZZ, oldClazz, clazz));
      }
    }
    return clazz;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass basicGetClazz() {
    return clazz;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClazz(EClass newClazz) {
    EClass oldClazz = clazz;
    clazz = newClazz;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCHEMA_CLASS__CLAZZ, oldClazz, clazz));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.SCHEMA_CLASS__TABLE, oldTable, table));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCHEMA_CLASS__TABLE, oldTable, table));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SchemaFeature> getExternalFeatures() {
    if (externalFeatures == null) {
      externalFeatures = new EObjectContainmentEList<SchemaFeature>(SchemaFeature.class, this, DataPackage.SCHEMA_CLASS__EXTERNAL_FEATURES);
    }
    return externalFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case DataPackage.SCHEMA_CLASS__EXTERNAL_FEATURES:
        return ((InternalEList<?>)getExternalFeatures()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case DataPackage.SCHEMA_CLASS__CLAZZ:
        if (resolve) return getClazz();
        return basicGetClazz();
      case DataPackage.SCHEMA_CLASS__TABLE:
        if (resolve) return getTable();
        return basicGetTable();
      case DataPackage.SCHEMA_CLASS__EXTERNAL_FEATURES:
        return getExternalFeatures();
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
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case DataPackage.SCHEMA_CLASS__CLAZZ:
        setClazz((EClass)newValue);
        return;
      case DataPackage.SCHEMA_CLASS__TABLE:
        setTable((DTable)newValue);
        return;
      case DataPackage.SCHEMA_CLASS__EXTERNAL_FEATURES:
        getExternalFeatures().clear();
        getExternalFeatures().addAll((Collection<? extends SchemaFeature>)newValue);
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
      case DataPackage.SCHEMA_CLASS__CLAZZ:
        setClazz((EClass)null);
        return;
      case DataPackage.SCHEMA_CLASS__TABLE:
        setTable((DTable)null);
        return;
      case DataPackage.SCHEMA_CLASS__EXTERNAL_FEATURES:
        getExternalFeatures().clear();
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
      case DataPackage.SCHEMA_CLASS__CLAZZ:
        return clazz != null;
      case DataPackage.SCHEMA_CLASS__TABLE:
        return table != null;
      case DataPackage.SCHEMA_CLASS__EXTERNAL_FEATURES:
        return externalFeatures != null && !externalFeatures.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SchemaClassImpl
