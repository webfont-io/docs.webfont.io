// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: webfont.proto

package io.grpc.sdk.webfont;

/**
 * Protobuf type {@code webfontsdk.GetUseRateResult}
 */
public  final class GetUseRateResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:webfontsdk.GetUseRateResult)
    GetUseRateResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetUseRateResult.newBuilder() to construct.
  private GetUseRateResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetUseRateResult() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetUseRateResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetUseRateResult(
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
              items_ = com.google.protobuf.MapField.newMapField(
                  ItemsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
            items__ = input.readMessage(
                ItemsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            items_.getMutableMap().put(
                items__.getKey(), items__.getValue());
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
    return io.grpc.sdk.webfont.WebfontProto.internal_static_webfontsdk_GetUseRateResult_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetItems();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.sdk.webfont.WebfontProto.internal_static_webfontsdk_GetUseRateResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.sdk.webfont.GetUseRateResult.class, io.grpc.sdk.webfont.GetUseRateResult.Builder.class);
  }

  public static final int ITEMS_FIELD_NUMBER = 1;
  private static final class ItemsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.Integer, java.lang.Integer> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                io.grpc.sdk.webfont.WebfontProto.internal_static_webfontsdk_GetUseRateResult_ItemsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.UINT32,
                0,
                com.google.protobuf.WireFormat.FieldType.UINT32,
                0);
  }
  private com.google.protobuf.MapField<
      java.lang.Integer, java.lang.Integer> items_;
  private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
  internalGetItems() {
    if (items_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ItemsDefaultEntryHolder.defaultEntry);
    }
    return items_;
  }

  public int getItemsCount() {
    return internalGetItems().getMap().size();
  }
  /**
   * <pre>
   *repeated UseRate items=1;
   * </pre>
   *
   * <code>map&lt;uint32, uint32&gt; items = 1;</code>
   */

  public boolean containsItems(
      int key) {
    
    return internalGetItems().getMap().containsKey(key);
  }
  /**
   * Use {@link #getItemsMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.Integer, java.lang.Integer> getItems() {
    return getItemsMap();
  }
  /**
   * <pre>
   *repeated UseRate items=1;
   * </pre>
   *
   * <code>map&lt;uint32, uint32&gt; items = 1;</code>
   */

  public java.util.Map<java.lang.Integer, java.lang.Integer> getItemsMap() {
    return internalGetItems().getMap();
  }
  /**
   * <pre>
   *repeated UseRate items=1;
   * </pre>
   *
   * <code>map&lt;uint32, uint32&gt; items = 1;</code>
   */

  public int getItemsOrDefault(
      int key,
      int defaultValue) {
    
    java.util.Map<java.lang.Integer, java.lang.Integer> map =
        internalGetItems().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   *repeated UseRate items=1;
   * </pre>
   *
   * <code>map&lt;uint32, uint32&gt; items = 1;</code>
   */

  public int getItemsOrThrow(
      int key) {
    
    java.util.Map<java.lang.Integer, java.lang.Integer> map =
        internalGetItems().getMap();
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
        internalGetItems(),
        ItemsDefaultEntryHolder.defaultEntry,
        1);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
         : internalGetItems().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
      items__ = ItemsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, items__);
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
    if (!(obj instanceof io.grpc.sdk.webfont.GetUseRateResult)) {
      return super.equals(obj);
    }
    io.grpc.sdk.webfont.GetUseRateResult other = (io.grpc.sdk.webfont.GetUseRateResult) obj;

    if (!internalGetItems().equals(
        other.internalGetItems())) return false;
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
    if (!internalGetItems().getMap().isEmpty()) {
      hash = (37 * hash) + ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetItems().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.sdk.webfont.GetUseRateResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.sdk.webfont.GetUseRateResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.sdk.webfont.GetUseRateResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.sdk.webfont.GetUseRateResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.sdk.webfont.GetUseRateResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.sdk.webfont.GetUseRateResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.sdk.webfont.GetUseRateResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.sdk.webfont.GetUseRateResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.sdk.webfont.GetUseRateResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.sdk.webfont.GetUseRateResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.sdk.webfont.GetUseRateResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.sdk.webfont.GetUseRateResult parseFrom(
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
  public static Builder newBuilder(io.grpc.sdk.webfont.GetUseRateResult prototype) {
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
   * Protobuf type {@code webfontsdk.GetUseRateResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:webfontsdk.GetUseRateResult)
      io.grpc.sdk.webfont.GetUseRateResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.sdk.webfont.WebfontProto.internal_static_webfontsdk_GetUseRateResult_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetItems();
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
          return internalGetMutableItems();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.sdk.webfont.WebfontProto.internal_static_webfontsdk_GetUseRateResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.sdk.webfont.GetUseRateResult.class, io.grpc.sdk.webfont.GetUseRateResult.Builder.class);
    }

    // Construct using io.grpc.sdk.webfont.GetUseRateResult.newBuilder()
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
      internalGetMutableItems().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.sdk.webfont.WebfontProto.internal_static_webfontsdk_GetUseRateResult_descriptor;
    }

    @java.lang.Override
    public io.grpc.sdk.webfont.GetUseRateResult getDefaultInstanceForType() {
      return io.grpc.sdk.webfont.GetUseRateResult.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.sdk.webfont.GetUseRateResult build() {
      io.grpc.sdk.webfont.GetUseRateResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.sdk.webfont.GetUseRateResult buildPartial() {
      io.grpc.sdk.webfont.GetUseRateResult result = new io.grpc.sdk.webfont.GetUseRateResult(this);
      int from_bitField0_ = bitField0_;
      result.items_ = internalGetItems();
      result.items_.makeImmutable();
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
      if (other instanceof io.grpc.sdk.webfont.GetUseRateResult) {
        return mergeFrom((io.grpc.sdk.webfont.GetUseRateResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.sdk.webfont.GetUseRateResult other) {
      if (other == io.grpc.sdk.webfont.GetUseRateResult.getDefaultInstance()) return this;
      internalGetMutableItems().mergeFrom(
          other.internalGetItems());
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
      io.grpc.sdk.webfont.GetUseRateResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.sdk.webfont.GetUseRateResult) e.getUnfinishedMessage();
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
        java.lang.Integer, java.lang.Integer> items_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetItems() {
      if (items_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ItemsDefaultEntryHolder.defaultEntry);
      }
      return items_;
    }
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetMutableItems() {
      onChanged();;
      if (items_ == null) {
        items_ = com.google.protobuf.MapField.newMapField(
            ItemsDefaultEntryHolder.defaultEntry);
      }
      if (!items_.isMutable()) {
        items_ = items_.copy();
      }
      return items_;
    }

    public int getItemsCount() {
      return internalGetItems().getMap().size();
    }
    /**
     * <pre>
     *repeated UseRate items=1;
     * </pre>
     *
     * <code>map&lt;uint32, uint32&gt; items = 1;</code>
     */

    public boolean containsItems(
        int key) {
      
      return internalGetItems().getMap().containsKey(key);
    }
    /**
     * Use {@link #getItemsMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getItems() {
      return getItemsMap();
    }
    /**
     * <pre>
     *repeated UseRate items=1;
     * </pre>
     *
     * <code>map&lt;uint32, uint32&gt; items = 1;</code>
     */

    public java.util.Map<java.lang.Integer, java.lang.Integer> getItemsMap() {
      return internalGetItems().getMap();
    }
    /**
     * <pre>
     *repeated UseRate items=1;
     * </pre>
     *
     * <code>map&lt;uint32, uint32&gt; items = 1;</code>
     */

    public int getItemsOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetItems().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     *repeated UseRate items=1;
     * </pre>
     *
     * <code>map&lt;uint32, uint32&gt; items = 1;</code>
     */

    public int getItemsOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetItems().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearItems() {
      internalGetMutableItems().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     *repeated UseRate items=1;
     * </pre>
     *
     * <code>map&lt;uint32, uint32&gt; items = 1;</code>
     */

    public Builder removeItems(
        int key) {
      
      internalGetMutableItems().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer>
    getMutableItems() {
      return internalGetMutableItems().getMutableMap();
    }
    /**
     * <pre>
     *repeated UseRate items=1;
     * </pre>
     *
     * <code>map&lt;uint32, uint32&gt; items = 1;</code>
     */
    public Builder putItems(
        int key,
        int value) {
      
      
      internalGetMutableItems().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     *repeated UseRate items=1;
     * </pre>
     *
     * <code>map&lt;uint32, uint32&gt; items = 1;</code>
     */

    public Builder putAllItems(
        java.util.Map<java.lang.Integer, java.lang.Integer> values) {
      internalGetMutableItems().getMutableMap()
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


    // @@protoc_insertion_point(builder_scope:webfontsdk.GetUseRateResult)
  }

  // @@protoc_insertion_point(class_scope:webfontsdk.GetUseRateResult)
  private static final io.grpc.sdk.webfont.GetUseRateResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.sdk.webfont.GetUseRateResult();
  }

  public static io.grpc.sdk.webfont.GetUseRateResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetUseRateResult>
      PARSER = new com.google.protobuf.AbstractParser<GetUseRateResult>() {
    @java.lang.Override
    public GetUseRateResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetUseRateResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetUseRateResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetUseRateResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.sdk.webfont.GetUseRateResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

