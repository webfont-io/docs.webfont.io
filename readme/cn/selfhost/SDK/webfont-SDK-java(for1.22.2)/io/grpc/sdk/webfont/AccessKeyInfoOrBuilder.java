// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: webfont.proto

package io.grpc.sdk.webfont;

public interface AccessKeyInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:webfontsdk.AccessKeyInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string accesskey = 1;</code>
   */
  java.lang.String getAccesskey();
  /**
   * <code>string accesskey = 1;</code>
   */
  com.google.protobuf.ByteString
      getAccesskeyBytes();

  /**
   * <code>uint64 user_uid = 2;</code>
   */
  long getUserUid();

  /**
   * <code>uint32 font_id = 3;</code>
   */
  int getFontId();

  /**
   * <code>int64 add_time = 4;</code>
   */
  long getAddTime();

  /**
   * <code>string uuid = 5;</code>
   */
  java.lang.String getUuid();
  /**
   * <code>string uuid = 5;</code>
   */
  com.google.protobuf.ByteString
      getUuidBytes();
}
