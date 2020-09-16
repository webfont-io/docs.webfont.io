// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: webfont.proto

package io.grpc.sdk.webfont;

/**
 * Protobuf type {@code webfontsdk.FontListResult}
 */
public  final class FontListResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:webfontsdk.FontListResult)
    FontListResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FontListResult.newBuilder() to construct.
  private FontListResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FontListResult() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FontListResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FontListResult(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              fonts_ = com.google.protobuf.MapField.newMapField(
                  FontsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Long>
            fonts__ = input.readMessage(
                FontsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            fonts_.getMutableMap().put(
                fonts__.getKey(), fonts__.getValue());
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
    return io.grpc.sdk.webfont.WebfontProto.internal_static_webfontsdk_FontListResult_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetFonts();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.sdk.webfont.WebfontProto.internal_static_webfontsdk_FontListResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.sdk.webfont.FontListResult.class, io.grpc.sdk.webfont.FontListResult.Builder.class);
  }

  public static final int FONTS_FIELD_NUMBER = 1;
  private static final class FontsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.Integer, java.lang.Long> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.Integer, java.lang.Long>newDefaultInstance(
                io.grpc.sdk.webfont.WebfontProto.internal_static_webfontsdk_FontListResult_FontsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.UINT32,
                0,
                com.google.protobuf.WireFormat.FieldType.INT64,
                0L);
  }
  private com.google.protobuf.MapField<
      java.lang.Integer, java.lang.Long> fonts_;
  private com.google.protobuf.MapField<java.lang.Integer, java.lang.Long>
  internalGetFonts() {
    if (fonts_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          FontsDefaultEntryHolder.defaultEntry);
    }
    return fonts_;
  }

  public int getFontsCount() {
    return internalGetFonts().getMap().size();
  }
  /**
   * <code>map&lt;uint32, int64&gt; fonts = 1;</code>
   */

  public boolean containsFonts(
      int key) {
    
    return internalGetFonts().getMap().containsKey(key);
  }
  /**
   * Use {@link #getFontsMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.Integer, java.lang.Long> getFonts() {
    return getFontsMap();
  }
  /**
   * <code>map&lt;uint32, int64&gt; fonts = 1;</code>
   */

  public java.util.Map<java.lang.Integer, java.lang.Long> getFontsMap() {
    return internalGetFonts().getMap();
  }
  /**
   * <code>map&lt;uint32, int64&gt; fonts = 1;</code>
   */

  public long getFontsOrDefault(
      int key,
      long defaultValue) {
    
    java.util.Map<java.lang.Integer, java.lang.Long> map =
        internalGetFonts().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;uint32, int64&gt; fonts = 1;</code>
   */

  public long getFontsOrThrow(
      int key) {
    
    java.util.Map<java.lang.Integer, java.lang.Long> map =
        internalGetFonts().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeIntegerMapTo(
        output,
        internalGetFonts(),
        FontsDefaultEntryHolder.defaultEntry,
        1);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.Integer, java.lang.Long> entry
         : internalGetFonts().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Long>
      fonts__ = FontsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, fonts__);
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
    if (!(obj instanceof io.grpc.sdk.webfont.FontListResult)) {
      return super.equals(obj);
    }
    io.grpc.sdk.webfont.FontListResult other = (io.grpc.sdk.webfont.FontListResult) obj;

    if (!internalGetFonts().equals(
        other.internalGetFonts())) return false;
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
    if (!internalGetFonts().getMap().isEmpty()) {
      hash = (37 * hash) + FONTS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetFonts().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.sdk.webfont.FontListResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.sdk.webfont.FontListResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.sdk.webfont.FontListResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.sdk.webfont.FontListResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.sdk.webfont.FontListResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.sdk.webfont.FontListResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.sdk.webfont.FontListResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.sdk.webfont.FontListResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.sdk.webfont.FontListResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.sdk.webfont.FontListResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.sdk.webfont.FontListResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.sdk.webfont.FontListResult parseFrom(
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
  public static Builder newBuilder(io.grpc.sdk.webfont.FontListResult prototype) {
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
   * Protobuf type {@code webfontsdk.FontListResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:webfontsdk.FontListResult)
      io.grpc.sdk.webfont.FontListResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.sdk.webfont.WebfontProto.internal_static_webfontsdk_FontListResult_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetFonts();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableFonts();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.sdk.webfont.WebfontProto.internal_static_webfontsdk_FontListResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.sdk.webfont.FontListResult.class, io.grpc.sdk.webfont.FontListResult.Builder.class);
    }

    // Construct using io.grpc.sdk.webfont.FontListResult.newBuilder()
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
      internalGetMutableFonts().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.sdk.webfont.WebfontProto.internal_static_webfontsdk_FontListResult_descriptor;
    }

    @java.lang.Override
    public io.grpc.sdk.webfont.FontListResult getDefaultInstanceForType() {
      return io.grpc.sdk.webfont.FontListResult.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.sdk.webfont.FontListResult build() {
      io.grpc.sdk.webfont.FontListResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.sdk.webfont.FontListResult buildPartial() {
      io.grpc.sdk.webfont.FontListResult result = new io.grpc.sdk.webfont.FontListResult(this);
      int from_bitField0_ = bitField0_;
      result.fonts_ = internalGetFonts();
      result.fonts_.makeImmutable();
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
      if (other instanceof io.grpc.sdk.webfont.FontListResult) {
        return mergeFrom((io.grpc.sdk.webfont.FontListResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.sdk.webfont.FontListResult other) {
      if (other == io.grpc.sdk.webfont.FontListResult.getDefaultInstance()) return this;
      internalGetMutableFonts().mergeFrom(
          other.internalGetFonts());
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
      io.grpc.sdk.webfont.FontListResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.sdk.webfont.FontListResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Long> fonts_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Long>
    internalGetFonts() {
      if (fonts_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            FontsDefaultEntryHolder.defaultEntry);
      }
      return fonts_;
    }
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Long>
    internalGetMutableFonts() {
      onChanged();;
      if (fonts_ == null) {
        fonts_ = com.google.protobuf.MapField.newMapField(
            FontsDefaultEntryHolder.defaultEntry);
      }
      if (!fonts_.isMutable()) {
        fonts_ = fonts_.copy();
      }
      return fonts_;
    }

    public int getFontsCount() {
      return internalGetFonts().getMap().size();
    }
    /**
     * <code>map&lt;uint32, int64&gt; fonts = 1;</code>
     */

    public boolean containsFonts(
        int key) {
      
      return internalGetFonts().getMap().containsKey(key);
    }
    /**
     * Use {@link #getFontsMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Long> getFonts() {
      return getFontsMap();
    }
    /**
     * <code>map&lt;uint32, int64&gt; fonts = 1;</code>
     */

    public java.util.Map<java.lang.Integer, java.lang.Long> getFontsMap() {
      return internalGetFonts().getMap();
    }
    /**
     * <code>map&lt;uint32, int64&gt; fonts = 1;</code>
     */

    public long getFontsOrDefault(
        int key,
        long defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Long> map =
          internalGetFonts().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, int64&gt; fonts = 1;</code>
     */

    public long getFontsOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Long> map =
          internalGetFonts().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearFonts() {
      internalGetMutableFonts().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;uint32, int64&gt; fonts = 1;</code>
     */

    public Builder removeFonts(
        int key) {
      
      internalGetMutableFonts().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Long>
    getMutableFonts() {
      return internalGetMutableFonts().getMutableMap();
    }
    /**
     * <code>map&lt;uint32, int64&gt; fonts = 1;</code>
     */
    public Builder putFonts(
        int key,
        long value) {
      
      
      internalGetMutableFonts().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;uint32, int64&gt; fonts = 1;</code>
     */

    public Builder putAllFonts(
        java.util.Map<java.lang.Integer, java.lang.Long> values) {
      internalGetMutableFonts().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:webfontsdk.FontListResult)
  }

  // @@protoc_insertion_point(class_scope:webfontsdk.FontListResult)
  private static final io.grpc.sdk.webfont.FontListResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.sdk.webfont.FontListResult();
  }

  public static io.grpc.sdk.webfont.FontListResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FontListResult>
      PARSER = new com.google.protobuf.AbstractParser<FontListResult>() {
    @java.lang.Override
    public FontListResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FontListResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FontListResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FontListResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.sdk.webfont.FontListResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
