/**
 */
package org.xtext.example.domainmodel.domainmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.domainmodel.domainmodel.DomainmodelFactory
 * @model kind="package"
 * @generated
 */
public interface DomainmodelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "domainmodel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/domainmodel/Domainmodel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "domainmodel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DomainmodelPackage eINSTANCE = org.xtext.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.domainmodel.domainmodel.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.domainmodel.domainmodel.impl.ModelImpl
   * @see org.xtext.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>My DSL</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MY_DSL = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.domainmodel.domainmodel.impl.myDSLImpl <em>my DSL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.domainmodel.domainmodel.impl.myDSLImpl
   * @see org.xtext.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getmyDSL()
   * @generated
   */
  int MY_DSL = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_DSL__NAME = 0;

  /**
   * The number of structural features of the '<em>my DSL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_DSL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.domainmodel.domainmodel.impl.DefineImpl <em>Define</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.domainmodel.domainmodel.impl.DefineImpl
   * @see org.xtext.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getDefine()
   * @generated
   */
  int DEFINE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE__NAME = MY_DSL__NAME;

  /**
   * The number of structural features of the '<em>Define</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE_FEATURE_COUNT = MY_DSL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.domainmodel.domainmodel.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.domainmodel.domainmodel.impl.FunctionImpl
   * @see org.xtext.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = MY_DSL__NAME;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = MY_DSL_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.xtext.example.domainmodel.domainmodel.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.domainmodel.domainmodel.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.domainmodel.domainmodel.Model#getMyDSL <em>My DSL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>My DSL</em>'.
   * @see org.xtext.example.domainmodel.domainmodel.Model#getMyDSL()
   * @see #getModel()
   * @generated
   */
  EReference getModel_MyDSL();

  /**
   * Returns the meta object for class '{@link org.xtext.example.domainmodel.domainmodel.myDSL <em>my DSL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>my DSL</em>'.
   * @see org.xtext.example.domainmodel.domainmodel.myDSL
   * @generated
   */
  EClass getmyDSL();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.domainmodel.domainmodel.myDSL#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.domainmodel.domainmodel.myDSL#getName()
   * @see #getmyDSL()
   * @generated
   */
  EAttribute getmyDSL_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.domainmodel.domainmodel.Define <em>Define</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Define</em>'.
   * @see org.xtext.example.domainmodel.domainmodel.Define
   * @generated
   */
  EClass getDefine();

  /**
   * Returns the meta object for class '{@link org.xtext.example.domainmodel.domainmodel.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see org.xtext.example.domainmodel.domainmodel.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DomainmodelFactory getDomainmodelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.domainmodel.domainmodel.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.domainmodel.domainmodel.impl.ModelImpl
     * @see org.xtext.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>My DSL</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MY_DSL = eINSTANCE.getModel_MyDSL();

    /**
     * The meta object literal for the '{@link org.xtext.example.domainmodel.domainmodel.impl.myDSLImpl <em>my DSL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.domainmodel.domainmodel.impl.myDSLImpl
     * @see org.xtext.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getmyDSL()
     * @generated
     */
    EClass MY_DSL = eINSTANCE.getmyDSL();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MY_DSL__NAME = eINSTANCE.getmyDSL_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.domainmodel.domainmodel.impl.DefineImpl <em>Define</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.domainmodel.domainmodel.impl.DefineImpl
     * @see org.xtext.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getDefine()
     * @generated
     */
    EClass DEFINE = eINSTANCE.getDefine();

    /**
     * The meta object literal for the '{@link org.xtext.example.domainmodel.domainmodel.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.domainmodel.domainmodel.impl.FunctionImpl
     * @see org.xtext.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

  }

} //DomainmodelPackage
