// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: Protos/webfont.proto
// </auto-generated>
#pragma warning disable 0414, 1591
#region Designer generated code

using grpc = global::Grpc.Core;

namespace Webfontsdk {
  /// <summary>
  /// The greeting service definition.
  /// </summary>
  public static partial class Greeter
  {
    static readonly string __ServiceName = "webfontsdk.Greeter";

    static readonly grpc::Marshaller<global::Webfontsdk.FontBuildRequest> __Marshaller_webfontsdk_FontBuildRequest = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Webfontsdk.FontBuildRequest.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::Webfontsdk.FontBuildBufResult> __Marshaller_webfontsdk_FontBuildBufResult = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Webfontsdk.FontBuildBufResult.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::Webfontsdk.FontBuildAccessKeyRequest> __Marshaller_webfontsdk_FontBuildAccessKeyRequest = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Webfontsdk.FontBuildAccessKeyRequest.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::Webfontsdk.MultFontBuildRequest> __Marshaller_webfontsdk_MultFontBuildRequest = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Webfontsdk.MultFontBuildRequest.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::Webfontsdk.MultFontBuildBufResult> __Marshaller_webfontsdk_MultFontBuildBufResult = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Webfontsdk.MultFontBuildBufResult.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::Webfontsdk.FontListRequest> __Marshaller_webfontsdk_FontListRequest = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Webfontsdk.FontListRequest.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::Webfontsdk.FontListResult> __Marshaller_webfontsdk_FontListResult = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Webfontsdk.FontListResult.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::Webfontsdk.GetProfileWithoutMapRequest> __Marshaller_webfontsdk_GetProfileWithoutMapRequest = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Webfontsdk.GetProfileWithoutMapRequest.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::Webfontsdk.GetProfileWithoutMapResult> __Marshaller_webfontsdk_GetProfileWithoutMapResult = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Webfontsdk.GetProfileWithoutMapResult.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::Webfontsdk.GetMultGlyfsUnicodeRequest> __Marshaller_webfontsdk_GetMultGlyfsUnicodeRequest = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Webfontsdk.GetMultGlyfsUnicodeRequest.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::Webfontsdk.GetMultGlyfsUnicodeResult> __Marshaller_webfontsdk_GetMultGlyfsUnicodeResult = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Webfontsdk.GetMultGlyfsUnicodeResult.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::Webfontsdk.GetFontListRequest> __Marshaller_webfontsdk_GetFontListRequest = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Webfontsdk.GetFontListRequest.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::Webfontsdk.GetFontListReply> __Marshaller_webfontsdk_GetFontListReply = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Webfontsdk.GetFontListReply.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::Webfontsdk.GetAccessKeyInfoRequest> __Marshaller_webfontsdk_GetAccessKeyInfoRequest = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Webfontsdk.GetAccessKeyInfoRequest.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::Webfontsdk.AccessKeyInfo> __Marshaller_webfontsdk_AccessKeyInfo = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Webfontsdk.AccessKeyInfo.Parser.ParseFrom);

    static readonly grpc::Method<global::Webfontsdk.FontBuildRequest, global::Webfontsdk.FontBuildBufResult> __Method_BuildFont = new grpc::Method<global::Webfontsdk.FontBuildRequest, global::Webfontsdk.FontBuildBufResult>(
        grpc::MethodType.Unary,
        __ServiceName,
        "BuildFont",
        __Marshaller_webfontsdk_FontBuildRequest,
        __Marshaller_webfontsdk_FontBuildBufResult);

    static readonly grpc::Method<global::Webfontsdk.FontBuildAccessKeyRequest, global::Webfontsdk.FontBuildBufResult> __Method_BuildFontForAccessKey = new grpc::Method<global::Webfontsdk.FontBuildAccessKeyRequest, global::Webfontsdk.FontBuildBufResult>(
        grpc::MethodType.Unary,
        __ServiceName,
        "BuildFontForAccessKey",
        __Marshaller_webfontsdk_FontBuildAccessKeyRequest,
        __Marshaller_webfontsdk_FontBuildBufResult);

