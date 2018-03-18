/**
 */
package org.pdulvp.data.table.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.impl.DataPackageImpl;
import org.pdulvp.data.table.DAttribute;
import org.pdulvp.data.table.DFeature;
import org.pdulvp.data.table.DKey;
import org.pdulvp.data.table.DKeyValue;
import org.pdulvp.data.table.DNamedElement;
import org.pdulvp.data.table.DReference;
import org.pdulvp.data.table.DTable;
import org.pdulvp.data.table.DTablePkg;
import org.pdulvp.data.table.TableFactory;
import org.pdulvp.data.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TablePackageImpl extends EPackageImpl implements TablePackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dTableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dKeyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dNamedElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dTablePkgEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dKeyValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dFeatureEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.pdulvp.data.table.TablePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TablePackageImpl() {
    super(eNS_URI, TableFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link TablePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TablePackage init() {
    if (isInited) return (TablePackage)EPackage.Registry.INSTANCE.getEPackage(TablePackage.eNS_URI);

    // Obtain or create and register package
    TablePackageImpl theTablePackage = (TablePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TablePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TablePackageImpl());

    isInited = true;

    // Initialize simple dependencies
    EcorePackage.eINSTANCE.eClass();

    // Obtain or create and register interdependencies
    DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);

    // Create package meta-data objects
    theTablePackage.createPackageContents();
    theDataPackage.createPackageContents();

    // Initialize created meta-data
    theTablePackage.initializePackageContents();
    theDataPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTablePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TablePackage.eNS_URI, theTablePackage);
    return theTablePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDTable() {
    return dTableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDTable_PrimaryKey() {
    return (EReference)dTableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDTable_IndexKeys() {
    return (EReference)dTableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDTable_OwnedAttributes() {
    return (EReference)dTableEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDTable_OwnedReferences() {
    return (EReference)dTableEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDTable_ClassName() {
    return (EAttribute)dTableEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDTable_OrderingKeys() {
    return (EReference)dTableEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDTable_FilteringKeys() {
    return (EReference)dTableEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDTable_Pagination() {
    return (EAttribute)dTableEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDAttribute() {
    return dAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDKey() {
    return dKeyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDKey_Features() {
    return (EReference)dKeyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDNamedElement() {
    return dNamedElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDNamedElement_DbName() {
    return (EAttribute)dNamedElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDTablePkg() {
    return dTablePkgEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDTablePkg_OwnedTables() {
    return (EReference)dTablePkgEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDKeyValue() {
    return dKeyValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDKeyValue_Table() {
    return (EReference)dKeyValueEClass.getEStructuralFeatures().get(0);
  }

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDKeyValue_Feature() {
    return (EReference)dKeyValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDKeyValue_Value() {
    return (EAttribute)dKeyValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDReference() {
    return dReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDFeature() {
    return dFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDFeature_JsonName() {
    return (EAttribute)dFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDFeature_Editable() {
    return (EAttribute)dFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDFeature_External() {
    return (EAttribute)dFeatureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDFeature_ExportJson() {
    return (EAttribute)dFeatureEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDFeature_Feature() {
    return (EReference)dFeatureEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getDFeature_Many() {
    return (EAttribute)dFeatureEClass.getEStructuralFeatures().get(5);
  }

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableFactory getTableFactory() {
    return (TableFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents() {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    dTableEClass = createEClass(DTABLE);
    createEReference(dTableEClass, DTABLE__PRIMARY_KEY);
    createEReference(dTableEClass, DTABLE__INDEX_KEYS);
    createEReference(dTableEClass, DTABLE__ORDERING_KEYS);
    createEReference(dTableEClass, DTABLE__FILTERING_KEYS);
    createEAttribute(dTableEClass, DTABLE__CLASS_NAME);
    createEReference(dTableEClass, DTABLE__OWNED_ATTRIBUTES);
    createEReference(dTableEClass, DTABLE__OWNED_REFERENCES);
    createEAttribute(dTableEClass, DTABLE__PAGINATION);

    dFeatureEClass = createEClass(DFEATURE);
    createEAttribute(dFeatureEClass, DFEATURE__JSON_NAME);
    createEAttribute(dFeatureEClass, DFEATURE__EDITABLE);
    createEAttribute(dFeatureEClass, DFEATURE__EXTERNAL);
    createEAttribute(dFeatureEClass, DFEATURE__EXPORT_JSON);
    createEReference(dFeatureEClass, DFEATURE__FEATURE);
    createEAttribute(dFeatureEClass, DFEATURE__MANY);

    dAttributeEClass = createEClass(DATTRIBUTE);

    dReferenceEClass = createEClass(DREFERENCE);

    dKeyEClass = createEClass(DKEY);
    createEReference(dKeyEClass, DKEY__FEATURES);

    dNamedElementEClass = createEClass(DNAMED_ELEMENT);
    createEAttribute(dNamedElementEClass, DNAMED_ELEMENT__DB_NAME);

    dTablePkgEClass = createEClass(DTABLE_PKG);
    createEReference(dTablePkgEClass, DTABLE_PKG__OWNED_TABLES);

    dKeyValueEClass = createEClass(DKEY_VALUE);
    createEReference(dKeyValueEClass, DKEY_VALUE__TABLE);
    createEReference(dKeyValueEClass, DKEY_VALUE__FEATURE);
    createEAttribute(dKeyValueEClass, DKEY_VALUE__VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents() {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    dTableEClass.getESuperTypes().add(this.getDNamedElement());
    dFeatureEClass.getESuperTypes().add(this.getDNamedElement());
    dAttributeEClass.getESuperTypes().add(this.getDFeature());
    dReferenceEClass.getESuperTypes().add(this.getDFeature());
    dKeyEClass.getESuperTypes().add(this.getDNamedElement());
    dNamedElementEClass.getESuperTypes().add(theDataPackage.getAbstractItem());
    dTablePkgEClass.getESuperTypes().add(this.getDNamedElement());
    dKeyValueEClass.getESuperTypes().add(this.getDNamedElement());

    // Initialize classes and features; add operations and parameters
    initEClass(dTableEClass, DTable.class, "DTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDTable_PrimaryKey(), this.getDKey(), null, "primaryKey", null, 0, 1, DTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDTable_IndexKeys(), this.getDKey(), null, "indexKeys", null, 0, -1, DTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDTable_OrderingKeys(), this.getDKeyValue(), null, "orderingKeys", null, 0, -1, DTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDTable_FilteringKeys(), this.getDKeyValue(), null, "filteringKeys", null, 0, -1, DTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDTable_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, DTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDTable_OwnedAttributes(), this.getDAttribute(), null, "ownedAttributes", null, 0, -1, DTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDTable_OwnedReferences(), this.getDReference(), null, "ownedReferences", null, 0, -1, DTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDTable_Pagination(), ecorePackage.getEInt(), "pagination", null, 0, 1, DTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dFeatureEClass, DFeature.class, "DFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDFeature_JsonName(), ecorePackage.getEString(), "jsonName", null, 0, 1, DFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDFeature_Editable(), ecorePackage.getEBoolean(), "editable", null, 0, 1, DFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDFeature_External(), ecorePackage.getEBoolean(), "external", "false", 0, 1, DFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDFeature_ExportJson(), ecorePackage.getEBoolean(), "exportJson", null, 0, 1, DFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDFeature_Feature(), ecorePackage.getEStructuralFeature(), null, "feature", null, 0, 1, DFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDFeature_Many(), ecorePackage.getEBoolean(), "many", null, 0, 1, DFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dAttributeEClass, DAttribute.class, "DAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dReferenceEClass, DReference.class, "DReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dKeyEClass, DKey.class, "DKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDKey_Features(), this.getDFeature(), null, "features", null, 0, -1, DKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dNamedElementEClass, DNamedElement.class, "DNamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDNamedElement_DbName(), ecorePackage.getEString(), "dbName", null, 0, 1, DNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dTablePkgEClass, DTablePkg.class, "DTablePkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDTablePkg_OwnedTables(), this.getDTable(), null, "ownedTables", null, 0, -1, DTablePkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dKeyValueEClass, DKeyValue.class, "DKeyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDKeyValue_Table(), this.getDTable(), null, "table", null, 0, 1, DKeyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDKeyValue_Feature(), this.getDFeature(), null, "feature", null, 0, 1, DKeyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDKeyValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, DKeyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create annotations
    // database
    createDatabaseAnnotations();
  }

  /**
   * Initializes the annotations for <b>database</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createDatabaseAnnotations() {
    String source = "database";	
    addAnnotation
      (getDFeature_JsonName(), 
       source, 
       new String[] {
       "db_id", "name"
       });	
    addAnnotation
      (getDNamedElement_DbName(), 
       source, 
       new String[] {
       "db_id", "name"
       });
  }

} //TablePackageImpl
