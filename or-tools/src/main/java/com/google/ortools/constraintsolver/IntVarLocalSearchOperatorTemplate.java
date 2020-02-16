/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

/**
 *  Base operator class for operators manipulating variables.
 */
public class IntVarLocalSearchOperatorTemplate extends LocalSearchOperator {
  private transient long swigCPtr;

  protected IntVarLocalSearchOperatorTemplate(long cPtr, boolean cMemoryOwn) {
    super(mainJNI.IntVarLocalSearchOperatorTemplate_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IntVarLocalSearchOperatorTemplate obj) {
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
        mainJNI.delete_IntVarLocalSearchOperatorTemplate(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public boolean HoldsDelta() {
    return mainJNI.IntVarLocalSearchOperatorTemplate_HoldsDelta(swigCPtr, this);
  }

  public boolean isIncremental() {
    return mainJNI.IntVarLocalSearchOperatorTemplate_isIncremental(swigCPtr, this);
  }

  public int size() {
    return mainJNI.IntVarLocalSearchOperatorTemplate_size(swigCPtr, this);
  }

  /**
   *  Returns the value in the current assignment of the variable of given index.
   */
  public long value(long index) {
    return mainJNI.IntVarLocalSearchOperatorTemplate_value(swigCPtr, this, index);
  }

  /**
   *  Returns the variable of given index.
   */
  public IntVar var(long index) {
    long cPtr = mainJNI.IntVarLocalSearchOperatorTemplate_var(swigCPtr, this, index);
    return (cPtr == 0) ? null : new IntVar(cPtr, false);
  }

  public long oldValue(long index) {
    return mainJNI.IntVarLocalSearchOperatorTemplate_oldValue(swigCPtr, this, index);
  }

  public void setValue(long index, long value) {
    mainJNI.IntVarLocalSearchOperatorTemplate_setValue(swigCPtr, this, index, value);
  }

  public boolean activated(long index) {
    return mainJNI.IntVarLocalSearchOperatorTemplate_activated(swigCPtr, this, index);
  }

  public void activate(long index) {
    mainJNI.IntVarLocalSearchOperatorTemplate_activate(swigCPtr, this, index);
  }

  public void deactivate(long index) {
    mainJNI.IntVarLocalSearchOperatorTemplate_deactivate(swigCPtr, this, index);
  }

  public void addVars(IntVar[] vars) {
    mainJNI.IntVarLocalSearchOperatorTemplate_addVars(swigCPtr, this, vars);
  }

  /**
   *  Called by Start() after synchronizing the operator with the current assignment. Should be overridden instead of Start() to avoid calling VarLocalSearchOperator::Start explicitly.
   */
  public void onStart() {
    mainJNI.IntVarLocalSearchOperatorTemplate_onStart(swigCPtr, this);
  }

}