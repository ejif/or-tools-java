/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.linearsolver;

import java.lang.reflect.*;

/**
 * This class stores parameter settings for LP and MIP solvers. Some parameters<br>
 * are marked as advanced: do not change their values unless you know what you<br>
 * are doing!<br>
 * <br>
 * For developers: how to add a new parameter:<br>
 * - Add the new Foo parameter in the DoubleParam or IntegerParam enum.<br>
 * - If it is a categorical param, add a FooValues enum.<br>
 * - Decide if the wrapper should define a default value for it: yes<br>
 *   if it controls the properties of the solution (example:<br>
 *   tolerances) or if it consistently improves performance, no<br>
 *   otherwise. If yes, define kDefaultFoo.<br>
 * - Add a foo_value_ member and, if no default value is defined, a<br>
 *   foo_is_default_ member.<br>
 * - Add code to handle Foo in Set...Param, Reset...Param,<br>
 *   Get...Param, Reset and the constructor.<br>
 * - In class MPSolverInterface, add a virtual method SetFoo, add it<br>
 *   to SetCommonParameters or SetMIPParameters, and implement it for<br>
 *   each solver. Sometimes, parameters need to be implemented<br>
 *   differently, see for example the INCREMENTALITY implementation.<br>
 * - Add a test in linear_solver_test.cc.<br>
 * <br>
 * TODO(user): store the parameter values in a protocol buffer<br>
 * instead. We need to figure out how to deal with the subtleties of<br>
 * the default values.
 */
