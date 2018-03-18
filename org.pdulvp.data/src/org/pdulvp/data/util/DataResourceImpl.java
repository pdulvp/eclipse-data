/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pdulvp.data.util;

import java.util.UUID;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.pdulvp.data.AbstractItem;

/**
 * <!-- begin-user-doc --> The <b>Resource </b> associated with the package. <!-- end-user-doc -->
 * @see org.pdulvp.data.util.DataResourceFactoryImpl
 * @generated
 */
public class DataResourceImpl extends XMIResourceImpl {
  /**
   * Creates an instance of the resource.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param uri the URI of the new resource.
   * @generated
   */
  public DataResourceImpl(URI uri) {
    super(uri);
  }

  @Override
  public void attached(EObject eObject) {
    super.attached(eObject);

    if (eObject instanceof AbstractItem) {
      AbstractItem i = (AbstractItem) eObject;
      if (i.getId() == null || !(i.equals(getEObject(i.getId())))) {
        i.setId(UUID.randomUUID().toString());
      }
    }
    
  }

} // DataResourceImpl
