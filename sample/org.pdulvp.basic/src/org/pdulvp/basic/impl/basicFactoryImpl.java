/**
 */
package org.pdulvp.basic.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.pdulvp.basic.AbstractItem;
import org.pdulvp.basic.Interface;
import org.pdulvp.basic.Property;
import org.pdulvp.basic.basicFactory;
import org.pdulvp.basic.basicPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class basicFactoryImpl extends EFactoryImpl implements basicFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static basicFactory init() {
		try {
			basicFactory thebasicFactory = (basicFactory)EPackage.Registry.INSTANCE.getEFactory(basicPackage.eNS_URI);
			if (thebasicFactory != null) {
				return thebasicFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new basicFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public basicFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case basicPackage.CLASS: return createClass();
			case basicPackage.PROPERTY: return createProperty();
			case basicPackage.INTERFACE: return createInterface();
			case basicPackage.ABSTRACT_ITEM: return createAbstractItem();
			case basicPackage.PACKAGE: return createPackage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.pdulvp.basic.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractItem createAbstractItem() {
		AbstractItemImpl abstractItem = new AbstractItemImpl();
		return abstractItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.pdulvp.basic.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public basicPackage getbasicPackage() {
		return (basicPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static basicPackage getPackage() {
		return basicPackage.eINSTANCE;
	}

} //basicFactoryImpl
