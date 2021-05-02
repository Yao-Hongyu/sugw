package com.biber.sugw.util;

import com.biber.sugw.dao.Student;
import com.biber.sugw.dto.PostDto;
import com.biber.sugw.vo.StudentVo;

import java.util.ArrayList;
import java.util.List;

public class PageUtil {

    public static List<StudentVo> page(Integer page, Integer pageSize, List<StudentVo> studentVos) {
        List<StudentVo> studentVoList = new ArrayList<>();
        int start = (page - 1) * pageSize;
        int sum = studentVos.size();
        if (pageSize > (sum - (page - 1) * pageSize)) pageSize = (sum - (page - 1) * pageSize);
        for (int i = 0; i < pageSize; i++) {
            studentVoList.add(studentVos.get(start++));
        }
        return studentVoList;
    }

}
