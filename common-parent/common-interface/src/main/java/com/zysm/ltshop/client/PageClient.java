package com.zysm.ltshop.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Copyright (C), 2018-2019, Chong Qing  zy.
 *
 * @ClassName: PageClient
 * @Description: TODO
 * @Author: Mr_shi
 * @CreateDate: 2019/2/18 21:12
 * @Version: 1.0
 */
@FeignClient(value = "LTSHOP-COMMON",fallbackFactory = PageClientFallbackFactory.class)
public interface PageClient {
    @RequestMapping(value = "/staticPage",method = RequestMethod.POST)
    public void getStaticPage(@RequestBody Object model,
                              @RequestParam("templatePath") String templatePath,
                              @RequestParam("staticPagePah") String staticPagePah);
}
