// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ortools/sat/cp_model.proto

package com.google.ortools.sat;

/**
 * Protobuf type {@code operations_research.sat.LinearExpressionProto}
 */
public  final class LinearExpressionProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:operations_research.sat.LinearExpressionProto)
    LinearExpressionProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LinearExpressionProto.newBuilder() to construct.
  private LinearExpressionProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LinearExpressionProto() {
    vars_ = emptyIntList();
    coeffs_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LinearExpressionProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LinearExpressionProto(
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
          case 8: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              vars_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            vars_.addInt(input.readInt32());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              vars_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              vars_.addInt(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              coeffs_ = newIntList();
              mutable_bitField0_ |= 0x00000002;
            }
            coeffs_.addInt(input.readInt32());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
              coeffs_ = newIntList();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              coeffs_.addInt(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 24: {

            offset_ = input.readInt64();
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        vars_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        coeffs_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ortools.sat.CpModelProtobuf.internal_static_operations_research_sat_LinearExpressionProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ortools.sat.CpModelProtobuf.internal_static_operations_research_sat_LinearExpressionProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ortools.sat.LinearExpressionProto.class, com.google.ortools.sat.LinearExpressionProto.Builder.class);
  }

  public static final int VARS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.IntList vars_;
  /**
   * <code>repeated int32 vars = 1;</code>
   * @return A list containing the vars.
   */
  public java.util.List<java.lang.Integer>
      getVarsList() {
    return vars_;
  }
  /**
   * <code>repeated int32 vars = 1;</code>
   * @return The count of vars.
   */
  public int getVarsCount() {
    return vars_.size();
  }
  /**
   * <code>repeated int32 vars = 1;</code>
   * @param index The index of the element to return.
   * @return The vars at the given index.
   */
  public int getVars(int index) {
    return vars_.getInt(index);
  }
  private int varsMemoizedSerializedSize = -1;

  public static final int COEFFS_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.IntList coeffs_;
  /**
   * <code>repeated int32 coeffs = 2;</code>
   * @return A list containing the coeffs.
   */
  public java.util.List<java.lang.Integer>
      getCoeffsList() {
    return coeffs_;
  }
  /**
   * <code>repeated int32 coeffs = 2;</code>
   * @return The count of coeffs.
   */
  public int getCoeffsCount() {
    return coeffs_.size();
  }
  /**
   * <code>repeated int32 coeffs = 2;</code>
   * @param index The index of the element to return.
   * @return The coeffs at the given index.
   */
  public int getCoeffs(int index) {
    return coeffs_.getInt(index);
  }
  private int coeffsMemoizedSerializedSize = -1;

  public static final int OFFSET_FIELD_NUMBER = 3;
  private long offset_;
  /**
   * <code>int64 offset = 3;</code>
   * @return The offset.
   */
  public long getOffset() {
    return offset_;
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
    getSerializedSize();
    if (getVarsList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(varsMemoizedSerializedSize);
    }
    for (int i = 0; i < vars_.size(); i++) {
      output.writeInt32NoTag(vars_.getInt(i));
    }
    if (getCoeffsList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(coeffsMemoizedSerializedSize);
    }
    for (int i = 0; i < coeffs_.size(); i++) {
      output.writeInt32NoTag(coeffs_.getInt(i));
    }
    if (offset_ != 0L) {
      output.writeInt64(3, offset_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < vars_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(vars_.getInt(i));
      }
      size += dataSize;
      if (!getVarsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      varsMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      for (int i = 0; i < coeffs_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(coeffs_.getInt(i));
      }
      size += dataSize;
      if (!getCoeffsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      coeffsMemoizedSerializedSize = dataSize;
    }
    if (offset_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, offset_);
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
    if (!(obj instanceof com.google.ortools.sat.LinearExpressionProto)) {
      return super.equals(obj);
    }
    com.google.ortools.sat.LinearExpressionProto other = (com.google.ortools.sat.LinearExpressionProto) obj;

    if (!getVarsList()
        .equals(other.getVarsList())) return false;
    if (!getCoeffsList()
        .equals(other.getCoeffsList())) return false;
    if (getOffset()
        != other.getOffset()) return false;
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
    if (getVarsCount() > 0) {
      hash = (37 * hash) + VARS_FIELD_NUMBER;
      hash = (53 * hash) + getVarsList().hashCode();
    }
    if (getCoeffsCount() > 0) {
      hash = (37 * hash) + COEFFS_FIELD_NUMBER;
      hash = (53 * hash) + getCoeffsList().hashCode();
    }
    hash = (37 * hash) + OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOffset());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ortools.sat.LinearExpressionProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ortools.sat.LinearExpressionProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ortools.sat.LinearExpressionProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ortools.sat.LinearExpressionProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ortools.sat.LinearExpressionProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ortools.sat.LinearExpressionProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ortools.sat.LinearExpressionProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ortools.sat.LinearExpressionProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ortools.sat.LinearExpressionProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ortools.sat.LinearExpressionProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ortools.sat.LinearExpressionProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ortools.sat.LinearExpressionProto parseFrom(
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
  public static Builder newBuilder(com.google.ortools.sat.LinearExpressionProto prototype) {
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
   * Protobuf type {@code operations_research.sat.LinearExpressionProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:operations_research.sat.LinearExpressionProto)
      com.google.ortools.sat.LinearExpressionProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ortools.sat.CpModelProtobuf.internal_static_operations_research_sat_LinearExpressionProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ortools.sat.CpModelProtobuf.internal_static_operations_research_sat_LinearExpressionProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ortools.sat.LinearExpressionProto.class, com.google.ortools.sat.LinearExpressionProto.Builder.class);
    }

    // Construct using com.google.ortools.sat.LinearExpressionProto.newBuilder()
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
      vars_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      coeffs_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
      offset_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ortools.sat.CpModelProtobuf.internal_static_operations_research_sat_LinearExpressionProto_descriptor;
    }

    @java.lang.Override
    public com.google.ortools.sat.LinearExpressionProto getDefaultInstanceForType() {
      return com.google.ortools.sat.LinearExpressionProto.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ortools.sat.LinearExpressionProto build() {
      com.google.ortools.sat.LinearExpressionProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ortools.sat.LinearExpressionProto buildPartial() {
      com.google.ortools.sat.LinearExpressionProto result = new com.google.ortools.sat.LinearExpressionProto(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        vars_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.vars_ = vars_;
      if (((bitField0_ & 0x00000002) != 0)) {
        coeffs_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.coeffs_ = coeffs_;
      result.offset_ = offset_;
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
      if (other instanceof com.google.ortools.sat.LinearExpressionProto) {
        return mergeFrom((com.google.ortools.sat.LinearExpressionProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ortools.sat.LinearExpressionProto other) {
      if (other == com.google.ortools.sat.LinearExpressionProto.getDefaultInstance()) return this;
      if (!other.vars_.isEmpty()) {
        if (vars_.isEmpty()) {
          vars_ = other.vars_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureVarsIsMutable();
          vars_.addAll(other.vars_);
        }
        onChanged();
      }
      if (!other.coeffs_.isEmpty()) {
        if (coeffs_.isEmpty()) {
          coeffs_ = other.coeffs_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureCoeffsIsMutable();
          coeffs_.addAll(other.coeffs_);
        }
        onChanged();
      }
      if (other.getOffset() != 0L) {
        setOffset(other.getOffset());
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
      com.google.ortools.sat.LinearExpressionProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ortools.sat.LinearExpressionProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.IntList vars_ = emptyIntList();
    private void ensureVarsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        vars_ = mutableCopy(vars_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int32 vars = 1;</code>
     * @return A list containing the vars.
     */
    public java.util.List<java.lang.Integer>
        getVarsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(vars_) : vars_;
    }
    /**
     * <code>repeated int32 vars = 1;</code>
     * @return The count of vars.
     */
    public int getVarsCount() {
      return vars_.size();
    }
    /**
     * <code>repeated int32 vars = 1;</code>
     * @param index The index of the element to return.
     * @return The vars at the given index.
     */
    public int getVars(int index) {
      return vars_.getInt(index);
    }
    /**
     * <code>repeated int32 vars = 1;</code>
     * @param index The index to set the value at.
     * @param value The vars to set.
     * @return This builder for chaining.
     */
    public Builder setVars(
        int index, int value) {
      ensureVarsIsMutable();
      vars_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 vars = 1;</code>
     * @param value The vars to add.
     * @return This builder for chaining.
     */
    public Builder addVars(int value) {
      ensureVarsIsMutable();
      vars_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 vars = 1;</code>
     * @param values The vars to add.
     * @return This builder for chaining.
     */
    public Builder addAllVars(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureVarsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, vars_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 vars = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVars() {
      vars_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList coeffs_ = emptyIntList();
    private void ensureCoeffsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        coeffs_ = mutableCopy(coeffs_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated int32 coeffs = 2;</code>
     * @return A list containing the coeffs.
     */
    public java.util.List<java.lang.Integer>
        getCoeffsList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(coeffs_) : coeffs_;
    }
    /**
     * <code>repeated int32 coeffs = 2;</code>
     * @return The count of coeffs.
     */
    public int getCoeffsCount() {
      return coeffs_.size();
    }
    /**
     * <code>repeated int32 coeffs = 2;</code>
     * @param index The index of the element to return.
     * @return The coeffs at the given index.
     */
    public int getCoeffs(int index) {
      return coeffs_.getInt(index);
    }
    /**
     * <code>repeated int32 coeffs = 2;</code>
     * @param index The index to set the value at.
     * @param value The coeffs to set.
     * @return This builder for chaining.
     */
    public Builder setCoeffs(
        int index, int value) {
      ensureCoeffsIsMutable();
      coeffs_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 coeffs = 2;</code>
     * @param value The coeffs to add.
     * @return This builder for chaining.
     */
    public Builder addCoeffs(int value) {
      ensureCoeffsIsMutable();
      coeffs_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 coeffs = 2;</code>
     * @param values The coeffs to add.
     * @return This builder for chaining.
     */
    public Builder addAllCoeffs(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureCoeffsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, coeffs_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 coeffs = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCoeffs() {
      coeffs_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    private long offset_ ;
    /**
     * <code>int64 offset = 3;</code>
     * @return The offset.
     */
    public long getOffset() {
      return offset_;
    }
    /**
     * <code>int64 offset = 3;</code>
     * @param value The offset to set.
     * @return This builder for chaining.
     */
    public Builder setOffset(long value) {
      
      offset_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 offset = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOffset() {
      
      offset_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:operations_research.sat.LinearExpressionProto)
  }

  // @@protoc_insertion_point(class_scope:operations_research.sat.LinearExpressionProto)
  private static final com.google.ortools.sat.LinearExpressionProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ortools.sat.LinearExpressionProto();
  }

  public static com.google.ortools.sat.LinearExpressionProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LinearExpressionProto>
      PARSER = new com.google.protobuf.AbstractParser<LinearExpressionProto>() {
    @java.lang.Override
    public LinearExpressionProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LinearExpressionProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LinearExpressionProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LinearExpressionProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ortools.sat.LinearExpressionProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

