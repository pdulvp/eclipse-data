/**
 */
package org.pdulvp.data.table;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.pdulvp.data.table.TablePackage
 * @generated
 */
public interface TableFactory extends EFactory {
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TableFactory eINSTANCE = org.pdulvp.data.table.impl.TableFactoryImpl.init();

  /**
   * Returns a new object of class '<em>DTable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DTable</em>'.
   * @generated
   */
  DTable createDTable();

  /**
   * Returns a new object of class '<em>DAttribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DAttribute</em>'.
   * @generated
   */
  DAttribute createDAttribute();

  /**
   * Returns a new object of class '<em>DKey</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DKey</em>'.
   * @generated
   */
  DKey createDKey();

  /**
   * Returns a new object of class '<em>DNamed Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DNamed Element</em>'.
   * @generated
   */
  DNamedElement createDNamedElement();

  /**
   * Returns a new object of class '<em>DTable Pkg</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DTable Pkg</em>'.
   * @generated
   */
  DTablePkg createDTablePkg();

  /**
   * Returns a new object of class '<em>DKey Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DKey Value</em>'.
   * @generated
   */
  DKeyValue createDKeyValue();

  /**
   * Returns a new object of class '<em>DReference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DReference</em>'.
   * @generated
   */
  DReference createDReference();

  /**
   * Returns a new object of class '<em>DFeature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DFeature</em>'.
   * @generated
   */
  DFeature createDFeature();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TablePackage getTablePackage();

} //TableFactory
