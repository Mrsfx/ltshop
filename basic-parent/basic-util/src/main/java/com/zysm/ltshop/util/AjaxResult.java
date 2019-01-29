package com.zysm.ltshop.util;

/**
 * Copyright (C), 2018-2019, Chong Qing  zy.
 *
 * @ClassName: AjaxResult
 * @Description: 请求返回对象
 * @Author: Mr_shi
 * @CreateDate: 2019/1/27 11:03
 * @Version: 1.0
 */
public class AjaxResult {
    private Boolean success;    //是否成功
    private String message;     //提示信息
    private Object returnData;  //请求成功返回的数据

    public Boolean getSuccess() {
        return success;
    }

    public AjaxResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getReturnData() {
        return returnData;
    }

    public AjaxResult setReturnData(Object returnData) {
        this.returnData = returnData;
        return this;
    }

    public static AjaxResult getAjaxResult(){
        return new AjaxResult();
    }
}
