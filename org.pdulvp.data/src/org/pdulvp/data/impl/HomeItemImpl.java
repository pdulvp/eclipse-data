/**
 */
package org.pdulvp.data.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pdulvp.data.Application;
import org.pdulvp.data.Category;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.HomeItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Home Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.impl.HomeItemImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.HomeItemImpl#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HomeItemImpl extends AbstractItemImpl implements HomeItem {
  /**
   * The cached value of the '{@link #getApplication() <em>Application</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApplication()
   * @generated
   * @ordered
   */
  protected Application application;

  /**
   * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategory()
   * @generated
   * @ordered
   */
  protected Category category;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HomeItemImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return DataPackage.Literals.HOME_ITEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Application getApplication() {
    if (application != null && application.eIsProxy()) {
      InternalEObject oldApplication = (InternalEObject)application;
      application = (Application)eResolveProxy(oldApplication);
      if (application != oldApplication) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.HOME_ITEM__APPLICATION, oldApplication, application));
      }
    }
    return application;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Application basicGetApplication() {
    return application;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setApplication(Application newApplication) {
    Application oldApplication = application;
    application = newApplication;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.HOME_ITEM__APPLICATION, oldApplication, application));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Category getCategory() {
    if (category != null && category.eIsProxy()) {
      InternalEObject oldCategory = (InternalEObject)category;
      category = (Category)eResolveProxy(oldCategory);
      if (category != oldCategory) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.HOME_ITEM__CATEGORY, oldCategory, category));
      }
    }
    return category;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Category basicGetCategory() {
    return category;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCategory(Category newCategory) {
    Category oldCategory = category;
    category = newCategory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.HOME_ITEM__CATEGORY, oldCategory, category));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case DataPackage.HOME_ITEM__APPLICATION:
        if (resolve) return getApplication();
        return basicGetApplication();
      case DataPackage.HOME_ITEM__CATEGORY:
        if (resolve) return getCategory();
        return basicGetCategory();
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
      case DataPackage.HOME_ITEM__APPLICATION:
        setApplication((Application)newValue);
        return;
      case DataPackage.HOME_ITEM__CATEGORY:
        setCategory((Category)newValue);
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
      case DataPackage.HOME_ITEM__APPLICATION:
        setApplication((Application)null);
        return;
      case DataPackage.HOME_ITEM__CATEGORY:
        setCategory((Category)null);
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
      case DataPackage.HOME_ITEM__APPLICATION:
        return application != null;
      case DataPackage.HOME_ITEM__CATEGORY:
        return category != null;
    }
    return super.eIsSet(featureID);
  }

} //HomeItemImpl
