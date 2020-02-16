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
 *  A class to express a linear objective.
 */
public class MPObjective {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MPObjective(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MPObjective obj) {
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
        main_research_linear_solverJNI.delete_MPObjective(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Clears the offset, all variables and coefficients, and the optimization<br>
   * direction.
   */
  public void clear() {
    main_research_linear_solverJNI.MPObjective_clear(swigCPtr, this);
  }

  /**
   * Sets the coefficient of the variable in the objective.<br>
   * <br>
   * If the variable does not belong to the solver, the function just returns,<br>
   * or crashes in non-opt mode.
   */
  public void setCoefficient(MPVariable var, double coeff) {
    main_research_linear_solverJNI.MPObjective_setCoefficient(swigCPtr, this, MPVariable.getCPtr(var), var, coeff);
  }

  /**
   *  Gets the coefficient of a given variable in the objective<br>
   * <br>
   * It returns 0 if the variable does not appear in the objective).
   */
  public double getCoefficient(MPVariable var) {
    return main_research_linear_solverJNI.MPObjective_getCoefficient(swigCPtr, this, MPVariable.getCPtr(var), var);
  }

  /**
   *  Sets the constant term in the objective.
   */
  public void setOffset(double value) {
    main_research_linear_solverJNI.MPObjective_setOffset(swigCPtr, this, value);
  }

  /**
   *  Gets the constant term in the objective.
   */
  public double offset() {
    return main_research_linear_solverJNI.MPObjective_offset(swigCPtr, this);
  }

  /**
   *  Sets the optimization direction (maximize: true or minimize: false).
   */
  public void setOptimizationDirection(boolean maximize) {
    main_research_linear_solverJNI.MPObjective_setOptimizationDirection(swigCPtr, this, maximize);
  }

  /**
   *  Sets the optimization direction to minimize.
   */
  public void setMinimization() {
    main_research_linear_solverJNI.MPObjective_setMinimization(swigCPtr, this);
  }

  /**
   *  Sets the optimization direction to maximize.
   */
  public void setMaximization() {
    main_research_linear_solverJNI.MPObjective_setMaximization(swigCPtr, this);
  }

  /**
   *  Is the optimization direction set to maximize?
   */
  public boolean maximization() {
    return main_research_linear_solverJNI.MPObjective_maximization(swigCPtr, this);
  }

  /**
   *  Is the optimization direction set to minimize?
   */
  public boolean minimization() {
    return main_research_linear_solverJNI.MPObjective_minimization(swigCPtr, this);
  }

  /**
   * Returns the objective value of the best solution found so far.<br>
   * <br>
   * It is the optimal objective value if the problem has been solved to<br>
   * optimality.<br>
   * <br>
   * Note: the objective value may be slightly different than what you could<br>
   * compute yourself using <code>MPVariable::solution_value();</code> please use the<br>
   * --verify_solution flag to gain confidence about the numerical stability of<br>
   * your solution.
   */
  public double value() {
    return main_research_linear_solverJNI.MPObjective_value(swigCPtr, this);
  }

  /**
   * Returns the best objective bound.<br>
   * <br>
   * In case of minimization, it is a lower bound on the objective value of the<br>
   * optimal integer solution. Only available for discrete problems.
   */
  public double bestBound() {
    return main_research_linear_solverJNI.MPObjective_bestBound(swigCPtr, this);
  }

}