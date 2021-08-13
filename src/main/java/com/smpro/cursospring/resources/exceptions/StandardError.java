package com.smpro.cursospring.resources.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable {
    private static final long serialVersionUID = -6530908927131471505L;
    private Integer status;
    private String msg;
    private Long timeStamp;

    public StandardError(Integer status, String msg, Long timeStamp) {
        this.status = status;
        this.msg = msg;
        this.timeStamp = timeStamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getTimeStanp() {
        return timeStamp;
    }

    public void setTimeStanp(Long timeStanp) {
        this.timeStamp = timeStanp;
    }
}
