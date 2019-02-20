package com.zysm.ltshop.client;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * Copyright (C), 2018-2019, Chong Qing  zy.
 *
 * @ClassName: PageClientFallbackFactory
 * @Description: TODO
 * @Author: Mr_shi
 * @CreateDate: 2019/2/18 21:15
 * @Version: 1.0
 */
@Component
public class PageClientFallbackFactory implements FallbackFactory<PageClient> {
    @Override
    public PageClient create(Throwable throwable) {
        return new PageClient() {
            @Override
            public void getStaticPage(Object model, String templatePath, String staticPagePah) {
                System.out.println("生成页面失败");
            }
        };
    }
}
