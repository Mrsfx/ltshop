package com.zysm.ltshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Copyright (C), 2018-2019, Chong Qing  zy.
 *
 * @ClassName: CommonServiceApplication
 * @Description: TODO
 * @Author: Mr_shi
 * @CreateDate: 2019/2/17 11:10
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2

public class CommonServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommonServiceApplication.class, args);
    }
}
