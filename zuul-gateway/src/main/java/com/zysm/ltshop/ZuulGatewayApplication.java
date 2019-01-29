package com.zysm.ltshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Copyright (C), 2018-2019, Chong Qing  zy.
 *
 * @ClassName: ZuulGatewayApplication
 * @Description: 网关
 * @Author: Mr_shi
 * @CreateDate: 2019/1/27 11:21
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulGatewayApplication.class, args);
    }
}
