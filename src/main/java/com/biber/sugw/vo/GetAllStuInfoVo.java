package com.biber.sugw.vo;

import com.biber.sugw.dto.PostDto;
import lombok.Data;

import java.util.List;

@Data
public class GetAllStuInfoVo {

    private Integer total;
    private List<StudentVo> students;

}
