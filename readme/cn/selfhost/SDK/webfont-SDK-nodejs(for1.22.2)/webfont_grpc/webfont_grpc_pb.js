// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var webfont_pb = require('./webfont_pb.js');

function serialize_webfontsdk_AccessKeyInfo(arg) {
  if (!(arg instanceof webfont_pb.AccessKeyInfo)) {
    throw new Error('Expected argument of type webfontsdk.AccessKeyInfo');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_webfontsdk_AccessKeyInfo(buffer_arg) {
  return webfont_pb.AccessKeyInfo.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_webfontsdk_FontBuildAccessKeyRequest(arg) {
  if (!(arg instanceof webfont_pb.FontBuildAccessKeyRequest)) {
    throw new Error('Expected argument of type webfontsdk.FontBuildAccessKeyRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_webfontsdk_FontBuildAccessKeyRequest(buffer_arg) {
  return webfont_pb.FontBuildAccessKeyRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_webfontsdk_FontBuildBufResult(arg) {
  if (!(arg instanceof webfont_pb.FontBuildBufResult)) {
    throw new Error('Expected argument of type webfontsdk.FontBuildBufResult');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_webfontsdk_FontBuildBufResult(buffer_arg) {
  return webfont_pb.FontBuildBufResult.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_webfontsdk_FontBuildRequest(arg) {
  if (!(arg instanceof webfont_pb.FontBuildRequest)) {
    throw new Error('Expected argument of type webfontsdk.FontBuildRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_webfontsdk_FontBuildRequest(buffer_arg) {
  return webfont_pb.FontBuildRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_webfontsdk_FontListRequest(arg) {
  if (!(arg instanceof webfont_pb.FontListRequest)) {
    throw new Error('Expected argument of type webfontsdk.FontListRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_webfontsdk_FontListRequest(buffer_arg) {
  return webfont_pb.FontListRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_webfontsdk_FontListResult(arg) {
  if (!(arg instanceof webfont_pb.FontListResult)) {
    throw new Error('Expected argument of type webfontsdk.FontListResult');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_webfontsdk_FontListResult(buffer_arg) {
  return webfont_pb.FontListResult.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_webfontsdk_GetAccessKeyInfoRequest(arg) {
  if (!(arg instanceof webfont_pb.GetAccessKeyInfoRequest)) {
    throw new Error('Expected argument of type webfontsdk.GetAccessKeyInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_webfontsdk_GetAccessKeyInfoRequest(buffer_arg) {
  return webfont_pb.GetAccessKeyInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_webfontsdk_GetFontListReply(arg) {
  if (!(arg instanceof webfont_pb.GetFontListReply)) {
    throw new Error('Expected argument of type webfontsdk.GetFontListReply');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_webfontsdk_GetFontListReply(buffer_arg) {
  return webfont_pb.GetFontListReply.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_webfontsdk_GetFontListRequest(arg) {
  if (!(arg instanceof webfont_pb.GetFontListRequest)) {
    throw new Error('Expected argument of type webfontsdk.GetFontListRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_webfontsdk_GetFontListRequest(buffer_arg) {
  return webfont_pb.GetFontListRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_webfontsdk_GetMultGlyfsUnicodeRequest(arg) {
  if (!(arg instanceof webfont_pb.GetMultGlyfsUnicodeRequest)) {
    throw new Error('Expected argument of type webfontsdk.GetMultGlyfsUnicodeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_webfontsdk_GetMultGlyfsUnicodeRequest(buffer_arg) {
  return webfont_pb.GetMultGlyfsUnicodeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_webfontsdk_GetMultGlyfsUnicodeResult(arg) {
  if (!(arg instanceof webfont_pb.GetMultGlyfsUnicodeResult)) {
    throw new Error('Expected argument of type webfontsdk.GetMultGlyfsUnicodeResult');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_webfontsdk_GetMultGlyfsUnicodeResult(buffer_arg) {
  return webfont_pb.GetMultGlyfsUnicodeResult.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_webfontsdk_GetProfileWithoutMapRequest(arg) {
  if (!(arg instanceof webfont_pb.GetProfileWithoutMapRequest)) {
    throw new Error('Expected argument of type webfontsdk.GetProfileWithoutMapRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_webfontsdk_GetProfileWithoutMapRequest(buffer_arg) {
  return webfont_pb.GetProfileWithoutMapRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_webfontsdk_GetProfileWithoutMapResult(arg) {
  if (!(arg instanceof webfont_pb.GetProfileWithoutMapResult)) {
    throw new Error('Expected argument of type webfontsdk.GetProfileWithoutMapResult');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_webfontsdk_GetProfileWithoutMapResult(buffer_arg) {
  return webfont_pb.GetProfileWithoutMapResult.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_webfontsdk_HelloReply(arg) {
  if (!(arg instanceof webfont_pb.HelloReply)) {
    throw new Error('Expected argument of type webfontsdk.HelloReply');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_webfontsdk_HelloReply(buffer_arg) {
  return webfont_pb.HelloReply.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_webfontsdk_HelloRequest(arg) {
  if (!(arg instanceof webfont_pb.HelloRequest)) {
    throw new Error('Expected argument of type webfontsdk.HelloRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_webfontsdk_HelloRequest(buffer_arg) {
  return webfont_pb.HelloRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_webfontsdk_MultFontBuildBufResult(arg) {
  if (!(arg instanceof webfont_pb.MultFontBuildBufResult)) {
    throw new Error('Expected argument of type webfontsdk.MultFontBuildBufResult');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_webfontsdk_MultFontBuildBufResult(buffer_arg) {
  return webfont_pb.MultFontBuildBufResult.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_webfontsdk_MultFontBuildRequest(arg) {
  if (!(arg instanceof webfont_pb.MultFontBuildRequest)) {
    throw new Error('Expected argument of type webfontsdk.MultFontBuildRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_webfontsdk_MultFontBuildRequest(buffer_arg) {
  return webfont_pb.MultFontBuildRequest.deserializeBinary(new Uint8Array(buffer_arg));
}


// The greeting service definition.
var GreeterService = exports.GreeterService = {
  // Sends a greeting
sayHello: {
    path: '/webfontsdk.Greeter/SayHello',
    requestStream: false,
    responseStream: false,
    requestType: webfont_pb.HelloRequest,
    responseType: webfont_pb.HelloReply,
    requestSerialize: serialize_webfontsdk_HelloRequest,
    requestDeserialize: deserialize_webfontsdk_HelloRequest,
    responseSerialize: serialize_webfontsdk_HelloReply,
    responseDeserialize: deserialize_webfontsdk_HelloReply,
  },
  // BuildFont
buildFont: {
    path: '/webfontsdk.Greeter/BuildFont',
    requestStream: false,
    responseStream: false,
    requestType: webfont_pb.FontBuildRequest,
    responseType: webfont_pb.FontBuildBufResult,
    requestSerialize: serialize_webfontsdk_FontBuildRequest,
    requestDeserialize: deserialize_webfontsdk_FontBuildRequest,
    responseSerialize: serialize_webfontsdk_FontBuildBufResult,
    responseDeserialize: deserialize_webfontsdk_FontBuildBufResult,
  },
  // BuildFontForAccessKey
buildFontForAccessKey: {
    path: '/webfontsdk.Greeter/BuildFontForAccessKey',
    requestStream: false,
    responseStream: false,
    requestType: webfont_pb.FontBuildAccessKeyRequest,
    responseType: webfont_pb.FontBuildBufResult,
    requestSerialize: serialize_webfontsdk_FontBuildAccessKeyRequest,
    requestDeserialize: deserialize_webfontsdk_FontBuildAccessKeyRequest,
    responseSerialize: serialize_webfontsdk_FontBuildBufResult,
    responseDeserialize: deserialize_webfontsdk_FontBuildBufResult,
  },
  // MultBuildFont
multBuildFont: {
    path: '/webfontsdk.Greeter/MultBuildFont',
    requestStream: false,
    responseStream: false,
    requestType: webfont_pb.MultFontBuildRequest,
    responseType: webfont_pb.MultFontBuildBufResult,
    requestSerialize: serialize_webfontsdk_MultFontBuildRequest,
    requestDeserialize: deserialize_webfontsdk_MultFontBuildRequest,
    responseSerialize: serialize_webfontsdk_MultFontBuildBufResult,
    responseDeserialize: deserialize_webfontsdk_MultFontBuildBufResult,
  },
  // Get my fontlist
fontList: {
    path: '/webfontsdk.Greeter/FontList',
    requestStream: false,
    responseStream: false,
    requestType: webfont_pb.FontListRequest,
    responseType: webfont_pb.FontListResult,
    requestSerialize: serialize_webfontsdk_FontListRequest,
    requestDeserialize: deserialize_webfontsdk_FontListRequest,
    responseSerialize: serialize_webfontsdk_FontListResult,
    responseDeserialize: deserialize_webfontsdk_FontListResult,
  },
  // GetProfile
getProfileWithoutMap: {
    path: '/webfontsdk.Greeter/GetProfileWithoutMap',
    requestStream: false,
    responseStream: false,
    requestType: webfont_pb.GetProfileWithoutMapRequest,
    responseType: webfont_pb.GetProfileWithoutMapResult,
    requestSerialize: serialize_webfontsdk_GetProfileWithoutMapRequest,
    requestDeserialize: deserialize_webfontsdk_GetProfileWithoutMapRequest,
    responseSerialize: serialize_webfontsdk_GetProfileWithoutMapResult,
    responseDeserialize: deserialize_webfontsdk_GetProfileWithoutMapResult,
  },
  // GetUnicodeIndexs
// rpc GetUnicodeIndexs(GetUnicodeIndexsRequest) returns (GetUnicodeIndexsResult) {}
//
// GetGlyfs Index
// rpc GetGlyfsIndex(GetGlyfsIndexRequest) returns (GetGlyfsIndexResult) {}
//
// GetGlyfs Unicode
// rpc GetGlyfsUnicode(GetGlyfsUnicodeRequest) returns (GetGlyfsUnicodeResult) {}
//
// GetMultGlyfsUnicode
getMultGlyfsUnicode: {
    path: '/webfontsdk.Greeter/GetMultGlyfsUnicode',
    requestStream: false,
    responseStream: false,
    requestType: webfont_pb.GetMultGlyfsUnicodeRequest,
    responseType: webfont_pb.GetMultGlyfsUnicodeResult,
    requestSerialize: serialize_webfontsdk_GetMultGlyfsUnicodeRequest,
    requestDeserialize: deserialize_webfontsdk_GetMultGlyfsUnicodeRequest,
    responseSerialize: serialize_webfontsdk_GetMultGlyfsUnicodeResult,
    responseDeserialize: deserialize_webfontsdk_GetMultGlyfsUnicodeResult,
  },
  // 获得厂商列表和字体列表
getFontList: {
    path: '/webfontsdk.Greeter/GetFontList',
    requestStream: false,
    responseStream: false,
    requestType: webfont_pb.GetFontListRequest,
    responseType: webfont_pb.GetFontListReply,
    requestSerialize: serialize_webfontsdk_GetFontListRequest,
    requestDeserialize: deserialize_webfontsdk_GetFontListRequest,
    responseSerialize: serialize_webfontsdk_GetFontListReply,
    responseDeserialize: deserialize_webfontsdk_GetFontListReply,
  },
  // 获得AccessKey
getAccessKeyInfo: {
    path: '/webfontsdk.Greeter/GetAccessKeyInfo',
    requestStream: false,
    responseStream: false,
    requestType: webfont_pb.GetAccessKeyInfoRequest,
    responseType: webfont_pb.AccessKeyInfo,
    requestSerialize: serialize_webfontsdk_GetAccessKeyInfoRequest,
    requestDeserialize: deserialize_webfontsdk_GetAccessKeyInfoRequest,
    responseSerialize: serialize_webfontsdk_AccessKeyInfo,
    responseDeserialize: deserialize_webfontsdk_AccessKeyInfo,
  },
};

exports.GreeterClient = grpc.makeGenericClientConstructor(GreeterService);
