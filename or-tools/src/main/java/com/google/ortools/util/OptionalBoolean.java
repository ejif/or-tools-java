// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ortools/util/optional_boolean.proto

package com.google.ortools.util;

/**
 * <pre>
 * A "three-way" boolean: unspecified, false or true.
 * We don't use the value of 1 to increase the chance to catch bugs: eg. in
 * python, a user may set a proto field of this type enum to a boolean value
 * without type checks, if they set it to True, the proto validity code will
 * catch it (because it'll be cast to 1, which is an invalid enum value).
 * Note that if the user sets if to False (i.e. 0), it will be caught by the
 * routing library's parameter validity check too.
 * </pre>
 *
 * Protobuf enum {@code operations_research.OptionalBoolean}
 */
public enum OptionalBoolean
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>BOOL_UNSPECIFIED = 0;</code>
   */
  BOOL_UNSPECIFIED(0),
  /**
   * <code>BOOL_FALSE = 2;</code>
   */
  BOOL_FALSE(2),
  /**
   * <code>BOOL_TRUE = 3;</code>
   */
  BOOL_TRUE(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>BOOL_UNSPECIFIED = 0;</code>
   */
  public static final int BOOL_UNSPECIFIED_VALUE = 0;
  /**
   * <code>BOOL_FALSE = 2;</code>
   */
  public static final int BOOL_FALSE_VALUE = 2;
  /**
   * <code>BOOL_TRUE = 3;</code>
   */
  public static final int BOOL_TRUE_VALUE = 3;


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
  public static OptionalBoolean valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OptionalBoolean forNumber(int value) {
    switch (value) {
      case 0: return BOOL_UNSPECIFIED;
      case 2: return BOOL_FALSE;
      case 3: return BOOL_TRUE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OptionalBoolean>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OptionalBoolean> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OptionalBoolean>() {
          public OptionalBoolean findValueByNumber(int number) {
            return OptionalBoolean.forNumber(number);
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
    return com.google.ortools.util.OptionalBooleanOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final OptionalBoolean[] VALUES = values();

  public static OptionalBoolean valueOf(
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

  private OptionalBoolean(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:operations_research.OptionalBoolean)
}