    static readonly grpc::Method<global::Webfontsdk.MultFontBuildRequest, global::Webfontsdk.MultFontBuildBufResult> __Method_MultBuildFont = new grpc::Method<global::Webfontsdk.MultFontBuildRequest, global::Webfontsdk.MultFontBuildBufResult>(
        grpc::MethodType.Unary,
        __ServiceName,
        "MultBuildFont",
        __Marshaller_webfontsdk_MultFontBuildRequest,
        __Marshaller_webfontsdk_MultFontBuildBufResult);

    static readonly grpc::Method<global::Webfontsdk.FontListRequest, global::Webfontsdk.FontListResult> __Method_FontList = new grpc::Method<global::Webfontsdk.FontListRequest, global::Webfontsdk.FontListResult>(
        grpc::MethodType.Unary,
        __ServiceName,
        "FontList",
        __Marshaller_webfontsdk_FontListRequest,
        __Marshaller_webfontsdk_FontListResult);

    static readonly grpc::Method<global::Webfontsdk.GetProfileWithoutMapRequest, global::Webfontsdk.GetProfileWithoutMapResult> __Method_GetProfileWithoutMap = new grpc::Method<global::Webfontsdk.GetProfileWithoutMapRequest, global::Webfontsdk.GetProfileWithoutMapResult>(
        grpc::MethodType.Unary,
        __ServiceName,
        "GetProfileWithoutMap",
        __Marshaller_webfontsdk_GetProfileWithoutMapRequest,
        __Marshaller_webfontsdk_GetProfileWithoutMapResult);

    static readonly grpc::Method<global::Webfontsdk.GetMultGlyfsUnicodeRequest, global::Webfontsdk.GetMultGlyfsUnicodeResult> __Method_GetMultGlyfsUnicode = new grpc::Method<global::Webfontsdk.GetMultGlyfsUnicodeRequest, global::Webfontsdk.GetMultGlyfsUnicodeResult>(
        grpc::MethodType.Unary,
        __ServiceName,
        "GetMultGlyfsUnicode",
        __Marshaller_webfontsdk_GetMultGlyfsUnicodeRequest,
        __Marshaller_webfontsdk_GetMultGlyfsUnicodeResult);

    static readonly grpc::Method<global::Webfontsdk.GetFontListRequest, global::Webfontsdk.GetFontListReply> __Method_GetFontList = new grpc::Method<global::Webfontsdk.GetFontListRequest, global::Webfontsdk.GetFontListReply>(
        grpc::MethodType.Unary,
        __ServiceName,
        "GetFontList",
        __Marshaller_webfontsdk_GetFontListRequest,
        __Marshaller_webfontsdk_GetFontListReply);

    static readonly grpc::Method<global::Webfontsdk.GetAccessKeyInfoRequest, global::Webfontsdk.AccessKeyInfo> __Method_GetAccessKeyInfo = new grpc::Method<global::Webfontsdk.GetAccessKeyInfoRequest, global::Webfontsdk.AccessKeyInfo>(
        grpc::MethodType.Unary,
        __ServiceName,
        "GetAccessKeyInfo",
        __Marshaller_webfontsdk_GetAccessKeyInfoRequest,
        __Marshaller_webfontsdk_AccessKeyInfo);

    /// <summary>Service descriptor</summary>
    public static global::Google.Protobuf.Reflection.ServiceDescriptor Descriptor
    {
      get { return global::Webfontsdk.WebfontReflection.Descriptor.Services[0]; }
    }

