/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

/**
 *  Checker for type requirements.
 */
public class TypeRequirementChecker extends TypeRegulationsChecker {
  private transient long swigCPtr;

  protected TypeRequirementChecker(long cPtr, boolean cMemoryOwn) {
    super(mainJNI.TypeRequirementChecker_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TypeRequirementChecker obj) {
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
        mainJNI.delete_TypeRequirementChecker(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public TypeRequirementChecker(RoutingModel model) {
    this(mainJNI.new_TypeRequirementChecker(RoutingModel.getCPtr(model), model), true);
  }

}
