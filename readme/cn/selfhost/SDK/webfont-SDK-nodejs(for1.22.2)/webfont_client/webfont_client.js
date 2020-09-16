/*
 *
 * Copyright 2015 gRPC authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

var messages = require('../webfont_grpc/webfont_pb');
var services = require('../webfont_grpc/webfont_grpc_pb');

var grpc = require('grpc');
var OSS = require('ali-oss');

var grpcConfig = {addr:'localhost:5000', apiKey:'xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx'};
var ossConfig = {endpoint:'xxxxxxx.aliyuncs.com', accessKeyId:'XXXXXXX', accessKeySecret:'XXXXXXX', bucket:'XXXXXXX'};

var client = new services.GreeterClient(grpcConfig.addr, grpc.credentials.createInsecure());


 /**
 * 用户在程序中调用该方法，服务器生成webfont,并通过回调返回webFontFace
 *
 * @param param {accessKey:'', content:''}
 * @return
 */
function getFontFace(params, callback) {
	buildFont(grpcConfig.apiKey, params.accessKey, params.content, function(err, webFontInfo) {
		if(err) {
			callback(err, null);
			return;
		}
		//callback(null, webFontInfo);
		
		uploadFontFile(webFontInfo, params.url, function(err, fontFaceInfo) {
			if(err) {
				callback(err, null);
				return;
			}
			fontFaceInfo.tag = params.tag;
			var webFontFace = buildWebFontFace(fontFaceInfo);
			callback(null, webFontFace);
		});
		
	});
}

function buildFont(apiKey, accessKey, content, callback) {
	var request = new messages.FontBuildAccessKeyRequest();
	request.setApikey(apiKey);
	request.setAccesskey(accessKey);
	request.setText(content);
	request.setNeedTtf(true);//如果不需要此格式的文件返回，则此处参数设置为false
	request.setNeedEot(true);//如果不需要此格式的文件返回，则此处参数设置为false
	request.setNeedWoff(true);//如果不需要此格式的文件返回，则此处参数设置为false
	request.setNeedWoff2(true);//如果不需要此格式的文件返回，则此处参数设置为false
	
	client.buildFontForAccessKey(request, function(err, response) {
		if(err) {
			console.log(err);
			callback(err, null);
			return;
		}
		
		var webFontInfo = {};
		webFontInfo.apiKey = apiKey;
		webFontInfo.fontId = response.getFontId();
		webFontInfo.content = content;
		webFontInfo.fontCheckSum = response.getFontChecksum();
		webFontInfo.fontFormatVersion = response.getFontFormatVersion();
		webFontInfo.nameEn = response.getNameEn();
		webFontInfo.bytesTtf = response.getBytesTtf();
		webFontInfo.bytesEot = response.getBytesEot();
		webFontInfo.bytesWoff = response.getBytesWoff();
		webFontInfo.bytesWoff2 = response.getBytesWoff2();
		
		console.log("font Id: %d", webFontInfo.fontId);
		console.log("ttf len: %d", webFontInfo.bytesTtf.length);
		console.log("eot len: %d", webFontInfo.bytesEot.length);
		console.log("woff len: %d", webFontInfo.bytesWoff.length);
		console.log("woff2 len: %d", webFontInfo.bytesWoff2.length);
		console.log("name: %s", webFontInfo.nameEn);
		
		callback(null, webFontInfo);
	});
}


function uploadFontFile(webFontInfo, url, callback) {
	// 类似：a/b/font1
	var objectBaseName = "";
	if (!url) {
		// 使用fontid+ randomid
		objectBaseName =
				"fontface/"
						+ webFontInfo.fontId
						+ "/"
						+ randomUUID().replace(/-/g, "")
						+ "/"
						+ webFontInfo.nameEn;
	} else {
		objectBaseName = url;
	}
	console.log("objectBaseName:" + objectBaseName);

	var eotObjectName = objectBaseName + ".eot";
	var woffObjectName = objectBaseName + ".woff";
	var woff2ObjectName = objectBaseName + ".woff2";
	var ttfObjectName = objectBaseName + ".ttf";

	var fontFaceInfo = {};
	uploadOSS(webFontInfo.bytesEot, eotObjectName, function(err, urlStr1) {
		fontFaceInfo.eotUrl = urlStr1;
		uploadOSS(webFontInfo.bytesWoff, woffObjectName, function(err, urlStr2) {
			fontFaceInfo.woffUrl = urlStr2;
			uploadOSS(webFontInfo.bytesTtf, ttfObjectName, function(err, urlStr3) {
			    fontFaceInfo.ttfUrl = urlStr3;
			    uploadOSS(webFontInfo.bytesWoff2, woff2ObjectName, function(err, urlStr4) {
			        fontFaceInfo.woff2Url = urlStr4;
				
				    fontFaceInfo.nameEn = webFontInfo.nameEn;
				    callback(null, fontFaceInfo);
			    });
			});
		});
	});
	
}

