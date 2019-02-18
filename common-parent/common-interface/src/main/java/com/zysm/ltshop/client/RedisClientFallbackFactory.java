package com.zysm.ltshop.client;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * Copyright (C), 2018-2019, Chong Qing  zy.
 *
 * @ClassName: RedisClientFallbackFactory
 * @Description: TODO
 * @Author: Mr_shi
 * @CreateDate: 2019/2/18 18:17
 * @Version: 1.0
 */
@Component
public class RedisClientFallbackFactory implements FallbackFactory<RedisClient> {
    @Override
    public RedisClient create(Throwable throwable) {
        return new RedisClient() {
            @Override
            public String getRedis(String key) {
                return "获取失败";
            }

            @Override
            public void setRedis(String key, String value) {
                System.out.println("redis存储失败");
            }
        };
    }
}
