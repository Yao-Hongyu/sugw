package com.biber.sugw.mappers.mapperExtension;

import com.biber.sugw.dao.Student;
import com.biber.sugw.mappers.mapper.StudentMapper;
import com.biber.sugw.vo.StudentVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapperExtension extends StudentMapper {

    public List<StudentVo> getAllWithOrganizationAndBranchAndMajor();

    public List<StudentVo> getByWillWithOrganizationAndBranchAndMajor(List<Integer> orgIdList);

}
