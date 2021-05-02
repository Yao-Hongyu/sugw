package com.biber.sugw.vo;

import lombok.Data;

import java.util.List;
@Data
public class GetStuInfoVo {

    private Integer total;
    private List<StudentVo> students;

}
