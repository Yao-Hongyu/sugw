package com.biber.sugw.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class GetStuInfoDto {

    @NotNull(message = "不能为空")
    private String token;
    @NotNull(message = "不能为空")
    private String keyWord;
    private Integer page;
    private Integer pageSize;

}
