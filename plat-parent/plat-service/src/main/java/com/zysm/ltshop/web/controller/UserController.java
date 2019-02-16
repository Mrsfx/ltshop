package com.zysm.ltshop.web.controller;

import com.zysm.ltshop.domain.User;
import com.zysm.ltshop.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (C), 2018-2019, Chong Qing  zy.
 *
 * @ClassName: UserController
 * @Description: TODO
 * @Author: Mr_shi
 * @CreateDate: 2019/1/27 16:33
 * @Version: 1.0
 */
@RestController
@RequestMapping
public class UserController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody User user){
        if("root".equals(user.getUsername())&&"admin".equals(user.getPassword())){
            return AjaxResult.me().setSuccess(true).setMessage("登录成功").setRetObj(new User("M","aa"));
        }
        return AjaxResult.me().setSuccess(false).setMessage("用户名或密码错误！");
    }
}
