/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.graph;

public class MinCostFlowBase {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MinCostFlowBase(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MinCostFlowBase obj) {
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
        mainJNI.delete_MinCostFlowBase(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public MinCostFlowBase() {
    this(mainJNI.new_MinCostFlowBase(), true);
  }

  public enum Status {
    NOT_SOLVED,
    OPTIMAL,
    FEASIBLE,
    INFEASIBLE,
    UNBALANCED,
    BAD_RESULT,
    BAD_COST_RANGE;

    public final int swigValue() {
      return swigValue;
    }

    public static Status swigToEnum(int swigValue) {
      Status[] swigValues = Status.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (Status swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + Status.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private Status() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private Status(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private Status(Status swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
