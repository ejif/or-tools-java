// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ortools/sat/cp_model.proto

package com.google.ortools.sat;

/**
 * <pre>
 * The status returned by a solver trying to solve a CpModelProto.
 * </pre>
 *
 * Protobuf enum {@code operations_research.sat.CpSolverStatus}
 */
public enum CpSolverStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * The status of the model is still unknown. A search limit has been reached
   * before any of the statuses below could be determined.
   * </pre>
   *
   * <code>UNKNOWN = 0;</code>
   */
  UNKNOWN(0),
  /**
   * <pre>
   * The given CpModelProto didn't pass the validation step. You can get a
   * detailed error by calling ValidateCpModel(model_proto).
   * </pre>
   *
   * <code>MODEL_INVALID = 1;</code>
   */
  MODEL_INVALID(1),
  /**
   * <pre>
   * A feasible solution as been found. For an optimization problem, we still
   * don't know if it is the optimal one though.
   * </pre>
   *
   * <code>FEASIBLE = 2;</code>
   */
  FEASIBLE(2),
  /**
   * <pre>
   * The problem has been proven infeasible.
   * </pre>
   *
   * <code>INFEASIBLE = 3;</code>
   */
  INFEASIBLE(3),
  /**
   * <pre>
   * An optimal feasible solution has been found. This is also used to indicate
   * that all solutions where found if this was asked for a satisfiability
   * problem.
   * </pre>
   *
   * <code>OPTIMAL = 4;</code>
   */
  OPTIMAL(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * The status of the model is still unknown. A search limit has been reached
   * before any of the statuses below could be determined.
   * </pre>
   *
   * <code>UNKNOWN = 0;</code>
   */
  public static final int UNKNOWN_VALUE = 0;
  /**
   * <pre>
   * The given CpModelProto didn't pass the validation step. You can get a
   * detailed error by calling ValidateCpModel(model_proto).
   * </pre>
   *
   * <code>MODEL_INVALID = 1;</code>
   */
  public static final int MODEL_INVALID_VALUE = 1;
  /**
   * <pre>
   * A feasible solution as been found. For an optimization problem, we still
   * don't know if it is the optimal one though.
   * </pre>
   *
   * <code>FEASIBLE = 2;</code>
   */
  public static final int FEASIBLE_VALUE = 2;
  /**
   * <pre>
   * The problem has been proven infeasible.
   * </pre>
   *
   * <code>INFEASIBLE = 3;</code>
   */
  public static final int INFEASIBLE_VALUE = 3;
  /**
   * <pre>
   * An optimal feasible solution has been found. This is also used to indicate
   * that all solutions where found if this was asked for a satisfiability
   * problem.
   * </pre>
   *
   * <code>OPTIMAL = 4;</code>
   */
  public static final int OPTIMAL_VALUE = 4;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static CpSolverStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CpSolverStatus forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN;
      case 1: return MODEL_INVALID;
      case 2: return FEASIBLE;
      case 3: return INFEASIBLE;
      case 4: return OPTIMAL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CpSolverStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CpSolverStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CpSolverStatus>() {
          public CpSolverStatus findValueByNumber(int number) {
            return CpSolverStatus.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.ortools.sat.CpModelProtobuf.getDescriptor().getEnumTypes().get(0);
  }

  private static final CpSolverStatus[] VALUES = values();

  public static CpSolverStatus valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private CpSolverStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:operations_research.sat.CpSolverStatus)
}

