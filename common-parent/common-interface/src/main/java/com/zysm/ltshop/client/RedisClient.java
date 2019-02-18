package com.zysm.ltshop.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Copyright (C), 2018-2019, Chong Qing  zy.
 *
 * @ClassName: RedisClient
 * @Description: TODO
 * @Author: Mr_shi
 * @CreateDate: 2019/2/18 18:13
 * @Version: 1.0
 */
@FeignClient(value = "LTSHOP-COMMON",fallbackFactory = RedisClientFallbackFactory.class)
public interface RedisClient {
    @RequestMapping(value = "/getRedis",method = RequestMethod.GET)
    public String getRedis(@RequestParam("key") String key);

    @RequestMapping(value = "/setRedis",method = RequestMethod.POST)
    public void setRedis(@RequestParam("key") String key,@RequestParam("value") String value);
}
