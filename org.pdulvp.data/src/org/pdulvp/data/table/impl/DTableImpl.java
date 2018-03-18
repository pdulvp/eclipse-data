/**
 */
package org.pdulvp.data.table.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pdulvp.data.table.DAttribute;
import org.pdulvp.data.table.DKey;
import org.pdulvp.data.table.DKeyValue;
import org.pdulvp.data.table.DReference;
import org.pdulvp.data.table.DTable;
import org.pdulvp.data.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DTable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.table.impl.DTableImpl#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link org.pdulvp.data.table.impl.DTableImpl#getIndexKeys <em>Index Keys</em>}</li>
 *   <li>{@link org.pdulvp.data.table.impl.DTableImpl#getOrderingKeys <em>Ordering Keys</em>}</li>
 *   <li>{@link org.pdulvp.data.table.impl.DTableImpl#getFilteringKeys <em>Filtering Keys</em>}</li>
 *   <li>{@link org.pdulvp.data.table.impl.DTableImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.pdulvp.data.table.impl.DTableImpl#getOwnedAttributes <em>Owned Attributes</em>}</li>
 *   <li>{@link org.pdulvp.data.table.impl.DTableImpl#getOwnedReferences <em>Owned References</em>}</li>
 *   <li>{@link org.pdulvp.data.table.impl.DTableImpl#getPagination <em>Pagination</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DTableImpl extends DNamedElementImpl implements DTable {
  /**
   * The cached value of the '{@link #getPrimaryKey() <em>Primary Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimaryKey()
   * @generated
   * @ordered
   */
  protected DKey primaryKey;

  /**
   * The cached value of the '{@link #getIndexKeys() <em>Index Keys</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndexKeys()
   * @generated
   * @ordered
   */
  protected EList<DKey> indexKeys;

		/**
   * The cached value of the '{@link #getOrderingKeys() <em>Ordering Keys</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrderingKeys()
   * @generated
   * @ordered
   */
  protected EList<DKeyValue> orderingKeys;

  /**
   * The cached value of the '{@link #getFilteringKeys() <em>Filtering Keys</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilteringKeys()
   * @generated
   * @ordered
   */
  protected EList<DKeyValue> filteringKeys;

		/**
   * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassName()
   * @generated
   * @ordered
   */
  protected static final String CLASS_NAME_EDEFAULT = null;

		/**
   * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassName()
   * @generated
   * @ordered
   */
  protected String className = CLASS_NAME_EDEFAULT;

		/**
   * The cached value of the '{@link #getOwnedAttributes() <em>Owned Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedAttributes()
   * @generated
   * @ordered
   */
  protected EList<DAttribute> ownedAttributes;

		/**
   * The cached value of the '{@link #getOwnedReferences() <em>Owned References</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedReferences()
   * @generated
   * @ordered
   */
  protected EList<DReference> ownedReferences;

  /**
   * The default value of the '{@link #getPagination() <em>Pagination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPagination()
   * @generated
   * @ordered
   */
  protected static final int PAGINATION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPagination() <em>Pagination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPagination()
   * @generated
   * @ordered
   */
  protected int pagination = PAGINATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DTableImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return TablePackage.Literals.DTABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DKey getPrimaryKey() {
    return primaryKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimaryKey(DKey newPrimaryKey, NotificationChain msgs) {
    DKey oldPrimaryKey = primaryKey;
    primaryKey = newPrimaryKey;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.DTABLE__PRIMARY_KEY, oldPrimaryKey, newPrimaryKey);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimaryKey(DKey newPrimaryKey) {
    if (newPrimaryKey != primaryKey) {
      NotificationChain msgs = null;
      if (primaryKey != null)
        msgs = ((InternalEObject)primaryKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.DTABLE__PRIMARY_KEY, null, msgs);
      if (newPrimaryKey != null)
        msgs = ((InternalEObject)newPrimaryKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.DTABLE__PRIMARY_KEY, null, msgs);
      msgs = basicSetPrimaryKey(newPrimaryKey, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DTABLE__PRIMARY_KEY, newPrimaryKey, newPrimaryKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DKey> getIndexKeys() {
    if (indexKeys == null) {
      indexKeys = new EObjectContainmentEList<DKey>(DKey.class, this, TablePackage.DTABLE__INDEX_KEYS);
    }
    return indexKeys;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DAttribute> getOwnedAttributes() {
    if (ownedAttributes == null) {
      ownedAttributes = new EObjectContainmentEList<DAttribute>(DAttribute.class, this, TablePackage.DTABLE__OWNED_ATTRIBUTES);
    }
    return ownedAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DReference> getOwnedReferences() {
    if (ownedReferences == null) {
      ownedReferences = new EObjectContainmentEList<DReference>(DReference.class, this, TablePackage.DTABLE__OWNED_REFERENCES);
    }
    return ownedReferences;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClassName() {
    return className;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setClassName(String newClassName) {
    String oldClassName = className;
    className = newClassName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DTABLE__CLASS_NAME, oldClassName, className));
  }

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DKeyValue> getOrderingKeys() {
    if (orderingKeys == null) {
      orderingKeys = new EObjectContainmentEList<DKeyValue>(DKeyValue.class, this, TablePackage.DTABLE__ORDERING_KEYS);
    }
    return orderingKeys;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DKeyValue> getFilteringKeys() {
    if (filteringKeys == null) {
      filteringKeys = new EObjectContainmentEList<DKeyValue>(DKeyValue.class, this, TablePackage.DTABLE__FILTERING_KEYS);
    }
    return filteringKeys;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPagination() {
    return pagination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPagination(int newPagination) {
    int oldPagination = pagination;
    pagination = newPagination;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DTABLE__PAGINATION, oldPagination, pagination));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case TablePackage.DTABLE__PRIMARY_KEY:
        return basicSetPrimaryKey(null, msgs);
      case TablePackage.DTABLE__INDEX_KEYS:
        return ((InternalEList<?>)getIndexKeys()).basicRemove(otherEnd, msgs);
      case TablePackage.DTABLE__ORDERING_KEYS:
        return ((InternalEList<?>)getOrderingKeys()).basicRemove(otherEnd, msgs);
      case TablePackage.DTABLE__FILTERING_KEYS:
        return ((InternalEList<?>)getFilteringKeys()).basicRemove(otherEnd, msgs);
      case TablePackage.DTABLE__OWNED_ATTRIBUTES:
        return ((InternalEList<?>)getOwnedAttributes()).basicRemove(otherEnd, msgs);
      case TablePackage.DTABLE__OWNED_REFERENCES:
        return ((InternalEList<?>)getOwnedReferences()).basicRemove(otherEnd, msgs);
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
      case TablePackage.DTABLE__PRIMARY_KEY:
        return getPrimaryKey();
      case TablePackage.DTABLE__INDEX_KEYS:
        return getIndexKeys();
      case TablePackage.DTABLE__ORDERING_KEYS:
        return getOrderingKeys();
      case TablePackage.DTABLE__FILTERING_KEYS:
        return getFilteringKeys();
      case TablePackage.DTABLE__CLASS_NAME:
        return getClassName();
      case TablePackage.DTABLE__OWNED_ATTRIBUTES:
        return getOwnedAttributes();
      case TablePackage.DTABLE__OWNED_REFERENCES:
        return getOwnedReferences();
      case TablePackage.DTABLE__PAGINATION:
        return getPagination();
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
      case TablePackage.DTABLE__PRIMARY_KEY:
        setPrimaryKey((DKey)newValue);
        return;
      case TablePackage.DTABLE__INDEX_KEYS:
        getIndexKeys().clear();
        getIndexKeys().addAll((Collection<? extends DKey>)newValue);
        return;
      case TablePackage.DTABLE__ORDERING_KEYS:
        getOrderingKeys().clear();
        getOrderingKeys().addAll((Collection<? extends DKeyValue>)newValue);
        return;
      case TablePackage.DTABLE__FILTERING_KEYS:
        getFilteringKeys().clear();
        getFilteringKeys().addAll((Collection<? extends DKeyValue>)newValue);
        return;
      case TablePackage.DTABLE__CLASS_NAME:
        setClassName((String)newValue);
        return;
      case TablePackage.DTABLE__OWNED_ATTRIBUTES:
        getOwnedAttributes().clear();
        getOwnedAttributes().addAll((Collection<? extends DAttribute>)newValue);
        return;
      case TablePackage.DTABLE__OWNED_REFERENCES:
        getOwnedReferences().clear();
        getOwnedReferences().addAll((Collection<? extends DReference>)newValue);
        return;
      case TablePackage.DTABLE__PAGINATION:
        setPagination((Integer)newValue);
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
      case TablePackage.DTABLE__PRIMARY_KEY:
        setPrimaryKey((DKey)null);
        return;
      case TablePackage.DTABLE__INDEX_KEYS:
        getIndexKeys().clear();
        return;
      case TablePackage.DTABLE__ORDERING_KEYS:
        getOrderingKeys().clear();
        return;
      case TablePackage.DTABLE__FILTERING_KEYS:
        getFilteringKeys().clear();
        return;
      case TablePackage.DTABLE__CLASS_NAME:
        setClassName(CLASS_NAME_EDEFAULT);
        return;
      case TablePackage.DTABLE__OWNED_ATTRIBUTES:
        getOwnedAttributes().clear();
        return;
      case TablePackage.DTABLE__OWNED_REFERENCES:
        getOwnedReferences().clear();
        return;
      case TablePackage.DTABLE__PAGINATION:
        setPagination(PAGINATION_EDEFAULT);
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
      case TablePackage.DTABLE__PRIMARY_KEY:
        return primaryKey != null;
      case TablePackage.DTABLE__INDEX_KEYS:
        return indexKeys != null && !indexKeys.isEmpty();
      case TablePackage.DTABLE__ORDERING_KEYS:
        return orderingKeys != null && !orderingKeys.isEmpty();
      case TablePackage.DTABLE__FILTERING_KEYS:
        return filteringKeys != null && !filteringKeys.isEmpty();
      case TablePackage.DTABLE__CLASS_NAME:
        return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
      case TablePackage.DTABLE__OWNED_ATTRIBUTES:
        return ownedAttributes != null && !ownedAttributes.isEmpty();
      case TablePackage.DTABLE__OWNED_REFERENCES:
        return ownedReferences != null && !ownedReferences.isEmpty();
      case TablePackage.DTABLE__PAGINATION:
        return pagination != PAGINATION_EDEFAULT;
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
    result.append(" (className: ");
    result.append(className);
    result.append(", pagination: ");
    result.append(pagination);
    result.append(')');
    return result.toString();
  }

} //DTableImpl
