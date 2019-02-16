package com.zysm.ltshop.util;

/**
 * @author yaohuaipeng
 * @date 2018/10/15-16:50
 */
public class AjaxResult {
    private Boolean success = true;
    private String message = "操作成功";
    private Object retObj = null;

    public static AjaxResult me(){
        return new AjaxResult();
    }

    public AjaxResult() {
    }

    public AjaxResult(String message) {
        this.message = message;
    }

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

    public Object getRetObj() {
        return retObj;
    }

    public AjaxResult setRetObj(Object retObj) {
        this.retObj = retObj;
        return this;
    }
}
