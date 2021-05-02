package com.biber.sugw.dto;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class PostDto {

    @Pattern(regexp = "^2020[0-9]{4}$",message = "不符合规范")
    private String stdId;
    @NotNull(message = "不能为空")
    private String stdName;
    @NotNull(message = "不能为空")
    private String major;
    @NotNull(message = "不能为空")
    private String classNum;
    @Pattern(regexp = "[0-9]{5,10}$",message = "不符合规范")
    private String stdQQ;
    @Pattern(regexp = "^[1][0-9]{10}$",message = "不符合规范")
    private String stdPhone;
    @Valid
    @NotNull
    private Will firstWill;
    private Will secondWill;
    @Pattern(regexp = "true|false",message = "不符合规范")
    private String isDispensing;

    @Data
    public static class Will{
        @NotNull
        private String organization;
        @NotNull
        private String branch;
        private String reason;

    }

}
