// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ortools/linear_solver/linear_solver.proto

package com.google.ortools.linearsolver;

public interface MPModelProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:operations_research.MPModelProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * All the variables appearing in the model.
   * </pre>
   *
   * <code>repeated .operations_research.MPVariableProto variable = 3;</code>
   */
  java.util.List<com.google.ortools.linearsolver.MPVariableProto> 
      getVariableList();
  /**
   * <pre>
   * All the variables appearing in the model.
   * </pre>
   *
   * <code>repeated .operations_research.MPVariableProto variable = 3;</code>
   */
  com.google.ortools.linearsolver.MPVariableProto getVariable(int index);
  /**
   * <pre>
   * All the variables appearing in the model.
   * </pre>
   *
   * <code>repeated .operations_research.MPVariableProto variable = 3;</code>
   */
  int getVariableCount();
  /**
   * <pre>
   * All the variables appearing in the model.
   * </pre>
   *
   * <code>repeated .operations_research.MPVariableProto variable = 3;</code>
   */
  java.util.List<? extends com.google.ortools.linearsolver.MPVariableProtoOrBuilder> 
      getVariableOrBuilderList();
  /**
   * <pre>
   * All the variables appearing in the model.
   * </pre>
   *
   * <code>repeated .operations_research.MPVariableProto variable = 3;</code>
   */
  com.google.ortools.linearsolver.MPVariableProtoOrBuilder getVariableOrBuilder(
      int index);

  /**
   * <pre>
   * All the constraints appearing in the model.
   * </pre>
   *
   * <code>repeated .operations_research.MPConstraintProto constraint = 4;</code>
   */
  java.util.List<com.google.ortools.linearsolver.MPConstraintProto> 
      getConstraintList();
  /**
   * <pre>
   * All the constraints appearing in the model.
   * </pre>
   *
   * <code>repeated .operations_research.MPConstraintProto constraint = 4;</code>
   */
  com.google.ortools.linearsolver.MPConstraintProto getConstraint(int index);
  /**
   * <pre>
   * All the constraints appearing in the model.
   * </pre>
   *
   * <code>repeated .operations_research.MPConstraintProto constraint = 4;</code>
   */
  int getConstraintCount();
  /**
   * <pre>
   * All the constraints appearing in the model.
   * </pre>
   *
   * <code>repeated .operations_research.MPConstraintProto constraint = 4;</code>
   */
  java.util.List<? extends com.google.ortools.linearsolver.MPConstraintProtoOrBuilder> 
      getConstraintOrBuilderList();
  /**
   * <pre>
   * All the constraints appearing in the model.
   * </pre>
   *
   * <code>repeated .operations_research.MPConstraintProto constraint = 4;</code>
   */
  com.google.ortools.linearsolver.MPConstraintProtoOrBuilder getConstraintOrBuilder(
      int index);

  /**
   * <pre>
   * All the general constraints appearing in the model. Note that not all
   * solvers support all types of general constraints.
   * </pre>
   *
   * <code>repeated .operations_research.MPGeneralConstraintProto general_constraint = 7;</code>
   */
  java.util.List<com.google.ortools.linearsolver.MPGeneralConstraintProto> 
      getGeneralConstraintList();
  /**
   * <pre>
   * All the general constraints appearing in the model. Note that not all
   * solvers support all types of general constraints.
   * </pre>
   *
   * <code>repeated .operations_research.MPGeneralConstraintProto general_constraint = 7;</code>
   */
  com.google.ortools.linearsolver.MPGeneralConstraintProto getGeneralConstraint(int index);
  /**
   * <pre>
   * All the general constraints appearing in the model. Note that not all
   * solvers support all types of general constraints.
   * </pre>
   *
   * <code>repeated .operations_research.MPGeneralConstraintProto general_constraint = 7;</code>
   */
  int getGeneralConstraintCount();
  /**
   * <pre>
   * All the general constraints appearing in the model. Note that not all
   * solvers support all types of general constraints.
   * </pre>
   *
   * <code>repeated .operations_research.MPGeneralConstraintProto general_constraint = 7;</code>
   */
  java.util.List<? extends com.google.ortools.linearsolver.MPGeneralConstraintProtoOrBuilder> 
      getGeneralConstraintOrBuilderList();
  /**
   * <pre>
   * All the general constraints appearing in the model. Note that not all
   * solvers support all types of general constraints.
   * </pre>
   *
   * <code>repeated .operations_research.MPGeneralConstraintProto general_constraint = 7;</code>
   */
  com.google.ortools.linearsolver.MPGeneralConstraintProtoOrBuilder getGeneralConstraintOrBuilder(
      int index);

  /**
   * <pre>
   * True if the problem is a maximization problem. Minimize by default.
   * </pre>
   *
   * <code>optional bool maximize = 1 [default = false];</code>
   * @return Whether the maximize field is set.
   */
  boolean hasMaximize();
  /**
   * <pre>
   * True if the problem is a maximization problem. Minimize by default.
   * </pre>
   *
   * <code>optional bool maximize = 1 [default = false];</code>
   * @return The maximize.
   */
  boolean getMaximize();

  /**
   * <pre>
   * Offset for the objective function. Must be finite.
   * </pre>
   *
   * <code>optional double objective_offset = 2 [default = 0];</code>
   * @return Whether the objectiveOffset field is set.
   */
  boolean hasObjectiveOffset();
  /**
   * <pre>
   * Offset for the objective function. Must be finite.
   * </pre>
   *
   * <code>optional double objective_offset = 2 [default = 0];</code>
   * @return The objectiveOffset.
   */
  double getObjectiveOffset();

  /**
   * <pre>
   * Optionally, a quadratic objective.
   * As of 2019/06, only SCIP and Gurobi support quadratic objectives.
   * </pre>
   *
   * <code>optional .operations_research.MPQuadraticObjective quadratic_objective = 8;</code>
   * @return Whether the quadraticObjective field is set.
   */
  boolean hasQuadraticObjective();
  /**
   * <pre>
   * Optionally, a quadratic objective.
   * As of 2019/06, only SCIP and Gurobi support quadratic objectives.
   * </pre>
   *
   * <code>optional .operations_research.MPQuadraticObjective quadratic_objective = 8;</code>
   * @return The quadraticObjective.
   */
  com.google.ortools.linearsolver.MPQuadraticObjective getQuadraticObjective();
  /**
   * <pre>
   * Optionally, a quadratic objective.
   * As of 2019/06, only SCIP and Gurobi support quadratic objectives.
   * </pre>
   *
   * <code>optional .operations_research.MPQuadraticObjective quadratic_objective = 8;</code>
   */
  com.google.ortools.linearsolver.MPQuadraticObjectiveOrBuilder getQuadraticObjectiveOrBuilder();

  /**
   * <pre>
   * Name of the model.
   * </pre>
   *
   * <code>optional string name = 5 [default = ""];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Name of the model.
   * </pre>
   *
   * <code>optional string name = 5 [default = ""];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the model.
   * </pre>
   *
   * <code>optional string name = 5 [default = ""];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Solution hint.
   * If a feasible or almost-feasible solution to the problem is already known,
   * it may be helpful to pass it to the solver so that it can be used. A solver
   * that supports this feature will try to use this information to create its
   * initial feasible solution.
   * Note that it may not always be faster to give a hint like this to the
   * solver. There is also no guarantee that the solver will use this hint or
   * try to return a solution "close" to this assignment in case of multiple
   * optimal solutions.
   * </pre>
   *
   * <code>optional .operations_research.PartialVariableAssignment solution_hint = 6;</code>
   * @return Whether the solutionHint field is set.
   */
  boolean hasSolutionHint();
  /**
   * <pre>
   * Solution hint.
   * If a feasible or almost-feasible solution to the problem is already known,
   * it may be helpful to pass it to the solver so that it can be used. A solver
   * that supports this feature will try to use this information to create its
   * initial feasible solution.
   * Note that it may not always be faster to give a hint like this to the
   * solver. There is also no guarantee that the solver will use this hint or
   * try to return a solution "close" to this assignment in case of multiple
   * optimal solutions.
   * </pre>
   *
   * <code>optional .operations_research.PartialVariableAssignment solution_hint = 6;</code>
   * @return The solutionHint.
   */
  com.google.ortools.linearsolver.PartialVariableAssignment getSolutionHint();
  /**
   * <pre>
   * Solution hint.
   * If a feasible or almost-feasible solution to the problem is already known,
   * it may be helpful to pass it to the solver so that it can be used. A solver
   * that supports this feature will try to use this information to create its
   * initial feasible solution.
   * Note that it may not always be faster to give a hint like this to the
   * solver. There is also no guarantee that the solver will use this hint or
   * try to return a solution "close" to this assignment in case of multiple
   * optimal solutions.
   * </pre>
   *
   * <code>optional .operations_research.PartialVariableAssignment solution_hint = 6;</code>
   */
  com.google.ortools.linearsolver.PartialVariableAssignmentOrBuilder getSolutionHintOrBuilder();
}
