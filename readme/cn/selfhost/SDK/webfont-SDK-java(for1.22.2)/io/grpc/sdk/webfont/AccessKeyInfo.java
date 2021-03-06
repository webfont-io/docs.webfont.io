// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: webfont.proto

package io.grpc.sdk.webfont;

/**
 * <pre>
 * 一个完整的AccessInfo
 * </pre>
 *
 * Protobuf type {@code webfontsdk.AccessKeyInfo}
 */
public  final class AccessKeyInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:webfontsdk.AccessKeyInfo)
    AccessKeyInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AccessKeyInfo.newBuilder() to construct.
  private AccessKeyInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AccessKeyInfo() {
    accesskey_ = "";
    uuid_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AccessKeyInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AccessKeyInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            java.lang.String s = input.readStringRequireUtf8();

            accesskey_ = s;
            break;
          }
          case 16: {

            userUid_ = input.readUInt64();
            break;
          }
          case 24: {

            fontId_ = input.readUInt32();
            break;
          }
          case 32: {

            addTime_ = input.readInt64();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            uuid_ = s;
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
    return io.grpc.sdk.webfont.WebfontProto.internal_static_webfontsdk_AccessKeyInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.sdk.webfont.WebfontProto.internal_static_webfontsdk_AccessKeyInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.sdk.webfont.AccessKeyInfo.class, io.grpc.sdk.webfont.AccessKeyInfo.Builder.class);
  }

  public static final int ACCESSKEY_FIELD_NUMBER = 1;
  private volatile java.lang.Object accesskey_;
  /**
   * <code>string accesskey = 1;</code>
   */
  public java.lang.String getAccesskey() {
    java.lang.Object ref = accesskey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      accesskey_ = s;
      return s;
    }
  }
  /**
   * <code>string accesskey = 1;</code>
   */
  public com.google.protobuf.ByteString
      getAccesskeyBytes() {
    java.lang.Object ref = accesskey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      accesskey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_UID_FIELD_NUMBER = 2;
  private long userUid_;
  /**
   * <code>uint64 user_uid = 2;</code>
   */
  public long getUserUid() {
    return userUid_;
  }

  public static final int FONT_ID_FIELD_NUMBER = 3;
  private int fontId_;
  /**
   * <code>uint32 font_id = 3;</code>
   */
  public int getFontId() {
    return fontId_;
  }

  public static final int ADD_TIME_FIELD_NUMBER = 4;
  private long addTime_;
  /**
   * <code>int64 add_time = 4;</code>
   */
  public long getAddTime() {
    return addTime_;
  }

  public static final int UUID_FIELD_NUMBER = 5;
  private volatile java.lang.Object uuid_;
  /**
   * <code>string uuid = 5;</code>
   */
  public java.lang.String getUuid() {
    java.lang.Object ref = uuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uuid_ = s;
      return s;
    }
  }
  /**
   * <code>string uuid = 5;</code>
   */
  public com.google.protobuf.ByteString
      getUuidBytes() {
    java.lang.Object ref = uuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getAccesskeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, accesskey_);
    }
    if (userUid_ != 0L) {
      output.writeUInt64(2, userUid_);
    }
    if (fontId_ != 0) {
      output.writeUInt32(3, fontId_);
    }
    if (addTime_ != 0L) {
      output.writeInt64(4, addTime_);
    }
    if (!getUuidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, uuid_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAccesskeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, accesskey_);
    }
    if (userUid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, userUid_);
    }
    if (fontId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, fontId_);
    }
    if (addTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, addTime_);
    }
    if (!getUuidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, uuid_);
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
    if (!(obj instanceof io.grpc.sdk.webfont.AccessKeyInfo)) {
      return super.equals(obj);
    }
    io.grpc.sdk.webfont.AccessKeyInfo other = (io.grpc.sdk.webfont.AccessKeyInfo) obj;

    if (!getAccesskey()
        .equals(other.getAccesskey())) return false;
    if (getUserUid()
        != other.getUserUid()) return false;
    if (getFontId()
        != other.getFontId()) return false;
    if (getAddTime()
        != other.getAddTime()) return false;
    if (!getUuid()
        .equals(other.getUuid())) return false;
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
    hash = (37 * hash) + ACCESSKEY_FIELD_NUMBER;
    hash = (53 * hash) + getAccesskey().hashCode();
    hash = (37 * hash) + USER_UID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUserUid());
    hash = (37 * hash) + FONT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFontId();
    hash = (37 * hash) + ADD_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAddTime());
    hash = (37 * hash) + UUID_FIELD_NUMBER;
    hash = (53 * hash) + getUuid().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.sdk.webfont.AccessKeyInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.sdk.webfont.AccessKeyInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.sdk.webfont.AccessKeyInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.sdk.webfont.AccessKeyInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.sdk.webfont.AccessKeyInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.sdk.webfont.AccessKeyInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.sdk.webfont.AccessKeyInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.sdk.webfont.AccessKeyInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.sdk.webfont.AccessKeyInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.sdk.webfont.AccessKeyInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.sdk.webfont.AccessKeyInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.sdk.webfont.AccessKeyInfo parseFrom(
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
  public static Builder newBuilder(io.grpc.sdk.webfont.AccessKeyInfo prototype) {
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
   * 一个完整的AccessInfo
   * </pre>
   *
   * Protobuf type {@code webfontsdk.AccessKeyInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:webfontsdk.AccessKeyInfo)
      io.grpc.sdk.webfont.AccessKeyInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.sdk.webfont.WebfontProto.internal_static_webfontsdk_AccessKeyInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.sdk.webfont.WebfontProto.internal_static_webfontsdk_AccessKeyInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.sdk.webfont.AccessKeyInfo.class, io.grpc.sdk.webfont.AccessKeyInfo.Builder.class);
    }

    // Construct using io.grpc.sdk.webfont.AccessKeyInfo.newBuilder()
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
      accesskey_ = "";

      userUid_ = 0L;

      fontId_ = 0;

      addTime_ = 0L;

      uuid_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.sdk.webfont.WebfontProto.internal_static_webfontsdk_AccessKeyInfo_descriptor;
    }

    @java.lang.Override
    public io.grpc.sdk.webfont.AccessKeyInfo getDefaultInstanceForType() {
      return io.grpc.sdk.webfont.AccessKeyInfo.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.sdk.webfont.AccessKeyInfo build() {
      io.grpc.sdk.webfont.AccessKeyInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.sdk.webfont.AccessKeyInfo buildPartial() {
      io.grpc.sdk.webfont.AccessKeyInfo result = new io.grpc.sdk.webfont.AccessKeyInfo(this);
      result.accesskey_ = accesskey_;
      result.userUid_ = userUid_;
      result.fontId_ = fontId_;
      result.addTime_ = addTime_;
      result.uuid_ = uuid_;
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
      if (other instanceof io.grpc.sdk.webfont.AccessKeyInfo) {
        return mergeFrom((io.grpc.sdk.webfont.AccessKeyInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.sdk.webfont.AccessKeyInfo other) {
      if (other == io.grpc.sdk.webfont.AccessKeyInfo.getDefaultInstance()) return this;
      if (!other.getAccesskey().isEmpty()) {
        accesskey_ = other.accesskey_;
        onChanged();
      }
      if (other.getUserUid() != 0L) {
        setUserUid(other.getUserUid());
      }
      if (other.getFontId() != 0) {
        setFontId(other.getFontId());
      }
      if (other.getAddTime() != 0L) {
        setAddTime(other.getAddTime());
      }
      if (!other.getUuid().isEmpty()) {
        uuid_ = other.uuid_;
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
      io.grpc.sdk.webfont.AccessKeyInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.sdk.webfont.AccessKeyInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object accesskey_ = "";
    /**
     * <code>string accesskey = 1;</code>
     */
    public java.lang.String getAccesskey() {
      java.lang.Object ref = accesskey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        accesskey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string accesskey = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAccesskeyBytes() {
      java.lang.Object ref = accesskey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        accesskey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string accesskey = 1;</code>
     */
    public Builder setAccesskey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      accesskey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string accesskey = 1;</code>
     */
    public Builder clearAccesskey() {
      
      accesskey_ = getDefaultInstance().getAccesskey();
      onChanged();
      return this;
    }
    /**
     * <code>string accesskey = 1;</code>
     */
    public Builder setAccesskeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      accesskey_ = value;
      onChanged();
      return this;
    }

    private long userUid_ ;
    /**
     * <code>uint64 user_uid = 2;</code>
     */
    public long getUserUid() {
      return userUid_;
    }
    /**
     * <code>uint64 user_uid = 2;</code>
     */
    public Builder setUserUid(long value) {
      
      userUid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 user_uid = 2;</code>
     */
    public Builder clearUserUid() {
      
      userUid_ = 0L;
      onChanged();
      return this;
    }

    private int fontId_ ;
    /**
     * <code>uint32 font_id = 3;</code>
     */
    public int getFontId() {
      return fontId_;
    }
    /**
     * <code>uint32 font_id = 3;</code>
     */
    public Builder setFontId(int value) {
      
      fontId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 font_id = 3;</code>
     */
    public Builder clearFontId() {
      
      fontId_ = 0;
      onChanged();
      return this;
    }

    private long addTime_ ;
    /**
     * <code>int64 add_time = 4;</code>
     */
    public long getAddTime() {
      return addTime_;
    }
    /**
     * <code>int64 add_time = 4;</code>
     */
    public Builder setAddTime(long value) {
      
      addTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 add_time = 4;</code>
     */
    public Builder clearAddTime() {
      
      addTime_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object uuid_ = "";
    /**
     * <code>string uuid = 5;</code>
     */
    public java.lang.String getUuid() {
      java.lang.Object ref = uuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string uuid = 5;</code>
     */
    public com.google.protobuf.ByteString
        getUuidBytes() {
      java.lang.Object ref = uuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string uuid = 5;</code>
     */
    public Builder setUuid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      uuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string uuid = 5;</code>
     */
    public Builder clearUuid() {
      
      uuid_ = getDefaultInstance().getUuid();
      onChanged();
      return this;
    }
    /**
     * <code>string uuid = 5;</code>
     */
    public Builder setUuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      uuid_ = value;
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


    // @@protoc_insertion_point(builder_scope:webfontsdk.AccessKeyInfo)
  }

  // @@protoc_insertion_point(class_scope:webfontsdk.AccessKeyInfo)
  private static final io.grpc.sdk.webfont.AccessKeyInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.sdk.webfont.AccessKeyInfo();
  }

  public static io.grpc.sdk.webfont.AccessKeyInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AccessKeyInfo>
      PARSER = new com.google.protobuf.AbstractParser<AccessKeyInfo>() {
    @java.lang.Override
    public AccessKeyInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AccessKeyInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AccessKeyInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AccessKeyInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.sdk.webfont.AccessKeyInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

