/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

/**
 *  The class IntVar is a subset of IntExpr. In addition to the IntExpr protocol, it offers persistence, removing values from the domains, and a finer model for events.
 */
public class IntVar extends IntExpr {
  private transient long swigCPtr;

  protected IntVar(long cPtr, boolean cMemoryOwn) {
    super(mainJNI.IntVar_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IntVar obj) {
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
        mainJNI.delete_IntVar(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public boolean isVar() {
    return mainJNI.IntVar_isVar(swigCPtr, this);
  }

  public IntVar var() {
    long cPtr = mainJNI.IntVar_var(swigCPtr, this);
    return (cPtr == 0) ? null : new IntVar(cPtr, false);
  }

  /**
   *  This method returns the value of the variable. This method checks before that the variable is bound.
   */
  public long value() {
    return mainJNI.IntVar_value(swigCPtr, this);
  }

  /**
   *  This method removes the value 'v' from the domain of the variable.
   */
  public void removeValue(long v) {
    mainJNI.IntVar_removeValue(swigCPtr, this, v);
  }

  /**
   *  This method removes the interval 'l' .. 'u' from the domain of the variable. It assumes that 'l' &lt;= 'u'.
   */
  public void removeInterval(long l, long u) {
    mainJNI.IntVar_removeInterval(swigCPtr, this, l, u);
  }

  /**
   *  This method remove the values from the domain of the variable.
   */
  public void removeValues(long[] values) {
    mainJNI.IntVar_removeValues(swigCPtr, this, values);
  }

  /**
   *  This method intersects the current domain with the values in the array.
   */
  public void setValue(long[] values) {
    mainJNI.IntVar_setValue(swigCPtr, this, values);
  }

  /**
   *  This method attaches a demon that will be awakened when the variable is bound.
   */
  public void whenBound(Demon d) {
    mainJNI.IntVar_whenBound__SWIG_0(swigCPtr, this, Demon.getCPtr(d), d);
  }

  /**
   *  This method attaches a closure that will be awakened when the variable is bound.
   */
  public void whenBound(Runnable closure) {
    mainJNI.IntVar_whenBound__SWIG_1(swigCPtr, this, closure);
  }

  /**
   *  This method attaches a demon that will watch any domain modification of the domain of the variable.
   */
  public void whenDomain(Demon d) {
    mainJNI.IntVar_whenDomain__SWIG_0(swigCPtr, this, Demon.getCPtr(d), d);
  }

  /**
   *  This method attaches a closure that will watch any domain modification of the domain of the variable.
   */
  public void whenDomain(Runnable closure) {
    mainJNI.IntVar_whenDomain__SWIG_1(swigCPtr, this, closure);
  }

  /**
   *  This method returns the number of values in the domain of the variable.
   */
  public java.math.BigInteger size() {
    return mainJNI.IntVar_size(swigCPtr, this);
  }

  /**
   *  This method returns whether the value 'v' is in the domain of the variable.
   */
  public boolean contains(long v) {
    return mainJNI.IntVar_contains(swigCPtr, this, v);
  }

  /**
   *  Creates a hole iterator. When 'reversible' is false, the returned object is created on the normal C++ heap and the solver does NOT take ownership of the object.
   */
  public IntVarIterator makeHoleIterator(boolean reversible) {
    long cPtr = mainJNI.IntVar_makeHoleIterator(swigCPtr, this, reversible);
    return (cPtr == 0) ? null : new IntVarIterator(cPtr, false);
  }

  /**
   *  Creates a domain iterator. When 'reversible' is false, the returned object is created on the normal C++ heap and the solver does NOT take ownership of the object.
   */
  public IntVarIterator makeDomainIterator(boolean reversible) {
    long cPtr = mainJNI.IntVar_makeDomainIterator(swigCPtr, this, reversible);
    return (cPtr == 0) ? null : new IntVarIterator(cPtr, false);
  }

  /**
   *  Returns the previous min.
   */
  public long oldMin() {
    return mainJNI.IntVar_oldMin(swigCPtr, this);
  }

  /**
   *  Returns the previous max.
   */
  public long oldMax() {
    return mainJNI.IntVar_oldMax(swigCPtr, this);
  }

  public int varType() {
    return mainJNI.IntVar_varType(swigCPtr, this);
  }

  /**
   *  Accepts the given visitor.
   */
  public void accept(ModelVisitor visitor) {
    mainJNI.IntVar_accept(swigCPtr, this, ModelVisitor.getCPtr(visitor), visitor);
  }

  /**
   *  IsEqual
   */
  public IntVar isEqual(long constant) {
    long cPtr = mainJNI.IntVar_isEqual(swigCPtr, this, constant);
    return (cPtr == 0) ? null : new IntVar(cPtr, false);
  }

  public IntVar isDifferent(long constant) {
    long cPtr = mainJNI.IntVar_isDifferent(swigCPtr, this, constant);
    return (cPtr == 0) ? null : new IntVar(cPtr, false);
  }

  public IntVar isGreaterOrEqual(long constant) {
    long cPtr = mainJNI.IntVar_isGreaterOrEqual(swigCPtr, this, constant);
    return (cPtr == 0) ? null : new IntVar(cPtr, false);
  }

  public IntVar isLessOrEqual(long constant) {
    long cPtr = mainJNI.IntVar_isLessOrEqual(swigCPtr, this, constant);
    return (cPtr == 0) ? null : new IntVar(cPtr, false);
  }

  /**
   *  Returns the index of the variable.
   */
  public int index() {
    return mainJNI.IntVar_index(swigCPtr, this);
  }

}
