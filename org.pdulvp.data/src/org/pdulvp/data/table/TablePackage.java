/**
 */
package org.pdulvp.data.table;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.pdulvp.data.DataPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.pdulvp.data.table.TableFactory
 * @model kind="package"
 * @generated
 */
public interface TablePackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "table";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://org.pdulvp/table";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "table";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TablePackage eINSTANCE = org.pdulvp.data.table.impl.TablePackageImpl.init();

  /**
   * The meta object id for the '{@link org.pdulvp.data.table.impl.DNamedElementImpl <em>DNamed Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.table.impl.DNamedElementImpl
   * @see org.pdulvp.data.table.impl.TablePackageImpl#getDNamedElement()
   * @generated
   */
  int DNAMED_ELEMENT = 5;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DNAMED_ELEMENT__TIMESTAMP = DataPackage.ABSTRACT_ITEM__TIMESTAMP;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DNAMED_ELEMENT__ID = DataPackage.ABSTRACT_ITEM__ID;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DNAMED_ELEMENT__TAG = DataPackage.ABSTRACT_ITEM__TAG;

  /**
   * The feature id for the '<em><b>Db Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DNAMED_ELEMENT__DB_NAME = DataPackage.ABSTRACT_ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>DNamed Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DNAMED_ELEMENT_FEATURE_COUNT = DataPackage.ABSTRACT_ITEM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.pdulvp.data.table.impl.DTableImpl <em>DTable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.table.impl.DTableImpl
   * @see org.pdulvp.data.table.impl.TablePackageImpl#getDTable()
   * @generated
   */
  int DTABLE = 0;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTABLE__TIMESTAMP = DNAMED_ELEMENT__TIMESTAMP;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTABLE__ID = DNAMED_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTABLE__TAG = DNAMED_ELEMENT__TAG;

  /**
   * The feature id for the '<em><b>Db Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTABLE__DB_NAME = DNAMED_ELEMENT__DB_NAME;

  /**
   * The feature id for the '<em><b>Primary Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTABLE__PRIMARY_KEY = DNAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Index Keys</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTABLE__INDEX_KEYS = DNAMED_ELEMENT_FEATURE_COUNT + 1;

		/**
   * The feature id for the '<em><b>Ordering Keys</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTABLE__ORDERING_KEYS = DNAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Filtering Keys</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTABLE__FILTERING_KEYS = DNAMED_ELEMENT_FEATURE_COUNT + 3;

		/**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTABLE__CLASS_NAME = DNAMED_ELEMENT_FEATURE_COUNT + 4;

		/**
   * The feature id for the '<em><b>Owned Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTABLE__OWNED_ATTRIBUTES = DNAMED_ELEMENT_FEATURE_COUNT + 5;

		/**
   * The feature id for the '<em><b>Owned References</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTABLE__OWNED_REFERENCES = DNAMED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Pagination</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTABLE__PAGINATION = DNAMED_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>DTable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTABLE_FEATURE_COUNT = DNAMED_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link org.pdulvp.data.table.impl.DFeatureImpl <em>DFeature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.table.impl.DFeatureImpl
   * @see org.pdulvp.data.table.impl.TablePackageImpl#getDFeature()
   * @generated
   */
  int DFEATURE = 1;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DFEATURE__TIMESTAMP = DNAMED_ELEMENT__TIMESTAMP;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DFEATURE__ID = DNAMED_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DFEATURE__TAG = DNAMED_ELEMENT__TAG;

  /**
   * The feature id for the '<em><b>Db Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DFEATURE__DB_NAME = DNAMED_ELEMENT__DB_NAME;

  /**
   * The feature id for the '<em><b>Json Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DFEATURE__JSON_NAME = DNAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Editable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DFEATURE__EDITABLE = DNAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>External</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DFEATURE__EXTERNAL = DNAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Export Json</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DFEATURE__EXPORT_JSON = DNAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DFEATURE__FEATURE = DNAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DFEATURE__MANY = DNAMED_ELEMENT_FEATURE_COUNT + 5;

		/**
   * The number of structural features of the '<em>DFeature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DFEATURE_FEATURE_COUNT = DNAMED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.pdulvp.data.table.impl.DAttributeImpl <em>DAttribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.table.impl.DAttributeImpl
   * @see org.pdulvp.data.table.impl.TablePackageImpl#getDAttribute()
   * @generated
   */
  int DATTRIBUTE = 2;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATTRIBUTE__TIMESTAMP = DFEATURE__TIMESTAMP;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATTRIBUTE__ID = DFEATURE__ID;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATTRIBUTE__TAG = DFEATURE__TAG;

  /**
   * The feature id for the '<em><b>Db Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATTRIBUTE__DB_NAME = DFEATURE__DB_NAME;

  /**
   * The feature id for the '<em><b>Json Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATTRIBUTE__JSON_NAME = DFEATURE__JSON_NAME;

  /**
   * The feature id for the '<em><b>Editable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATTRIBUTE__EDITABLE = DFEATURE__EDITABLE;

  /**
   * The feature id for the '<em><b>External</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATTRIBUTE__EXTERNAL = DFEATURE__EXTERNAL;

  /**
   * The feature id for the '<em><b>Export Json</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATTRIBUTE__EXPORT_JSON = DFEATURE__EXPORT_JSON;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATTRIBUTE__FEATURE = DFEATURE__FEATURE;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DATTRIBUTE__MANY = DFEATURE__MANY;

		/**
   * The number of structural features of the '<em>DAttribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATTRIBUTE_FEATURE_COUNT = DFEATURE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.pdulvp.data.table.impl.DKeyImpl <em>DKey</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.table.impl.DKeyImpl
   * @see org.pdulvp.data.table.impl.TablePackageImpl#getDKey()
   * @generated
   */
  int DKEY = 4;

  /**
   * The meta object id for the '{@link org.pdulvp.data.table.impl.DTablePkgImpl <em>DTable Pkg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.table.impl.DTablePkgImpl
   * @see org.pdulvp.data.table.impl.TablePackageImpl#getDTablePkg()
   * @generated
   */
  int DTABLE_PKG = 6;

  /**
   * The meta object id for the '{@link org.pdulvp.data.table.impl.DReferenceImpl <em>DReference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.table.impl.DReferenceImpl
   * @see org.pdulvp.data.table.impl.TablePackageImpl#getDReference()
   * @generated
   */
  int DREFERENCE = 3;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DREFERENCE__TIMESTAMP = DFEATURE__TIMESTAMP;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DREFERENCE__ID = DFEATURE__ID;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DREFERENCE__TAG = DFEATURE__TAG;

  /**
   * The feature id for the '<em><b>Db Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DREFERENCE__DB_NAME = DFEATURE__DB_NAME;

  /**
   * The feature id for the '<em><b>Json Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DREFERENCE__JSON_NAME = DFEATURE__JSON_NAME;

  /**
   * The feature id for the '<em><b>Editable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DREFERENCE__EDITABLE = DFEATURE__EDITABLE;

  /**
   * The feature id for the '<em><b>External</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DREFERENCE__EXTERNAL = DFEATURE__EXTERNAL;

  /**
   * The feature id for the '<em><b>Export Json</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DREFERENCE__EXPORT_JSON = DFEATURE__EXPORT_JSON;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DREFERENCE__FEATURE = DFEATURE__FEATURE;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DREFERENCE__MANY = DFEATURE__MANY;

		/**
   * The number of structural features of the '<em>DReference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DREFERENCE_FEATURE_COUNT = DFEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DKEY__TIMESTAMP = DNAMED_ELEMENT__TIMESTAMP;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DKEY__ID = DNAMED_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DKEY__TAG = DNAMED_ELEMENT__TAG;

  /**
   * The feature id for the '<em><b>Db Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DKEY__DB_NAME = DNAMED_ELEMENT__DB_NAME;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DKEY__FEATURES = DNAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>DKey</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DKEY_FEATURE_COUNT = DNAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTABLE_PKG__TIMESTAMP = DNAMED_ELEMENT__TIMESTAMP;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTABLE_PKG__ID = DNAMED_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTABLE_PKG__TAG = DNAMED_ELEMENT__TAG;

  /**
   * The feature id for the '<em><b>Db Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTABLE_PKG__DB_NAME = DNAMED_ELEMENT__DB_NAME;

  /**
   * The feature id for the '<em><b>Owned Tables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTABLE_PKG__OWNED_TABLES = DNAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>DTable Pkg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTABLE_PKG_FEATURE_COUNT = DNAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.pdulvp.data.table.impl.DKeyValueImpl <em>DKey Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.table.impl.DKeyValueImpl
   * @see org.pdulvp.data.table.impl.TablePackageImpl#getDKeyValue()
   * @generated
   */
  int DKEY_VALUE = 7;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DKEY_VALUE__TIMESTAMP = DNAMED_ELEMENT__TIMESTAMP;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DKEY_VALUE__ID = DNAMED_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DKEY_VALUE__TAG = DNAMED_ELEMENT__TAG;

  /**
   * The feature id for the '<em><b>Db Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DKEY_VALUE__DB_NAME = DNAMED_ELEMENT__DB_NAME;

  /**
   * The feature id for the '<em><b>Table</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DKEY_VALUE__TABLE = DNAMED_ELEMENT_FEATURE_COUNT + 0;

		/**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DKEY_VALUE__FEATURE = DNAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DKEY_VALUE__VALUE = DNAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>DKey Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DKEY_VALUE_FEATURE_COUNT = DNAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.table.DTable <em>DTable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DTable</em>'.
   * @see org.pdulvp.data.table.DTable
   * @generated
   */
  EClass getDTable();

  /**
   * Returns the meta object for the containment reference '{@link org.pdulvp.data.table.DTable#getPrimaryKey <em>Primary Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Primary Key</em>'.
   * @see org.pdulvp.data.table.DTable#getPrimaryKey()
   * @see #getDTable()
   * @generated
   */
  EReference getDTable_PrimaryKey();

  /**
   * Returns the meta object for the containment reference list '{@link org.pdulvp.data.table.DTable#getIndexKeys <em>Index Keys</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Index Keys</em>'.
   * @see org.pdulvp.data.table.DTable#getIndexKeys()
   * @see #getDTable()
   * @generated
   */
  EReference getDTable_IndexKeys();

  /**
   * Returns the meta object for the containment reference list '{@link org.pdulvp.data.table.DTable#getOwnedAttributes <em>Owned Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Attributes</em>'.
   * @see org.pdulvp.data.table.DTable#getOwnedAttributes()
   * @see #getDTable()
   * @generated
   */
  EReference getDTable_OwnedAttributes();

  /**
   * Returns the meta object for the containment reference list '{@link org.pdulvp.data.table.DTable#getOwnedReferences <em>Owned References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned References</em>'.
   * @see org.pdulvp.data.table.DTable#getOwnedReferences()
   * @see #getDTable()
   * @generated
   */
  EReference getDTable_OwnedReferences();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.table.DTable#getClassName <em>Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Name</em>'.
   * @see org.pdulvp.data.table.DTable#getClassName()
   * @see #getDTable()
   * @generated
   */
  EAttribute getDTable_ClassName();

  /**
   * Returns the meta object for the containment reference list '{@link org.pdulvp.data.table.DTable#getOrderingKeys <em>Ordering Keys</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ordering Keys</em>'.
   * @see org.pdulvp.data.table.DTable#getOrderingKeys()
   * @see #getDTable()
   * @generated
   */
  EReference getDTable_OrderingKeys();

  /**
   * Returns the meta object for the containment reference list '{@link org.pdulvp.data.table.DTable#getFilteringKeys <em>Filtering Keys</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Filtering Keys</em>'.
   * @see org.pdulvp.data.table.DTable#getFilteringKeys()
   * @see #getDTable()
   * @generated
   */
  EReference getDTable_FilteringKeys();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.table.DTable#getPagination <em>Pagination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pagination</em>'.
   * @see org.pdulvp.data.table.DTable#getPagination()
   * @see #getDTable()
   * @generated
   */
  EAttribute getDTable_Pagination();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.table.DAttribute <em>DAttribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DAttribute</em>'.
   * @see org.pdulvp.data.table.DAttribute
   * @generated
   */
  EClass getDAttribute();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.table.DKey <em>DKey</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DKey</em>'.
   * @see org.pdulvp.data.table.DKey
   * @generated
   */
  EClass getDKey();

  /**
   * Returns the meta object for the reference list '{@link org.pdulvp.data.table.DKey#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Features</em>'.
   * @see org.pdulvp.data.table.DKey#getFeatures()
   * @see #getDKey()
   * @generated
   */
  EReference getDKey_Features();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.table.DNamedElement <em>DNamed Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DNamed Element</em>'.
   * @see org.pdulvp.data.table.DNamedElement
   * @generated
   */
  EClass getDNamedElement();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.table.DNamedElement#getDbName <em>Db Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Name</em>'.
   * @see org.pdulvp.data.table.DNamedElement#getDbName()
   * @see #getDNamedElement()
   * @generated
   */
  EAttribute getDNamedElement_DbName();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.table.DTablePkg <em>DTable Pkg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DTable Pkg</em>'.
   * @see org.pdulvp.data.table.DTablePkg
   * @generated
   */
  EClass getDTablePkg();

  /**
   * Returns the meta object for the containment reference list '{@link org.pdulvp.data.table.DTablePkg#getOwnedTables <em>Owned Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Tables</em>'.
   * @see org.pdulvp.data.table.DTablePkg#getOwnedTables()
   * @see #getDTablePkg()
   * @generated
   */
  EReference getDTablePkg_OwnedTables();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.table.DKeyValue <em>DKey Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DKey Value</em>'.
   * @see org.pdulvp.data.table.DKeyValue
   * @generated
   */
  EClass getDKeyValue();

  /**
   * Returns the meta object for the reference '{@link org.pdulvp.data.table.DKeyValue#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Table</em>'.
   * @see org.pdulvp.data.table.DKeyValue#getTable()
   * @see #getDKeyValue()
   * @generated
   */
	EReference getDKeyValue_Table();

		/**
   * Returns the meta object for the reference '{@link org.pdulvp.data.table.DKeyValue#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see org.pdulvp.data.table.DKeyValue#getFeature()
   * @see #getDKeyValue()
   * @generated
   */
  EReference getDKeyValue_Feature();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.table.DKeyValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.pdulvp.data.table.DKeyValue#getValue()
   * @see #getDKeyValue()
   * @generated
   */
  EAttribute getDKeyValue_Value();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.table.DReference <em>DReference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DReference</em>'.
   * @see org.pdulvp.data.table.DReference
   * @generated
   */
  EClass getDReference();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.table.DFeature <em>DFeature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DFeature</em>'.
   * @see org.pdulvp.data.table.DFeature
   * @generated
   */
  EClass getDFeature();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.table.DFeature#getJsonName <em>Json Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Json Name</em>'.
   * @see org.pdulvp.data.table.DFeature#getJsonName()
   * @see #getDFeature()
   * @generated
   */
  EAttribute getDFeature_JsonName();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.table.DFeature#isEditable <em>Editable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Editable</em>'.
   * @see org.pdulvp.data.table.DFeature#isEditable()
   * @see #getDFeature()
   * @generated
   */
  EAttribute getDFeature_Editable();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.table.DFeature#isExternal <em>External</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>External</em>'.
   * @see org.pdulvp.data.table.DFeature#isExternal()
   * @see #getDFeature()
   * @generated
   */
  EAttribute getDFeature_External();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.table.DFeature#isExportJson <em>Export Json</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Export Json</em>'.
   * @see org.pdulvp.data.table.DFeature#isExportJson()
   * @see #getDFeature()
   * @generated
   */
  EAttribute getDFeature_ExportJson();

  /**
   * Returns the meta object for the reference '{@link org.pdulvp.data.table.DFeature#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see org.pdulvp.data.table.DFeature#getFeature()
   * @see #getDFeature()
   * @generated
   */
  EReference getDFeature_Feature();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.table.DFeature#isMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.pdulvp.data.table.DFeature#isMany()
   * @see #getDFeature()
   * @generated
   */
	EAttribute getDFeature_Many();

		/**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TableFactory getTableFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals {
    /**
     * The meta object literal for the '{@link org.pdulvp.data.table.impl.DTableImpl <em>DTable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.table.impl.DTableImpl
     * @see org.pdulvp.data.table.impl.TablePackageImpl#getDTable()
     * @generated
     */
    EClass DTABLE = eINSTANCE.getDTable();

    /**
     * The meta object literal for the '<em><b>Primary Key</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DTABLE__PRIMARY_KEY = eINSTANCE.getDTable_PrimaryKey();

    /**
     * The meta object literal for the '<em><b>Index Keys</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DTABLE__INDEX_KEYS = eINSTANCE.getDTable_IndexKeys();

    /**
     * The meta object literal for the '<em><b>Owned Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DTABLE__OWNED_ATTRIBUTES = eINSTANCE.getDTable_OwnedAttributes();

    /**
     * The meta object literal for the '<em><b>Owned References</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DTABLE__OWNED_REFERENCES = eINSTANCE.getDTable_OwnedReferences();

    /**
     * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DTABLE__CLASS_NAME = eINSTANCE.getDTable_ClassName();

    /**
     * The meta object literal for the '<em><b>Ordering Keys</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DTABLE__ORDERING_KEYS = eINSTANCE.getDTable_OrderingKeys();

    /**
     * The meta object literal for the '<em><b>Filtering Keys</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DTABLE__FILTERING_KEYS = eINSTANCE.getDTable_FilteringKeys();

    /**
     * The meta object literal for the '<em><b>Pagination</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DTABLE__PAGINATION = eINSTANCE.getDTable_Pagination();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.table.impl.DAttributeImpl <em>DAttribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.table.impl.DAttributeImpl
     * @see org.pdulvp.data.table.impl.TablePackageImpl#getDAttribute()
     * @generated
     */
    EClass DATTRIBUTE = eINSTANCE.getDAttribute();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.table.impl.DKeyImpl <em>DKey</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.table.impl.DKeyImpl
     * @see org.pdulvp.data.table.impl.TablePackageImpl#getDKey()
     * @generated
     */
    EClass DKEY = eINSTANCE.getDKey();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DKEY__FEATURES = eINSTANCE.getDKey_Features();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.table.impl.DNamedElementImpl <em>DNamed Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.table.impl.DNamedElementImpl
     * @see org.pdulvp.data.table.impl.TablePackageImpl#getDNamedElement()
     * @generated
     */
    EClass DNAMED_ELEMENT = eINSTANCE.getDNamedElement();

    /**
     * The meta object literal for the '<em><b>Db Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DNAMED_ELEMENT__DB_NAME = eINSTANCE.getDNamedElement_DbName();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.table.impl.DTablePkgImpl <em>DTable Pkg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.table.impl.DTablePkgImpl
     * @see org.pdulvp.data.table.impl.TablePackageImpl#getDTablePkg()
     * @generated
     */
    EClass DTABLE_PKG = eINSTANCE.getDTablePkg();

    /**
     * The meta object literal for the '<em><b>Owned Tables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DTABLE_PKG__OWNED_TABLES = eINSTANCE.getDTablePkg_OwnedTables();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.table.impl.DKeyValueImpl <em>DKey Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.table.impl.DKeyValueImpl
     * @see org.pdulvp.data.table.impl.TablePackageImpl#getDKeyValue()
     * @generated
     */
    EClass DKEY_VALUE = eINSTANCE.getDKeyValue();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DKEY_VALUE__TABLE = eINSTANCE.getDKeyValue_Table();

				/**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DKEY_VALUE__FEATURE = eINSTANCE.getDKeyValue_Feature();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DKEY_VALUE__VALUE = eINSTANCE.getDKeyValue_Value();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.table.impl.DReferenceImpl <em>DReference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.table.impl.DReferenceImpl
     * @see org.pdulvp.data.table.impl.TablePackageImpl#getDReference()
     * @generated
     */
    EClass DREFERENCE = eINSTANCE.getDReference();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.table.impl.DFeatureImpl <em>DFeature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.table.impl.DFeatureImpl
     * @see org.pdulvp.data.table.impl.TablePackageImpl#getDFeature()
     * @generated
     */
    EClass DFEATURE = eINSTANCE.getDFeature();

    /**
     * The meta object literal for the '<em><b>Json Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DFEATURE__JSON_NAME = eINSTANCE.getDFeature_JsonName();

    /**
     * The meta object literal for the '<em><b>Editable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DFEATURE__EDITABLE = eINSTANCE.getDFeature_Editable();

    /**
     * The meta object literal for the '<em><b>External</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DFEATURE__EXTERNAL = eINSTANCE.getDFeature_External();

    /**
     * The meta object literal for the '<em><b>Export Json</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DFEATURE__EXPORT_JSON = eINSTANCE.getDFeature_ExportJson();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DFEATURE__FEATURE = eINSTANCE.getDFeature_Feature();

				/**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute DFEATURE__MANY = eINSTANCE.getDFeature_Many();

  }

} //TablePackage