/**
 * 把字体文件上传到OSS
 *
 * @param data Uint8Array 类型的字体文件数据
 * @param objectName 对象名称
 * @param callback 回调函数，回传参数为对象的url
 */
async function uploadOSS(data, objectName, callback) {
	if(data.length == 0) {
		callback(null, '');
		return;
	}
	
	let ossClient = new OSS({
		endpoint: ossConfig.endpoint,
		accessKeyId: ossConfig.accessKeyId,
		accessKeySecret: ossConfig.accessKeySecret,
		bucket: ossConfig.bucket
	});
	
	try {
		let result = await ossClient.put(objectName, Buffer.from(data));
		console.log('wth121 oss result: ' + JSON.stringify(result));
		
		let url = ossClient.signatureUrl(objectName, {
			expires: 3600 * 1000 * 24 * 1000,
			method: 'PUT'
		});
		console.log('full url: ' + url);
		var simpleUrl = url.substring(0, url.indexOf("?"));
		console.log('simpleUrl: ' + simpleUrl);
		callback(null, simpleUrl);
	} catch (e) {
		console.log(e);
		callback(e, '');
	} finally {
		//close ossClient
	}
}

/**
 * 根据webfont资源保存的地址来生成@font-face语句。
 *
 * @param fontFaceInfo
 * @return
 */
function buildWebFontFace(fontFaceInfo) {
	var webFontFace = {};
	
	//定义生成的@font-face语句里的font-family属性值，本SDK默认将字体的英文名字作为@font-face语句里的font-family属性值。
	webFontFace.fontFamily = fontFaceInfo.nameEn;

	console.log(fontFaceInfo);

	var fontface =
			"@font-face{font-family:'"
					+ fontFaceInfo.nameEn
					+ "';";


	//如果eot不为空
	if (fontFaceInfo.eotUrl) {
		fontface += "src:url('" + fontFaceInfo.eotUrl + "');";
	}

	fontface += "src:";

	//如果eot不为空
	if (fontFaceInfo.eotUrl) {
		fontface += "url('" + fontFaceInfo.eotUrl + "?#iefix')format('embedded-opentype'),";

	}
	//如果woff不为空
	if (fontFaceInfo.woffUrl) {
		fontface += "url('" + fontFaceInfo.woffUrl + "')format('woff'),";
	}

    //如果woff不为空
	if (fontFaceInfo.woff2Url) {
	    fontface += "url('" + fontFaceInfo.woff2Url + "')format('woff2'),";
	}

	//如果ttf不为空
	if (fontFaceInfo.ttfUrl) {
		fontface += "url('" + fontFaceInfo.ttfUrl + "')format('truetype'),";
	}

	fontface = fontface.substring(0, fontface.length - 1);
	fontface += ";}";

	if (fontFaceInfo.tag) {
		fontface += fontFaceInfo.tag + "{font-family:'"
				+ fontFaceInfo.nameEn
				+ "'}";
	}
	console.log(fontface);
	
	webFontFace.fontFace = fontface;
	webFontFace.tag = fontFaceInfo.tag;
	webFontFace.woff = fontFaceInfo.woffUrl;
	
	return webFontFace;
}

function randomUUID() {
    var s = [];
    var hexDigits = "0123456789abcdef";
    for (var i = 0; i < 36; i++) {
        s[i] = hexDigits.substr(Math.floor(Math.random() * 0x10), 1);
    }
    s[14] = "4";  // bits 12-15 of the time_hi_and_version field to 0010
    s[19] = hexDigits.substr((s[19] & 0x3) | 0x8, 1);  // bits 6-7 of the clock_seq_hi_and_reserved to 01
    s[8] = s[13] = s[18] = s[23] = "-";
 
    var uuid = s.join("");
    return uuid;
}


exports.getFontFace = getFontFace;

