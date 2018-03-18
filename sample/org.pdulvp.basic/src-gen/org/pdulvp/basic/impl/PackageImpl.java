/**
 */
package org.pdulvp.basic.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.pdulvp.basic.Interface;
import org.pdulvp.basic.basicPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.basic.impl.PackageImpl#getOwnedClasses <em>Owned Classes</em>}</li>
 *   <li>{@link org.pdulvp.basic.impl.PackageImpl#getOwnedInterfaces <em>Owned Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends AbstractItemImpl implements org.pdulvp.basic.Package {
	/**
	 * The cached value of the '{@link #getOwnedClasses() <em>Owned Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<org.pdulvp.basic.Class> ownedClasses;

	/**
	 * The cached value of the '{@link #getOwnedInterfaces() <em>Owned Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> ownedInterfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return basicPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.pdulvp.basic.Class> getOwnedClasses() {
		if (ownedClasses == null) {
			ownedClasses = new EObjectResolvingEList<org.pdulvp.basic.Class>(org.pdulvp.basic.Class.class, this, basicPackage.PACKAGE__OWNED_CLASSES);
		}
		return ownedClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getOwnedInterfaces() {
		if (ownedInterfaces == null) {
			ownedInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, basicPackage.PACKAGE__OWNED_INTERFACES);
		}
		return ownedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case basicPackage.PACKAGE__OWNED_CLASSES:
				return getOwnedClasses();
			case basicPackage.PACKAGE__OWNED_INTERFACES:
				return getOwnedInterfaces();
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
			case basicPackage.PACKAGE__OWNED_CLASSES:
				getOwnedClasses().clear();
				getOwnedClasses().addAll((Collection<? extends org.pdulvp.basic.Class>)newValue);
				return;
			case basicPackage.PACKAGE__OWNED_INTERFACES:
				getOwnedInterfaces().clear();
				getOwnedInterfaces().addAll((Collection<? extends Interface>)newValue);
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
			case basicPackage.PACKAGE__OWNED_CLASSES:
				getOwnedClasses().clear();
				return;
			case basicPackage.PACKAGE__OWNED_INTERFACES:
				getOwnedInterfaces().clear();
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
			case basicPackage.PACKAGE__OWNED_CLASSES:
				return ownedClasses != null && !ownedClasses.isEmpty();
			case basicPackage.PACKAGE__OWNED_INTERFACES:
				return ownedInterfaces != null && !ownedInterfaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PackageImpl
