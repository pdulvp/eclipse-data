/**
 */
package org.pdulvp.data.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.pdulvp.data.Category;
import org.pdulvp.data.ChildItem;
import org.pdulvp.data.DataPackage;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Child Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.impl.ChildItemImpl#getCategories <em>Categories</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ChildItemImpl extends AbstractItemImpl implements ChildItem {
  /**
   * The cached value of the '{@link #getCategories() <em>Categories</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategories()
   * @generated
   * @ordered
   */
  protected EList<Category> categories;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChildItemImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return DataPackage.Literals.CHILD_ITEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Category> getCategories() {
    if (categories == null) {
      categories = new EObjectResolvingEList<Category>(Category.class, this, DataPackage.CHILD_ITEM__CATEGORIES);
    }
    return categories;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case DataPackage.CHILD_ITEM__CATEGORIES:
        return getCategories();
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
      case DataPackage.CHILD_ITEM__CATEGORIES:
        getCategories().clear();
        getCategories().addAll((Collection<? extends Category>)newValue);
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
      case DataPackage.CHILD_ITEM__CATEGORIES:
        getCategories().clear();
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
      case DataPackage.CHILD_ITEM__CATEGORIES:
        return categories != null && !categories.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ChildItemImpl
