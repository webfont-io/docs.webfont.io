#!/usr/bin/env python3
# -*- coding: utf-8 -*-
import logging
import grpc
import oss2
import os
import uuid
import urllib.parse

import webfont_client.webfont_pb2 as webfont_pb2
import webfont_client.webfont_pb2_grpc as webfont_pb2_grpc

grpcConfig = {'addr': 'localhost:5000',
              'apiKey': '5c051ef2-441f-4ed2-8f3b-61506da724e9'}
ossConfig = {'endpoint': 'oss-cn-beijing.aliyuncs.com', 'accessKeyId': 'LTAI4FswR5BVegCTm98n8DUi',
             'accessKeySecret': 'mCMs3kL6FqUI7HggVhmPn75ZkK0UhP', 'bucket': 'youziku-test'}
logging.basicConfig(level=logging.INFO,
                    format='%(asctime)s:%(name)s:%(levelname)s:%(message)s')
logger = logging.getLogger(__name__)


channel = grpc.insecure_channel(grpcConfig['addr'])
stub = webfont_pb2_grpc.GreeterStub(channel)


def buildFont(apiKey, accessKey, content):
    request = webfont_pb2.FontBuildAccessKeyRequest()
    request.apikey = apiKey
    request.accesskey = accessKey
    request.text = content
    request.need_ttf = True  # 如果不需要此格式的文件返回，则此处参数设置为false
    request.need_eot = True  # 如果不需要此格式的文件返回，则此处参数设置为false
    request.need_woff = True  # 如果不需要此格式的文件返回，则此处参数设置为false
    request.need_woff2 = True  # 如果不需要此格式的文件返回，则此处参数设置为false
    try:
        response = stub.BuildFontForAccessKey(request)
        webFontInfo = {}
        webFontInfo['apiKey'] = apiKey
        webFontInfo['fontId'] = response.font_id
        webFontInfo['content'] = content
        webFontInfo['fontCheckSum'] = response.font_checksum
        webFontInfo['fontFormatVersion'] = response.font_format_version
        webFontInfo['nameEn'] = response.name_en
        webFontInfo['bytesTtf'] = response.bytes_ttf
        webFontInfo['bytesEot'] = response.bytes_eot
        webFontInfo['bytesWoff'] = response.bytes_woff
        webFontInfo['bytesWoff2'] = response.bytes_woff2
        logger.info("font Id: %d", webFontInfo['fontId'])
        logger.info("ttf len: %d", len(webFontInfo['bytesTtf']))
        logger.info("eot len: %d", len(webFontInfo['bytesEot']))
        logger.info("woff len: %d", len(webFontInfo['bytesWoff']))
        logger.info("woff2 len: %d", len(webFontInfo['bytesWoff2']))
        logger.info("name: %s", webFontInfo['nameEn'])
        return webFontInfo
    except:
        raise


'''
  将生成的webfont资源上传到存储空间里，并返回保存的地址，用于构建@font-face语句。
  @param webFontInfo
  @param url         自定义保存路径
'''


def uploadFontFile(webFontInfo, url):
    # 类似：a/b/font1
    objectBaseName = ""
    if not isNotEmpty(url):
        # 使用fontid+ randomid
        objectBaseName = "fontface/" + \
            str(webFontInfo['fontId']) + "/" + \
            randomUUID() + "/" + webFontInfo['nameEn']
    else:
        objectBaseName = url

    logger.info("objectBaseName:" + objectBaseName)

    eotObjectName = objectBaseName + ".eot"
    woffObjectName = objectBaseName + ".woff"
    woff2ObjectName = objectBaseName + ".woff2"
    ttfObjectName = objectBaseName + ".ttf"
    fontFaceInfo = {}
    eotUrlString = uploadOSS(webFontInfo['bytesEot'], eotObjectName)
    woffUrlString = uploadOSS(webFontInfo['bytesWoff'], woffObjectName)
    woff2UrlString = uploadOSS(webFontInfo['bytesWoff2'], woff2ObjectName)
    ttfUrlString = uploadOSS(webFontInfo['bytesTtf'], ttfObjectName) 
    fontFaceInfo['eotUrl'] = eotUrlString
    fontFaceInfo['woffUrl'] = woffUrlString
    fontFaceInfo['woff2Url'] = woff2UrlString
    fontFaceInfo['ttfUrl'] = ttfUrlString
    fontFaceInfo['nameEn'] = webFontInfo['nameEn']
    return fontFaceInfo


'''
  判断bucket是否存在
'''


def does_bucket_exist(bucket):
    try:
        bucket.get_bucket_info()
    except oss2.exceptions.NoSuchBucket:
        return False
    except:
        raise
    return True


