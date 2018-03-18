/**
 */
package org.pdulvp.data;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.Request#getOwnedTriggers <em>Owned Triggers</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getRequest()
 * @model
 * @generated
 */
public interface Request extends AbstractItem, NamedItem {

  /**
   * Returns the value of the '<em><b>Owned Triggers</b></em>' containment reference list.
   * The list contents are of type {@link org.pdulvp.data.Trigger}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Triggers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Triggers</em>' containment reference list.
   * @see org.pdulvp.data.DataPackage#getRequest_OwnedTriggers()
   * @model containment="true"
   * @generated
   */
  EList<Trigger> getOwnedTriggers();
} // Request
