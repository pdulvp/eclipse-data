/**
 */
package org.pdulvp.data.table.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;
import org.pdulvp.data.AbstractItem;
import org.pdulvp.data.Timestamp;
import org.pdulvp.data.table.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.pdulvp.data.table.TablePackage
 * @generated
 */
public class TableSwitch<T> extends Switch<T> {
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TablePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableSwitch() {
    if (modelPackage == null) {
      modelPackage = TablePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage) {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID) {
      case TablePackage.DTABLE: {
        DTable dTable = (DTable)theEObject;
        T result = caseDTable(dTable);
        if (result == null) result = caseDNamedElement(dTable);
        if (result == null) result = caseAbstractItem(dTable);
        if (result == null) result = caseTimestamp(dTable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TablePackage.DFEATURE: {
        DFeature dFeature = (DFeature)theEObject;
        T result = caseDFeature(dFeature);
        if (result == null) result = caseDNamedElement(dFeature);
        if (result == null) result = caseAbstractItem(dFeature);
        if (result == null) result = caseTimestamp(dFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TablePackage.DATTRIBUTE: {
        DAttribute dAttribute = (DAttribute)theEObject;
        T result = caseDAttribute(dAttribute);
        if (result == null) result = caseDFeature(dAttribute);
        if (result == null) result = caseDNamedElement(dAttribute);
        if (result == null) result = caseAbstractItem(dAttribute);
        if (result == null) result = caseTimestamp(dAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TablePackage.DREFERENCE: {
        DReference dReference = (DReference)theEObject;
        T result = caseDReference(dReference);
        if (result == null) result = caseDFeature(dReference);
        if (result == null) result = caseDNamedElement(dReference);
        if (result == null) result = caseAbstractItem(dReference);
        if (result == null) result = caseTimestamp(dReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TablePackage.DKEY: {
        DKey dKey = (DKey)theEObject;
        T result = caseDKey(dKey);
        if (result == null) result = caseDNamedElement(dKey);
        if (result == null) result = caseAbstractItem(dKey);
        if (result == null) result = caseTimestamp(dKey);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TablePackage.DNAMED_ELEMENT: {
        DNamedElement dNamedElement = (DNamedElement)theEObject;
        T result = caseDNamedElement(dNamedElement);
        if (result == null) result = caseAbstractItem(dNamedElement);
        if (result == null) result = caseTimestamp(dNamedElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TablePackage.DTABLE_PKG: {
        DTablePkg dTablePkg = (DTablePkg)theEObject;
        T result = caseDTablePkg(dTablePkg);
        if (result == null) result = caseDNamedElement(dTablePkg);
        if (result == null) result = caseAbstractItem(dTablePkg);
        if (result == null) result = caseTimestamp(dTablePkg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TablePackage.DKEY_VALUE: {
        DKeyValue dKeyValue = (DKeyValue)theEObject;
        T result = caseDKeyValue(dKeyValue);
        if (result == null) result = caseDNamedElement(dKeyValue);
        if (result == null) result = caseAbstractItem(dKeyValue);
        if (result == null) result = caseTimestamp(dKeyValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DTable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DTable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDTable(DTable object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DAttribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DAttribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDAttribute(DAttribute object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DKey</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DKey</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDKey(DKey object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DNamed Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DNamed Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDNamedElement(DNamedElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DTable Pkg</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DTable Pkg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDTablePkg(DTablePkg object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DKey Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DKey Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDKeyValue(DKeyValue object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DReference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DReference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDReference(DReference object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DFeature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DFeature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDFeature(DFeature object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Timestamp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Timestamp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimestamp(Timestamp object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractItem(AbstractItem object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object) {
    return null;
  }

} //TableSwitch
