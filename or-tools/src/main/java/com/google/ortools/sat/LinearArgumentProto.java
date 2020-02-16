// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ortools/sat/cp_model.proto

package com.google.ortools.sat;

/**
 * Protobuf type {@code operations_research.sat.LinearArgumentProto}
 */
public  final class LinearArgumentProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:operations_research.sat.LinearArgumentProto)
    LinearArgumentProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LinearArgumentProto.newBuilder() to construct.
  private LinearArgumentProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LinearArgumentProto() {
    exprs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LinearArgumentProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LinearArgumentProto(
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
          case 10: {
            com.google.ortools.sat.LinearExpressionProto.Builder subBuilder = null;
            if (target_ != null) {
              subBuilder = target_.toBuilder();
            }
            target_ = input.readMessage(com.google.ortools.sat.LinearExpressionProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(target_);
              target_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              exprs_ = new java.util.ArrayList<com.google.ortools.sat.LinearExpressionProto>();
              mutable_bitField0_ |= 0x00000001;
            }
            exprs_.add(
                input.readMessage(com.google.ortools.sat.LinearExpressionProto.parser(), extensionRegistry));
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
        exprs_ = java.util.Collections.unmodifiableList(exprs_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ortools.sat.CpModelProtobuf.internal_static_operations_research_sat_LinearArgumentProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ortools.sat.CpModelProtobuf.internal_static_operations_research_sat_LinearArgumentProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ortools.sat.LinearArgumentProto.class, com.google.ortools.sat.LinearArgumentProto.Builder.class);
  }

  public static final int TARGET_FIELD_NUMBER = 1;
  private com.google.ortools.sat.LinearExpressionProto target_;
  /**
   * <code>.operations_research.sat.LinearExpressionProto target = 1;</code>
   * @return Whether the target field is set.
   */
  public boolean hasTarget() {
    return target_ != null;
  }
  /**
   * <code>.operations_research.sat.LinearExpressionProto target = 1;</code>
   * @return The target.
   */
  public com.google.ortools.sat.LinearExpressionProto getTarget() {
    return target_ == null ? com.google.ortools.sat.LinearExpressionProto.getDefaultInstance() : target_;
  }
  /**
   * <code>.operations_research.sat.LinearExpressionProto target = 1;</code>
   */
  public com.google.ortools.sat.LinearExpressionProtoOrBuilder getTargetOrBuilder() {
    return getTarget();
  }

  public static final int EXPRS_FIELD_NUMBER = 2;
  private java.util.List<com.google.ortools.sat.LinearExpressionProto> exprs_;
  /**
   * <code>repeated .operations_research.sat.LinearExpressionProto exprs = 2;</code>
   */
  public java.util.List<com.google.ortools.sat.LinearExpressionProto> getExprsList() {
    return exprs_;
  }
  /**
   * <code>repeated .operations_research.sat.LinearExpressionProto exprs = 2;</code>
   */
  public java.util.List<? extends com.google.ortools.sat.LinearExpressionProtoOrBuilder> 
      getExprsOrBuilderList() {
    return exprs_;
  }
  /**
   * <code>repeated .operations_research.sat.LinearExpressionProto exprs = 2;</code>
   */
  public int getExprsCount() {
    return exprs_.size();
  }
  /**
   * <code>repeated .operations_research.sat.LinearExpressionProto exprs = 2;</code>
   */
  public com.google.ortools.sat.LinearExpressionProto getExprs(int index) {
    return exprs_.get(index);
  }
  /**
   * <code>repeated .operations_research.sat.LinearExpressionProto exprs = 2;</code>
   */
  public com.google.ortools.sat.LinearExpressionProtoOrBuilder getExprsOrBuilder(
      int index) {
    return exprs_.get(index);
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
    if (target_ != null) {
      output.writeMessage(1, getTarget());
    }
    for (int i = 0; i < exprs_.size(); i++) {
      output.writeMessage(2, exprs_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (target_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTarget());
    }
    for (int i = 0; i < exprs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, exprs_.get(i));
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
    if (!(obj instanceof com.google.ortools.sat.LinearArgumentProto)) {
      return super.equals(obj);
    }
    com.google.ortools.sat.LinearArgumentProto other = (com.google.ortools.sat.LinearArgumentProto) obj;

    if (hasTarget() != other.hasTarget()) return false;
    if (hasTarget()) {
      if (!getTarget()
          .equals(other.getTarget())) return false;
    }
    if (!getExprsList()
        .equals(other.getExprsList())) return false;
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
    if (hasTarget()) {
      hash = (37 * hash) + TARGET_FIELD_NUMBER;
      hash = (53 * hash) + getTarget().hashCode();
    }
    if (getExprsCount() > 0) {
      hash = (37 * hash) + EXPRS_FIELD_NUMBER;
      hash = (53 * hash) + getExprsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ortools.sat.LinearArgumentProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ortools.sat.LinearArgumentProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ortools.sat.LinearArgumentProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ortools.sat.LinearArgumentProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ortools.sat.LinearArgumentProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ortools.sat.LinearArgumentProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ortools.sat.LinearArgumentProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ortools.sat.LinearArgumentProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ortools.sat.LinearArgumentProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ortools.sat.LinearArgumentProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ortools.sat.LinearArgumentProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ortools.sat.LinearArgumentProto parseFrom(
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
  public static Builder newBuilder(com.google.ortools.sat.LinearArgumentProto prototype) {
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
   * Protobuf type {@code operations_research.sat.LinearArgumentProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:operations_research.sat.LinearArgumentProto)
      com.google.ortools.sat.LinearArgumentProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ortools.sat.CpModelProtobuf.internal_static_operations_research_sat_LinearArgumentProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ortools.sat.CpModelProtobuf.internal_static_operations_research_sat_LinearArgumentProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ortools.sat.LinearArgumentProto.class, com.google.ortools.sat.LinearArgumentProto.Builder.class);
    }

    // Construct using com.google.ortools.sat.LinearArgumentProto.newBuilder()
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
        getExprsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (targetBuilder_ == null) {
        target_ = null;
      } else {
        target_ = null;
        targetBuilder_ = null;
      }
      if (exprsBuilder_ == null) {
        exprs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        exprsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ortools.sat.CpModelProtobuf.internal_static_operations_research_sat_LinearArgumentProto_descriptor;
    }

    @java.lang.Override
    public com.google.ortools.sat.LinearArgumentProto getDefaultInstanceForType() {
      return com.google.ortools.sat.LinearArgumentProto.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ortools.sat.LinearArgumentProto build() {
      com.google.ortools.sat.LinearArgumentProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ortools.sat.LinearArgumentProto buildPartial() {
      com.google.ortools.sat.LinearArgumentProto result = new com.google.ortools.sat.LinearArgumentProto(this);
      int from_bitField0_ = bitField0_;
      if (targetBuilder_ == null) {
        result.target_ = target_;
      } else {
        result.target_ = targetBuilder_.build();
      }
      if (exprsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          exprs_ = java.util.Collections.unmodifiableList(exprs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.exprs_ = exprs_;
      } else {
        result.exprs_ = exprsBuilder_.build();
      }
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
      if (other instanceof com.google.ortools.sat.LinearArgumentProto) {
        return mergeFrom((com.google.ortools.sat.LinearArgumentProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ortools.sat.LinearArgumentProto other) {
      if (other == com.google.ortools.sat.LinearArgumentProto.getDefaultInstance()) return this;
      if (other.hasTarget()) {
        mergeTarget(other.getTarget());
      }
      if (exprsBuilder_ == null) {
        if (!other.exprs_.isEmpty()) {
          if (exprs_.isEmpty()) {
            exprs_ = other.exprs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureExprsIsMutable();
            exprs_.addAll(other.exprs_);
          }
          onChanged();
        }
      } else {
        if (!other.exprs_.isEmpty()) {
          if (exprsBuilder_.isEmpty()) {
            exprsBuilder_.dispose();
            exprsBuilder_ = null;
            exprs_ = other.exprs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            exprsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getExprsFieldBuilder() : null;
          } else {
            exprsBuilder_.addAllMessages(other.exprs_);
          }
        }
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
      com.google.ortools.sat.LinearArgumentProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ortools.sat.LinearArgumentProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.ortools.sat.LinearExpressionProto target_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ortools.sat.LinearExpressionProto, com.google.ortools.sat.LinearExpressionProto.Builder, com.google.ortools.sat.LinearExpressionProtoOrBuilder> targetBuilder_;
    /**
     * <code>.operations_research.sat.LinearExpressionProto target = 1;</code>
     * @return Whether the target field is set.
     */
    public boolean hasTarget() {
      return targetBuilder_ != null || target_ != null;
    }
    /**
     * <code>.operations_research.sat.LinearExpressionProto target = 1;</code>
     * @return The target.
     */
    public com.google.ortools.sat.LinearExpressionProto getTarget() {
      if (targetBuilder_ == null) {
        return target_ == null ? com.google.ortools.sat.LinearExpressionProto.getDefaultInstance() : target_;
      } else {
        return targetBuilder_.getMessage();
      }
    }
    /**
     * <code>.operations_research.sat.LinearExpressionProto target = 1;</code>
     */
    public Builder setTarget(com.google.ortools.sat.LinearExpressionProto value) {
      if (targetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        target_ = value;
        onChanged();
      } else {
        targetBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.operations_research.sat.LinearExpressionProto target = 1;</code>
     */
    public Builder setTarget(
        com.google.ortools.sat.LinearExpressionProto.Builder builderForValue) {
      if (targetBuilder_ == null) {
        target_ = builderForValue.build();
        onChanged();
      } else {
        targetBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.operations_research.sat.LinearExpressionProto target = 1;</code>
     */
    public Builder mergeTarget(com.google.ortools.sat.LinearExpressionProto value) {
      if (targetBuilder_ == null) {
        if (target_ != null) {
          target_ =
            com.google.ortools.sat.LinearExpressionProto.newBuilder(target_).mergeFrom(value).buildPartial();
        } else {
          target_ = value;
        }
        onChanged();
      } else {
        targetBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.operations_research.sat.LinearExpressionProto target = 1;</code>
     */
    public Builder clearTarget() {
      if (targetBuilder_ == null) {
        target_ = null;
        onChanged();
      } else {
        target_ = null;
        targetBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.operations_research.sat.LinearExpressionProto target = 1;</code>
     */
    public com.google.ortools.sat.LinearExpressionProto.Builder getTargetBuilder() {
      
      onChanged();
      return getTargetFieldBuilder().getBuilder();
    }
    /**
     * <code>.operations_research.sat.LinearExpressionProto target = 1;</code>
     */
    public com.google.ortools.sat.LinearExpressionProtoOrBuilder getTargetOrBuilder() {
      if (targetBuilder_ != null) {
        return targetBuilder_.getMessageOrBuilder();
      } else {
        return target_ == null ?
            com.google.ortools.sat.LinearExpressionProto.getDefaultInstance() : target_;
      }
    }
    /**
     * <code>.operations_research.sat.LinearExpressionProto target = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ortools.sat.LinearExpressionProto, com.google.ortools.sat.LinearExpressionProto.Builder, com.google.ortools.sat.LinearExpressionProtoOrBuilder> 
        getTargetFieldBuilder() {
      if (targetBuilder_ == null) {
        targetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ortools.sat.LinearExpressionProto, com.google.ortools.sat.LinearExpressionProto.Builder, com.google.ortools.sat.LinearExpressionProtoOrBuilder>(
                getTarget(),
                getParentForChildren(),
                isClean());
        target_ = null;
      }
      return targetBuilder_;
    }

    private java.util.List<com.google.ortools.sat.LinearExpressionProto> exprs_ =
      java.util.Collections.emptyList();
    private void ensureExprsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        exprs_ = new java.util.ArrayList<com.google.ortools.sat.LinearExpressionProto>(exprs_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ortools.sat.LinearExpressionProto, com.google.ortools.sat.LinearExpressionProto.Builder, com.google.ortools.sat.LinearExpressionProtoOrBuilder> exprsBuilder_;

    /**
     * <code>repeated .operations_research.sat.LinearExpressionProto exprs = 2;</code>
     */
    public java.util.List<com.google.ortools.sat.LinearExpressionProto> getExprsList() {
      if (exprsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(exprs_);
      } else {
        return exprsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .operations_research.sat.LinearExpressionProto exprs = 2;</code>
     */
    public int getExprsCount() {
      if (exprsBuilder_ == null) {
        return exprs_.size();
      } else {
        return exprsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .operations_research.sat.LinearExpressionProto exprs = 2;</code>
     */
    public com.google.ortools.sat.LinearExpressionProto getExprs(int index) {
      if (exprsBuilder_ == null) {
        return exprs_.get(index);
      } else {
        return exprsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .operations_research.sat.LinearExpressionProto exprs = 2;</code>
     */
    public Builder setExprs(
        int index, com.google.ortools.sat.LinearExpressionProto value) {
      if (exprsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExprsIsMutable();
        exprs_.set(index, value);
        onChanged();
      } else {
        exprsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .operations_research.sat.LinearExpressionProto exprs = 2;</code>
     */
    public Builder setExprs(
        int index, com.google.ortools.sat.LinearExpressionProto.Builder builderForValue) {
      if (exprsBuilder_ == null) {
        ensureExprsIsMutable();
        exprs_.set(index, builderForValue.build());
        onChanged();
      } else {
        exprsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .operations_research.sat.LinearExpressionProto exprs = 2;</code>
     */
    public Builder addExprs(com.google.ortools.sat.LinearExpressionProto value) {
      if (exprsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExprsIsMutable();
        exprs_.add(value);
        onChanged();
      } else {
        exprsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .operations_research.sat.LinearExpressionProto exprs = 2;</code>
     */
    public Builder addExprs(
        int index, com.google.ortools.sat.LinearExpressionProto value) {
      if (exprsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExprsIsMutable();
        exprs_.add(index, value);
        onChanged();
      } else {
        exprsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .operations_research.sat.LinearExpressionProto exprs = 2;</code>
     */
    public Builder addExprs(
        com.google.ortools.sat.LinearExpressionProto.Builder builderForValue) {
      if (exprsBuilder_ == null) {
        ensureExprsIsMutable();
        exprs_.add(builderForValue.build());
        onChanged();
      } else {
        exprsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .operations_research.sat.LinearExpressionProto exprs = 2;</code>
     */
    public Builder addExprs(
        int index, com.google.ortools.sat.LinearExpressionProto.Builder builderForValue) {
      if (exprsBuilder_ == null) {
        ensureExprsIsMutable();
        exprs_.add(index, builderForValue.build());
        onChanged();
      } else {
        exprsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .operations_research.sat.LinearExpressionProto exprs = 2;</code>
     */
    public Builder addAllExprs(
        java.lang.Iterable<? extends com.google.ortools.sat.LinearExpressionProto> values) {
      if (exprsBuilder_ == null) {
        ensureExprsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, exprs_);
        onChanged();
      } else {
        exprsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .operations_research.sat.LinearExpressionProto exprs = 2;</code>
     */
    public Builder clearExprs() {
      if (exprsBuilder_ == null) {
        exprs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        exprsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .operations_research.sat.LinearExpressionProto exprs = 2;</code>
     */
    public Builder removeExprs(int index) {
      if (exprsBuilder_ == null) {
        ensureExprsIsMutable();
        exprs_.remove(index);
        onChanged();
      } else {
        exprsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .operations_research.sat.LinearExpressionProto exprs = 2;</code>
     */
    public com.google.ortools.sat.LinearExpressionProto.Builder getExprsBuilder(
        int index) {
      return getExprsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .operations_research.sat.LinearExpressionProto exprs = 2;</code>
     */
    public com.google.ortools.sat.LinearExpressionProtoOrBuilder getExprsOrBuilder(
        int index) {
      if (exprsBuilder_ == null) {
        return exprs_.get(index);  } else {
        return exprsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .operations_research.sat.LinearExpressionProto exprs = 2;</code>
     */
    public java.util.List<? extends com.google.ortools.sat.LinearExpressionProtoOrBuilder> 
         getExprsOrBuilderList() {
      if (exprsBuilder_ != null) {
        return exprsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(exprs_);
      }
    }
    /**
     * <code>repeated .operations_research.sat.LinearExpressionProto exprs = 2;</code>
     */
    public com.google.ortools.sat.LinearExpressionProto.Builder addExprsBuilder() {
      return getExprsFieldBuilder().addBuilder(
          com.google.ortools.sat.LinearExpressionProto.getDefaultInstance());
    }
    /**
     * <code>repeated .operations_research.sat.LinearExpressionProto exprs = 2;</code>
     */
    public com.google.ortools.sat.LinearExpressionProto.Builder addExprsBuilder(
        int index) {
      return getExprsFieldBuilder().addBuilder(
          index, com.google.ortools.sat.LinearExpressionProto.getDefaultInstance());
    }
    /**
     * <code>repeated .operations_research.sat.LinearExpressionProto exprs = 2;</code>
     */
    public java.util.List<com.google.ortools.sat.LinearExpressionProto.Builder> 
         getExprsBuilderList() {
      return getExprsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ortools.sat.LinearExpressionProto, com.google.ortools.sat.LinearExpressionProto.Builder, com.google.ortools.sat.LinearExpressionProtoOrBuilder> 
        getExprsFieldBuilder() {
      if (exprsBuilder_ == null) {
        exprsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ortools.sat.LinearExpressionProto, com.google.ortools.sat.LinearExpressionProto.Builder, com.google.ortools.sat.LinearExpressionProtoOrBuilder>(
                exprs_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        exprs_ = null;
      }
      return exprsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:operations_research.sat.LinearArgumentProto)
  }

  // @@protoc_insertion_point(class_scope:operations_research.sat.LinearArgumentProto)
  private static final com.google.ortools.sat.LinearArgumentProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ortools.sat.LinearArgumentProto();
  }

  public static com.google.ortools.sat.LinearArgumentProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LinearArgumentProto>
      PARSER = new com.google.protobuf.AbstractParser<LinearArgumentProto>() {
    @java.lang.Override
    public LinearArgumentProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LinearArgumentProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LinearArgumentProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LinearArgumentProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ortools.sat.LinearArgumentProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
