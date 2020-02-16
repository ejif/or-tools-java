// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ortools/linear_solver/linear_solver.proto

package com.google.ortools.linearsolver;

public interface MPSolutionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:operations_research.MPSolutionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Result of the optimization.
   * </pre>
   *
   * <code>optional .operations_research.MPSolverResponseStatus status = 1 [default = MPSOLVER_UNKNOWN_STATUS];</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * Result of the optimization.
   * </pre>
   *
   * <code>optional .operations_research.MPSolverResponseStatus status = 1 [default = MPSOLVER_UNKNOWN_STATUS];</code>
   * @return The status.
   */
  com.google.ortools.linearsolver.MPSolverResponseStatus getStatus();

  /**
   * <pre>
   * Human-readable string giving more details about the status. For example,
   * when the status is MPSOLVER_INVALID_MODE, this can hold a description of
   * why the model is invalid.
   * This isn't always filled: don't depend on its value or even its presence.
   * </pre>
   *
   * <code>optional string status_str = 7;</code>
   * @return Whether the statusStr field is set.
   */
  boolean hasStatusStr();
  /**
   * <pre>
   * Human-readable string giving more details about the status. For example,
   * when the status is MPSOLVER_INVALID_MODE, this can hold a description of
   * why the model is invalid.
   * This isn't always filled: don't depend on its value or even its presence.
   * </pre>
   *
   * <code>optional string status_str = 7;</code>
   * @return The statusStr.
   */
  java.lang.String getStatusStr();
  /**
   * <pre>
   * Human-readable string giving more details about the status. For example,
   * when the status is MPSOLVER_INVALID_MODE, this can hold a description of
   * why the model is invalid.
   * This isn't always filled: don't depend on its value or even its presence.
   * </pre>
   *
   * <code>optional string status_str = 7;</code>
   * @return The bytes for statusStr.
   */
  com.google.protobuf.ByteString
      getStatusStrBytes();

  /**
   * <pre>
   * Objective value corresponding to the "variable_value" below, taking into
   * account the source "objective_offset" and "objective_coefficient".
   * This is set iff 'status' is OPTIMAL or FEASIBLE.
   * </pre>
   *
   * <code>optional double objective_value = 2;</code>
   * @return Whether the objectiveValue field is set.
   */
  boolean hasObjectiveValue();
  /**
   * <pre>
   * Objective value corresponding to the "variable_value" below, taking into
   * account the source "objective_offset" and "objective_coefficient".
   * This is set iff 'status' is OPTIMAL or FEASIBLE.
   * </pre>
   *
   * <code>optional double objective_value = 2;</code>
   * @return The objectiveValue.
   */
  double getObjectiveValue();

  /**
   * <pre>
   * This field is only filled for MIP problems. For a minimization problem,
   * this is a lower bound on the optimal objective value. For a maximization
   * problem, it is an upper bound. It is only filled if the status is OPTIMAL
   * or FEASIBLE. In the former case, best_objective_bound should be equal to
   * objective_value (modulo numerical errors).
   * </pre>
   *
   * <code>optional double best_objective_bound = 5;</code>
   * @return Whether the bestObjectiveBound field is set.
   */
  boolean hasBestObjectiveBound();
  /**
   * <pre>
   * This field is only filled for MIP problems. For a minimization problem,
   * this is a lower bound on the optimal objective value. For a maximization
   * problem, it is an upper bound. It is only filled if the status is OPTIMAL
   * or FEASIBLE. In the former case, best_objective_bound should be equal to
   * objective_value (modulo numerical errors).
   * </pre>
   *
   * <code>optional double best_objective_bound = 5;</code>
   * @return The bestObjectiveBound.
   */
  double getBestObjectiveBound();

  /**
   * <pre>
   * Variable values in the same order as the MPModelProto::variable field.
   * This is a dense representation. These are set iff 'status' is OPTIMAL or
   * FEASIBLE.
   * </pre>
   *
   * <code>repeated double variable_value = 3 [packed = true];</code>
   * @return A list containing the variableValue.
   */
  java.util.List<java.lang.Double> getVariableValueList();
  /**
   * <pre>
   * Variable values in the same order as the MPModelProto::variable field.
   * This is a dense representation. These are set iff 'status' is OPTIMAL or
   * FEASIBLE.
   * </pre>
   *
   * <code>repeated double variable_value = 3 [packed = true];</code>
   * @return The count of variableValue.
   */
  int getVariableValueCount();
  /**
   * <pre>
   * Variable values in the same order as the MPModelProto::variable field.
   * This is a dense representation. These are set iff 'status' is OPTIMAL or
   * FEASIBLE.
   * </pre>
   *
   * <code>repeated double variable_value = 3 [packed = true];</code>
   * @param index The index of the element to return.
   * @return The variableValue at the given index.
   */
  double getVariableValue(int index);

  /**
   * <pre>
   * [Advanced usage.]
   * Values of the dual variables values in the same order as the
   * MPModelProto::constraint field. This is a dense representation.
   * These are not set if the problem was solved with a MIP solver (even if
   * it is actually a linear program).
   * These are set iff 'status' is OPTIMAL or FEASIBLE.
   * </pre>
   *
   * <code>repeated double dual_value = 4 [packed = true];</code>
   * @return A list containing the dualValue.
   */
  java.util.List<java.lang.Double> getDualValueList();
  /**
   * <pre>
   * [Advanced usage.]
   * Values of the dual variables values in the same order as the
   * MPModelProto::constraint field. This is a dense representation.
   * These are not set if the problem was solved with a MIP solver (even if
   * it is actually a linear program).
   * These are set iff 'status' is OPTIMAL or FEASIBLE.
   * </pre>
   *
   * <code>repeated double dual_value = 4 [packed = true];</code>
   * @return The count of dualValue.
   */
  int getDualValueCount();
  /**
   * <pre>
   * [Advanced usage.]
   * Values of the dual variables values in the same order as the
   * MPModelProto::constraint field. This is a dense representation.
   * These are not set if the problem was solved with a MIP solver (even if
   * it is actually a linear program).
   * These are set iff 'status' is OPTIMAL or FEASIBLE.
   * </pre>
   *
   * <code>repeated double dual_value = 4 [packed = true];</code>
   * @param index The index of the element to return.
   * @return The dualValue at the given index.
   */
  double getDualValue(int index);

  /**
   * <pre>
   * [Advanced usage.]
   * Values of the reduced cost of the variables in the same order as the
   * MPModelProto::variable. This is a dense representation.
   * These are not set if the problem was solved with a MIP solver (even if it
   * is actually a linear program).
   * These are set iff 'status' is OPTIMAL or FEASIBLE.
   * </pre>
   *
   * <code>repeated double reduced_cost = 6 [packed = true];</code>
   * @return A list containing the reducedCost.
   */
  java.util.List<java.lang.Double> getReducedCostList();
  /**
   * <pre>
   * [Advanced usage.]
   * Values of the reduced cost of the variables in the same order as the
   * MPModelProto::variable. This is a dense representation.
   * These are not set if the problem was solved with a MIP solver (even if it
   * is actually a linear program).
   * These are set iff 'status' is OPTIMAL or FEASIBLE.
   * </pre>
   *
   * <code>repeated double reduced_cost = 6 [packed = true];</code>
   * @return The count of reducedCost.
   */
  int getReducedCostCount();
  /**
   * <pre>
   * [Advanced usage.]
   * Values of the reduced cost of the variables in the same order as the
   * MPModelProto::variable. This is a dense representation.
   * These are not set if the problem was solved with a MIP solver (even if it
   * is actually a linear program).
   * These are set iff 'status' is OPTIMAL or FEASIBLE.
   * </pre>
   *
   * <code>repeated double reduced_cost = 6 [packed = true];</code>
   * @param index The index of the element to return.
   * @return The reducedCost at the given index.
   */
  double getReducedCost(int index);
}
