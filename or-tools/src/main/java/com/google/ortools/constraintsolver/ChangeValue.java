/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

/**
 *  Defines operators which change the value of variables; each neighbor corresponds to *one* modified variable. Sub-classes have to define ModifyValue which determines what the new variable value is going to be (given the current value and the variable).
 */
public class ChangeValue extends IntVarLocalSearchOperator {
  private transient long swigCPtr;

  protected ChangeValue(long cPtr, boolean cMemoryOwn) {
    super(mainJNI.ChangeValue_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ChangeValue obj) {
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
        mainJNI.delete_ChangeValue(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    mainJNI.ChangeValue_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    mainJNI.ChangeValue_change_ownership(this, swigCPtr, true);
  }

  public ChangeValue(IntVar[] vars) {
    this(mainJNI.new_ChangeValue(vars), true);
    mainJNI.ChangeValue_director_connect(this, swigCPtr, true, true);
  }

  public long modifyValue(long index, long value) {
    return mainJNI.ChangeValue_modifyValue(swigCPtr, this, index, value);
  }

  /**
   *  This method should not be overridden. Override ModifyValue() instead.
   */
  protected boolean oneNeighbor() {
    return (getClass() == ChangeValue.class) ? mainJNI.ChangeValue_oneNeighbor(swigCPtr, this) : mainJNI.ChangeValue_oneNeighborSwigExplicitChangeValue(swigCPtr, this);
  }

}