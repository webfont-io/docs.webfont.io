# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

import webfont_client.webfont_pb2 as webfont__pb2


class GreeterStub(object):
    """The greeting service definition.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.BuildFont = channel.unary_unary(
                '/webfontsdk.Greeter/BuildFont',
                request_serializer=webfont__pb2.FontBuildRequest.SerializeToString,
                response_deserializer=webfont__pb2.FontBuildBufResult.FromString,
                )
        self.BuildFontForAccessKey = channel.unary_unary(
                '/webfontsdk.Greeter/BuildFontForAccessKey',
                request_serializer=webfont__pb2.FontBuildAccessKeyRequest.SerializeToString,
                response_deserializer=webfont__pb2.FontBuildBufResult.FromString,
                )
        self.MultBuildFont = channel.unary_unary(
                '/webfontsdk.Greeter/MultBuildFont',
                request_serializer=webfont__pb2.MultFontBuildRequest.SerializeToString,
                response_deserializer=webfont__pb2.MultFontBuildBufResult.FromString,
                )
        self.FontList = channel.unary_unary(
                '/webfontsdk.Greeter/FontList',
                request_serializer=webfont__pb2.FontListRequest.SerializeToString,
                response_deserializer=webfont__pb2.FontListResult.FromString,
                )
        self.GetProfileWithoutMap = channel.unary_unary(
                '/webfontsdk.Greeter/GetProfileWithoutMap',
                request_serializer=webfont__pb2.GetProfileWithoutMapRequest.SerializeToString,
                response_deserializer=webfont__pb2.GetProfileWithoutMapResult.FromString,
                )
        self.GetMultGlyfsUnicode = channel.unary_unary(
                '/webfontsdk.Greeter/GetMultGlyfsUnicode',
                request_serializer=webfont__pb2.GetMultGlyfsUnicodeRequest.SerializeToString,
                response_deserializer=webfont__pb2.GetMultGlyfsUnicodeResult.FromString,
                )
        self.GetFontList = channel.unary_unary(
                '/webfontsdk.Greeter/GetFontList',
                request_serializer=webfont__pb2.GetFontListRequest.SerializeToString,
                response_deserializer=webfont__pb2.GetFontListReply.FromString,
                )
        self.GetAccessKeyInfo = channel.unary_unary(
                '/webfontsdk.Greeter/GetAccessKeyInfo',
                request_serializer=webfont__pb2.GetAccessKeyInfoRequest.SerializeToString,
                response_deserializer=webfont__pb2.AccessKeyInfo.FromString,
                )


class GreeterServicer(object):
    """The greeting service definition.
    """

    def BuildFont(self, request, context):
        """BuildFont
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def BuildFontForAccessKey(self, request, context):
        """BuildFontForAccessKey
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def MultBuildFont(self, request, context):
        """MultBuildFont
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def FontList(self, request, context):
        """Get my fontlist
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetProfileWithoutMap(self, request, context):
        """GetProfile
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetMultGlyfsUnicode(self, request, context):
        """GetUnicodeIndexs
        rpc GetUnicodeIndexs(GetUnicodeIndexsRequest) returns (GetUnicodeIndexsResult) {}

        GetGlyfs Index
        rpc GetGlyfsIndex(GetGlyfsIndexRequest) returns (GetGlyfsIndexResult) {}

        GetGlyfs Unicode
        rpc GetGlyfsUnicode(GetGlyfsUnicodeRequest) returns (GetGlyfsUnicodeResult) {}

        GetMultGlyfsUnicode
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetFontList(self, request, context):
        """获得厂商列表和字体列表
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetAccessKeyInfo(self, request, context):
        """获得AccessKey
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_GreeterServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'BuildFont': grpc.unary_unary_rpc_method_handler(
                    servicer.BuildFont,
                    request_deserializer=webfont__pb2.FontBuildRequest.FromString,
                    response_serializer=webfont__pb2.FontBuildBufResult.SerializeToString,
            ),
            'BuildFontForAccessKey': grpc.unary_unary_rpc_method_handler(
                    servicer.BuildFontForAccessKey,
                    request_deserializer=webfont__pb2.FontBuildAccessKeyRequest.FromString,
                    response_serializer=webfont__pb2.FontBuildBufResult.SerializeToString,
            ),
            'MultBuildFont': grpc.unary_unary_rpc_method_handler(
                    servicer.MultBuildFont,
                    request_deserializer=webfont__pb2.MultFontBuildRequest.FromString,
                    response_serializer=webfont__pb2.MultFontBuildBufResult.SerializeToString,
            ),
            'FontList': grpc.unary_unary_rpc_method_handler(
                    servicer.FontList,
                    request_deserializer=webfont__pb2.FontListRequest.FromString,
                    response_serializer=webfont__pb2.FontListResult.SerializeToString,
            ),
            'GetProfileWithoutMap': grpc.unary_unary_rpc_method_handler(
                    servicer.GetProfileWithoutMap,
                    request_deserializer=webfont__pb2.GetProfileWithoutMapRequest.FromString,
                    response_serializer=webfont__pb2.GetProfileWithoutMapResult.SerializeToString,
            ),
            'GetMultGlyfsUnicode': grpc.unary_unary_rpc_method_handler(
                    servicer.GetMultGlyfsUnicode,
                    request_deserializer=webfont__pb2.GetMultGlyfsUnicodeRequest.FromString,
                    response_serializer=webfont__pb2.GetMultGlyfsUnicodeResult.SerializeToString,
            ),
            'GetFontList': grpc.unary_unary_rpc_method_handler(
                    servicer.GetFontList,
                    request_deserializer=webfont__pb2.GetFontListRequest.FromString,
                    response_serializer=webfont__pb2.GetFontListReply.SerializeToString,
            ),
            'GetAccessKeyInfo': grpc.unary_unary_rpc_method_handler(
                    servicer.GetAccessKeyInfo,
                    request_deserializer=webfont__pb2.GetAccessKeyInfoRequest.FromString,
                    response_serializer=webfont__pb2.AccessKeyInfo.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'webfontsdk.Greeter', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Greeter(object):
    """The greeting service definition.
    """

    @staticmethod
    def BuildFont(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/webfontsdk.Greeter/BuildFont',
            webfont__pb2.FontBuildRequest.SerializeToString,
            webfont__pb2.FontBuildBufResult.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def BuildFontForAccessKey(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/webfontsdk.Greeter/BuildFontForAccessKey',
            webfont__pb2.FontBuildAccessKeyRequest.SerializeToString,
            webfont__pb2.FontBuildBufResult.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def MultBuildFont(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/webfontsdk.Greeter/MultBuildFont',
            webfont__pb2.MultFontBuildRequest.SerializeToString,
            webfont__pb2.MultFontBuildBufResult.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def FontList(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/webfontsdk.Greeter/FontList',
            webfont__pb2.FontListRequest.SerializeToString,
            webfont__pb2.FontListResult.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetProfileWithoutMap(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/webfontsdk.Greeter/GetProfileWithoutMap',
            webfont__pb2.GetProfileWithoutMapRequest.SerializeToString,
            webfont__pb2.GetProfileWithoutMapResult.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetMultGlyfsUnicode(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/webfontsdk.Greeter/GetMultGlyfsUnicode',
            webfont__pb2.GetMultGlyfsUnicodeRequest.SerializeToString,
            webfont__pb2.GetMultGlyfsUnicodeResult.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetFontList(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/webfontsdk.Greeter/GetFontList',
            webfont__pb2.GetFontListRequest.SerializeToString,
            webfont__pb2.GetFontListReply.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetAccessKeyInfo(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/webfontsdk.Greeter/GetAccessKeyInfo',
            webfont__pb2.GetAccessKeyInfoRequest.SerializeToString,
            webfont__pb2.AccessKeyInfo.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
