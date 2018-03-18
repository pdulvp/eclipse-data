/**
 */
package org.pdulvp.data;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.JobPkg#getOwnedJobs <em>Owned Jobs</em>}</li>
 *   <li>{@link org.pdulvp.data.JobPkg#getOwnedJobPkgs <em>Owned Job Pkgs</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getJobPkg()
 * @model
 * @generated
 */
public interface JobPkg extends AbstractItem, NamedItem {
  /**
   * Returns the value of the '<em><b>Owned Jobs</b></em>' containment reference list.
   * The list contents are of type {@link org.pdulvp.data.Job}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Jobs</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Jobs</em>' containment reference list.
   * @see org.pdulvp.data.DataPackage#getJobPkg_OwnedJobs()
   * @model containment="true"
   * @generated
   */
  EList<Job> getOwnedJobs();

  /**
   * Returns the value of the '<em><b>Owned Job Pkgs</b></em>' containment reference list.
   * The list contents are of type {@link org.pdulvp.data.JobPkg}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Job Pkgs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Job Pkgs</em>' containment reference list.
   * @see org.pdulvp.data.DataPackage#getJobPkg_OwnedJobPkgs()
   * @model containment="true"
   * @generated
   */
  EList<JobPkg> getOwnedJobPkgs();

} // JobPkg
