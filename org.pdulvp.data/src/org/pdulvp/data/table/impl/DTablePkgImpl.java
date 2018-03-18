/**
 */
package org.pdulvp.data.table.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pdulvp.data.table.DTable;
import org.pdulvp.data.table.DTablePkg;
import org.pdulvp.data.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DTable Pkg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.table.impl.DTablePkgImpl#getOwnedTables <em>Owned Tables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DTablePkgImpl extends DNamedElementImpl implements DTablePkg {
  /**
   * The cached value of the '{@link #getOwnedTables() <em>Owned Tables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedTables()
   * @generated
   * @ordered
   */
  protected EList<DTable> ownedTables;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DTablePkgImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return TablePackage.Literals.DTABLE_PKG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DTable> getOwnedTables() {
    if (ownedTables == null) {
      ownedTables = new EObjectContainmentEList<DTable>(DTable.class, this, TablePackage.DTABLE_PKG__OWNED_TABLES);
    }
    return ownedTables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case TablePackage.DTABLE_PKG__OWNED_TABLES:
        return ((InternalEList<?>)getOwnedTables()).basicRemove(otherEnd, msgs);
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
      case TablePackage.DTABLE_PKG__OWNED_TABLES:
        return getOwnedTables();
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
      case TablePackage.DTABLE_PKG__OWNED_TABLES:
        getOwnedTables().clear();
        getOwnedTables().addAll((Collection<? extends DTable>)newValue);
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
      case TablePackage.DTABLE_PKG__OWNED_TABLES:
        getOwnedTables().clear();
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
      case TablePackage.DTABLE_PKG__OWNED_TABLES:
        return ownedTables != null && !ownedTables.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DTablePkgImpl
