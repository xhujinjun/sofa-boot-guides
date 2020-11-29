package com.github.xiejinjun.web;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class RequestHead {
    @ApiModelProperty("请求来源")
    private String from;
}
