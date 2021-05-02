package com.biber.sugw.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StudentVo {
    private Integer stdId;
    private String stdName;
    private String major;
    private String classNum;
    private String stdQQ;
    private String stdPhone;
    private Will firstWill;
    private Will secondWill;
    private String isDispensing;

    @Data
    private static class Will{
        private String organization;
        private String branch;
        private String reason;
    }

}
