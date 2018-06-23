package com.wdd.util;

public class JsonMsg {
    private boolean  success;
    private String  msg;
    private Object data;

    public JsonMsg() {
    }
    public JsonMsg(boolean success) {
        this.success = success;
    }
    public JsonMsg(String msg) {
        this.msg = msg;
    }
    public JsonMsg(String msg,Object data) {
        this.msg = msg;
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
