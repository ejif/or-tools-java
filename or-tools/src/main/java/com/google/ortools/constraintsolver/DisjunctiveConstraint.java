/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

// Used to wrap IndexEvaluator2
// see https://docs.oracle.com/javase/8/docs/api/java/util/function/LongBinaryOperator.html
import java.util.function.LongBinaryOperator;

public class DisjunctiveConstraint extends Constraint {
  private transient long swigCPtr;

  protected DisjunctiveConstraint(long cPtr, boolean cMemoryOwn) {
    super(mainJNI.DisjunctiveConstraint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DisjunctiveConstraint obj) {
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
        mainJNI.delete_DisjunctiveConstraint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Creates a sequence variable from the constraint.
   */
  public SequenceVar makeSequenceVar() {
    long cPtr = mainJNI.DisjunctiveConstraint_makeSequenceVar(swigCPtr, this);
    return (cPtr == 0) ? null : new SequenceVar(cPtr, false);
  }

  /**
   *  Add a transition time between intervals.  It forces the distance between the end of interval a and start of interval b that follows it to be at least transition_time(a, b). This function must always return a positive or null value.
   */
  public void setTransitionTime(LongBinaryOperator transition_time) {
    mainJNI.DisjunctiveConstraint_setTransitionTime(swigCPtr, this, transition_time);
  }

  public long transitionTime(int before_index, int after_index) {
    return mainJNI.DisjunctiveConstraint_transitionTime(swigCPtr, this, before_index, after_index);
  }

}
