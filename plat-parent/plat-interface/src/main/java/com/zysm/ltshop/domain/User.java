package com.zysm.ltshop.domain;

/**
 * Copyright (C), 2018-2019, Chong Qing  zy.
 *
 * @ClassName: User
 * @Description: 用户类
 * @Author: Mr_shi
 * @CreateDate: 2019/1/27 11:34
 * @Version: 1.0
 */
public class User {
    private Long id;
    private String username;
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
