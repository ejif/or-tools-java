/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class AssignmentIntervalContainer {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected AssignmentIntervalContainer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AssignmentIntervalContainer obj) {
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
        mainJNI.delete_AssignmentIntervalContainer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public AssignmentIntervalContainer() {
    this(mainJNI.new_AssignmentIntervalContainer(), true);
  }

  public IntervalVarElement add(IntervalVar var) {
    long cPtr = mainJNI.AssignmentIntervalContainer_add(swigCPtr, this, IntervalVar.getCPtr(var), var);
    return (cPtr == 0) ? null : new IntervalVarElement(cPtr, false);
  }

  /**
   *  Adds element without checking its presence in the container.
   */
  public IntervalVarElement fastAdd(IntervalVar var) {
    long cPtr = mainJNI.AssignmentIntervalContainer_fastAdd(swigCPtr, this, IntervalVar.getCPtr(var), var);
    return (cPtr == 0) ? null : new IntervalVarElement(cPtr, false);
  }

  /**
   *  Advanced usage: Adds element at a given position; position has to have been allocated with AssignmentContainer::Resize() beforehand.
   */
  public IntervalVarElement addAtPosition(IntervalVar var, int position) {
    long cPtr = mainJNI.AssignmentIntervalContainer_addAtPosition(swigCPtr, this, IntervalVar.getCPtr(var), var, position);
    return (cPtr == 0) ? null : new IntervalVarElement(cPtr, false);
  }

  public void clear() {
    mainJNI.AssignmentIntervalContainer_clear(swigCPtr, this);
  }

  /**
   *  Advanced usage: Resizes the container, potentially adding elements with null variables.
   */
  public void resize(long size) {
    mainJNI.AssignmentIntervalContainer_resize(swigCPtr, this, size);
  }

  public boolean empty() {
    return mainJNI.AssignmentIntervalContainer_empty(swigCPtr, this);
  }

  /**
   *  Copies the elements of 'container' which are already in the calling container.
   */
  public void copyIntersection(AssignmentIntervalContainer container) {
    mainJNI.AssignmentIntervalContainer_copyIntersection(swigCPtr, this, AssignmentIntervalContainer.getCPtr(container), container);
  }

  /**
   *  Copies all the elements of 'container' to this container, clearing its previous content.
   */
  public void copy(AssignmentIntervalContainer container) {
    mainJNI.AssignmentIntervalContainer_copy(swigCPtr, this, AssignmentIntervalContainer.getCPtr(container), container);
  }

  public boolean contains(IntervalVar var) {
    return mainJNI.AssignmentIntervalContainer_contains(swigCPtr, this, IntervalVar.getCPtr(var), var);
  }

  public IntervalVarElement mutableElement(IntervalVar var) {
    long cPtr = mainJNI.AssignmentIntervalContainer_mutableElement__SWIG_0(swigCPtr, this, IntervalVar.getCPtr(var), var);
    return (cPtr == 0) ? null : new IntervalVarElement(cPtr, false);
  }

  public IntervalVarElement element(IntervalVar var) {
    return new IntervalVarElement(mainJNI.AssignmentIntervalContainer_element__SWIG_0(swigCPtr, this, IntervalVar.getCPtr(var), var), false);
  }

  public IntervalVarElement mutableElement(int index) {
    long cPtr = mainJNI.AssignmentIntervalContainer_mutableElement__SWIG_1(swigCPtr, this, index);
    return (cPtr == 0) ? null : new IntervalVarElement(cPtr, false);
  }

  public IntervalVarElement element(int index) {
    return new IntervalVarElement(mainJNI.AssignmentIntervalContainer_element__SWIG_1(swigCPtr, this, index), false);
  }

  public int size() {
    return mainJNI.AssignmentIntervalContainer_size(swigCPtr, this);
  }

  public void store() {
    mainJNI.AssignmentIntervalContainer_store(swigCPtr, this);
  }

  public void restore() {
    mainJNI.AssignmentIntervalContainer_restore(swigCPtr, this);
  }

  public boolean AreAllElementsBound() {
    return mainJNI.AssignmentIntervalContainer_AreAllElementsBound(swigCPtr, this);
  }

}