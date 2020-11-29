package com.github.xiejinjun.web;

/**
 * 客户端类型
 *
 * @author zql
 * @createTime 2020/7/28
 **/
public enum ClientType {
    /**
     * 手机
     */
    MOBILE(1),
    /**
     * PC
     */
    PC(2),
    /**
     * 微信
     */
    WX(3),
    ;


    private final int code;

    ClientType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
