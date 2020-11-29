package com.github.xiejinjun.web;

public enum SysStatusCode {
    /**
     * 执行成功
     */
    SUCCESS(1000, "成功");

    private int code;
    private String msg;

    SysStatusCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
