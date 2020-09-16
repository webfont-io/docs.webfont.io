// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: webfont.proto

package io.grpc.sdk.webfont;

/**
 * Protobuf type {@code webfontsdk.UseRate}
 */
public  final class UseRate extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:webfontsdk.UseRate)
    UseRateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UseRate.newBuilder() to construct.
  private UseRate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UseRate() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UseRate();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UseRate(
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
          case 8: {

            fontId_ = input.readUInt32();
            break;
          }
          case 16: {

            count_ = input.readUInt32();
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
    return io.grpc.sdk.webfont.WebfontProto.internal_static_webfontsdk_UseRate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.sdk.webfont.WebfontProto.internal_static_webfontsdk_UseRate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.sdk.webfont.UseRate.class, io.grpc.sdk.webfont.UseRate.Builder.class);
  }

  public static final int FONT_ID_FIELD_NUMBER = 1;
  private int fontId_;
  /**
   * <code>uint32 font_id = 1;</code>
   */
  public int getFontId() {
    return fontId_;
  }

  public static final int COUNT_FIELD_NUMBER = 2;
  private int count_;
  /**
   * <code>uint32 count = 2;</code>
   */
  public int getCount() {
    return count_;
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
    if (fontId_ != 0) {
      output.writeUInt32(1, fontId_);
    }
    if (count_ != 0) {
      output.writeUInt32(2, count_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fontId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, fontId_);
    }
    if (count_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, count_);
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
    if (!(obj instanceof io.grpc.sdk.webfont.UseRate)) {
      return super.equals(obj);
    }
    io.grpc.sdk.webfont.UseRate other = (io.grpc.sdk.webfont.UseRate) obj;

    if (getFontId()
        != other.getFontId()) return false;
    if (getCount()
        != other.getCount()) return false;
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
    hash = (37 * hash) + FONT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFontId();
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.sdk.webfont.UseRate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.sdk.webfont.UseRate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.sdk.webfont.UseRate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.sdk.webfont.UseRate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.sdk.webfont.UseRate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.sdk.webfont.UseRate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.sdk.webfont.UseRate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.sdk.webfont.UseRate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.sdk.webfont.UseRate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.sdk.webfont.UseRate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.sdk.webfont.UseRate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.sdk.webfont.UseRate parseFrom(
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
  public static Builder newBuilder(io.grpc.sdk.webfont.UseRate prototype) {
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
   * Protobuf type {@code webfontsdk.UseRate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:webfontsdk.UseRate)
      io.grpc.sdk.webfont.UseRateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.sdk.webfont.WebfontProto.internal_static_webfontsdk_UseRate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.sdk.webfont.WebfontProto.internal_static_webfontsdk_UseRate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.sdk.webfont.UseRate.class, io.grpc.sdk.webfont.UseRate.Builder.class);
    }

    // Construct using io.grpc.sdk.webfont.UseRate.newBuilder()
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
      fontId_ = 0;

      count_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.sdk.webfont.WebfontProto.internal_static_webfontsdk_UseRate_descriptor;
    }

    @java.lang.Override
    public io.grpc.sdk.webfont.UseRate getDefaultInstanceForType() {
      return io.grpc.sdk.webfont.UseRate.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.sdk.webfont.UseRate build() {
      io.grpc.sdk.webfont.UseRate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.sdk.webfont.UseRate buildPartial() {
      io.grpc.sdk.webfont.UseRate result = new io.grpc.sdk.webfont.UseRate(this);
      result.fontId_ = fontId_;
      result.count_ = count_;
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
      if (other instanceof io.grpc.sdk.webfont.UseRate) {
        return mergeFrom((io.grpc.sdk.webfont.UseRate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.sdk.webfont.UseRate other) {
      if (other == io.grpc.sdk.webfont.UseRate.getDefaultInstance()) return this;
      if (other.getFontId() != 0) {
        setFontId(other.getFontId());
      }
      if (other.getCount() != 0) {
        setCount(other.getCount());
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
      io.grpc.sdk.webfont.UseRate parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.sdk.webfont.UseRate) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int fontId_ ;
    /**
     * <code>uint32 font_id = 1;</code>
     */
    public int getFontId() {
      return fontId_;
    }
    /**
     * <code>uint32 font_id = 1;</code>
     */
    public Builder setFontId(int value) {
      
      fontId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 font_id = 1;</code>
     */
    public Builder clearFontId() {
      
      fontId_ = 0;
      onChanged();
      return this;
    }

    private int count_ ;
    /**
     * <code>uint32 count = 2;</code>
     */
    public int getCount() {
      return count_;
    }
    /**
     * <code>uint32 count = 2;</code>
     */
    public Builder setCount(int value) {
      
      count_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 count = 2;</code>
     */
    public Builder clearCount() {
      
      count_ = 0;
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


    // @@protoc_insertion_point(builder_scope:webfontsdk.UseRate)
  }

  // @@protoc_insertion_point(class_scope:webfontsdk.UseRate)
  private static final io.grpc.sdk.webfont.UseRate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.sdk.webfont.UseRate();
  }

  public static io.grpc.sdk.webfont.UseRate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UseRate>
      PARSER = new com.google.protobuf.AbstractParser<UseRate>() {
    @java.lang.Override
    public UseRate parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UseRate(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UseRate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UseRate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.sdk.webfont.UseRate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
