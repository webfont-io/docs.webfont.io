// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: webfont.proto

package io.grpc.sdk.webfont;

/**
 * Protobuf type {@code webfontsdk.FontBuildBufResult}
 */
public  final class FontBuildBufResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:webfontsdk.FontBuildBufResult)
    FontBuildBufResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FontBuildBufResult.newBuilder() to construct.
  private FontBuildBufResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FontBuildBufResult() {
    nameEn_ = "";
    bytesTtf_ = com.google.protobuf.ByteString.EMPTY;
    bytesEot_ = com.google.protobuf.ByteString.EMPTY;
    bytesWoff_ = com.google.protobuf.ByteString.EMPTY;
    bytesWoff2_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FontBuildBufResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FontBuildBufResult(
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

            fontFormatVersion_ = input.readUInt32();
            break;
          }
          case 24: {

            fontChecksum_ = input.readUInt64();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            nameEn_ = s;
            break;
          }
          case 42: {

            bytesTtf_ = input.readBytes();
            break;
          }
          case 50: {

            bytesEot_ = input.readBytes();
            break;
          }
          case 58: {

            bytesWoff_ = input.readBytes();
            break;
          }
          case 66: {

            bytesWoff2_ = input.readBytes();
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
    return io.grpc.sdk.webfont.WebfontProto.internal_static_webfontsdk_FontBuildBufResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.sdk.webfont.WebfontProto.internal_static_webfontsdk_FontBuildBufResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.sdk.webfont.FontBuildBufResult.class, io.grpc.sdk.webfont.FontBuildBufResult.Builder.class);
  }

  public static final int FONT_ID_FIELD_NUMBER = 1;
  private int fontId_;
  /**
   * <code>uint32 font_id = 1;</code>
   */
  public int getFontId() {
    return fontId_;
  }

  public static final int FONT_FORMAT_VERSION_FIELD_NUMBER = 2;
  private int fontFormatVersion_;
  /**
   * <pre>
   *字体格式版本
   * </pre>
   *
   * <code>uint32 font_format_version = 2;</code>
   */
  public int getFontFormatVersion() {
    return fontFormatVersion_;
  }

  public static final int FONT_CHECKSUM_FIELD_NUMBER = 3;
  private long fontChecksum_;
  /**
   * <pre>
   *字体的唯一辨识编码
   * </pre>
   *
   * <code>uint64 font_checksum = 3;</code>
   */
  public long getFontChecksum() {
    return fontChecksum_;
  }

  public static final int NAME_EN_FIELD_NUMBER = 4;
  private volatile java.lang.Object nameEn_;
  /**
   * <code>string name_en = 4;</code>
   */
  public java.lang.String getNameEn() {
    java.lang.Object ref = nameEn_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nameEn_ = s;
      return s;
    }
  }
  /**
   * <code>string name_en = 4;</code>
   */
  public com.google.protobuf.ByteString
      getNameEnBytes() {
    java.lang.Object ref = nameEn_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nameEn_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BYTES_TTF_FIELD_NUMBER = 5;
  private com.google.protobuf.ByteString bytesTtf_;
  /**
   * <code>bytes bytes_ttf = 5;</code>
   */
  public com.google.protobuf.ByteString getBytesTtf() {
    return bytesTtf_;
  }

  public static final int BYTES_EOT_FIELD_NUMBER = 6;
  private com.google.protobuf.ByteString bytesEot_;
  /**
   * <code>bytes bytes_eot = 6;</code>
   */
  public com.google.protobuf.ByteString getBytesEot() {
    return bytesEot_;
  }

  public static final int BYTES_WOFF_FIELD_NUMBER = 7;
  private com.google.protobuf.ByteString bytesWoff_;
  /**
   * <code>bytes bytes_woff = 7;</code>
   */
  public com.google.protobuf.ByteString getBytesWoff() {
    return bytesWoff_;
  }

  public static final int BYTES_WOFF2_FIELD_NUMBER = 8;
  private com.google.protobuf.ByteString bytesWoff2_;
  /**
   * <code>bytes bytes_woff2 = 8;</code>
   */
  public com.google.protobuf.ByteString getBytesWoff2() {
    return bytesWoff2_;
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
    if (fontFormatVersion_ != 0) {
      output.writeUInt32(2, fontFormatVersion_);
    }
    if (fontChecksum_ != 0L) {
      output.writeUInt64(3, fontChecksum_);
    }
    if (!getNameEnBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, nameEn_);
    }
    if (!bytesTtf_.isEmpty()) {
      output.writeBytes(5, bytesTtf_);
    }
    if (!bytesEot_.isEmpty()) {
      output.writeBytes(6, bytesEot_);
    }
    if (!bytesWoff_.isEmpty()) {
      output.writeBytes(7, bytesWoff_);
    }
    if (!bytesWoff2_.isEmpty()) {
      output.writeBytes(8, bytesWoff2_);
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
    if (fontFormatVersion_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, fontFormatVersion_);
    }
    if (fontChecksum_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, fontChecksum_);
    }
    if (!getNameEnBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, nameEn_);
    }
    if (!bytesTtf_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(5, bytesTtf_);
    }
    if (!bytesEot_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(6, bytesEot_);
    }
    if (!bytesWoff_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(7, bytesWoff_);
    }
    if (!bytesWoff2_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(8, bytesWoff2_);
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
    if (!(obj instanceof io.grpc.sdk.webfont.FontBuildBufResult)) {
      return super.equals(obj);
    }
    io.grpc.sdk.webfont.FontBuildBufResult other = (io.grpc.sdk.webfont.FontBuildBufResult) obj;

    if (getFontId()
        != other.getFontId()) return false;
    if (getFontFormatVersion()
        != other.getFontFormatVersion()) return false;
    if (getFontChecksum()
        != other.getFontChecksum()) return false;
    if (!getNameEn()
        .equals(other.getNameEn())) return false;
    if (!getBytesTtf()
        .equals(other.getBytesTtf())) return false;
    if (!getBytesEot()
        .equals(other.getBytesEot())) return false;
    if (!getBytesWoff()
        .equals(other.getBytesWoff())) return false;
    if (!getBytesWoff2()
        .equals(other.getBytesWoff2())) return false;
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
    hash = (37 * hash) + FONT_FORMAT_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getFontFormatVersion();
    hash = (37 * hash) + FONT_CHECKSUM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFontChecksum());
    hash = (37 * hash) + NAME_EN_FIELD_NUMBER;
    hash = (53 * hash) + getNameEn().hashCode();
    hash = (37 * hash) + BYTES_TTF_FIELD_NUMBER;
    hash = (53 * hash) + getBytesTtf().hashCode();
    hash = (37 * hash) + BYTES_EOT_FIELD_NUMBER;
    hash = (53 * hash) + getBytesEot().hashCode();
    hash = (37 * hash) + BYTES_WOFF_FIELD_NUMBER;
    hash = (53 * hash) + getBytesWoff().hashCode();
    hash = (37 * hash) + BYTES_WOFF2_FIELD_NUMBER;
    hash = (53 * hash) + getBytesWoff2().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.sdk.webfont.FontBuildBufResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.sdk.webfont.FontBuildBufResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.sdk.webfont.FontBuildBufResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.sdk.webfont.FontBuildBufResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.sdk.webfont.FontBuildBufResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.sdk.webfont.FontBuildBufResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.sdk.webfont.FontBuildBufResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.sdk.webfont.FontBuildBufResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.sdk.webfont.FontBuildBufResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.sdk.webfont.FontBuildBufResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.sdk.webfont.FontBuildBufResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.sdk.webfont.FontBuildBufResult parseFrom(
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
  public static Builder newBuilder(io.grpc.sdk.webfont.FontBuildBufResult prototype) {
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
   * Protobuf type {@code webfontsdk.FontBuildBufResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:webfontsdk.FontBuildBufResult)
      io.grpc.sdk.webfont.FontBuildBufResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.sdk.webfont.WebfontProto.internal_static_webfontsdk_FontBuildBufResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.sdk.webfont.WebfontProto.internal_static_webfontsdk_FontBuildBufResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.sdk.webfont.FontBuildBufResult.class, io.grpc.sdk.webfont.FontBuildBufResult.Builder.class);
    }

    // Construct using io.grpc.sdk.webfont.FontBuildBufResult.newBuilder()
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

      fontFormatVersion_ = 0;

      fontChecksum_ = 0L;

      nameEn_ = "";

      bytesTtf_ = com.google.protobuf.ByteString.EMPTY;

      bytesEot_ = com.google.protobuf.ByteString.EMPTY;

      bytesWoff_ = com.google.protobuf.ByteString.EMPTY;

      bytesWoff2_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.sdk.webfont.WebfontProto.internal_static_webfontsdk_FontBuildBufResult_descriptor;
    }

    @java.lang.Override
    public io.grpc.sdk.webfont.FontBuildBufResult getDefaultInstanceForType() {
      return io.grpc.sdk.webfont.FontBuildBufResult.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.sdk.webfont.FontBuildBufResult build() {
      io.grpc.sdk.webfont.FontBuildBufResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.sdk.webfont.FontBuildBufResult buildPartial() {
      io.grpc.sdk.webfont.FontBuildBufResult result = new io.grpc.sdk.webfont.FontBuildBufResult(this);
      result.fontId_ = fontId_;
      result.fontFormatVersion_ = fontFormatVersion_;
      result.fontChecksum_ = fontChecksum_;
      result.nameEn_ = nameEn_;
      result.bytesTtf_ = bytesTtf_;
      result.bytesEot_ = bytesEot_;
      result.bytesWoff_ = bytesWoff_;
      result.bytesWoff2_ = bytesWoff2_;
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
      if (other instanceof io.grpc.sdk.webfont.FontBuildBufResult) {
        return mergeFrom((io.grpc.sdk.webfont.FontBuildBufResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.sdk.webfont.FontBuildBufResult other) {
      if (other == io.grpc.sdk.webfont.FontBuildBufResult.getDefaultInstance()) return this;
      if (other.getFontId() != 0) {
        setFontId(other.getFontId());
      }
      if (other.getFontFormatVersion() != 0) {
        setFontFormatVersion(other.getFontFormatVersion());
      }
      if (other.getFontChecksum() != 0L) {
        setFontChecksum(other.getFontChecksum());
      }
      if (!other.getNameEn().isEmpty()) {
        nameEn_ = other.nameEn_;
        onChanged();
      }
      if (other.getBytesTtf() != com.google.protobuf.ByteString.EMPTY) {
        setBytesTtf(other.getBytesTtf());
      }
      if (other.getBytesEot() != com.google.protobuf.ByteString.EMPTY) {
        setBytesEot(other.getBytesEot());
      }
      if (other.getBytesWoff() != com.google.protobuf.ByteString.EMPTY) {
        setBytesWoff(other.getBytesWoff());
      }
      if (other.getBytesWoff2() != com.google.protobuf.ByteString.EMPTY) {
        setBytesWoff2(other.getBytesWoff2());
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
      io.grpc.sdk.webfont.FontBuildBufResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.sdk.webfont.FontBuildBufResult) e.getUnfinishedMessage();
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

    private int fontFormatVersion_ ;
    /**
     * <pre>
     *字体格式版本
     * </pre>
     *
     * <code>uint32 font_format_version = 2;</code>
     */
    public int getFontFormatVersion() {
      return fontFormatVersion_;
    }
    /**
     * <pre>
     *字体格式版本
     * </pre>
     *
     * <code>uint32 font_format_version = 2;</code>
     */
    public Builder setFontFormatVersion(int value) {
      
      fontFormatVersion_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *字体格式版本
     * </pre>
     *
     * <code>uint32 font_format_version = 2;</code>
     */
    public Builder clearFontFormatVersion() {
      
      fontFormatVersion_ = 0;
      onChanged();
      return this;
    }

    private long fontChecksum_ ;
    /**
     * <pre>
     *字体的唯一辨识编码
     * </pre>
     *
     * <code>uint64 font_checksum = 3;</code>
     */
    public long getFontChecksum() {
      return fontChecksum_;
    }
    /**
     * <pre>
     *字体的唯一辨识编码
     * </pre>
     *
     * <code>uint64 font_checksum = 3;</code>
     */
    public Builder setFontChecksum(long value) {
      
      fontChecksum_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *字体的唯一辨识编码
     * </pre>
     *
     * <code>uint64 font_checksum = 3;</code>
     */
    public Builder clearFontChecksum() {
      
      fontChecksum_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object nameEn_ = "";
    /**
     * <code>string name_en = 4;</code>
     */
    public java.lang.String getNameEn() {
      java.lang.Object ref = nameEn_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nameEn_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name_en = 4;</code>
     */
    public com.google.protobuf.ByteString
        getNameEnBytes() {
      java.lang.Object ref = nameEn_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nameEn_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name_en = 4;</code>
     */
    public Builder setNameEn(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nameEn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name_en = 4;</code>
     */
    public Builder clearNameEn() {
      
      nameEn_ = getDefaultInstance().getNameEn();
      onChanged();
      return this;
    }
    /**
     * <code>string name_en = 4;</code>
     */
    public Builder setNameEnBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nameEn_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString bytesTtf_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes bytes_ttf = 5;</code>
     */
    public com.google.protobuf.ByteString getBytesTtf() {
      return bytesTtf_;
    }
    /**
     * <code>bytes bytes_ttf = 5;</code>
     */
    public Builder setBytesTtf(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bytesTtf_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes bytes_ttf = 5;</code>
     */
    public Builder clearBytesTtf() {
      
      bytesTtf_ = getDefaultInstance().getBytesTtf();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString bytesEot_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes bytes_eot = 6;</code>
     */
    public com.google.protobuf.ByteString getBytesEot() {
      return bytesEot_;
    }
    /**
     * <code>bytes bytes_eot = 6;</code>
     */
    public Builder setBytesEot(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bytesEot_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes bytes_eot = 6;</code>
     */
    public Builder clearBytesEot() {
      
      bytesEot_ = getDefaultInstance().getBytesEot();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString bytesWoff_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes bytes_woff = 7;</code>
     */
    public com.google.protobuf.ByteString getBytesWoff() {
      return bytesWoff_;
    }
    /**
     * <code>bytes bytes_woff = 7;</code>
     */
    public Builder setBytesWoff(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bytesWoff_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes bytes_woff = 7;</code>
     */
    public Builder clearBytesWoff() {
      
      bytesWoff_ = getDefaultInstance().getBytesWoff();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString bytesWoff2_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes bytes_woff2 = 8;</code>
     */
    public com.google.protobuf.ByteString getBytesWoff2() {
      return bytesWoff2_;
    }
    /**
     * <code>bytes bytes_woff2 = 8;</code>
     */
    public Builder setBytesWoff2(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bytesWoff2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes bytes_woff2 = 8;</code>
     */
    public Builder clearBytesWoff2() {
      
      bytesWoff2_ = getDefaultInstance().getBytesWoff2();
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


    // @@protoc_insertion_point(builder_scope:webfontsdk.FontBuildBufResult)
  }

  // @@protoc_insertion_point(class_scope:webfontsdk.FontBuildBufResult)
  private static final io.grpc.sdk.webfont.FontBuildBufResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.sdk.webfont.FontBuildBufResult();
  }

  public static io.grpc.sdk.webfont.FontBuildBufResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FontBuildBufResult>
      PARSER = new com.google.protobuf.AbstractParser<FontBuildBufResult>() {
    @java.lang.Override
    public FontBuildBufResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FontBuildBufResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FontBuildBufResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FontBuildBufResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.sdk.webfont.FontBuildBufResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

