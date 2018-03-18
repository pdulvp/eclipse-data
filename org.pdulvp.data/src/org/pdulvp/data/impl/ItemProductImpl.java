/**
 */
package org.pdulvp.data.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.Item;
import org.pdulvp.data.ItemProduct;
import org.pdulvp.data.Product;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.impl.ItemProductImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ItemProductImpl#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemProductImpl extends AbstractItemImpl implements ItemProduct {
  /**
   * The cached value of the '{@link #getItem() <em>Item</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItem()
   * @generated
   * @ordered
   */
  protected Item item;

  /**
   * The cached value of the '{@link #getProduct() <em>Product</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProduct()
   * @generated
   * @ordered
   */
  protected Product product;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ItemProductImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return DataPackage.Literals.ITEM_PRODUCT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Item getItem() {
    if (item != null && item.eIsProxy()) {
      InternalEObject oldItem = (InternalEObject)item;
      item = (Item)eResolveProxy(oldItem);
      if (item != oldItem) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.ITEM_PRODUCT__ITEM, oldItem, item));
      }
    }
    return item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Item basicGetItem() {
    return item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setItem(Item newItem) {
    Item oldItem = item;
    item = newItem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ITEM_PRODUCT__ITEM, oldItem, item));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Product getProduct() {
    if (product != null && product.eIsProxy()) {
      InternalEObject oldProduct = (InternalEObject)product;
      product = (Product)eResolveProxy(oldProduct);
      if (product != oldProduct) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.ITEM_PRODUCT__PRODUCT, oldProduct, product));
      }
    }
    return product;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Product basicGetProduct() {
    return product;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProduct(Product newProduct) {
    Product oldProduct = product;
    product = newProduct;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ITEM_PRODUCT__PRODUCT, oldProduct, product));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case DataPackage.ITEM_PRODUCT__ITEM:
        if (resolve) return getItem();
        return basicGetItem();
      case DataPackage.ITEM_PRODUCT__PRODUCT:
        if (resolve) return getProduct();
        return basicGetProduct();
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
      case DataPackage.ITEM_PRODUCT__ITEM:
        setItem((Item)newValue);
        return;
      case DataPackage.ITEM_PRODUCT__PRODUCT:
        setProduct((Product)newValue);
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
      case DataPackage.ITEM_PRODUCT__ITEM:
        setItem((Item)null);
        return;
      case DataPackage.ITEM_PRODUCT__PRODUCT:
        setProduct((Product)null);
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
      case DataPackage.ITEM_PRODUCT__ITEM:
        return item != null;
      case DataPackage.ITEM_PRODUCT__PRODUCT:
        return product != null;
    }
    return super.eIsSet(featureID);
  }

} //ItemProductImpl
