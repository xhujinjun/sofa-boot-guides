package com.github.xiejinjun.web;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 统一请求
 * @author zql
 */
@Data
public class ApiRequest<T> {
    /**
     * 加密head用于保存加密的用户数据
     */
    @ApiModelProperty("请求头")
    protected RequestHead head;
    /**
     * 请求ID
     * 请求唯一
     */
    @ApiModelProperty(hidden = true)
    protected String requestId;
    /**
     * 请求时间
     */
    @NotNull
    @Min(0)
    @ApiModelProperty("请求时间戳 单位(秒)")
    protected Long timestamp;
    /**
     * 授权key
     */
    @ApiModelProperty("授权KEY")
    protected String tokenKey;
    /**
     * 登录设备类型
     */
    @ApiModelProperty("登录设备类型")
    protected ClientType clientType = ClientType.PC;

    @NotNull
    @Valid
    private T data;
}
