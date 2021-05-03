package com.biber.sugw.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ApiModel(value = "LoginDto")
public class LoginDto {

    @ApiModelProperty(value = "用户名")
    @NotNull(message = "不能为空")
    private String username;

    @ApiModelProperty(value = "用户密码")
    @NotNull(message = "不能为空")
    private String password;

}
