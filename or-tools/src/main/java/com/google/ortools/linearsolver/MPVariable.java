/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.linearsolver;

import java.lang.reflect.*;

/**
 *  The class for variables of a Mathematical Programming (MP) model.
 */
public class MPVariable {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MPVariable(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MPVariable obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        main_research_linear_solverJNI.delete_MPVariable(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Returns the name of the variable.
   */
  public String name() {
    return main_research_linear_solverJNI.MPVariable_name(swigCPtr, this);
  }

  /**
   *  Sets the integrality requirement of the variable.
   */
  public void setInteger(boolean integer) {
    main_research_linear_solverJNI.MPVariable_setInteger(swigCPtr, this, integer);
  }

  /**
   * Returns the value of the variable in the current solution.<br>
   * <br>
   * If the variable is integer, then the value will always be an integer (the<br>
   * underlying solver handles floating-point values only, but this function<br>
   * automatically rounds it to the nearest integer; see: man 3 round).
   */
  public double solutionValue() {
    return main_research_linear_solverJNI.MPVariable_solutionValue(swigCPtr, this);
  }

  /**
   *  Returns the index of the variable in the MPSolver::variables_.
   */
  public int index() {
    return main_research_linear_solverJNI.MPVariable_index(swigCPtr, this);
  }

  /**
   *  Returns the lower bound.
   */
  public double lb() {
    return main_research_linear_solverJNI.MPVariable_lb(swigCPtr, this);
  }

  /**
   *  Returns the upper bound.
   */
  public double ub() {
    return main_research_linear_solverJNI.MPVariable_ub(swigCPtr, this);
  }

  /**
   *  Sets the lower bound.
   */
  public void setLb(double lb) {
    main_research_linear_solverJNI.MPVariable_setLb(swigCPtr, this, lb);
  }

  /**
   *  Sets the upper bound.
   */
  public void setUb(double ub) {
    main_research_linear_solverJNI.MPVariable_setUb(swigCPtr, this, ub);
  }

  /**
   *  Sets both the lower and upper bounds.
   */
  public void setBounds(double lb, double ub) {
    main_research_linear_solverJNI.MPVariable_setBounds(swigCPtr, this, lb, ub);
  }

  /**
   * Advanced usage: returns the reduced cost of the variable in the current<br>
   * solution (only available for continuous problems).
   */
  public double reducedCost() {
    return main_research_linear_solverJNI.MPVariable_reducedCost(swigCPtr, this);
  }

  /**
   * Advanced usage: returns the basis status of the variable in the current<br>
   * solution (only available for continuous problems).<br>
   * <br>
   * @see MPSolver#BasisStatus.
   */
  public MPSolver.BasisStatus basisStatus() {
    return MPSolver.BasisStatus.swigToEnum(main_research_linear_solverJNI.MPVariable_basisStatus(swigCPtr, this));
  }

}