    /// <summary>Client for Greeter</summary>
    public partial class GreeterClient : grpc::ClientBase<GreeterClient>
    {
      /// <summary>Creates a new client for Greeter</summary>
      /// <param name="channel">The channel to use to make remote calls.</param>
      public GreeterClient(grpc::ChannelBase channel) : base(channel)
      {
      }
      /// <summary>Creates a new client for Greeter that uses a custom <c>CallInvoker</c>.</summary>
      /// <param name="callInvoker">The callInvoker to use to make remote calls.</param>
      public GreeterClient(grpc::CallInvoker callInvoker) : base(callInvoker)
      {
      }
      /// <summary>Protected parameterless constructor to allow creation of test doubles.</summary>
      protected GreeterClient() : base()
      {
      }
      /// <summary>Protected constructor to allow creation of configured clients.</summary>
      /// <param name="configuration">The client configuration.</param>
      protected GreeterClient(ClientBaseConfiguration configuration) : base(configuration)
      {
      }

      /// <summary>
      ///BuildFont
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::Webfontsdk.FontBuildBufResult BuildFont(global::Webfontsdk.FontBuildRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return BuildFont(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      ///BuildFont
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::Webfontsdk.FontBuildBufResult BuildFont(global::Webfontsdk.FontBuildRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_BuildFont, null, options, request);
      }
      /// <summary>
      ///BuildFont
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::Webfontsdk.FontBuildBufResult> BuildFontAsync(global::Webfontsdk.FontBuildRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return BuildFontAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      ///BuildFont
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::Webfontsdk.FontBuildBufResult> BuildFontAsync(global::Webfontsdk.FontBuildRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_BuildFont, null, options, request);
      }
      /// <summary>
      ///BuildFontForAccessKey
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::Webfontsdk.FontBuildBufResult BuildFontForAccessKey(global::Webfontsdk.FontBuildAccessKeyRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return BuildFontForAccessKey(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      ///BuildFontForAccessKey
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::Webfontsdk.FontBuildBufResult BuildFontForAccessKey(global::Webfontsdk.FontBuildAccessKeyRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_BuildFontForAccessKey, null, options, request);
      }
      /// <summary>
      ///BuildFontForAccessKey
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::Webfontsdk.FontBuildBufResult> BuildFontForAccessKeyAsync(global::Webfontsdk.FontBuildAccessKeyRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return BuildFontForAccessKeyAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      ///BuildFontForAccessKey
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::Webfontsdk.FontBuildBufResult> BuildFontForAccessKeyAsync(global::Webfontsdk.FontBuildAccessKeyRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_BuildFontForAccessKey, null, options, request);
      }
      /// <summary>
      ///MultBuildFont
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::Webfontsdk.MultFontBuildBufResult MultBuildFont(global::Webfontsdk.MultFontBuildRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return MultBuildFont(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      ///MultBuildFont
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::Webfontsdk.MultFontBuildBufResult MultBuildFont(global::Webfontsdk.MultFontBuildRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_MultBuildFont, null, options, request);
      }
      /// <summary>
      ///MultBuildFont
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::Webfontsdk.MultFontBuildBufResult> MultBuildFontAsync(global::Webfontsdk.MultFontBuildRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return MultBuildFontAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      ///MultBuildFont
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::Webfontsdk.MultFontBuildBufResult> MultBuildFontAsync(global::Webfontsdk.MultFontBuildRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_MultBuildFont, null, options, request);
      }
      /// <summary>
      ///Get my fontlist
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::Webfontsdk.FontListResult FontList(global::Webfontsdk.FontListRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return FontList(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      ///Get my fontlist
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::Webfontsdk.FontListResult FontList(global::Webfontsdk.FontListRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_FontList, null, options, request);
      }
      /// <summary>
      ///Get my fontlist
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::Webfontsdk.FontListResult> FontListAsync(global::Webfontsdk.FontListRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return FontListAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      ///Get my fontlist
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::Webfontsdk.FontListResult> FontListAsync(global::Webfontsdk.FontListRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_FontList, null, options, request);
      }
      /// <summary>
      ///GetProfile
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::Webfontsdk.GetProfileWithoutMapResult GetProfileWithoutMap(global::Webfontsdk.GetProfileWithoutMapRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return GetProfileWithoutMap(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      ///GetProfile
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::Webfontsdk.GetProfileWithoutMapResult GetProfileWithoutMap(global::Webfontsdk.GetProfileWithoutMapRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_GetProfileWithoutMap, null, options, request);
      }
      /// <summary>
      ///GetProfile
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::Webfontsdk.GetProfileWithoutMapResult> GetProfileWithoutMapAsync(global::Webfontsdk.GetProfileWithoutMapRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return GetProfileWithoutMapAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      ///GetProfile
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::Webfontsdk.GetProfileWithoutMapResult> GetProfileWithoutMapAsync(global::Webfontsdk.GetProfileWithoutMapRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_GetProfileWithoutMap, null, options, request);
      }
      /// <summary>
      ///GetMultGlyfsUnicode
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::Webfontsdk.GetMultGlyfsUnicodeResult GetMultGlyfsUnicode(global::Webfontsdk.GetMultGlyfsUnicodeRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return GetMultGlyfsUnicode(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      ///GetMultGlyfsUnicode
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::Webfontsdk.GetMultGlyfsUnicodeResult GetMultGlyfsUnicode(global::Webfontsdk.GetMultGlyfsUnicodeRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_GetMultGlyfsUnicode, null, options, request);
      }
      /// <summary>
      ///GetMultGlyfsUnicode
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::Webfontsdk.GetMultGlyfsUnicodeResult> GetMultGlyfsUnicodeAsync(global::Webfontsdk.GetMultGlyfsUnicodeRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return GetMultGlyfsUnicodeAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      ///GetMultGlyfsUnicode
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::Webfontsdk.GetMultGlyfsUnicodeResult> GetMultGlyfsUnicodeAsync(global::Webfontsdk.GetMultGlyfsUnicodeRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_GetMultGlyfsUnicode, null, options, request);
      }
      /// <summary>
      ///获得厂商列表和字体列表
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::Webfontsdk.GetFontListReply GetFontList(global::Webfontsdk.GetFontListRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return GetFontList(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      ///获得厂商列表和字体列表
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::Webfontsdk.GetFontListReply GetFontList(global::Webfontsdk.GetFontListRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_GetFontList, null, options, request);
      }
      /// <summary>
      ///获得厂商列表和字体列表
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::Webfontsdk.GetFontListReply> GetFontListAsync(global::Webfontsdk.GetFontListRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return GetFontListAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      ///获得厂商列表和字体列表
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::Webfontsdk.GetFontListReply> GetFontListAsync(global::Webfontsdk.GetFontListRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_GetFontList, null, options, request);
      }
      /// <summary>
      ///获得AccessKey
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::Webfontsdk.AccessKeyInfo GetAccessKeyInfo(global::Webfontsdk.GetAccessKeyInfoRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return GetAccessKeyInfo(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      ///获得AccessKey
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::Webfontsdk.AccessKeyInfo GetAccessKeyInfo(global::Webfontsdk.GetAccessKeyInfoRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_GetAccessKeyInfo, null, options, request);
      }
      /// <summary>
      ///获得AccessKey
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::Webfontsdk.AccessKeyInfo> GetAccessKeyInfoAsync(global::Webfontsdk.GetAccessKeyInfoRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return GetAccessKeyInfoAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      ///获得AccessKey
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::Webfontsdk.AccessKeyInfo> GetAccessKeyInfoAsync(global::Webfontsdk.GetAccessKeyInfoRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_GetAccessKeyInfo, null, options, request);
      }
      /// <summary>Creates a new instance of client from given <c>ClientBaseConfiguration</c>.</summary>
      protected override GreeterClient NewInstance(ClientBaseConfiguration configuration)
      {
        return new GreeterClient(configuration);
      }
    }

  }
}
#endregion
