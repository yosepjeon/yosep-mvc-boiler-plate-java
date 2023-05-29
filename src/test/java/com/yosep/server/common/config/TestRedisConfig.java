//package com.yosep.server.common.config;
//
//import org.redisson.Redisson;
//import org.redisson.api.RedissonClient;
//import org.redisson.client.codec.Codec;
//import org.redisson.client.codec.StringCodec;
//import org.redisson.config.Config;
//import org.redisson.config.ReadMode;
//
//public class TestRedisConfig {
//
//    private final String MASTER_REDIS_ADDRESS = "redis://127.0.0.1:6379";
//    private final String SLAVE_REDIS_ADDRESS = "redis://127.0.0.1:8011";
//
//    //@Profile({"test"})
//    public RedissonClient localRedissonClient() {
//        Config config = new Config();
//        final Codec codec = new StringCodec();
//        config.setCodec(codec);
//
//        config.useMasterSlaveServers()
//            .setMasterAddress(this.MASTER_REDIS_ADDRESS)
//            .addSlaveAddress(this.SLAVE_REDIS_ADDRESS)
//            .setReadMode(ReadMode.SLAVE);
//
//        return Redisson.create(config);
//    }
//}
