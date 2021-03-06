// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: webfont.proto

package io.grpc.sdk.webfont;

public interface GetMultGlyfsUnicodeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:webfontsdk.GetMultGlyfsUnicodeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string apikey = 1;</code>
   */
  java.lang.String getApikey();
  /**
   * <code>string apikey = 1;</code>
   */
  com.google.protobuf.ByteString
      getApikeyBytes();

  /**
   * <code>uint32 font_id = 2;</code>
   */
  int getFontId();

  /**
   * <code>uint32 font_checksum = 3;</code>
   */
  int getFontChecksum();

  /**
   * <code>repeated uint32 unicodes = 4;</code>
   */
  java.util.List<java.lang.Integer> getUnicodesList();
  /**
   * <code>repeated uint32 unicodes = 4;</code>
   */
  int getUnicodesCount();
  /**
   * <code>repeated uint32 unicodes = 4;</code>
   */
  int getUnicodes(int index);

  /**
   * <pre>
   *追加0
   * </pre>
   *
   * <code>bool append_zero = 5;</code>
   */
  boolean getAppendZero();
}
