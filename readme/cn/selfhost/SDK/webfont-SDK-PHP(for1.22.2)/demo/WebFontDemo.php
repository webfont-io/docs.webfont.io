<?php
//引入 composer 的自动载加
require dirname(__DIR__) . '/vendor/autoload.php';

$client = new \source\WebFontClient;
$res = $client->getFontFace(new \source\model\FontFaceParam('d9ffb195f7e041d4a03fb8084f9c4fe5',"中文test", "#id1",""));

echo $res->toJSON();