public class MPSolverParameters {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MPSolverParameters(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MPSolverParameters obj) {
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
        main_research_linear_solverJNI.delete_MPSolverParameters(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static double getKDefaultRelativeMipGap() {
    return main_research_linear_solverJNI.MPSolverParameters_kDefaultRelativeMipGap_get();
  }

  public static double getKDefaultPrimalTolerance() {
    return main_research_linear_solverJNI.MPSolverParameters_kDefaultPrimalTolerance_get();
  }

  public static double getKDefaultDualTolerance() {
    return main_research_linear_solverJNI.MPSolverParameters_kDefaultDualTolerance_get();
  }

  public static MPSolverParameters.PresolveValues getKDefaultPresolve() {
    return MPSolverParameters.PresolveValues.swigToEnum(main_research_linear_solverJNI.MPSolverParameters_kDefaultPresolve_get());
  }

  public static MPSolverParameters.IncrementalityValues getKDefaultIncrementality() {
    return MPSolverParameters.IncrementalityValues.swigToEnum(main_research_linear_solverJNI.MPSolverParameters_kDefaultIncrementality_get());
  }

  /**
   *  The constructor sets all parameters to their default value.
   */
  public MPSolverParameters() {
    this(main_research_linear_solverJNI.new_MPSolverParameters(), true);
  }

  /**
   *  Sets a double parameter to a specific value.
   */
  public void setDoubleParam(MPSolverParameters.DoubleParam param, double value) {
    main_research_linear_solverJNI.MPSolverParameters_setDoubleParam(swigCPtr, this, param.swigValue(), value);
  }

  /**
   *  Sets a integer parameter to a specific value.
   */
  public void setIntegerParam(MPSolverParameters.IntegerParam param, int value) {
    main_research_linear_solverJNI.MPSolverParameters_setIntegerParam(swigCPtr, this, param.swigValue(), value);
  }

  /**
   *  Returns the value of a double parameter.
   */
  public double getDoubleParam(MPSolverParameters.DoubleParam param) {
    return main_research_linear_solverJNI.MPSolverParameters_getDoubleParam(swigCPtr, this, param.swigValue());
  }

  /**
   *  Returns the value of an integer parameter.
   */
  public int getIntegerParam(MPSolverParameters.IntegerParam param) {
    return main_research_linear_solverJNI.MPSolverParameters_getIntegerParam(swigCPtr, this, param.swigValue());
  }

  /**
   *  Enumeration of parameters that take continuous values.
   */
  public enum DoubleParam {
    /**
     *  Limit for relative MIP gap.
     */
    RELATIVE_MIP_GAP(main_research_linear_solverJNI.MPSolverParameters_RELATIVE_MIP_GAP_get()),
    /**
     * Advanced usage: tolerance for primal feasibility of basic solutions.<br>
     * <br>
     * This does not control the integer feasibility tolerance of integer<br>
     * solutions for MIP or the tolerance used during presolve.
     */
    PRIMAL_TOLERANCE(main_research_linear_solverJNI.MPSolverParameters_PRIMAL_TOLERANCE_get()),
    /**
     *  Advanced usage: tolerance for dual feasibility of basic solutions.
     */
    DUAL_TOLERANCE(main_research_linear_solverJNI.MPSolverParameters_DUAL_TOLERANCE_get());

    public final int swigValue() {
      return swigValue;
    }

    public static DoubleParam swigToEnum(int swigValue) {
      DoubleParam[] swigValues = DoubleParam.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (DoubleParam swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + DoubleParam.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private DoubleParam() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private DoubleParam(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private DoubleParam(DoubleParam swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  /**
   *  Enumeration of parameters that take integer or categorical values.
   */
  public enum IntegerParam {
    /**
     *  Advanced usage: presolve mode.
     */
    PRESOLVE(main_research_linear_solverJNI.MPSolverParameters_PRESOLVE_get()),
    /**
     *  Algorithm to solve linear programs.
     */
    LP_ALGORITHM(main_research_linear_solverJNI.MPSolverParameters_LP_ALGORITHM_get()),
    /**
     *  Advanced usage: incrementality from one solve to the next.
     */
    INCREMENTALITY(main_research_linear_solverJNI.MPSolverParameters_INCREMENTALITY_get()),
    /**
     *  Advanced usage: enable or disable matrix scaling.
     */
    SCALING(main_research_linear_solverJNI.MPSolverParameters_SCALING_get());

    public final int swigValue() {
      return swigValue;
    }

    public static IntegerParam swigToEnum(int swigValue) {
      IntegerParam[] swigValues = IntegerParam.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (IntegerParam swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + IntegerParam.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private IntegerParam() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private IntegerParam(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private IntegerParam(IntegerParam swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  /**
   *  For each categorical parameter, enumeration of possible values.
   */
  public enum PresolveValues {
    /**
     *  Presolve is off.
     */
    PRESOLVE_OFF(main_research_linear_solverJNI.MPSolverParameters_PRESOLVE_OFF_get()),
    /**
     *  Presolve is on.
     */
    PRESOLVE_ON(main_research_linear_solverJNI.MPSolverParameters_PRESOLVE_ON_get());

    public final int swigValue() {
      return swigValue;
    }

    public static PresolveValues swigToEnum(int swigValue) {
      PresolveValues[] swigValues = PresolveValues.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (PresolveValues swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + PresolveValues.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private PresolveValues() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private PresolveValues(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private PresolveValues(PresolveValues swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  /**
   *  LP algorithm to use.
   */
  public enum LpAlgorithmValues {
    /**
     *  Dual simplex.
     */
    DUAL(main_research_linear_solverJNI.MPSolverParameters_DUAL_get()),
    /**
     *  Primal simplex.
     */
    PRIMAL(main_research_linear_solverJNI.MPSolverParameters_PRIMAL_get()),
    /**
     *  Barrier algorithm.
     */
    BARRIER(main_research_linear_solverJNI.MPSolverParameters_BARRIER_get());

    public final int swigValue() {
      return swigValue;
    }

    public static LpAlgorithmValues swigToEnum(int swigValue) {
      LpAlgorithmValues[] swigValues = LpAlgorithmValues.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (LpAlgorithmValues swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + LpAlgorithmValues.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private LpAlgorithmValues() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private LpAlgorithmValues(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private LpAlgorithmValues(LpAlgorithmValues swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  /**
   *  Advanced usage: Incrementality options.
   */
  public enum IncrementalityValues {
    /**
     *  Start solve from scratch.
     */
    INCREMENTALITY_OFF(main_research_linear_solverJNI.MPSolverParameters_INCREMENTALITY_OFF_get()),
    /**
     * Reuse results from previous solve as much as the underlying solver<br>
     * allows.
     */
    INCREMENTALITY_ON(main_research_linear_solverJNI.MPSolverParameters_INCREMENTALITY_ON_get());

    public final int swigValue() {
      return swigValue;
    }

    public static IncrementalityValues swigToEnum(int swigValue) {
      IncrementalityValues[] swigValues = IncrementalityValues.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (IncrementalityValues swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + IncrementalityValues.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private IncrementalityValues() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private IncrementalityValues(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private IncrementalityValues(IncrementalityValues swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  /**
   *  Advanced usage: Scaling options.
   */
  public enum ScalingValues {
    /**
     *  Scaling is off.
     */
    SCALING_OFF(main_research_linear_solverJNI.MPSolverParameters_SCALING_OFF_get()),
    /**
     *  Scaling is on.
     */
    SCALING_ON(main_research_linear_solverJNI.MPSolverParameters_SCALING_ON_get());

    public final int swigValue() {
      return swigValue;
    }

    public static ScalingValues swigToEnum(int swigValue) {
      ScalingValues[] swigValues = ScalingValues.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (ScalingValues swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + ScalingValues.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private ScalingValues() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private ScalingValues(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private ScalingValues(ScalingValues swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}