/**
 */
package org.pdulvp.data.table.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;
import org.pdulvp.data.AbstractItem;
import org.pdulvp.data.Timestamp;
import org.pdulvp.data.table.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.pdulvp.data.table.TablePackage
 * @generated
 */
public class TableAdapterFactory extends AdapterFactoryImpl {
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TablePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = TablePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object) {
    if (object == modelPackage) {
      return true;
    }
    if (object instanceof EObject) {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TableSwitch<Adapter> modelSwitch =
    new TableSwitch<Adapter>() {
      @Override
      public Adapter caseDTable(DTable object) {
        return createDTableAdapter();
      }
      @Override
      public Adapter caseDFeature(DFeature object) {
        return createDFeatureAdapter();
      }
      @Override
      public Adapter caseDAttribute(DAttribute object) {
        return createDAttributeAdapter();
      }
      @Override
      public Adapter caseDReference(DReference object) {
        return createDReferenceAdapter();
      }
      @Override
      public Adapter caseDKey(DKey object) {
        return createDKeyAdapter();
      }
      @Override
      public Adapter caseDNamedElement(DNamedElement object) {
        return createDNamedElementAdapter();
      }
      @Override
      public Adapter caseDTablePkg(DTablePkg object) {
        return createDTablePkgAdapter();
      }
      @Override
      public Adapter caseDKeyValue(DKeyValue object) {
        return createDKeyValueAdapter();
      }
      @Override
      public Adapter caseTimestamp(Timestamp object) {
        return createTimestampAdapter();
      }
      @Override
      public Adapter caseAbstractItem(AbstractItem object) {
        return createAbstractItemAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object) {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.table.DTable <em>DTable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.table.DTable
   * @generated
   */
  public Adapter createDTableAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.table.DAttribute <em>DAttribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.table.DAttribute
   * @generated
   */
  public Adapter createDAttributeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.table.DKey <em>DKey</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.table.DKey
   * @generated
   */
  public Adapter createDKeyAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.table.DNamedElement <em>DNamed Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.table.DNamedElement
   * @generated
   */
  public Adapter createDNamedElementAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.table.DTablePkg <em>DTable Pkg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.table.DTablePkg
   * @generated
   */
  public Adapter createDTablePkgAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.table.DKeyValue <em>DKey Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.table.DKeyValue
   * @generated
   */
  public Adapter createDKeyValueAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.table.DReference <em>DReference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.table.DReference
   * @generated
   */
  public Adapter createDReferenceAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.table.DFeature <em>DFeature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.table.DFeature
   * @generated
   */
  public Adapter createDFeatureAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.Timestamp <em>Timestamp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.Timestamp
   * @generated
   */
  public Adapter createTimestampAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.AbstractItem <em>Abstract Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.AbstractItem
   * @generated
   */
  public Adapter createAbstractItemAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter() {
    return null;
  }

} //TableAdapterFactory
