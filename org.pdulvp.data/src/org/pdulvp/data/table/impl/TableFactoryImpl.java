/**
 */
package org.pdulvp.data.table.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.pdulvp.data.table.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TableFactoryImpl extends EFactoryImpl implements TableFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TableFactory init() {
    try {
      TableFactory theTableFactory = (TableFactory)EPackage.Registry.INSTANCE.getEFactory(TablePackage.eNS_URI);
      if (theTableFactory != null) {
        return theTableFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TableFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableFactoryImpl() {
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
      case TablePackage.DTABLE: return createDTable();
      case TablePackage.DFEATURE: return createDFeature();
      case TablePackage.DATTRIBUTE: return createDAttribute();
      case TablePackage.DREFERENCE: return createDReference();
      case TablePackage.DKEY: return createDKey();
      case TablePackage.DNAMED_ELEMENT: return createDNamedElement();
      case TablePackage.DTABLE_PKG: return createDTablePkg();
      case TablePackage.DKEY_VALUE: return createDKeyValue();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DTable createDTable() {
    DTableImpl dTable = new DTableImpl();
    return dTable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DAttribute createDAttribute() {
    DAttributeImpl dAttribute = new DAttributeImpl();
    return dAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DKey createDKey() {
    DKeyImpl dKey = new DKeyImpl();
    return dKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DNamedElement createDNamedElement() {
    DNamedElementImpl dNamedElement = new DNamedElementImpl();
    return dNamedElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DTablePkg createDTablePkg() {
    DTablePkgImpl dTablePkg = new DTablePkgImpl();
    return dTablePkg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DKeyValue createDKeyValue() {
    DKeyValueImpl dKeyValue = new DKeyValueImpl();
    return dKeyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DReference createDReference() {
    DReferenceImpl dReference = new DReferenceImpl();
    return dReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DFeature createDFeature() {
    DFeatureImpl dFeature = new DFeatureImpl();
    return dFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TablePackage getTablePackage() {
    return (TablePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TablePackage getPackage() {
    return TablePackage.eINSTANCE;
  }

} //TableFactoryImpl
