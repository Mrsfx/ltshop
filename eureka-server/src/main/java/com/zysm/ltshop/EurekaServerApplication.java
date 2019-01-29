package com.zysm.ltshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Copyright (C), 2018-2019, Chong Qing  zy.
 *
 * @ClassName: EurekaServerApplication
 * @Description: eureka服务端启动类
 * @Author: Mr_shi
 * @CreateDate: 2019/1/27 11:13
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
