// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ortools/linear_solver/linear_solver.proto

package com.google.ortools.linearsolver;

/**
 * <pre>
 * A variable is always constrained in the form:
 *    lower_bound &lt;= x &lt;= upper_bound
 * where lower_bound and upper_bound:
 * - Can form a singleton: x = constant = lower_bound = upper_bound.
 * - Can form a finite interval: lower_bound &lt;= x &lt;= upper_bound. (x is boxed.)
 * - Can form a semi-infinite interval.
 *     - lower_bound = -infinity: x &lt;= upper_bound.
 *     - upper_bound = +infinity: x &gt;= lower_bound.
 * - Can form the infinite interval: lower_bound = -infinity and
 *   upper_bound = +infinity, x is free.
 * MPVariableProto furthermore stores:
 *  - The coefficient of the variable in the objective.
 *  - Whether the variable is integer.
 * </pre>
 *
 * Protobuf type {@code operations_research.MPVariableProto}
 */
public  final class MPVariableProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:operations_research.MPVariableProto)
    MPVariableProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MPVariableProto.newBuilder() to construct.
  private MPVariableProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MPVariableProto() {
    lowerBound_ = Double.NEGATIVE_INFINITY;
    upperBound_ = Double.POSITIVE_INFINITY;
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MPVariableProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MPVariableProto(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 9: {
            bitField0_ |= 0x00000001;
            lowerBound_ = input.readDouble();
            break;
          }
          case 17: {
            bitField0_ |= 0x00000002;
            upperBound_ = input.readDouble();
            break;
          }
          case 25: {
            bitField0_ |= 0x00000004;
            objectiveCoefficient_ = input.readDouble();
            break;
          }
          case 32: {
            bitField0_ |= 0x00000008;
            isInteger_ = input.readBool();
            break;
          }
          case 42: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000010;
            name_ = bs;
            break;
          }
          case 48: {
            bitField0_ |= 0x00000020;
            branchingPriority_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ortools.linearsolver.LinearSolver.internal_static_operations_research_MPVariableProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ortools.linearsolver.LinearSolver.internal_static_operations_research_MPVariableProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ortools.linearsolver.MPVariableProto.class, com.google.ortools.linearsolver.MPVariableProto.Builder.class);
  }

  private int bitField0_;
  public static final int LOWER_BOUND_FIELD_NUMBER = 1;
  private double lowerBound_;
  /**
   * <pre>
   * lower_bound must be &lt;= upper_bound.
   * </pre>
   *
   * <code>optional double lower_bound = 1 [default = -inf];</code>
   * @return Whether the lowerBound field is set.
   */
  public boolean hasLowerBound() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * lower_bound must be &lt;= upper_bound.
   * </pre>
   *
   * <code>optional double lower_bound = 1 [default = -inf];</code>
   * @return The lowerBound.
   */
  public double getLowerBound() {
    return lowerBound_;
  }

  public static final int UPPER_BOUND_FIELD_NUMBER = 2;
  private double upperBound_;
  /**
   * <code>optional double upper_bound = 2 [default = inf];</code>
   * @return Whether the upperBound field is set.
   */
  public boolean hasUpperBound() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional double upper_bound = 2 [default = inf];</code>
   * @return The upperBound.
   */
  public double getUpperBound() {
    return upperBound_;
  }

  public static final int OBJECTIVE_COEFFICIENT_FIELD_NUMBER = 3;
  private double objectiveCoefficient_;
  /**
   * <pre>
   * The coefficient of the variable in the objective. Must be finite.
   * </pre>
   *
   * <code>optional double objective_coefficient = 3 [default = 0];</code>
   * @return Whether the objectiveCoefficient field is set.
   */
  public boolean hasObjectiveCoefficient() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * The coefficient of the variable in the objective. Must be finite.
   * </pre>
   *
   * <code>optional double objective_coefficient = 3 [default = 0];</code>
   * @return The objectiveCoefficient.
   */
  public double getObjectiveCoefficient() {
    return objectiveCoefficient_;
  }

  public static final int IS_INTEGER_FIELD_NUMBER = 4;
  private boolean isInteger_;
  /**
   * <pre>
   * True if the variable is constrained to be integer.
   * Ignored if MPModelProto::solver_type is *LINEAR_PROGRAMMING*.
   * </pre>
   *
   * <code>optional bool is_integer = 4 [default = false];</code>
   * @return Whether the isInteger field is set.
   */
  public boolean hasIsInteger() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * True if the variable is constrained to be integer.
   * Ignored if MPModelProto::solver_type is *LINEAR_PROGRAMMING*.
   * </pre>
   *
   * <code>optional bool is_integer = 4 [default = false];</code>
   * @return The isInteger.
   */
  public boolean getIsInteger() {
    return isInteger_;
  }

  public static final int NAME_FIELD_NUMBER = 5;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The name of the variable.
   * </pre>
   *
   * <code>optional string name = 5 [default = ""];</code>
   * @return Whether the name field is set.
   */
  public boolean hasName() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   * <pre>
   * The name of the variable.
   * </pre>
   *
   * <code>optional string name = 5 [default = ""];</code>
   * @return The name.
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        name_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * The name of the variable.
   * </pre>
   *
   * <code>optional string name = 5 [default = ""];</code>
   * @return The bytes for name.
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BRANCHING_PRIORITY_FIELD_NUMBER = 6;
  private int branchingPriority_;
  /**
   * <code>optional int32 branching_priority = 6 [default = 0];</code>
   * @return Whether the branchingPriority field is set.
   */
  public boolean hasBranchingPriority() {
    return ((bitField0_ & 0x00000020) != 0);
  }
  /**
   * <code>optional int32 branching_priority = 6 [default = 0];</code>
   * @return The branchingPriority.
   */
  public int getBranchingPriority() {
    return branchingPriority_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeDouble(1, lowerBound_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeDouble(2, upperBound_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeDouble(3, objectiveCoefficient_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeBool(4, isInteger_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, name_);
    }
    if (((bitField0_ & 0x00000020) != 0)) {
      output.writeInt32(6, branchingPriority_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, lowerBound_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, upperBound_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, objectiveCoefficient_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, isInteger_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, name_);
    }
    if (((bitField0_ & 0x00000020) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, branchingPriority_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ortools.linearsolver.MPVariableProto)) {
      return super.equals(obj);
    }
    com.google.ortools.linearsolver.MPVariableProto other = (com.google.ortools.linearsolver.MPVariableProto) obj;

    if (hasLowerBound() != other.hasLowerBound()) return false;
    if (hasLowerBound()) {
      if (java.lang.Double.doubleToLongBits(getLowerBound())
          != java.lang.Double.doubleToLongBits(
              other.getLowerBound())) return false;
    }
    if (hasUpperBound() != other.hasUpperBound()) return false;
    if (hasUpperBound()) {
      if (java.lang.Double.doubleToLongBits(getUpperBound())
          != java.lang.Double.doubleToLongBits(
              other.getUpperBound())) return false;
    }
    if (hasObjectiveCoefficient() != other.hasObjectiveCoefficient()) return false;
    if (hasObjectiveCoefficient()) {
      if (java.lang.Double.doubleToLongBits(getObjectiveCoefficient())
          != java.lang.Double.doubleToLongBits(
              other.getObjectiveCoefficient())) return false;
    }
    if (hasIsInteger() != other.hasIsInteger()) return false;
    if (hasIsInteger()) {
      if (getIsInteger()
          != other.getIsInteger()) return false;
    }
    if (hasName() != other.hasName()) return false;
    if (hasName()) {
      if (!getName()
          .equals(other.getName())) return false;
    }
    if (hasBranchingPriority() != other.hasBranchingPriority()) return false;
    if (hasBranchingPriority()) {
      if (getBranchingPriority()
          != other.getBranchingPriority()) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasLowerBound()) {
      hash = (37 * hash) + LOWER_BOUND_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getLowerBound()));
    }
    if (hasUpperBound()) {
      hash = (37 * hash) + UPPER_BOUND_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getUpperBound()));
    }
    if (hasObjectiveCoefficient()) {
      hash = (37 * hash) + OBJECTIVE_COEFFICIENT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getObjectiveCoefficient()));
    }
    if (hasIsInteger()) {
      hash = (37 * hash) + IS_INTEGER_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsInteger());
    }
    if (hasName()) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
    }
    if (hasBranchingPriority()) {
      hash = (37 * hash) + BRANCHING_PRIORITY_FIELD_NUMBER;
      hash = (53 * hash) + getBranchingPriority();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ortools.linearsolver.MPVariableProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ortools.linearsolver.MPVariableProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ortools.linearsolver.MPVariableProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ortools.linearsolver.MPVariableProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ortools.linearsolver.MPVariableProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ortools.linearsolver.MPVariableProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ortools.linearsolver.MPVariableProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ortools.linearsolver.MPVariableProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ortools.linearsolver.MPVariableProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ortools.linearsolver.MPVariableProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ortools.linearsolver.MPVariableProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ortools.linearsolver.MPVariableProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ortools.linearsolver.MPVariableProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A variable is always constrained in the form:
   *    lower_bound &lt;= x &lt;= upper_bound
   * where lower_bound and upper_bound:
   * - Can form a singleton: x = constant = lower_bound = upper_bound.
   * - Can form a finite interval: lower_bound &lt;= x &lt;= upper_bound. (x is boxed.)
   * - Can form a semi-infinite interval.
   *     - lower_bound = -infinity: x &lt;= upper_bound.
   *     - upper_bound = +infinity: x &gt;= lower_bound.
   * - Can form the infinite interval: lower_bound = -infinity and
   *   upper_bound = +infinity, x is free.
   * MPVariableProto furthermore stores:
   *  - The coefficient of the variable in the objective.
   *  - Whether the variable is integer.
   * </pre>
   *
   * Protobuf type {@code operations_research.MPVariableProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:operations_research.MPVariableProto)
      com.google.ortools.linearsolver.MPVariableProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ortools.linearsolver.LinearSolver.internal_static_operations_research_MPVariableProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ortools.linearsolver.LinearSolver.internal_static_operations_research_MPVariableProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ortools.linearsolver.MPVariableProto.class, com.google.ortools.linearsolver.MPVariableProto.Builder.class);
    }

    // Construct using com.google.ortools.linearsolver.MPVariableProto.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      lowerBound_ = Double.NEGATIVE_INFINITY;
      bitField0_ = (bitField0_ & ~0x00000001);
      upperBound_ = Double.POSITIVE_INFINITY;
      bitField0_ = (bitField0_ & ~0x00000002);
      objectiveCoefficient_ = 0D;
      bitField0_ = (bitField0_ & ~0x00000004);
      isInteger_ = false;
      bitField0_ = (bitField0_ & ~0x00000008);
      name_ = "";
      bitField0_ = (bitField0_ & ~0x00000010);
      branchingPriority_ = 0;
      bitField0_ = (bitField0_ & ~0x00000020);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ortools.linearsolver.LinearSolver.internal_static_operations_research_MPVariableProto_descriptor;
    }

    @java.lang.Override
    public com.google.ortools.linearsolver.MPVariableProto getDefaultInstanceForType() {
      return com.google.ortools.linearsolver.MPVariableProto.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ortools.linearsolver.MPVariableProto build() {
      com.google.ortools.linearsolver.MPVariableProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ortools.linearsolver.MPVariableProto buildPartial() {
      com.google.ortools.linearsolver.MPVariableProto result = new com.google.ortools.linearsolver.MPVariableProto(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.lowerBound_ = lowerBound_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.upperBound_ = upperBound_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.objectiveCoefficient_ = objectiveCoefficient_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.isInteger_ = isInteger_;
        to_bitField0_ |= 0x00000008;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        to_bitField0_ |= 0x00000010;
      }
      result.name_ = name_;
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.branchingPriority_ = branchingPriority_;
        to_bitField0_ |= 0x00000020;
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ortools.linearsolver.MPVariableProto) {
        return mergeFrom((com.google.ortools.linearsolver.MPVariableProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ortools.linearsolver.MPVariableProto other) {
      if (other == com.google.ortools.linearsolver.MPVariableProto.getDefaultInstance()) return this;
      if (other.hasLowerBound()) {
        setLowerBound(other.getLowerBound());
      }
      if (other.hasUpperBound()) {
        setUpperBound(other.getUpperBound());
      }
      if (other.hasObjectiveCoefficient()) {
        setObjectiveCoefficient(other.getObjectiveCoefficient());
      }
      if (other.hasIsInteger()) {
        setIsInteger(other.getIsInteger());
      }
      if (other.hasName()) {
        bitField0_ |= 0x00000010;
        name_ = other.name_;
        onChanged();
      }
      if (other.hasBranchingPriority()) {
        setBranchingPriority(other.getBranchingPriority());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.ortools.linearsolver.MPVariableProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ortools.linearsolver.MPVariableProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private double lowerBound_ = Double.NEGATIVE_INFINITY;
    /**
     * <pre>
     * lower_bound must be &lt;= upper_bound.
     * </pre>
     *
     * <code>optional double lower_bound = 1 [default = -inf];</code>
     * @return Whether the lowerBound field is set.
     */
    public boolean hasLowerBound() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * lower_bound must be &lt;= upper_bound.
     * </pre>
     *
     * <code>optional double lower_bound = 1 [default = -inf];</code>
     * @return The lowerBound.
     */
    public double getLowerBound() {
      return lowerBound_;
    }
    /**
     * <pre>
     * lower_bound must be &lt;= upper_bound.
     * </pre>
     *
     * <code>optional double lower_bound = 1 [default = -inf];</code>
     * @param value The lowerBound to set.
     * @return This builder for chaining.
     */
    public Builder setLowerBound(double value) {
      bitField0_ |= 0x00000001;
      lowerBound_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * lower_bound must be &lt;= upper_bound.
     * </pre>
     *
     * <code>optional double lower_bound = 1 [default = -inf];</code>
     * @return This builder for chaining.
     */
    public Builder clearLowerBound() {
      bitField0_ = (bitField0_ & ~0x00000001);
      lowerBound_ = Double.NEGATIVE_INFINITY;
      onChanged();
      return this;
    }

    private double upperBound_ = Double.POSITIVE_INFINITY;
    /**
     * <code>optional double upper_bound = 2 [default = inf];</code>
     * @return Whether the upperBound field is set.
     */
    public boolean hasUpperBound() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional double upper_bound = 2 [default = inf];</code>
     * @return The upperBound.
     */
    public double getUpperBound() {
      return upperBound_;
    }
    /**
     * <code>optional double upper_bound = 2 [default = inf];</code>
     * @param value The upperBound to set.
     * @return This builder for chaining.
     */
    public Builder setUpperBound(double value) {
      bitField0_ |= 0x00000002;
      upperBound_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional double upper_bound = 2 [default = inf];</code>
     * @return This builder for chaining.
     */
    public Builder clearUpperBound() {
      bitField0_ = (bitField0_ & ~0x00000002);
      upperBound_ = Double.POSITIVE_INFINITY;
      onChanged();
      return this;
    }

    private double objectiveCoefficient_ ;
    /**
     * <pre>
     * The coefficient of the variable in the objective. Must be finite.
     * </pre>
     *
     * <code>optional double objective_coefficient = 3 [default = 0];</code>
     * @return Whether the objectiveCoefficient field is set.
     */
    public boolean hasObjectiveCoefficient() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The coefficient of the variable in the objective. Must be finite.
     * </pre>
     *
     * <code>optional double objective_coefficient = 3 [default = 0];</code>
     * @return The objectiveCoefficient.
     */
    public double getObjectiveCoefficient() {
      return objectiveCoefficient_;
    }
    /**
     * <pre>
     * The coefficient of the variable in the objective. Must be finite.
     * </pre>
     *
     * <code>optional double objective_coefficient = 3 [default = 0];</code>
     * @param value The objectiveCoefficient to set.
     * @return This builder for chaining.
     */
    public Builder setObjectiveCoefficient(double value) {
      bitField0_ |= 0x00000004;
      objectiveCoefficient_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The coefficient of the variable in the objective. Must be finite.
     * </pre>
     *
     * <code>optional double objective_coefficient = 3 [default = 0];</code>
     * @return This builder for chaining.
     */
    public Builder clearObjectiveCoefficient() {
      bitField0_ = (bitField0_ & ~0x00000004);
      objectiveCoefficient_ = 0D;
      onChanged();
      return this;
    }

    private boolean isInteger_ ;
    /**
     * <pre>
     * True if the variable is constrained to be integer.
     * Ignored if MPModelProto::solver_type is *LINEAR_PROGRAMMING*.
     * </pre>
     *
     * <code>optional bool is_integer = 4 [default = false];</code>
     * @return Whether the isInteger field is set.
     */
    public boolean hasIsInteger() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * True if the variable is constrained to be integer.
     * Ignored if MPModelProto::solver_type is *LINEAR_PROGRAMMING*.
     * </pre>
     *
     * <code>optional bool is_integer = 4 [default = false];</code>
     * @return The isInteger.
     */
    public boolean getIsInteger() {
      return isInteger_;
    }
    /**
     * <pre>
     * True if the variable is constrained to be integer.
     * Ignored if MPModelProto::solver_type is *LINEAR_PROGRAMMING*.
     * </pre>
     *
     * <code>optional bool is_integer = 4 [default = false];</code>
     * @param value The isInteger to set.
     * @return This builder for chaining.
     */
    public Builder setIsInteger(boolean value) {
      bitField0_ |= 0x00000008;
      isInteger_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * True if the variable is constrained to be integer.
     * Ignored if MPModelProto::solver_type is *LINEAR_PROGRAMMING*.
     * </pre>
     *
     * <code>optional bool is_integer = 4 [default = false];</code>
     * @return This builder for chaining.
     */
    public Builder clearIsInteger() {
      bitField0_ = (bitField0_ & ~0x00000008);
      isInteger_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The name of the variable.
     * </pre>
     *
     * <code>optional string name = 5 [default = ""];</code>
     * @return Whether the name field is set.
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * The name of the variable.
     * </pre>
     *
     * <code>optional string name = 5 [default = ""];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the variable.
     * </pre>
     *
     * <code>optional string name = 5 [default = ""];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the variable.
     * </pre>
     *
     * <code>optional string name = 5 [default = ""];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the variable.
     * </pre>
     *
     * <code>optional string name = 5 [default = ""];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      bitField0_ = (bitField0_ & ~0x00000010);
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the variable.
     * </pre>
     *
     * <code>optional string name = 5 [default = ""];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
      name_ = value;
      onChanged();
      return this;
    }

    private int branchingPriority_ ;
    /**
     * <code>optional int32 branching_priority = 6 [default = 0];</code>
     * @return Whether the branchingPriority field is set.
     */
    public boolean hasBranchingPriority() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <code>optional int32 branching_priority = 6 [default = 0];</code>
     * @return The branchingPriority.
     */
    public int getBranchingPriority() {
      return branchingPriority_;
    }
    /**
     * <code>optional int32 branching_priority = 6 [default = 0];</code>
     * @param value The branchingPriority to set.
     * @return This builder for chaining.
     */
    public Builder setBranchingPriority(int value) {
      bitField0_ |= 0x00000020;
      branchingPriority_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 branching_priority = 6 [default = 0];</code>
     * @return This builder for chaining.
     */
    public Builder clearBranchingPriority() {
      bitField0_ = (bitField0_ & ~0x00000020);
      branchingPriority_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:operations_research.MPVariableProto)
  }

  // @@protoc_insertion_point(class_scope:operations_research.MPVariableProto)
  private static final com.google.ortools.linearsolver.MPVariableProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ortools.linearsolver.MPVariableProto();
  }

  public static com.google.ortools.linearsolver.MPVariableProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<MPVariableProto>
      PARSER = new com.google.protobuf.AbstractParser<MPVariableProto>() {
    @java.lang.Override
    public MPVariableProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MPVariableProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MPVariableProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MPVariableProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ortools.linearsolver.MPVariableProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

