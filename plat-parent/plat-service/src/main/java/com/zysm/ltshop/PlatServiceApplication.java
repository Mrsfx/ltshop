package com.zysm.ltshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Copyright (C), 2018-2019, Chong Qing  zy.
 *
 * @ClassName: PlatServiceApplication
 * @Description: 平台服务客户端
 * @Author: Mr_shi
 * @CreateDate: 2019/1/27 11:30
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class PlatServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(PlatServiceApplication.class, args);
    }
}
