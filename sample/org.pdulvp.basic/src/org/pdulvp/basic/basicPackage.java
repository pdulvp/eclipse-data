/**
 */
package org.pdulvp.basic;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.pdulvp.basic.basicFactory
 * @model kind="package"
 * @generated
 */
public interface basicPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "basic";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.pdulvp/basic";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "basic";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	basicPackage eINSTANCE = org.pdulvp.basic.impl.basicPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.pdulvp.basic.impl.AbstractItemImpl <em>Abstract Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pdulvp.basic.impl.AbstractItemImpl
	 * @see org.pdulvp.basic.impl.basicPackageImpl#getAbstractItem()
	 * @generated
	 */
	int ABSTRACT_ITEM = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ITEM__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ITEM__NAME = 1;

	/**
	 * The number of structural features of the '<em>Abstract Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ITEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Abstract Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.pdulvp.basic.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pdulvp.basic.impl.ClassImpl
	 * @see org.pdulvp.basic.impl.basicPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ID = ABSTRACT_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = ABSTRACT_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Owned Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_PROPERTIES = ABSTRACT_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IMPLEMENTS = ABSTRACT_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extend</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__EXTEND = ABSTRACT_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = ABSTRACT_ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = ABSTRACT_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pdulvp.basic.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pdulvp.basic.impl.PropertyImpl
	 * @see org.pdulvp.basic.impl.basicPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ID = ABSTRACT_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = ABSTRACT_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = ABSTRACT_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = ABSTRACT_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = ABSTRACT_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pdulvp.basic.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pdulvp.basic.impl.InterfaceImpl
	 * @see org.pdulvp.basic.impl.basicPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ID = ABSTRACT_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = ABSTRACT_ITEM__NAME;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = ABSTRACT_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = ABSTRACT_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pdulvp.basic.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pdulvp.basic.impl.PackageImpl
	 * @see org.pdulvp.basic.impl.basicPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ID = ABSTRACT_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = ABSTRACT_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Owned Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_CLASSES = ABSTRACT_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_INTERFACES = ABSTRACT_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = ABSTRACT_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = ABSTRACT_ITEM_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.pdulvp.basic.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see org.pdulvp.basic.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the reference list '{@link org.pdulvp.basic.Class#getOwnedProperties <em>Owned Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Properties</em>'.
	 * @see org.pdulvp.basic.Class#getOwnedProperties()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_OwnedProperties();

	/**
	 * Returns the meta object for the reference list '{@link org.pdulvp.basic.Class#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implements</em>'.
	 * @see org.pdulvp.basic.Class#getImplements()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Implements();

	/**
	 * Returns the meta object for the reference '{@link org.pdulvp.basic.Class#getExtend <em>Extend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extend</em>'.
	 * @see org.pdulvp.basic.Class#getExtend()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Extend();

	/**
	 * Returns the meta object for class '{@link org.pdulvp.basic.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.pdulvp.basic.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the reference '{@link org.pdulvp.basic.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.pdulvp.basic.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Type();

	/**
	 * Returns the meta object for class '{@link org.pdulvp.basic.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see org.pdulvp.basic.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for class '{@link org.pdulvp.basic.AbstractItem <em>Abstract Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Item</em>'.
	 * @see org.pdulvp.basic.AbstractItem
	 * @generated
	 */
	EClass getAbstractItem();

	/**
	 * Returns the meta object for the attribute '{@link org.pdulvp.basic.AbstractItem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.pdulvp.basic.AbstractItem#getId()
	 * @see #getAbstractItem()
	 * @generated
	 */
	EAttribute getAbstractItem_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.pdulvp.basic.AbstractItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.pdulvp.basic.AbstractItem#getName()
	 * @see #getAbstractItem()
	 * @generated
	 */
	EAttribute getAbstractItem_Name();

	/**
	 * Returns the meta object for class '{@link org.pdulvp.basic.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see org.pdulvp.basic.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the reference list '{@link org.pdulvp.basic.Package#getOwnedClasses <em>Owned Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Classes</em>'.
	 * @see org.pdulvp.basic.Package#getOwnedClasses()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_OwnedClasses();

	/**
	 * Returns the meta object for the reference list '{@link org.pdulvp.basic.Package#getOwnedInterfaces <em>Owned Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Interfaces</em>'.
	 * @see org.pdulvp.basic.Package#getOwnedInterfaces()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_OwnedInterfaces();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	basicFactory getbasicFactory();

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
		 * The meta object literal for the '{@link org.pdulvp.basic.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pdulvp.basic.impl.ClassImpl
		 * @see org.pdulvp.basic.impl.basicPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Owned Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__OWNED_PROPERTIES = eINSTANCE.getClass_OwnedProperties();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__IMPLEMENTS = eINSTANCE.getClass_Implements();

		/**
		 * The meta object literal for the '<em><b>Extend</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__EXTEND = eINSTANCE.getClass_Extend();

		/**
		 * The meta object literal for the '{@link org.pdulvp.basic.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pdulvp.basic.impl.PropertyImpl
		 * @see org.pdulvp.basic.impl.basicPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '{@link org.pdulvp.basic.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pdulvp.basic.impl.InterfaceImpl
		 * @see org.pdulvp.basic.impl.basicPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '{@link org.pdulvp.basic.impl.AbstractItemImpl <em>Abstract Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pdulvp.basic.impl.AbstractItemImpl
		 * @see org.pdulvp.basic.impl.basicPackageImpl#getAbstractItem()
		 * @generated
		 */
		EClass ABSTRACT_ITEM = eINSTANCE.getAbstractItem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ITEM__ID = eINSTANCE.getAbstractItem_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ITEM__NAME = eINSTANCE.getAbstractItem_Name();

		/**
		 * The meta object literal for the '{@link org.pdulvp.basic.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pdulvp.basic.impl.PackageImpl
		 * @see org.pdulvp.basic.impl.basicPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Owned Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__OWNED_CLASSES = eINSTANCE.getPackage_OwnedClasses();

		/**
		 * The meta object literal for the '<em><b>Owned Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__OWNED_INTERFACES = eINSTANCE.getPackage_OwnedInterfaces();

	}

} //basicPackage
