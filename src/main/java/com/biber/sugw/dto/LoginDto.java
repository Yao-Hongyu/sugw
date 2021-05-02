package com.biber.sugw.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class LoginDto {

    @NotNull(message = "不能为空")
    private String username;
    @NotNull(message = "不能为空")
    private String password;

}
