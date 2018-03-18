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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.NamedItem;
import org.pdulvp.data.Schema;
import org.pdulvp.data.SchemaClass;
import org.pdulvp.data.table.DNamedElement;
import org.pdulvp.data.table.DTable;
import org.pdulvp.data.table.DTablePkg;
import org.pdulvp.data.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.impl.SchemaImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.SchemaImpl#getName_frFR <em>Name fr FR</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.SchemaImpl#getDbName <em>Db Name</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.SchemaImpl#getOwnedTables <em>Owned Tables</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.SchemaImpl#getDbSchema <em>Db Schema</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.SchemaImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.SchemaImpl#getOwnedClasses <em>Owned Classes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaImpl extends AbstractItemImpl implements Schema {
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getName_frFR() <em>Name fr FR</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName_frFR()
   * @generated
   * @ordered
   */
  protected static final String NAME_FR_FR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName_frFR() <em>Name fr FR</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName_frFR()
   * @generated
   * @ordered
   */
  protected String name_frFR = NAME_FR_FR_EDEFAULT;

  /**
   * The default value of the '{@link #getDbName() <em>Db Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbName()
   * @generated
   * @ordered
   */
  protected static final String DB_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDbName() <em>Db Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbName()
   * @generated
   * @ordered
   */
  protected String dbName = DB_NAME_EDEFAULT;

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
   * The default value of the '{@link #getDbSchema() <em>Db Schema</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbSchema()
   * @generated
   * @ordered
   */
  protected static final String DB_SCHEMA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDbSchema() <em>Db Schema</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbSchema()
   * @generated
   * @ordered
   */
  protected String dbSchema = DB_SCHEMA_EDEFAULT;

  /**
   * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespace()
   * @generated
   * @ordered
   */
  protected static final String NAMESPACE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespace()
   * @generated
   * @ordered
   */
  protected String namespace = NAMESPACE_EDEFAULT;

  /**
   * The cached value of the '{@link #getOwnedClasses() <em>Owned Classes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedClasses()
   * @generated
   * @ordered
   */
  protected EList<SchemaClass> ownedClasses;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SchemaImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return DataPackage.Literals.SCHEMA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCHEMA__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName_frFR() {
    return name_frFR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName_frFR(String newName_frFR) {
    String oldName_frFR = name_frFR;
    name_frFR = newName_frFR;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCHEMA__NAME_FR_FR, oldName_frFR, name_frFR));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDbName() {
    return dbName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbName(String newDbName) {
    String oldDbName = dbName;
    dbName = newDbName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCHEMA__DB_NAME, oldDbName, dbName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DTable> getOwnedTables() {
    if (ownedTables == null) {
      ownedTables = new EObjectContainmentEList<DTable>(DTable.class, this, DataPackage.SCHEMA__OWNED_TABLES);
    }
    return ownedTables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDbSchema() {
    return dbSchema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbSchema(String newDbSchema) {
    String oldDbSchema = dbSchema;
    dbSchema = newDbSchema;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCHEMA__DB_SCHEMA, oldDbSchema, dbSchema));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNamespace() {
    return namespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamespace(String newNamespace) {
    String oldNamespace = namespace;
    namespace = newNamespace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCHEMA__NAMESPACE, oldNamespace, namespace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SchemaClass> getOwnedClasses() {
    if (ownedClasses == null) {
      ownedClasses = new EObjectContainmentEList<SchemaClass>(SchemaClass.class, this, DataPackage.SCHEMA__OWNED_CLASSES);
    }
    return ownedClasses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case DataPackage.SCHEMA__OWNED_TABLES:
        return ((InternalEList<?>)getOwnedTables()).basicRemove(otherEnd, msgs);
      case DataPackage.SCHEMA__OWNED_CLASSES:
        return ((InternalEList<?>)getOwnedClasses()).basicRemove(otherEnd, msgs);
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
      case DataPackage.SCHEMA__NAME:
        return getName();
      case DataPackage.SCHEMA__NAME_FR_FR:
        return getName_frFR();
      case DataPackage.SCHEMA__DB_NAME:
        return getDbName();
      case DataPackage.SCHEMA__OWNED_TABLES:
        return getOwnedTables();
      case DataPackage.SCHEMA__DB_SCHEMA:
        return getDbSchema();
      case DataPackage.SCHEMA__NAMESPACE:
        return getNamespace();
      case DataPackage.SCHEMA__OWNED_CLASSES:
        return getOwnedClasses();
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
      case DataPackage.SCHEMA__NAME:
        setName((String)newValue);
        return;
      case DataPackage.SCHEMA__NAME_FR_FR:
        setName_frFR((String)newValue);
        return;
      case DataPackage.SCHEMA__DB_NAME:
        setDbName((String)newValue);
        return;
      case DataPackage.SCHEMA__OWNED_TABLES:
        getOwnedTables().clear();
        getOwnedTables().addAll((Collection<? extends DTable>)newValue);
        return;
      case DataPackage.SCHEMA__DB_SCHEMA:
        setDbSchema((String)newValue);
        return;
      case DataPackage.SCHEMA__NAMESPACE:
        setNamespace((String)newValue);
        return;
      case DataPackage.SCHEMA__OWNED_CLASSES:
        getOwnedClasses().clear();
        getOwnedClasses().addAll((Collection<? extends SchemaClass>)newValue);
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
      case DataPackage.SCHEMA__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DataPackage.SCHEMA__NAME_FR_FR:
        setName_frFR(NAME_FR_FR_EDEFAULT);
        return;
      case DataPackage.SCHEMA__DB_NAME:
        setDbName(DB_NAME_EDEFAULT);
        return;
      case DataPackage.SCHEMA__OWNED_TABLES:
        getOwnedTables().clear();
        return;
      case DataPackage.SCHEMA__DB_SCHEMA:
        setDbSchema(DB_SCHEMA_EDEFAULT);
        return;
      case DataPackage.SCHEMA__NAMESPACE:
        setNamespace(NAMESPACE_EDEFAULT);
        return;
      case DataPackage.SCHEMA__OWNED_CLASSES:
        getOwnedClasses().clear();
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
      case DataPackage.SCHEMA__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DataPackage.SCHEMA__NAME_FR_FR:
        return NAME_FR_FR_EDEFAULT == null ? name_frFR != null : !NAME_FR_FR_EDEFAULT.equals(name_frFR);
      case DataPackage.SCHEMA__DB_NAME:
        return DB_NAME_EDEFAULT == null ? dbName != null : !DB_NAME_EDEFAULT.equals(dbName);
      case DataPackage.SCHEMA__OWNED_TABLES:
        return ownedTables != null && !ownedTables.isEmpty();
      case DataPackage.SCHEMA__DB_SCHEMA:
        return DB_SCHEMA_EDEFAULT == null ? dbSchema != null : !DB_SCHEMA_EDEFAULT.equals(dbSchema);
      case DataPackage.SCHEMA__NAMESPACE:
        return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
      case DataPackage.SCHEMA__OWNED_CLASSES:
        return ownedClasses != null && !ownedClasses.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
    if (baseClass == NamedItem.class) {
      switch (derivedFeatureID) {
        case DataPackage.SCHEMA__NAME: return DataPackage.NAMED_ITEM__NAME;
        case DataPackage.SCHEMA__NAME_FR_FR: return DataPackage.NAMED_ITEM__NAME_FR_FR;
        default: return -1;
      }
    }
    if (baseClass == DNamedElement.class) {
      switch (derivedFeatureID) {
        case DataPackage.SCHEMA__DB_NAME: return TablePackage.DNAMED_ELEMENT__DB_NAME;
        default: return -1;
      }
    }
    if (baseClass == DTablePkg.class) {
      switch (derivedFeatureID) {
        case DataPackage.SCHEMA__OWNED_TABLES: return TablePackage.DTABLE_PKG__OWNED_TABLES;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
    if (baseClass == NamedItem.class) {
      switch (baseFeatureID) {
        case DataPackage.NAMED_ITEM__NAME: return DataPackage.SCHEMA__NAME;
        case DataPackage.NAMED_ITEM__NAME_FR_FR: return DataPackage.SCHEMA__NAME_FR_FR;
        default: return -1;
      }
    }
    if (baseClass == DNamedElement.class) {
      switch (baseFeatureID) {
        case TablePackage.DNAMED_ELEMENT__DB_NAME: return DataPackage.SCHEMA__DB_NAME;
        default: return -1;
      }
    }
    if (baseClass == DTablePkg.class) {
      switch (baseFeatureID) {
        case TablePackage.DTABLE_PKG__OWNED_TABLES: return DataPackage.SCHEMA__OWNED_TABLES;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", name_frFR: ");
    result.append(name_frFR);
    result.append(", dbName: ");
    result.append(dbName);
    result.append(", dbSchema: ");
    result.append(dbSchema);
    result.append(", namespace: ");
    result.append(namespace);
    result.append(')');
    return result.toString();
  }

} //SchemaImpl
