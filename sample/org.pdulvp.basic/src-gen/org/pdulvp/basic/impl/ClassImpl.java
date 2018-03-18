/**
 */
package org.pdulvp.basic.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.pdulvp.basic.Interface;
import org.pdulvp.basic.Property;
import org.pdulvp.basic.basicPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.basic.impl.ClassImpl#getOwnedProperties <em>Owned Properties</em>}</li>
 *   <li>{@link org.pdulvp.basic.impl.ClassImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link org.pdulvp.basic.impl.ClassImpl#getExtend <em>Extend</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends AbstractItemImpl implements org.pdulvp.basic.Class {
	/**
	 * The cached value of the '{@link #getOwnedProperties() <em>Owned Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedProperties;

	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> implements_;

	/**
	 * The cached value of the '{@link #getExtend() <em>Extend</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtend()
	 * @generated
	 * @ordered
	 */
	protected org.pdulvp.basic.Class extend;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return basicPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedProperties() {
		if (ownedProperties == null) {
			ownedProperties = new EObjectResolvingEList<Property>(Property.class, this, basicPackage.CLASS__OWNED_PROPERTIES);
		}
		return ownedProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getImplements() {
		if (implements_ == null) {
			implements_ = new EObjectResolvingEList<Interface>(Interface.class, this, basicPackage.CLASS__IMPLEMENTS);
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.pdulvp.basic.Class getExtend() {
		if (extend != null && extend.eIsProxy()) {
			InternalEObject oldExtend = (InternalEObject)extend;
			extend = (org.pdulvp.basic.Class)eResolveProxy(oldExtend);
			if (extend != oldExtend) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, basicPackage.CLASS__EXTEND, oldExtend, extend));
			}
		}
		return extend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.pdulvp.basic.Class basicGetExtend() {
		return extend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtend(org.pdulvp.basic.Class newExtend) {
		org.pdulvp.basic.Class oldExtend = extend;
		extend = newExtend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, basicPackage.CLASS__EXTEND, oldExtend, extend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case basicPackage.CLASS__OWNED_PROPERTIES:
				return getOwnedProperties();
			case basicPackage.CLASS__IMPLEMENTS:
				return getImplements();
			case basicPackage.CLASS__EXTEND:
				if (resolve) return getExtend();
				return basicGetExtend();
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
			case basicPackage.CLASS__OWNED_PROPERTIES:
				getOwnedProperties().clear();
				getOwnedProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case basicPackage.CLASS__IMPLEMENTS:
				getImplements().clear();
				getImplements().addAll((Collection<? extends Interface>)newValue);
				return;
			case basicPackage.CLASS__EXTEND:
				setExtend((org.pdulvp.basic.Class)newValue);
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
			case basicPackage.CLASS__OWNED_PROPERTIES:
				getOwnedProperties().clear();
				return;
			case basicPackage.CLASS__IMPLEMENTS:
				getImplements().clear();
				return;
			case basicPackage.CLASS__EXTEND:
				setExtend((org.pdulvp.basic.Class)null);
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
			case basicPackage.CLASS__OWNED_PROPERTIES:
				return ownedProperties != null && !ownedProperties.isEmpty();
			case basicPackage.CLASS__IMPLEMENTS:
				return implements_ != null && !implements_.isEmpty();
			case basicPackage.CLASS__EXTEND:
				return extend != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassImpl
