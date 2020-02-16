// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ortools/linear_solver/linear_solver.proto

package com.google.ortools.linearsolver;

public interface MPAbsConstraintOrBuilder extends
    // @@protoc_insertion_point(interface_extends:operations_research.MPAbsConstraint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Variable indices are relative to the "variable" field in MPModelProto.
   * resultant_var = abs(var)
   * </pre>
   *
   * <code>optional int32 var_index = 1;</code>
   * @return Whether the varIndex field is set.
   */
  boolean hasVarIndex();
  /**
   * <pre>
   * Variable indices are relative to the "variable" field in MPModelProto.
   * resultant_var = abs(var)
   * </pre>
   *
   * <code>optional int32 var_index = 1;</code>
   * @return The varIndex.
   */
  int getVarIndex();

  /**
   * <code>optional int32 resultant_var_index = 2;</code>
   * @return Whether the resultantVarIndex field is set.
   */
  boolean hasResultantVarIndex();
  /**
   * <code>optional int32 resultant_var_index = 2;</code>
   * @return The resultantVarIndex.
   */
  int getResultantVarIndex();
}