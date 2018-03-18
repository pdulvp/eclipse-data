/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pdulvp.data.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pdulvp.data.Category;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.Screen;
import org.pdulvp.data.ScreenList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Screen List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.impl.ScreenListImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ScreenListImpl#getScreen <em>Screen</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ScreenListImpl#getIconData <em>Icon Data</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ScreenListImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ScreenListImpl#getPacks <em>Packs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScreenListImpl extends AbstractItemImpl implements ScreenList {
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
   * The cached value of the '{@link #getScreen() <em>Screen</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getScreen()
   * @generated
   * @ordered
   */
	protected Screen screen;

	/**
   * The default value of the '{@link #getIconData() <em>Icon Data</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getIconData()
   * @generated
   * @ordered
   */
	protected static final String ICON_DATA_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getIconData() <em>Icon Data</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getIconData()
   * @generated
   * @ordered
   */
	protected String iconData = ICON_DATA_EDEFAULT;

	/**
   * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStyle()
   * @generated
   * @ordered
   */
	protected static final String STYLE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStyle()
   * @generated
   * @ordered
   */
	protected String style = STYLE_EDEFAULT;

	/**
   * The default value of the '{@link #getPacks() <em>Packs</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPacks()
   * @generated
   * @ordered
   */
	protected static final String PACKS_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getPacks() <em>Packs</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPacks()
   * @generated
   * @ordered
   */
	protected String packs = PACKS_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ScreenListImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return DataPackage.Literals.SCREEN_LIST;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.SCREEN_LIST__CATEGORY, oldCategory, category));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCREEN_LIST__CATEGORY, oldCategory, category));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Screen getScreen() {
    if (screen != null && screen.eIsProxy()) {
      InternalEObject oldScreen = (InternalEObject)screen;
      screen = (Screen)eResolveProxy(oldScreen);
      if (screen != oldScreen) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.SCREEN_LIST__SCREEN, oldScreen, screen));
      }
    }
    return screen;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Screen basicGetScreen() {
    return screen;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setScreen(Screen newScreen) {
    Screen oldScreen = screen;
    screen = newScreen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCREEN_LIST__SCREEN, oldScreen, screen));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getIconData() {
    return iconData;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setIconData(String newIconData) {
    String oldIconData = iconData;
    iconData = newIconData;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCREEN_LIST__ICON_DATA, oldIconData, iconData));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getStyle() {
    return style;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getPacks() {
    return packs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case DataPackage.SCREEN_LIST__CATEGORY:
        if (resolve) return getCategory();
        return basicGetCategory();
      case DataPackage.SCREEN_LIST__SCREEN:
        if (resolve) return getScreen();
        return basicGetScreen();
      case DataPackage.SCREEN_LIST__ICON_DATA:
        return getIconData();
      case DataPackage.SCREEN_LIST__STYLE:
        return getStyle();
      case DataPackage.SCREEN_LIST__PACKS:
        return getPacks();
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
      case DataPackage.SCREEN_LIST__CATEGORY:
        setCategory((Category)newValue);
        return;
      case DataPackage.SCREEN_LIST__SCREEN:
        setScreen((Screen)newValue);
        return;
      case DataPackage.SCREEN_LIST__ICON_DATA:
        setIconData((String)newValue);
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
      case DataPackage.SCREEN_LIST__CATEGORY:
        setCategory((Category)null);
        return;
      case DataPackage.SCREEN_LIST__SCREEN:
        setScreen((Screen)null);
        return;
      case DataPackage.SCREEN_LIST__ICON_DATA:
        setIconData(ICON_DATA_EDEFAULT);
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
      case DataPackage.SCREEN_LIST__CATEGORY:
        return category != null;
      case DataPackage.SCREEN_LIST__SCREEN:
        return screen != null;
      case DataPackage.SCREEN_LIST__ICON_DATA:
        return ICON_DATA_EDEFAULT == null ? iconData != null : !ICON_DATA_EDEFAULT.equals(iconData);
      case DataPackage.SCREEN_LIST__STYLE:
        return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
      case DataPackage.SCREEN_LIST__PACKS:
        return PACKS_EDEFAULT == null ? packs != null : !PACKS_EDEFAULT.equals(packs);
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
    result.append(" (iconData: ");
    result.append(iconData);
    result.append(", style: ");
    result.append(style);
    result.append(", packs: ");
    result.append(packs);
    result.append(')');
    return result.toString();
  }

} //ScreenListImpl
