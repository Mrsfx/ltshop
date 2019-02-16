package com.zysm.ltshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Copyright (C), 2018-2019, Chong Qing  zy.
 *
 * @ClassName: ConfigServerApplication
 * @Description: 配置中心
 * @Author: Mr_shi
 * @CreateDate: 2019/1/29 22:16
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
