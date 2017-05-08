/**
 */
package org.xtext.example.domainmodel.domainmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.domainmodel.domainmodel.Model#getMyDSL <em>My DSL</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.domainmodel.domainmodel.DomainmodelPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>My DSL</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.domainmodel.domainmodel.myDSL}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>My DSL</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>My DSL</em>' containment reference list.
   * @see org.xtext.example.domainmodel.domainmodel.DomainmodelPackage#getModel_MyDSL()
   * @model containment="true"
   * @generated
   */
  EList<myDSL> getMyDSL();

} // Model
