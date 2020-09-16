<?php

// autoload_static.php @generated by Composer

namespace Composer\Autoload;

class ComposerStaticInitfcd9d179c7a5cc986166151748c54ec4
{
    public static $prefixLengthsPsr4 = array (
        's' => 
        array (
            'source\\model\\' => 13,
            'source\\' => 7,
        ),
        'W' => 
        array (
            'Webfontsdk\\' => 11,
        ),
        'O' => 
        array (
            'OSS\\' => 4,
        ),
        'G' => 
        array (
            'Grpc\\' => 5,
            'Google\\Protobuf\\' => 16,
            'GPBMetadata\\Google\\Protobuf\\' => 28,
            'GPBMetadata\\' => 12,
        ),
    );

    public static $prefixDirsPsr4 = array (
        'source\\model\\' => 
        array (
            0 => __DIR__ . '/../..' . '/source/model',
        ),
        'source\\' => 
        array (
            0 => __DIR__ . '/../..' . '/source',
        ),
        'Webfontsdk\\' => 
        array (
            0 => __DIR__ . '/../..' . '/gRPC',
        ),
        'OSS\\' => 
        array (
            0 => __DIR__ . '/..' . '/aliyuncs/oss-sdk-php/src/OSS',
        ),
        'Grpc\\' => 
        array (
            0 => __DIR__ . '/..' . '/grpc/grpc/src/lib',
        ),
        'Google\\Protobuf\\' => 
        array (
            0 => __DIR__ . '/..' . '/google/protobuf/src/Google/Protobuf',
        ),
        'GPBMetadata\\Google\\Protobuf\\' => 
        array (
            0 => __DIR__ . '/..' . '/google/protobuf/src/GPBMetadata/Google/Protobuf',
        ),
        'GPBMetadata\\' => 
        array (
            0 => __DIR__ . '/../..' . '/gRPC/GPBMetadata',
        ),
    );

    public static function getInitializer(ClassLoader $loader)
    {
        return \Closure::bind(function () use ($loader) {
            $loader->prefixLengthsPsr4 = ComposerStaticInitfcd9d179c7a5cc986166151748c54ec4::$prefixLengthsPsr4;
            $loader->prefixDirsPsr4 = ComposerStaticInitfcd9d179c7a5cc986166151748c54ec4::$prefixDirsPsr4;

        }, null, ClassLoader::class);
    }
}