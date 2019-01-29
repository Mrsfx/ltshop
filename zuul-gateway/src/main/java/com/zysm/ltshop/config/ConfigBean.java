package com.zysm.ltshop.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Copyright (C), 2018-2019, Chong Qing  zy.
 *
 * @ClassName: ConfigBean
 * @Description: 配置中心
 * @Author: Mr_shi
 * @CreateDate: 2019/1/28 17:01
 * @Version: 1.0
 */
@SpringBootConfiguration
@EnableSwagger2     //开启swagger生成接口文档
public class ConfigBean {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("爱购电商平台系统")
                .description("爱购电商平台接口文档说明")
                .contact(new Contact("solarger", "", "lishugen@itsoruce.cn"))
                .version("1.0")
                .build();
    }

}
