package com.youngcarl.common.exception;

import com.youngcarl.common.pojo.StatusEnum;

import java.io.Serializable;

/***
 * yanghanjin
 */
public class YcException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = -8806370060612489108L;

    private String errCode;
    private String errMsg;


    public YcException(String errCode, String errMsg) {
        super(errMsg);
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public YcException(String errMsg) {
        super(errMsg);
        this.errCode = StatusEnum.FAIL.getCode();
        this.errMsg = errMsg;
    }

    public YcException(StatusEnum statusEnum) {
        super(statusEnum.getMessage());
        this.errCode = statusEnum.getCode();
        this.errMsg = statusEnum.getMessage();
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
