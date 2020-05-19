package com.youngcarl.common.pojo;

/**
 * @Author yanghanjin
 * @Description:
 * @Date 2019/2/27
 */
public enum ResponseStatus {

    RESPONNSE_SUCCESS(200,"请求成功"),
    RESPONNSE_FAILD(400,"请求异常"),
    RESPONNSE_NOTLOGIN(401,"未登录"),

    RESPONNSE_PASSWORD_LENGTHLE8(501,"密码长度不能小于8位"),
    RESPONNSE_PASSWORD_LENGTHGE16(502,"密码长度不能大于20位"),
    RESPONNSE_PASSWORD_CONTAINSCHAR(503,"密码包括大小写字母、数字、其它符号，以上四种至少三种"),
    RESPONNSE_PASSWORD_CONTAINSSAMEMORECHAR(504,"密码不能有相同长度超2的子串重复"),
    RESPONNSE_PASSWORD_CONTAINSSAMECHAR(505,"密码中不得包含与登录名相同的字母组合，含大小写组合"),

    RESPONNSE_SIGNFAILD(600,"sign令牌错误"),
    RESPONNSE_SIGNTIMEOUT(601,"请求地址已失效"),
    RESPONNSE_SIGNINVALID(602,"登录信息已失效，请重新登录"),
    RESPONNSE_NOTOKEN(603,"token已失效"),
    RESPONNSE_SIGNEXCEPTION(603,"鉴权失败，缺少参数");

    private Integer code;

    private String message;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    ResponseStatus(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
