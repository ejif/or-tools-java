// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ortools/sat/cp_model.proto

package com.google.ortools.sat;

public interface DecisionStrategyProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:operations_research.sat.DecisionStrategyProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The variables to be considered for the next decision. The order matter and
   * is always used as a tie-breaker after the variable selection strategy
   * criteria defined below.
   * </pre>
   *
   * <code>repeated int32 variables = 1;</code>
   * @return A list containing the variables.
   */
  java.util.List<java.lang.Integer> getVariablesList();
  /**
   * <pre>
   * The variables to be considered for the next decision. The order matter and
   * is always used as a tie-breaker after the variable selection strategy
   * criteria defined below.
   * </pre>
   *
   * <code>repeated int32 variables = 1;</code>
   * @return The count of variables.
   */
  int getVariablesCount();
  /**
   * <pre>
   * The variables to be considered for the next decision. The order matter and
   * is always used as a tie-breaker after the variable selection strategy
   * criteria defined below.
   * </pre>
   *
   * <code>repeated int32 variables = 1;</code>
   * @param index The index of the element to return.
   * @return The variables at the given index.
   */
  int getVariables(int index);

  /**
   * <code>.operations_research.sat.DecisionStrategyProto.VariableSelectionStrategy variable_selection_strategy = 2;</code>
   * @return The enum numeric value on the wire for variableSelectionStrategy.
   */
  int getVariableSelectionStrategyValue();
  /**
   * <code>.operations_research.sat.DecisionStrategyProto.VariableSelectionStrategy variable_selection_strategy = 2;</code>
   * @return The variableSelectionStrategy.
   */
  com.google.ortools.sat.DecisionStrategyProto.VariableSelectionStrategy getVariableSelectionStrategy();

  /**
   * <code>.operations_research.sat.DecisionStrategyProto.DomainReductionStrategy domain_reduction_strategy = 3;</code>
   * @return The enum numeric value on the wire for domainReductionStrategy.
   */
  int getDomainReductionStrategyValue();
  /**
   * <code>.operations_research.sat.DecisionStrategyProto.DomainReductionStrategy domain_reduction_strategy = 3;</code>
   * @return The domainReductionStrategy.
   */
  com.google.ortools.sat.DecisionStrategyProto.DomainReductionStrategy getDomainReductionStrategy();

  /**
   * <code>repeated .operations_research.sat.DecisionStrategyProto.AffineTransformation transformations = 4;</code>
   */
  java.util.List<com.google.ortools.sat.DecisionStrategyProto.AffineTransformation> 
      getTransformationsList();
  /**
   * <code>repeated .operations_research.sat.DecisionStrategyProto.AffineTransformation transformations = 4;</code>
   */
  com.google.ortools.sat.DecisionStrategyProto.AffineTransformation getTransformations(int index);
  /**
   * <code>repeated .operations_research.sat.DecisionStrategyProto.AffineTransformation transformations = 4;</code>
   */
  int getTransformationsCount();
  /**
   * <code>repeated .operations_research.sat.DecisionStrategyProto.AffineTransformation transformations = 4;</code>
   */
  java.util.List<? extends com.google.ortools.sat.DecisionStrategyProto.AffineTransformationOrBuilder> 
      getTransformationsOrBuilderList();
  /**
   * <code>repeated .operations_research.sat.DecisionStrategyProto.AffineTransformation transformations = 4;</code>
   */
  com.google.ortools.sat.DecisionStrategyProto.AffineTransformationOrBuilder getTransformationsOrBuilder(
      int index);
}
