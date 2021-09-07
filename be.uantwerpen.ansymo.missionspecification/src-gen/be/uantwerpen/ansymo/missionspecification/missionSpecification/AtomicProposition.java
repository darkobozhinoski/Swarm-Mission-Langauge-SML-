/**
 * generated by Xtext 2.10.0
 */
package be.uantwerpen.ansymo.missionspecification.missionSpecification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Proposition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.uantwerpen.ansymo.missionspecification.missionSpecification.AtomicProposition#getInst <em>Inst</em>}</li>
 *   <li>{@link be.uantwerpen.ansymo.missionspecification.missionSpecification.AtomicProposition#getCond <em>Cond</em>}</li>
 *   <li>{@link be.uantwerpen.ansymo.missionspecification.missionSpecification.AtomicProposition#getAssoc <em>Assoc</em>}</li>
 *   <li>{@link be.uantwerpen.ansymo.missionspecification.missionSpecification.AtomicProposition#getInst2 <em>Inst2</em>}</li>
 *   <li>{@link be.uantwerpen.ansymo.missionspecification.missionSpecification.AtomicProposition#getCond2 <em>Cond2</em>}</li>
 * </ul>
 *
 * @see be.uantwerpen.ansymo.missionspecification.missionSpecification.MissionSpecificationPackage#getAtomicProposition()
 * @model
 * @generated
 */
public interface AtomicProposition extends EObject
{
  /**
   * Returns the value of the '<em><b>Inst</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inst</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inst</em>' containment reference.
   * @see #setInst(Instance)
   * @see be.uantwerpen.ansymo.missionspecification.missionSpecification.MissionSpecificationPackage#getAtomicProposition_Inst()
   * @model containment="true"
   * @generated
   */
  Instance getInst();

  /**
   * Sets the value of the '{@link be.uantwerpen.ansymo.missionspecification.missionSpecification.AtomicProposition#getInst <em>Inst</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inst</em>' containment reference.
   * @see #getInst()
   * @generated
   */
  void setInst(Instance value);

  /**
   * Returns the value of the '<em><b>Cond</b></em>' containment reference list.
   * The list contents are of type {@link be.uantwerpen.ansymo.missionspecification.missionSpecification.BooleanExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' containment reference list.
   * @see be.uantwerpen.ansymo.missionspecification.missionSpecification.MissionSpecificationPackage#getAtomicProposition_Cond()
   * @model containment="true"
   * @generated
   */
  EList<BooleanExpression> getCond();

  /**
   * Returns the value of the '<em><b>Assoc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assoc</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assoc</em>' containment reference.
   * @see #setAssoc(Association)
   * @see be.uantwerpen.ansymo.missionspecification.missionSpecification.MissionSpecificationPackage#getAtomicProposition_Assoc()
   * @model containment="true"
   * @generated
   */
  Association getAssoc();

  /**
   * Sets the value of the '{@link be.uantwerpen.ansymo.missionspecification.missionSpecification.AtomicProposition#getAssoc <em>Assoc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assoc</em>' containment reference.
   * @see #getAssoc()
   * @generated
   */
  void setAssoc(Association value);

  /**
   * Returns the value of the '<em><b>Inst2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inst2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inst2</em>' containment reference.
   * @see #setInst2(Instance)
   * @see be.uantwerpen.ansymo.missionspecification.missionSpecification.MissionSpecificationPackage#getAtomicProposition_Inst2()
   * @model containment="true"
   * @generated
   */
  Instance getInst2();

  /**
   * Sets the value of the '{@link be.uantwerpen.ansymo.missionspecification.missionSpecification.AtomicProposition#getInst2 <em>Inst2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inst2</em>' containment reference.
   * @see #getInst2()
   * @generated
   */
  void setInst2(Instance value);

  /**
   * Returns the value of the '<em><b>Cond2</b></em>' containment reference list.
   * The list contents are of type {@link be.uantwerpen.ansymo.missionspecification.missionSpecification.BooleanExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond2</em>' containment reference list.
   * @see be.uantwerpen.ansymo.missionspecification.missionSpecification.MissionSpecificationPackage#getAtomicProposition_Cond2()
   * @model containment="true"
   * @generated
   */
  EList<BooleanExpression> getCond2();

} // AtomicProposition
