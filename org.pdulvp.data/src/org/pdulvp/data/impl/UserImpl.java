/**
 */
package org.pdulvp.data.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.pdulvp.data.Category;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.ImageItem;
import org.pdulvp.data.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.impl.UserImpl#getMail <em>Mail</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.UserImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.UserImpl#getFavouriteCategories <em>Favourite Categories</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.UserImpl#getFavouriteItems <em>Favourite Items</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.UserImpl#getClickedItems <em>Clicked Items</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.UserImpl#getWidgetedItems <em>Widgeted Items</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.UserImpl#getGcm <em>Gcm</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.UserImpl#getIdentifiers <em>Identifiers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends AbstractItemImpl implements User {
	/**
   * The default value of the '{@link #getMail() <em>Mail</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMail()
   * @generated
   * @ordered
   */
	protected static final String MAIL_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getMail() <em>Mail</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMail()
   * @generated
   * @ordered
   */
	protected String mail = MAIL_EDEFAULT;

	/**
   * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPassword()
   * @generated
   * @ordered
   */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPassword()
   * @generated
   * @ordered
   */
	protected String password = PASSWORD_EDEFAULT;

	/**
   * The cached value of the '{@link #getFavouriteCategories() <em>Favourite Categories</em>}' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFavouriteCategories()
   * @generated
   * @ordered
   */
	protected EList<Category> favouriteCategories;

	/**
   * The cached value of the '{@link #getFavouriteItems() <em>Favourite Items</em>}' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFavouriteItems()
   * @generated
   * @ordered
   */
	protected EList<ImageItem> favouriteItems;

	/**
   * The cached value of the '{@link #getClickedItems() <em>Clicked Items</em>}' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getClickedItems()
   * @generated
   * @ordered
   */
	protected EList<ImageItem> clickedItems;

	/**
   * The cached value of the '{@link #getWidgetedItems() <em>Widgeted Items</em>}' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getWidgetedItems()
   * @generated
   * @ordered
   */
	protected EList<ImageItem> widgetedItems;

	/**
   * The cached value of the '{@link #getGcm() <em>Gcm</em>}' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getGcm()
   * @generated
   * @ordered
   */
	protected EList<String> gcm;

	/**
   * The default value of the '{@link #getIdentifiers() <em>Identifiers</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getIdentifiers()
   * @generated
   * @ordered
   */
	protected static final String IDENTIFIERS_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getIdentifiers() <em>Identifiers</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getIdentifiers()
   * @generated
   * @ordered
   */
	protected String identifiers = IDENTIFIERS_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected UserImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return DataPackage.Literals.USER;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String getMail() {
    return mail;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void setMail(String newMail) {
    String oldMail = mail;
    mail = newMail;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.USER__MAIL, oldMail, mail));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String getPassword() {
    return password;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void setPassword(String newPassword) {
    String oldPassword = password;
    password = newPassword;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.USER__PASSWORD, oldPassword, password));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EList<Category> getFavouriteCategories() {
    if (favouriteCategories == null) {
      favouriteCategories = new EObjectResolvingEList<Category>(Category.class, this, DataPackage.USER__FAVOURITE_CATEGORIES);
    }
    return favouriteCategories;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EList<ImageItem> getFavouriteItems() {
    if (favouriteItems == null) {
      favouriteItems = new EObjectResolvingEList<ImageItem>(ImageItem.class, this, DataPackage.USER__FAVOURITE_ITEMS);
    }
    return favouriteItems;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ImageItem> getClickedItems() {
    if (clickedItems == null) {
      clickedItems = new EObjectResolvingEList<ImageItem>(ImageItem.class, this, DataPackage.USER__CLICKED_ITEMS);
    }
    return clickedItems;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ImageItem> getWidgetedItems() {
    if (widgetedItems == null) {
      widgetedItems = new EObjectResolvingEList<ImageItem>(ImageItem.class, this, DataPackage.USER__WIDGETED_ITEMS);
    }
    return widgetedItems;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<String> getGcm() {
    if (gcm == null) {
      gcm = new EDataTypeUniqueEList<String>(String.class, this, DataPackage.USER__GCM);
    }
    return gcm;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getIdentifiers() {
    return identifiers;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setIdentifiers(String newIdentifiers) {
    String oldIdentifiers = identifiers;
    identifiers = newIdentifiers;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.USER__IDENTIFIERS, oldIdentifiers, identifiers));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case DataPackage.USER__MAIL:
        return getMail();
      case DataPackage.USER__PASSWORD:
        return getPassword();
      case DataPackage.USER__FAVOURITE_CATEGORIES:
        return getFavouriteCategories();
      case DataPackage.USER__FAVOURITE_ITEMS:
        return getFavouriteItems();
      case DataPackage.USER__CLICKED_ITEMS:
        return getClickedItems();
      case DataPackage.USER__WIDGETED_ITEMS:
        return getWidgetedItems();
      case DataPackage.USER__GCM:
        return getGcm();
      case DataPackage.USER__IDENTIFIERS:
        return getIdentifiers();
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
      case DataPackage.USER__MAIL:
        setMail((String)newValue);
        return;
      case DataPackage.USER__PASSWORD:
        setPassword((String)newValue);
        return;
      case DataPackage.USER__FAVOURITE_CATEGORIES:
        getFavouriteCategories().clear();
        getFavouriteCategories().addAll((Collection<? extends Category>)newValue);
        return;
      case DataPackage.USER__FAVOURITE_ITEMS:
        getFavouriteItems().clear();
        getFavouriteItems().addAll((Collection<? extends ImageItem>)newValue);
        return;
      case DataPackage.USER__CLICKED_ITEMS:
        getClickedItems().clear();
        getClickedItems().addAll((Collection<? extends ImageItem>)newValue);
        return;
      case DataPackage.USER__WIDGETED_ITEMS:
        getWidgetedItems().clear();
        getWidgetedItems().addAll((Collection<? extends ImageItem>)newValue);
        return;
      case DataPackage.USER__GCM:
        getGcm().clear();
        getGcm().addAll((Collection<? extends String>)newValue);
        return;
      case DataPackage.USER__IDENTIFIERS:
        setIdentifiers((String)newValue);
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
      case DataPackage.USER__MAIL:
        setMail(MAIL_EDEFAULT);
        return;
      case DataPackage.USER__PASSWORD:
        setPassword(PASSWORD_EDEFAULT);
        return;
      case DataPackage.USER__FAVOURITE_CATEGORIES:
        getFavouriteCategories().clear();
        return;
      case DataPackage.USER__FAVOURITE_ITEMS:
        getFavouriteItems().clear();
        return;
      case DataPackage.USER__CLICKED_ITEMS:
        getClickedItems().clear();
        return;
      case DataPackage.USER__WIDGETED_ITEMS:
        getWidgetedItems().clear();
        return;
      case DataPackage.USER__GCM:
        getGcm().clear();
        return;
      case DataPackage.USER__IDENTIFIERS:
        setIdentifiers(IDENTIFIERS_EDEFAULT);
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
      case DataPackage.USER__MAIL:
        return MAIL_EDEFAULT == null ? mail != null : !MAIL_EDEFAULT.equals(mail);
      case DataPackage.USER__PASSWORD:
        return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
      case DataPackage.USER__FAVOURITE_CATEGORIES:
        return favouriteCategories != null && !favouriteCategories.isEmpty();
      case DataPackage.USER__FAVOURITE_ITEMS:
        return favouriteItems != null && !favouriteItems.isEmpty();
      case DataPackage.USER__CLICKED_ITEMS:
        return clickedItems != null && !clickedItems.isEmpty();
      case DataPackage.USER__WIDGETED_ITEMS:
        return widgetedItems != null && !widgetedItems.isEmpty();
      case DataPackage.USER__GCM:
        return gcm != null && !gcm.isEmpty();
      case DataPackage.USER__IDENTIFIERS:
        return IDENTIFIERS_EDEFAULT == null ? identifiers != null : !IDENTIFIERS_EDEFAULT.equals(identifiers);
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
    result.append(" (mail: ");
    result.append(mail);
    result.append(", password: ");
    result.append(password);
    result.append(", gcm: ");
    result.append(gcm);
    result.append(", identifiers: ");
    result.append(identifiers);
    result.append(')');
    return result.toString();
  }

} //UserImpl
