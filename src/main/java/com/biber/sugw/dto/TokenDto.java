package com.biber.sugw.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class TokenDto {
    @NotNull(message = "不能为空")
    private String token;

}
