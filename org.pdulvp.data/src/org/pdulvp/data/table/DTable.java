/**
 */
package org.pdulvp.data.table;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DTable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.table.DTable#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link org.pdulvp.data.table.DTable#getIndexKeys <em>Index Keys</em>}</li>
 *   <li>{@link org.pdulvp.data.table.DTable#getOrderingKeys <em>Ordering Keys</em>}</li>
 *   <li>{@link org.pdulvp.data.table.DTable#getFilteringKeys <em>Filtering Keys</em>}</li>
 *   <li>{@link org.pdulvp.data.table.DTable#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.pdulvp.data.table.DTable#getOwnedAttributes <em>Owned Attributes</em>}</li>
 *   <li>{@link org.pdulvp.data.table.DTable#getOwnedReferences <em>Owned References</em>}</li>
 *   <li>{@link org.pdulvp.data.table.DTable#getPagination <em>Pagination</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.table.TablePackage#getDTable()
 * @model
 * @generated
 */
public interface DTable extends DNamedElement {
  /**
   * Returns the value of the '<em><b>Primary Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primary Key</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primary Key</em>' containment reference.
   * @see #setPrimaryKey(DKey)
   * @see org.pdulvp.data.table.TablePackage#getDTable_PrimaryKey()
   * @model containment="true"
   * @generated
   */
  DKey getPrimaryKey();

  /**
   * Sets the value of the '{@link org.pdulvp.data.table.DTable#getPrimaryKey <em>Primary Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primary Key</em>' containment reference.
   * @see #getPrimaryKey()
   * @generated
   */
  void setPrimaryKey(DKey value);

  /**
   * Returns the value of the '<em><b>Index Keys</b></em>' containment reference list.
   * The list contents are of type {@link org.pdulvp.data.table.DKey}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index Keys</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index Keys</em>' containment reference list.
   * @see org.pdulvp.data.table.TablePackage#getDTable_IndexKeys()
   * @model containment="true"
   * @generated
   */
  EList<DKey> getIndexKeys();

  /**
   * Returns the value of the '<em><b>Owned Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.pdulvp.data.table.DAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Attributes</em>' containment reference list.
   * @see org.pdulvp.data.table.TablePackage#getDTable_OwnedAttributes()
   * @model containment="true"
   * @generated
   */
  EList<DAttribute> getOwnedAttributes();

  /**
   * Returns the value of the '<em><b>Owned References</b></em>' containment reference list.
   * The list contents are of type {@link org.pdulvp.data.table.DReference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned References</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned References</em>' containment reference list.
   * @see org.pdulvp.data.table.TablePackage#getDTable_OwnedReferences()
   * @model containment="true"
   * @generated
   */
  EList<DReference> getOwnedReferences();

  /**
   * Returns the value of the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Name</em>' attribute.
   * @see #setClassName(String)
   * @see org.pdulvp.data.table.TablePackage#getDTable_ClassName()
   * @model
   * @generated
   */
  String getClassName();

  /**
   * Sets the value of the '{@link org.pdulvp.data.table.DTable#getClassName <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Name</em>' attribute.
   * @see #getClassName()
   * @generated
   */
	void setClassName(String value);

		/**
   * Returns the value of the '<em><b>Ordering Keys</b></em>' containment reference list.
   * The list contents are of type {@link org.pdulvp.data.table.DKeyValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ordering Keys</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ordering Keys</em>' containment reference list.
   * @see org.pdulvp.data.table.TablePackage#getDTable_OrderingKeys()
   * @model containment="true"
   * @generated
   */
  EList<DKeyValue> getOrderingKeys();

  /**
   * Returns the value of the '<em><b>Filtering Keys</b></em>' containment reference list.
   * The list contents are of type {@link org.pdulvp.data.table.DKeyValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filtering Keys</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filtering Keys</em>' containment reference list.
   * @see org.pdulvp.data.table.TablePackage#getDTable_FilteringKeys()
   * @model containment="true"
   * @generated
   */
  EList<DKeyValue> getFilteringKeys();

  /**
   * Returns the value of the '<em><b>Pagination</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pagination</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pagination</em>' attribute.
   * @see #setPagination(int)
   * @see org.pdulvp.data.table.TablePackage#getDTable_Pagination()
   * @model
   * @generated
   */
  int getPagination();

  /**
   * Sets the value of the '{@link org.pdulvp.data.table.DTable#getPagination <em>Pagination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pagination</em>' attribute.
   * @see #getPagination()
   * @generated
   */
  void setPagination(int value);

} // DTable
