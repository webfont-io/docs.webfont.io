// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: webfont.proto

package io.grpc.sdk.webfont;

/**
 * Protobuf enum {@code webfontsdk.Language}
 */
public enum Language
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNKNOW = 0;</code>
   */
  UNKNOW(0),
  /**
   * <code>English = 1;</code>
   */
  English(1),
  /**
   * <code>Simplified_Chinese = 2;</code>
   */
  Simplified_Chinese(2),
  /**
   * <code>Traditional_Chinese = 3;</code>
   */
  Traditional_Chinese(3),
  /**
   * <code>Japanese = 4;</code>
   */
  Japanese(4),
  /**
   * <code>Korean = 5;</code>
   */
  Korean(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNKNOW = 0;</code>
   */
  public static final int UNKNOW_VALUE = 0;
  /**
   * <code>English = 1;</code>
   */
  public static final int English_VALUE = 1;
  /**
   * <code>Simplified_Chinese = 2;</code>
   */
  public static final int Simplified_Chinese_VALUE = 2;
  /**
   * <code>Traditional_Chinese = 3;</code>
   */
  public static final int Traditional_Chinese_VALUE = 3;
  /**
   * <code>Japanese = 4;</code>
   */
  public static final int Japanese_VALUE = 4;
  /**
   * <code>Korean = 5;</code>
   */
  public static final int Korean_VALUE = 5;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Language valueOf(int value) {
    return forNumber(value);
  }

  public static Language forNumber(int value) {
    switch (value) {
      case 0: return UNKNOW;
      case 1: return English;
      case 2: return Simplified_Chinese;
      case 3: return Traditional_Chinese;
      case 4: return Japanese;
      case 5: return Korean;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Language>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Language> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Language>() {
          public Language findValueByNumber(int number) {
            return Language.forNumber(number);
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
    return io.grpc.sdk.webfont.WebfontProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final Language[] VALUES = values();

  public static Language valueOf(
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

  private Language(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:webfontsdk.Language)
}

