/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

/**
 *  Interval variables are often used in scheduling. The main characteristics of an IntervalVar are the start position, duration, and end date. All these characteristics can be queried and set, and demons can be posted on their modifications. An important aspect is optionality: an IntervalVar can be performed or not. If unperformed, then it simply does not exist, and its characteristics cannot be accessed any more. An interval var is automatically marked as unperformed when it is not consistent anymore (start greater than end, duration &lt; 0...)
 */
public class IntervalVar extends PropagationBaseObject {
  private transient long swigCPtr;

  protected IntervalVar(long cPtr, boolean cMemoryOwn) {
    super(mainJNI.IntervalVar_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IntervalVar obj) {
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
        mainJNI.delete_IntervalVar(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  The smallest acceptable value to be returned by StartMin()
   */
  public static long getKMinValidValue() {
    return mainJNI.IntervalVar_kMinValidValue_get();
  }

  /**
   *  The largest acceptable value to be returned by EndMax()
   */
  public static long getKMaxValidValue() {
    return mainJNI.IntervalVar_kMaxValidValue_get();
  }

  /**
   *  These methods query, set, and watch the start position of the interval var.
   */
  public long startMin() {
    return mainJNI.IntervalVar_startMin(swigCPtr, this);
  }

  public long startMax() {
    return mainJNI.IntervalVar_startMax(swigCPtr, this);
  }

  public void setStartMin(long m) {
    mainJNI.IntervalVar_setStartMin(swigCPtr, this, m);
  }

  public void setStartMax(long m) {
    mainJNI.IntervalVar_setStartMax(swigCPtr, this, m);
  }

  public void setStartRange(long mi, long ma) {
    mainJNI.IntervalVar_setStartRange(swigCPtr, this, mi, ma);
  }

  public long oldStartMin() {
    return mainJNI.IntervalVar_oldStartMin(swigCPtr, this);
  }

  public long oldStartMax() {
    return mainJNI.IntervalVar_oldStartMax(swigCPtr, this);
  }

  public void whenStartRange(Demon d) {
    mainJNI.IntervalVar_whenStartRange__SWIG_0(swigCPtr, this, Demon.getCPtr(d), d);
  }

  public void whenStartRange(Runnable closure) {
    mainJNI.IntervalVar_whenStartRange__SWIG_1(swigCPtr, this, closure);
  }

  public void whenStartBound(Demon d) {
    mainJNI.IntervalVar_whenStartBound__SWIG_0(swigCPtr, this, Demon.getCPtr(d), d);
  }

  public void whenStartBound(Runnable closure) {
    mainJNI.IntervalVar_whenStartBound__SWIG_1(swigCPtr, this, closure);
  }

  /**
   *  These methods query, set, and watch the duration of the interval var.
   */
  public long durationMin() {
    return mainJNI.IntervalVar_durationMin(swigCPtr, this);
  }

  public long durationMax() {
    return mainJNI.IntervalVar_durationMax(swigCPtr, this);
  }

  public void setDurationMin(long m) {
    mainJNI.IntervalVar_setDurationMin(swigCPtr, this, m);
  }

  public void setDurationMax(long m) {
    mainJNI.IntervalVar_setDurationMax(swigCPtr, this, m);
  }

  public void setDurationRange(long mi, long ma) {
    mainJNI.IntervalVar_setDurationRange(swigCPtr, this, mi, ma);
  }

  public long oldDurationMin() {
    return mainJNI.IntervalVar_oldDurationMin(swigCPtr, this);
  }

  public long oldDurationMax() {
    return mainJNI.IntervalVar_oldDurationMax(swigCPtr, this);
  }

  public void whenDurationRange(Demon d) {
    mainJNI.IntervalVar_whenDurationRange__SWIG_0(swigCPtr, this, Demon.getCPtr(d), d);
  }

  public void whenDurationRange(Runnable closure) {
    mainJNI.IntervalVar_whenDurationRange__SWIG_1(swigCPtr, this, closure);
  }

  public void whenDurationBound(Demon d) {
    mainJNI.IntervalVar_whenDurationBound__SWIG_0(swigCPtr, this, Demon.getCPtr(d), d);
  }

  public void whenDurationBound(Runnable closure) {
    mainJNI.IntervalVar_whenDurationBound__SWIG_1(swigCPtr, this, closure);
  }

  /**
   *  These methods query, set, and watch the end position of the interval var.
   */
  public long endMin() {
    return mainJNI.IntervalVar_endMin(swigCPtr, this);
  }

  public long endMax() {
    return mainJNI.IntervalVar_endMax(swigCPtr, this);
  }

  public void setEndMin(long m) {
    mainJNI.IntervalVar_setEndMin(swigCPtr, this, m);
  }

  public void setEndMax(long m) {
    mainJNI.IntervalVar_setEndMax(swigCPtr, this, m);
  }

  public void setEndRange(long mi, long ma) {
    mainJNI.IntervalVar_setEndRange(swigCPtr, this, mi, ma);
  }

  public long oldEndMin() {
    return mainJNI.IntervalVar_oldEndMin(swigCPtr, this);
  }

  public long oldEndMax() {
    return mainJNI.IntervalVar_oldEndMax(swigCPtr, this);
  }

  public void whenEndRange(Demon d) {
    mainJNI.IntervalVar_whenEndRange__SWIG_0(swigCPtr, this, Demon.getCPtr(d), d);
  }

  public void whenEndRange(Runnable closure) {
    mainJNI.IntervalVar_whenEndRange__SWIG_1(swigCPtr, this, closure);
  }

  public void whenEndBound(Demon d) {
    mainJNI.IntervalVar_whenEndBound__SWIG_0(swigCPtr, this, Demon.getCPtr(d), d);
  }

  public void whenEndBound(Runnable closure) {
    mainJNI.IntervalVar_whenEndBound__SWIG_1(swigCPtr, this, closure);
  }

  /**
   *  These methods query, set, and watch the performed status of the interval var.
   */
  public boolean mustBePerformed() {
    return mainJNI.IntervalVar_mustBePerformed(swigCPtr, this);
  }

  public boolean mayBePerformed() {
    return mainJNI.IntervalVar_mayBePerformed(swigCPtr, this);
  }

  public boolean cannotBePerformed() {
    return mainJNI.IntervalVar_cannotBePerformed(swigCPtr, this);
  }

  public boolean isPerformedBound() {
    return mainJNI.IntervalVar_isPerformedBound(swigCPtr, this);
  }

  public void setPerformed(boolean val) {
    mainJNI.IntervalVar_setPerformed(swigCPtr, this, val);
  }

  public boolean wasPerformedBound() {
    return mainJNI.IntervalVar_wasPerformedBound(swigCPtr, this);
  }

  public void whenPerformedBound(Demon d) {
    mainJNI.IntervalVar_whenPerformedBound__SWIG_0(swigCPtr, this, Demon.getCPtr(d), d);
  }

  public void whenPerformedBound(Runnable closure) {
    mainJNI.IntervalVar_whenPerformedBound__SWIG_1(swigCPtr, this, closure);
  }

  /**
   *  Attaches a demon awakened when anything about this interval changes.
   */
  public void whenAnything(Demon d) {
    mainJNI.IntervalVar_whenAnything__SWIG_0(swigCPtr, this, Demon.getCPtr(d), d);
  }

  /**
   *  Attaches a closure awakened when anything about this interval changes.
   */
  public void whenAnything(Runnable closure) {
    mainJNI.IntervalVar_whenAnything__SWIG_1(swigCPtr, this, closure);
  }

  /**
   *  These methods create expressions encapsulating the start, end and duration of the interval var. Please note that these must not be used if the interval var is unperformed.
   */
  public IntExpr startExpr() {
    long cPtr = mainJNI.IntervalVar_startExpr(swigCPtr, this);
    return (cPtr == 0) ? null : new IntExpr(cPtr, false);
  }

  public IntExpr durationExpr() {
    long cPtr = mainJNI.IntervalVar_durationExpr(swigCPtr, this);
    return (cPtr == 0) ? null : new IntExpr(cPtr, false);
  }

  public IntExpr endExpr() {
    long cPtr = mainJNI.IntervalVar_endExpr(swigCPtr, this);
    return (cPtr == 0) ? null : new IntExpr(cPtr, false);
  }

  public IntExpr performedExpr() {
    long cPtr = mainJNI.IntervalVar_performedExpr(swigCPtr, this);
    return (cPtr == 0) ? null : new IntExpr(cPtr, false);
  }

  /**
   *  These methods create expressions encapsulating the start, end and duration of the interval var. If the interval var is unperformed, they will return the unperformed_value.
   */
  public IntExpr safeStartExpr(long unperformed_value) {
    long cPtr = mainJNI.IntervalVar_safeStartExpr(swigCPtr, this, unperformed_value);
    return (cPtr == 0) ? null : new IntExpr(cPtr, false);
  }

  public IntExpr safeDurationExpr(long unperformed_value) {
    long cPtr = mainJNI.IntervalVar_safeDurationExpr(swigCPtr, this, unperformed_value);
    return (cPtr == 0) ? null : new IntExpr(cPtr, false);
  }

  public IntExpr safeEndExpr(long unperformed_value) {
    long cPtr = mainJNI.IntervalVar_safeEndExpr(swigCPtr, this, unperformed_value);
    return (cPtr == 0) ? null : new IntExpr(cPtr, false);
  }

  /**
   *  Accepts the given visitor.
   */
  public void accept(ModelVisitor visitor) {
    mainJNI.IntervalVar_accept(swigCPtr, this, ModelVisitor.getCPtr(visitor), visitor);
  }

}