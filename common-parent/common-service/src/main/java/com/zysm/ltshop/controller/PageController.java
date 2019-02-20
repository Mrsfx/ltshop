package com.zysm.ltshop.controller;

import com.zysm.ltshop.client.PageClient;
import com.zysm.ltshop.util.VelocityUtils;
import org.springframework.web.bind.annotation.*;

/**
 * Copyright (C), 2018-2019, Chong Qing  zy.
 *
 * @ClassName: PageController
 * @Description: TODO
 * @Author: Mr_shi
 * @CreateDate: 2019/2/18 21:08
 * @Version: 1.0
 */
@RestController
public class PageController implements PageClient{

    @RequestMapping(value = "/staticPage",method = RequestMethod.POST)
    public void getStaticPage(@RequestBody Object model,
                              @RequestParam("templatePath") String templatePath,
                              @RequestParam("staticPagePah") String staticPagePah){

        //如果我能接受到这个三个参数，里面就好办了
        System.out.println(model);
        System.out.println(templatePath);
        System.out.println(staticPagePah);
        VelocityUtils.staticByTemplate(model,templatePath,staticPagePah);

    }
}
