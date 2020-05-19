package com.youngcarl.common.pojo;


/**
 * @Author yanghanjin
 * @Description: 请求返回Model
 * @Date 2019/4/16
 */
public class ResponseModel {

    private Integer code;

    private String message;

    private Object data;

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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    private ResponseModel() {
    }

    private static ResponseModel model = null;

    public static ResponseModel success(Object data) {
        if (model == null) {
            model = new ResponseModel();
        }
        model.setCode(ResponseStatus.RESPONNSE_SUCCESS.getCode());
        model.setMessage(ResponseStatus.RESPONNSE_SUCCESS.getMessage());
        model.setData(data);
        return model;
    }

    public static ResponseModel faild(Object data) {
        if (model == null) {
            model = new ResponseModel();
        }
        model.setCode(ResponseStatus.RESPONNSE_FAILD.getCode());
        model.setMessage(ResponseStatus.RESPONNSE_FAILD.getMessage());
        model.setData(data);
        return model;
    }

    public static ResponseModel customize(ResponseStatus responseStatus, Object data) {
        if (model == null) {
            model = new ResponseModel();
        }
        model.setCode(responseStatus.getCode());
        model.setMessage(responseStatus.getMessage());
        model.setData(data);
        return model;
    }

    public static ResponseModel customizeAll(Integer code, String message, Object data) {
        if (model == null) {
            model = new ResponseModel();
        }
        model.setCode(code);
        model.setMessage(message);
        model.setData(data);
        return model;
    }


}
