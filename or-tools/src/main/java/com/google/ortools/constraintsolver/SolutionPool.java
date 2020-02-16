/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

/**
 *  This class is used to manage a pool of solutions. It can transform a single point local search into a multipoint local search.
 */
public class SolutionPool extends BaseObject {
  private transient long swigCPtr;

  protected SolutionPool(long cPtr, boolean cMemoryOwn) {
    super(mainJNI.SolutionPool_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SolutionPool obj) {
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
        mainJNI.delete_SolutionPool(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  This method is called to initialize the solution pool with the assignment from the local search.
   */
  public void initialize(Assignment assignment) {
    mainJNI.SolutionPool_initialize(swigCPtr, this, Assignment.getCPtr(assignment), assignment);
  }

  /**
   *  This method is called when a new solution has been accepted by the local search.
   */
  public void registerNewSolution(Assignment assignment) {
    mainJNI.SolutionPool_registerNewSolution(swigCPtr, this, Assignment.getCPtr(assignment), assignment);
  }

  /**
   *  This method is called when the local search starts a new neighborhood to initialize the default assignment.
   */
  public void getNextSolution(Assignment assignment) {
    mainJNI.SolutionPool_getNextSolution(swigCPtr, this, Assignment.getCPtr(assignment), assignment);
  }

  /**
   *  This method checks if the local solution needs to be updated with an external one.
   */
  public boolean syncNeeded(Assignment local_assignment) {
    return mainJNI.SolutionPool_syncNeeded(swigCPtr, this, Assignment.getCPtr(local_assignment), local_assignment);
  }

}