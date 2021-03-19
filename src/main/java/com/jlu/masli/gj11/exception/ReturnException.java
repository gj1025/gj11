package com.jlu.masli.gj11.exception;
/**
 * 定义一个描述对象
 */
public class ReturnException {
    // 响应码
    private Integer code;
    // 异常描述
    private String msg;
    // 请求的Url
    private String url;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
