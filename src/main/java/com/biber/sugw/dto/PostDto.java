package com.biber.sugw.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@ApiModel(value = "PostDto")
public class PostDto {

    @ApiModelProperty(value = "学生id")
    @Pattern(regexp = "^2020[0-9]{4}$",message = "不符合规范")
    private String stdId;

    @ApiModelProperty(value = "学生姓名")
    @NotNull(message = "不能为空")
    private String stdName;

    @ApiModelProperty(value = "专业")
    @NotNull(message = "不能为空")
    private String major;

    @ApiModelProperty(value = "班级")
    @NotNull(message = "不能为空")
    private String classNum;

    @ApiModelProperty(value = "qq")
    @Pattern(regexp = "[0-9]{5,10}$",message = "不符合规范")
    private String stdQQ;

    @ApiModelProperty(value = "手机号")
    @Pattern(regexp = "^[1][0-9]{10}$",message = "不符合规范")
    private String stdPhone;

    @ApiModelProperty(value = "第一志愿")
    @Valid
    @NotNull
    private Will firstWill;

    @ApiModelProperty(value = "第二志愿")
    private Will secondWill;

    @ApiModelProperty(value = "是否调剂")
    @Pattern(regexp = "true|false",message = "不符合规范")
    private String isDispensing;

    @Data
    @ApiModel(value = "Will")
    public static class Will{
        @ApiModelProperty(value = "组织名")
        @NotNull
        private String organization;

        @ApiModelProperty(value = "部门名")
        @NotNull
        private String branch;

        @ApiModelProperty(value = "原因")
        private String reason;

    }

}
