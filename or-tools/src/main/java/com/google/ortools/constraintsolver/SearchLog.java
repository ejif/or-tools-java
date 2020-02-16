/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

// Used to wrap DisplayCallback (std::function<std::string()>)
// see https://docs.oracle.com/javase/8/docs/api/java/util/function/Supplier.html
import java.util.function.Supplier;

/**
 *  The base class of all search logs that periodically outputs information when the search is running.
 */
public class SearchLog extends SearchMonitor {
  private transient long swigCPtr;

  protected SearchLog(long cPtr, boolean cMemoryOwn) {
    super(mainJNI.SearchLog_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SearchLog obj) {
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
        mainJNI.delete_SearchLog(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SearchLog(Solver s, OptimizeVar obj, IntVar var, double scaling_factor, double offset, Supplier<String> display_callback, int period) {
    this(mainJNI.new_SearchLog(Solver.getCPtr(s), s, OptimizeVar.getCPtr(obj), obj, IntVar.getCPtr(var), var, scaling_factor, offset, display_callback, period), true);
  }

  public void enterSearch() {
    mainJNI.SearchLog_enterSearch(swigCPtr, this);
  }

  public void exitSearch() {
    mainJNI.SearchLog_exitSearch(swigCPtr, this);
  }

  public boolean atSolution() {
    return mainJNI.SearchLog_atSolution(swigCPtr, this);
  }

  public void beginFail() {
    mainJNI.SearchLog_beginFail(swigCPtr, this);
  }

  public void noMoreSolutions() {
    mainJNI.SearchLog_noMoreSolutions(swigCPtr, this);
  }

  public void AcceptUncheckedNeighbor() {
    mainJNI.SearchLog_AcceptUncheckedNeighbor(swigCPtr, this);
  }

  public void applyDecision(Decision decision) {
    mainJNI.SearchLog_applyDecision(swigCPtr, this, Decision.getCPtr(decision), decision);
  }

  public void refuteDecision(Decision decision) {
    mainJNI.SearchLog_refuteDecision(swigCPtr, this, Decision.getCPtr(decision), decision);
  }

  public void outputDecision() {
    mainJNI.SearchLog_outputDecision(swigCPtr, this);
  }

  public void maintain() {
    mainJNI.SearchLog_maintain(swigCPtr, this);
  }

  public void beginInitialPropagation() {
    mainJNI.SearchLog_beginInitialPropagation(swigCPtr, this);
  }

  public void endInitialPropagation() {
    mainJNI.SearchLog_endInitialPropagation(swigCPtr, this);
  }

  public String toString() {
    return mainJNI.SearchLog_toString(swigCPtr, this);
  }

}