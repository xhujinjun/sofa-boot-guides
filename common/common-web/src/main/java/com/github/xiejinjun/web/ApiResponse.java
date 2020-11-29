package com.github.xiejinjun.web;

import lombok.Data;

/**
 * 响应
 * <p>所有的Controller使用此统一响应体</p>
 *
 * @author zql
 * @param <T>
 */
@Data
public class ApiResponse<T> {
    private Integer code;
    private String msg;
    private String requestId;
    private T data;

    public static <T> ApiResponse<T> success(T data) {
        ApiResponse<T> res = new ApiResponse<>();
        res.setCode(SysStatusCode.SUCCESS.getCode());
        res.setMsg(SysStatusCode.SUCCESS.getMsg());
        res.setData(data);
        return res;
    }

    public static ApiResponse<Void> success4Void() {
        ApiResponse<Void> res = new ApiResponse<>();
        res.setCode(SysStatusCode.SUCCESS.getCode());
        res.setMsg(SysStatusCode.SUCCESS.getMsg());
        return res;
    }
}
