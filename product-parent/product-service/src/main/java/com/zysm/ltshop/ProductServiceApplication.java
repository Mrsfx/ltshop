package com.zysm.ltshop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Copyright (C), 2018-2019, Chong Qing  zy.
 *
 * @ClassName: ProductServiceApplication
 * @Description: TODO
 * @Author: Mr_shi
 * @CreateDate: 2019/2/15 21:44
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
@MapperScan("com.zysm.ltshop.mapper")
@EnableFeignClients(basePackages = "com.zysm.ltshop.client")
@EnableHystrix
public class ProductServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }
}
