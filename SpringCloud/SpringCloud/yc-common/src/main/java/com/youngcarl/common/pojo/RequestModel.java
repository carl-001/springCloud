package com.youngcarl.common.pojo;

/**
 * @Author yanghanjin
 * @Description: 前端请求Model
 * @Date 2019/4/16
 */
public class RequestModel<T> {

    private String token;

    private Long timestap;

    private String sign;

    private T data;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getTimestap() {
        return timestap;
    }

    public void setTimestap(Long timestap) {
        this.timestap = timestap;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
