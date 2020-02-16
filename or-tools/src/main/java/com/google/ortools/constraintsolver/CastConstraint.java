/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

/**
 *  Cast constraints are special channeling constraints designed to keep a variable in sync with an expression.  They are created internally when Var() is called on a subclass of IntExpr.
 */
public class CastConstraint extends Constraint {
  private transient long swigCPtr;

  protected CastConstraint(long cPtr, boolean cMemoryOwn) {
    super(mainJNI.CastConstraint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CastConstraint obj) {
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
        mainJNI.delete_CastConstraint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public IntVar target_var() {
    long cPtr = mainJNI.CastConstraint_target_var(swigCPtr, this);
    return (cPtr == 0) ? null : new IntVar(cPtr, false);
  }

}
