/**
 */
package org.pdulvp.data.table.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pdulvp.data.table.DFeature;
import org.pdulvp.data.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DFeature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.table.impl.DFeatureImpl#getJsonName <em>Json Name</em>}</li>
 *   <li>{@link org.pdulvp.data.table.impl.DFeatureImpl#isEditable <em>Editable</em>}</li>
 *   <li>{@link org.pdulvp.data.table.impl.DFeatureImpl#isExternal <em>External</em>}</li>
 *   <li>{@link org.pdulvp.data.table.impl.DFeatureImpl#isExportJson <em>Export Json</em>}</li>
 *   <li>{@link org.pdulvp.data.table.impl.DFeatureImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.pdulvp.data.table.impl.DFeatureImpl#isMany <em>Many</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DFeatureImpl extends DNamedElementImpl implements DFeature {
  /**
   * The default value of the '{@link #getJsonName() <em>Json Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJsonName()
   * @generated
   * @ordered
   */
  protected static final String JSON_NAME_EDEFAULT = null;
  /**
   * The cached value of the '{@link #getJsonName() <em>Json Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJsonName()
   * @generated
   * @ordered
   */
  protected String jsonName = JSON_NAME_EDEFAULT;
  /**
   * The default value of the '{@link #isEditable() <em>Editable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEditable()
   * @generated
   * @ordered
   */
  protected static final boolean EDITABLE_EDEFAULT = false;
  /**
   * The cached value of the '{@link #isEditable() <em>Editable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEditable()
   * @generated
   * @ordered
   */
  protected boolean editable = EDITABLE_EDEFAULT;
  /**
   * The default value of the '{@link #isExternal() <em>External</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExternal()
   * @generated
   * @ordered
   */
  protected static final boolean EXTERNAL_EDEFAULT = false;
  /**
   * The cached value of the '{@link #isExternal() <em>External</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExternal()
   * @generated
   * @ordered
   */
  protected boolean external = EXTERNAL_EDEFAULT;
  /**
   * The default value of the '{@link #isExportJson() <em>Export Json</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExportJson()
   * @generated
   * @ordered
   */
  protected static final boolean EXPORT_JSON_EDEFAULT = false;
  /**
   * The cached value of the '{@link #isExportJson() <em>Export Json</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExportJson()
   * @generated
   * @ordered
   */
  protected boolean exportJson = EXPORT_JSON_EDEFAULT;

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
   * The default value of the '{@link #isMany() <em>Many</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isMany()
   * @generated
   * @ordered
   */
	protected static final boolean MANY_EDEFAULT = false;
		/**
   * The cached value of the '{@link #isMany() <em>Many</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isMany()
   * @generated
   * @ordered
   */
	protected boolean many = MANY_EDEFAULT;

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DFeatureImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return TablePackage.Literals.DFEATURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getJsonName() {
    return jsonName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJsonName(String newJsonName) {
    String oldJsonName = jsonName;
    jsonName = newJsonName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DFEATURE__JSON_NAME, oldJsonName, jsonName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEditable() {
    return editable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEditable(boolean newEditable) {
    boolean oldEditable = editable;
    editable = newEditable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DFEATURE__EDITABLE, oldEditable, editable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isExternal() {
    return external;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExternal(boolean newExternal) {
    boolean oldExternal = external;
    external = newExternal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DFEATURE__EXTERNAL, oldExternal, external));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isExportJson() {
    return exportJson;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExportJson(boolean newExportJson) {
    boolean oldExportJson = exportJson;
    exportJson = newExportJson;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DFEATURE__EXPORT_JSON, oldExportJson, exportJson));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TablePackage.DFEATURE__FEATURE, oldFeature, feature));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DFEATURE__FEATURE, oldFeature, feature));
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isMany() {
    return many;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMany(boolean newMany) {
    boolean oldMany = many;
    many = newMany;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DFEATURE__MANY, oldMany, many));
  }

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case TablePackage.DFEATURE__JSON_NAME:
        return getJsonName();
      case TablePackage.DFEATURE__EDITABLE:
        return isEditable();
      case TablePackage.DFEATURE__EXTERNAL:
        return isExternal();
      case TablePackage.DFEATURE__EXPORT_JSON:
        return isExportJson();
      case TablePackage.DFEATURE__FEATURE:
        if (resolve) return getFeature();
        return basicGetFeature();
      case TablePackage.DFEATURE__MANY:
        return isMany();
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
      case TablePackage.DFEATURE__JSON_NAME:
        setJsonName((String)newValue);
        return;
      case TablePackage.DFEATURE__EDITABLE:
        setEditable((Boolean)newValue);
        return;
      case TablePackage.DFEATURE__EXTERNAL:
        setExternal((Boolean)newValue);
        return;
      case TablePackage.DFEATURE__EXPORT_JSON:
        setExportJson((Boolean)newValue);
        return;
      case TablePackage.DFEATURE__FEATURE:
        setFeature((EStructuralFeature)newValue);
        return;
      case TablePackage.DFEATURE__MANY:
        setMany((Boolean)newValue);
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
      case TablePackage.DFEATURE__JSON_NAME:
        setJsonName(JSON_NAME_EDEFAULT);
        return;
      case TablePackage.DFEATURE__EDITABLE:
        setEditable(EDITABLE_EDEFAULT);
        return;
      case TablePackage.DFEATURE__EXTERNAL:
        setExternal(EXTERNAL_EDEFAULT);
        return;
      case TablePackage.DFEATURE__EXPORT_JSON:
        setExportJson(EXPORT_JSON_EDEFAULT);
        return;
      case TablePackage.DFEATURE__FEATURE:
        setFeature((EStructuralFeature)null);
        return;
      case TablePackage.DFEATURE__MANY:
        setMany(MANY_EDEFAULT);
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
      case TablePackage.DFEATURE__JSON_NAME:
        return JSON_NAME_EDEFAULT == null ? jsonName != null : !JSON_NAME_EDEFAULT.equals(jsonName);
      case TablePackage.DFEATURE__EDITABLE:
        return editable != EDITABLE_EDEFAULT;
      case TablePackage.DFEATURE__EXTERNAL:
        return external != EXTERNAL_EDEFAULT;
      case TablePackage.DFEATURE__EXPORT_JSON:
        return exportJson != EXPORT_JSON_EDEFAULT;
      case TablePackage.DFEATURE__FEATURE:
        return feature != null;
      case TablePackage.DFEATURE__MANY:
        return many != MANY_EDEFAULT;
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
    result.append(" (jsonName: ");
    result.append(jsonName);
    result.append(", editable: ");
    result.append(editable);
    result.append(", external: ");
    result.append(external);
    result.append(", exportJson: ");
    result.append(exportJson);
    result.append(", many: ");
    result.append(many);
    result.append(')');
    return result.toString();
  }

} //DFeatureImpl
