package com.zysm.ltshop.controller;

import com.zysm.ltshop.client.RedisClient;
import com.zysm.ltshop.util.RedisUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (C), 2018-2019, Chong Qing  zy.
 *
 * @ClassName: RedisController
 * @Description: TODO
 * @Author: Mr_shi
 * @CreateDate: 2019/2/18 17:02
 * @Version: 1.0
 */
@RestController
public class RedisController implements RedisClient{
    /**
     * 根据key从Redis中获取数据
     * @param key
     * @return
     */
    @RequestMapping(value = "/getRedis",method = RequestMethod.GET)
    public String getRedis(String key){
        return RedisUtils.INSTANCE.get(key);
    }

    @RequestMapping(value = "/setRedis",method = RequestMethod.POST)
    public void setRedis(String key,String  value){
        RedisUtils.INSTANCE.set(key,value );
    }
}
