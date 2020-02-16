// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ortools/sat/cp_model.proto

package com.google.ortools.sat;

/**
 * <pre>
 * Argument of the constraints of the form target_var = OP(vars).
 * </pre>
 *
 * Protobuf type {@code operations_research.sat.IntegerArgumentProto}
 */
public  final class IntegerArgumentProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:operations_research.sat.IntegerArgumentProto)
    IntegerArgumentProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IntegerArgumentProto.newBuilder() to construct.
  private IntegerArgumentProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IntegerArgumentProto() {
    vars_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IntegerArgumentProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IntegerArgumentProto(
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

            target_ = input.readInt32();
            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              vars_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            vars_.addInt(input.readInt32());
            break;
          }
          case 18: {
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ortools.sat.CpModelProtobuf.internal_static_operations_research_sat_IntegerArgumentProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ortools.sat.CpModelProtobuf.internal_static_operations_research_sat_IntegerArgumentProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ortools.sat.IntegerArgumentProto.class, com.google.ortools.sat.IntegerArgumentProto.Builder.class);
  }

  public static final int TARGET_FIELD_NUMBER = 1;
  private int target_;
  /**
   * <code>int32 target = 1;</code>
   * @return The target.
   */
  public int getTarget() {
    return target_;
  }

  public static final int VARS_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.IntList vars_;
  /**
   * <code>repeated int32 vars = 2;</code>
   * @return A list containing the vars.
   */
  public java.util.List<java.lang.Integer>
      getVarsList() {
    return vars_;
  }
  /**
   * <code>repeated int32 vars = 2;</code>
   * @return The count of vars.
   */
  public int getVarsCount() {
    return vars_.size();
  }
  /**
   * <code>repeated int32 vars = 2;</code>
   * @param index The index of the element to return.
   * @return The vars at the given index.
   */
  public int getVars(int index) {
    return vars_.getInt(index);
  }
  private int varsMemoizedSerializedSize = -1;

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
    if (target_ != 0) {
      output.writeInt32(1, target_);
    }
    if (getVarsList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(varsMemoizedSerializedSize);
    }
    for (int i = 0; i < vars_.size(); i++) {
      output.writeInt32NoTag(vars_.getInt(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (target_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, target_);
    }
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
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ortools.sat.IntegerArgumentProto)) {
      return super.equals(obj);
    }
    com.google.ortools.sat.IntegerArgumentProto other = (com.google.ortools.sat.IntegerArgumentProto) obj;

    if (getTarget()
        != other.getTarget()) return false;
    if (!getVarsList()
        .equals(other.getVarsList())) return false;
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
    hash = (37 * hash) + TARGET_FIELD_NUMBER;
    hash = (53 * hash) + getTarget();
    if (getVarsCount() > 0) {
      hash = (37 * hash) + VARS_FIELD_NUMBER;
      hash = (53 * hash) + getVarsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ortools.sat.IntegerArgumentProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ortools.sat.IntegerArgumentProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ortools.sat.IntegerArgumentProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ortools.sat.IntegerArgumentProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ortools.sat.IntegerArgumentProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ortools.sat.IntegerArgumentProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ortools.sat.IntegerArgumentProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ortools.sat.IntegerArgumentProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ortools.sat.IntegerArgumentProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ortools.sat.IntegerArgumentProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ortools.sat.IntegerArgumentProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ortools.sat.IntegerArgumentProto parseFrom(
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
  public static Builder newBuilder(com.google.ortools.sat.IntegerArgumentProto prototype) {
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
   * Argument of the constraints of the form target_var = OP(vars).
   * </pre>
   *
   * Protobuf type {@code operations_research.sat.IntegerArgumentProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:operations_research.sat.IntegerArgumentProto)
      com.google.ortools.sat.IntegerArgumentProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ortools.sat.CpModelProtobuf.internal_static_operations_research_sat_IntegerArgumentProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ortools.sat.CpModelProtobuf.internal_static_operations_research_sat_IntegerArgumentProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ortools.sat.IntegerArgumentProto.class, com.google.ortools.sat.IntegerArgumentProto.Builder.class);
    }

    // Construct using com.google.ortools.sat.IntegerArgumentProto.newBuilder()
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
      target_ = 0;

      vars_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ortools.sat.CpModelProtobuf.internal_static_operations_research_sat_IntegerArgumentProto_descriptor;
    }

    @java.lang.Override
    public com.google.ortools.sat.IntegerArgumentProto getDefaultInstanceForType() {
      return com.google.ortools.sat.IntegerArgumentProto.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ortools.sat.IntegerArgumentProto build() {
      com.google.ortools.sat.IntegerArgumentProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ortools.sat.IntegerArgumentProto buildPartial() {
      com.google.ortools.sat.IntegerArgumentProto result = new com.google.ortools.sat.IntegerArgumentProto(this);
      int from_bitField0_ = bitField0_;
      result.target_ = target_;
      if (((bitField0_ & 0x00000001) != 0)) {
        vars_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.vars_ = vars_;
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
      if (other instanceof com.google.ortools.sat.IntegerArgumentProto) {
        return mergeFrom((com.google.ortools.sat.IntegerArgumentProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ortools.sat.IntegerArgumentProto other) {
      if (other == com.google.ortools.sat.IntegerArgumentProto.getDefaultInstance()) return this;
      if (other.getTarget() != 0) {
        setTarget(other.getTarget());
      }
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
      com.google.ortools.sat.IntegerArgumentProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ortools.sat.IntegerArgumentProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int target_ ;
    /**
     * <code>int32 target = 1;</code>
     * @return The target.
     */
    public int getTarget() {
      return target_;
    }
    /**
     * <code>int32 target = 1;</code>
     * @param value The target to set.
     * @return This builder for chaining.
     */
    public Builder setTarget(int value) {
      
      target_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 target = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTarget() {
      
      target_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList vars_ = emptyIntList();
    private void ensureVarsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        vars_ = mutableCopy(vars_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int32 vars = 2;</code>
     * @return A list containing the vars.
     */
    public java.util.List<java.lang.Integer>
        getVarsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(vars_) : vars_;
    }
    /**
     * <code>repeated int32 vars = 2;</code>
     * @return The count of vars.
     */
    public int getVarsCount() {
      return vars_.size();
    }
    /**
     * <code>repeated int32 vars = 2;</code>
     * @param index The index of the element to return.
     * @return The vars at the given index.
     */
    public int getVars(int index) {
      return vars_.getInt(index);
    }
    /**
     * <code>repeated int32 vars = 2;</code>
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
     * <code>repeated int32 vars = 2;</code>
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
     * <code>repeated int32 vars = 2;</code>
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
     * <code>repeated int32 vars = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearVars() {
      vars_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:operations_research.sat.IntegerArgumentProto)
  }

  // @@protoc_insertion_point(class_scope:operations_research.sat.IntegerArgumentProto)
  private static final com.google.ortools.sat.IntegerArgumentProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ortools.sat.IntegerArgumentProto();
  }

  public static com.google.ortools.sat.IntegerArgumentProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IntegerArgumentProto>
      PARSER = new com.google.protobuf.AbstractParser<IntegerArgumentProto>() {
    @java.lang.Override
    public IntegerArgumentProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IntegerArgumentProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IntegerArgumentProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IntegerArgumentProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ortools.sat.IntegerArgumentProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

