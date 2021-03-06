// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ortools/sat/cp_model.proto

package com.google.ortools.sat;

public interface NoOverlap2DConstraintProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:operations_research.sat.NoOverlap2DConstraintProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated int32 x_intervals = 1;</code>
   * @return A list containing the xIntervals.
   */
  java.util.List<java.lang.Integer> getXIntervalsList();
  /**
   * <code>repeated int32 x_intervals = 1;</code>
   * @return The count of xIntervals.
   */
  int getXIntervalsCount();
  /**
   * <code>repeated int32 x_intervals = 1;</code>
   * @param index The index of the element to return.
   * @return The xIntervals at the given index.
   */
  int getXIntervals(int index);

  /**
   * <pre>
   * Same size as x_intervals.
   * </pre>
   *
   * <code>repeated int32 y_intervals = 2;</code>
   * @return A list containing the yIntervals.
   */
  java.util.List<java.lang.Integer> getYIntervalsList();
  /**
   * <pre>
   * Same size as x_intervals.
   * </pre>
   *
   * <code>repeated int32 y_intervals = 2;</code>
   * @return The count of yIntervals.
   */
  int getYIntervalsCount();
  /**
   * <pre>
   * Same size as x_intervals.
   * </pre>
   *
   * <code>repeated int32 y_intervals = 2;</code>
   * @param index The index of the element to return.
   * @return The yIntervals at the given index.
   */
  int getYIntervals(int index);

  /**
   * <code>bool boxes_with_null_area_can_overlap = 3;</code>
   * @return The boxesWithNullAreaCanOverlap.
   */
  boolean getBoxesWithNullAreaCanOverlap();
}
