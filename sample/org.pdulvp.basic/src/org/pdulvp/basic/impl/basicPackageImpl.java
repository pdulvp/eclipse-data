/**
 */
package org.pdulvp.basic.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.pdulvp.basic.AbstractItem;
import org.pdulvp.basic.Interface;
import org.pdulvp.basic.Property;
import org.pdulvp.basic.basicFactory;
import org.pdulvp.basic.basicPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class basicPackageImpl extends EPackageImpl implements basicPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

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
	 * @see org.pdulvp.basic.basicPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private basicPackageImpl() {
		super(eNS_URI, basicFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link basicPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static basicPackage init() {
		if (isInited) return (basicPackage)EPackage.Registry.INSTANCE.getEPackage(basicPackage.eNS_URI);

		// Obtain or create and register package
		basicPackageImpl thebasicPackage = (basicPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof basicPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new basicPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thebasicPackage.createPackageContents();

		// Initialize created meta-data
		thebasicPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thebasicPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(basicPackage.eNS_URI, thebasicPackage);
		return thebasicPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_OwnedProperties() {
		return (EReference)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Implements() {
		return (EReference)classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Extend() {
		return (EReference)classEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Type() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractItem() {
		return abstractItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractItem_Id() {
		return (EAttribute)abstractItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractItem_Name() {
		return (EAttribute)abstractItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_OwnedClasses() {
		return (EReference)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_OwnedInterfaces() {
		return (EReference)packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public basicFactory getbasicFactory() {
		return (basicFactory)getEFactoryInstance();
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
		classEClass = createEClass(CLASS);
		createEReference(classEClass, CLASS__OWNED_PROPERTIES);
		createEReference(classEClass, CLASS__IMPLEMENTS);
		createEReference(classEClass, CLASS__EXTEND);

		propertyEClass = createEClass(PROPERTY);
		createEReference(propertyEClass, PROPERTY__TYPE);

		interfaceEClass = createEClass(INTERFACE);

		abstractItemEClass = createEClass(ABSTRACT_ITEM);
		createEAttribute(abstractItemEClass, ABSTRACT_ITEM__ID);
		createEAttribute(abstractItemEClass, ABSTRACT_ITEM__NAME);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__OWNED_CLASSES);
		createEReference(packageEClass, PACKAGE__OWNED_INTERFACES);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		classEClass.getESuperTypes().add(this.getAbstractItem());
		propertyEClass.getESuperTypes().add(this.getAbstractItem());
		interfaceEClass.getESuperTypes().add(this.getAbstractItem());
		packageEClass.getESuperTypes().add(this.getAbstractItem());

		// Initialize classes, features, and operations; add parameters
		initEClass(classEClass, org.pdulvp.basic.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClass_OwnedProperties(), this.getProperty(), null, "ownedProperties", null, 0, -1, org.pdulvp.basic.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Implements(), this.getInterface(), null, "implements", null, 0, -1, org.pdulvp.basic.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Extend(), this.getClass_(), null, "extend", null, 0, 1, org.pdulvp.basic.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperty_Type(), this.getClass_(), null, "type", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractItemEClass, AbstractItem.class, "AbstractItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractItem_Id(), ecorePackage.getEString(), "id", null, 0, 1, AbstractItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, org.pdulvp.basic.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_OwnedClasses(), this.getClass_(), null, "ownedClasses", null, 0, -1, org.pdulvp.basic.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_OwnedInterfaces(), this.getInterface(), null, "ownedInterfaces", null, 0, -1, org.pdulvp.basic.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

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
		  (getClass_OwnedProperties(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getClass_Implements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getClass_Extend(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProperty_Type(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractItem_Id(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractItem_Name(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPackage_OwnedClasses(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPackage_OwnedInterfaces(), 
		   source, 
		   new String[] {
		   });
	}

} //basicPackageImpl