'''
   将字体文件上传存储空间的方法（本SDK是用阿里云OSS作为存储空间）。
   用户可以根据自身的情况重写该方法，重写时须注意该方法必须传入文件二进制流（byte[]）和文件名

    @param data   字体文件,bytes类型
    @param objectName 对象名称
    @return 返回文件的完整存储地址（SDK将使用该地址构建@font-face语句）。
'''


def uploadOSS(data, objectName):
    if len(data) == 0:
        return ''
    logger.info("objectName:" + objectName)

    # 登录 https://ram.console.aliyun.com 创建RAM账号。
    auth = oss2.Auth(ossConfig['accessKeyId'], ossConfig['accessKeySecret'])
    # Endpoint以杭州为例，其它Region请按实际情况填写。
    bucket = oss2.Bucket(auth, ossConfig['endpoint'], ossConfig['bucket'])
    if does_bucket_exist(bucket):
        # 设置存储空间的访问权限为公共读。
        bucket.put_bucket_acl(oss2.BUCKET_ACL_PUBLIC_READ)
        # <yourObjectName>上传文件到OSS时需要指定包含文件后缀在内的完整路径，例如abc/efg/123.jpg。
        bucket.put_object(objectName, data)
        # 生成以GET方法访问的签名URL，访客可以直接通过浏览器访问相关内容。
        url = bucket.sign_url('GET', objectName, 3600 * 1000 * 24 * 1000)
        u = urllib.parse.unquote(url)
        #logger.info("url:%s",u)
        return u[:u.rfind('?')]

'''
  生成uuid
'''

def randomUUID():
    uid = str(uuid.uuid1())
    suid = ''.join(uid.split('-'))
    return suid

'''
  判断url是否为空
'''

def isNotEmpty(url):
    return len(url.strip()) > 0

"""
 根据webfont资源保存的地址来生成@font-face语句
"""


def buildWebFontFace(fontFaceInfo):
    webFontFace = {}
    #logger.info(fontFaceInfo)

    # 定义生成的@font-face语句里的font-family属性值，本SDK默认将字体的英文名字作为@font-face语句里的font-family属性值。
    webFontFace['fontFamily'] = fontFaceInfo['nameEn']

    fontface = "@font-face{font-family:'" + fontFaceInfo['nameEn'] + "';"

    # 如果eot不为空
    if isNotEmpty(fontFaceInfo['eotUrl']):
        fontface += "src:url('" + fontFaceInfo['eotUrl'] + "');"

    fontface += "src:"

    # 如果eot不为空
    if isNotEmpty(fontFaceInfo['eotUrl']):
        fontface += "url('" + fontFaceInfo['eotUrl'] + \
            "?#iefix')format('embedded-opentype'),"

    # 如果woff不为空
    if isNotEmpty(fontFaceInfo['woffUrl']):
        fontface += "url('" + fontFaceInfo['woffUrl'] + "')format('woff'),"

    # 如果woff2不为空
    if isNotEmpty(fontFaceInfo['woff2Url']):
        fontface += "url('" + fontFaceInfo['woff2Url'] + "')format('woff2'),"

    # 如果ttf不为空
    if isNotEmpty(fontFaceInfo['ttfUrl']):
        fontface += "url('" + fontFaceInfo['ttfUrl'] + "')format('truetype'),"

    fontface = fontface[:-1]+";}"

    if isNotEmpty(fontFaceInfo['tag']):
        fontface += fontFaceInfo['tag'] + \
            "{font-family:'" + fontFaceInfo['nameEn'] + "'}"

    #logger.info(fontface)
    webFontFace['fontFace'] = fontface
    webFontFace['tag'] = fontFaceInfo['tag']
    webFontFace['woff'] = fontFaceInfo['woffUrl']
    #logger.info(webFontFace)
    return webFontFace


'''
   用户在程序中调用该方法，服务器生成webfont并返回@font-face语句
   @param params {'accessKey':'', 'content':'','tag':'','url':''}
   @return
'''


def getFontFace(params):
    # 传入用户可使用的字体id和需要处理的文本，然后进行构建字体库
    webFontInfo = buildFont(
        grpcConfig['apiKey'], params['accessKey'], params['content'])
    # 将生成的webfont资源上传到存储空间里，并返回保存的地址，用于构建@font-face语句。
    fontFaceInfo = uploadFontFile(webFontInfo, params['url'])
    # 设置Tag参数，Tag即是select代码，如果调用getFontFace()方法时填写此参数，则返回的@font-face语句会自动将效果引用至select上。
    fontFaceInfo['tag'] = params['tag']
    # 根据webfont资源保存的地址来生成@font-face语句。
    webFontFace = buildWebFontFace(fontFaceInfo)
    return webFontFace
