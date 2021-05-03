package com.biber.sugw.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ApiModel(value = "GetStuInfoDto")
public class GetStuInfoDto {

    @ApiModelProperty(value = "token")
    @NotNull(message = "不能为空")
    private String token;

    @ApiModelProperty(value = "关键字")
    @NotNull(message = "不能为空")
    private String keyWord;

}
