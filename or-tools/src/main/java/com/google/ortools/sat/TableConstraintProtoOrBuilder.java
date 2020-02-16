// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ortools/sat/cp_model.proto

package com.google.ortools.sat;

public interface TableConstraintProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:operations_research.sat.TableConstraintProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated int32 vars = 1;</code>
   * @return A list containing the vars.
   */
  java.util.List<java.lang.Integer> getVarsList();
  /**
   * <code>repeated int32 vars = 1;</code>
   * @return The count of vars.
   */
  int getVarsCount();
  /**
   * <code>repeated int32 vars = 1;</code>
   * @param index The index of the element to return.
   * @return The vars at the given index.
   */
  int getVars(int index);

  /**
   * <code>repeated int64 values = 2;</code>
   * @return A list containing the values.
   */
  java.util.List<java.lang.Long> getValuesList();
  /**
   * <code>repeated int64 values = 2;</code>
   * @return The count of values.
   */
  int getValuesCount();
  /**
   * <code>repeated int64 values = 2;</code>
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  long getValues(int index);

  /**
   * <pre>
   * If true, the meaning is "negated", that is we forbid any of the given
   * tuple from a feasible assignment.
   * </pre>
   *
   * <code>bool negated = 3;</code>
   * @return The negated.
   */
  boolean getNegated();
}