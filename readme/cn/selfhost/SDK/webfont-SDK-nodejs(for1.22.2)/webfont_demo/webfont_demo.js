
var webFontClient = require('../webfont_client/webfont_client');

function main() {
  webFontClient.getFontFace({accessKey:' xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx', content:'ÄÚÈÝÎÄ×Ö', tag:'#id1', url:''}, function(err, webFontInfo) {
	  if(err) {
		console.log('error: ' + err);
	  } else {
		console.log('\nwebFontInfo: ' + JSON.stringify(webFontInfo));
	  }
  });
  
}

main();