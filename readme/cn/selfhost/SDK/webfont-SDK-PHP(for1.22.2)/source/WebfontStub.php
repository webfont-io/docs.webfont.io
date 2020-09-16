<?php

namespace source;

class WebfontStub extends \Grpc\BaseStub
{

    public function __construct($hostname, $opts, $channel = null)
    {
        parent::__construct($hostname, $opts, $channel);
    }

    public function BuildFontForAccessKey(\webfontsdk\FontBuildAccessKeyRequest $argument, $metadata = [], $options = [])
    {
        return $this->_simpleRequest('/webfontsdk.Greeter/BuildFontForAccessKey',
            $argument,
            ['\Webfontsdk\FontBuildBufResult', 'decode'],
            $metadata, $options);
    }

}