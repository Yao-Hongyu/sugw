package com.biber.sugw.service.impl;

import com.biber.sugw.dao.*;
import com.biber.sugw.dto.PostDto;
import com.biber.sugw.mappers.mapperExtension.MajorMapperExtension;
import com.biber.sugw.mappers.mapperExtension.OrganizationMapperExtension;
import com.biber.sugw.mappers.mapperExtension.StudentMapperExtension;
import com.biber.sugw.service.PostService;
import com.biber.sugw.vo.CommonResultVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Resource
    private StudentMapperExtension studentMapperExtension;
    @Resource
    private MajorMapperExtension majorMapperExtension;
    @Resource
    private OrganizationMapperExtension organizationMapperExtension;


    @Override
    public CommonResultVo save(PostDto postDto) {
        //数据拆箱
        Integer stdId = Integer.parseInt(postDto.getStdId());
        String stdName = postDto.getStdName();
        String major = postDto.getMajor();
        String classNum = postDto.getClassNum();
        String stdQQ = postDto.getStdQQ();
        String stdPhone = postDto.getStdPhone();

        PostDto.Will firstWill = postDto.getFirstWill();
        String organizationFirst = firstWill.getOrganization();
        String branchFirst = firstWill.getBranch();
        String reasonFirst = firstWill.getReason();


        PostDto.Will secondWill = postDto.getSecondWill();

        String isDispensing = postDto.getIsDispensing();

        Student student = new Student();

        //进行一些数据校验
        //1.检索专业
        MajorExample majorExample = new MajorExample();
        majorExample.createCriteria().andMajornameEqualTo(major);
        List<Major> majors = majorMapperExtension.selectByExample(majorExample);
        if (majors.size() != 1) return CommonResultVo.PostFail();

        //2.检索填报的志愿
        //2.1检索填报的志愿1
        OrganizationExample organizationExample = new OrganizationExample();
        organizationExample.createCriteria().andOrgnameEqualTo(organizationFirst)
                                            .andBranchnameEqualTo(branchFirst);
        List<Organization> organizations = organizationMapperExtension.selectByExample(organizationExample);
        if (organizations.size() != 1) return CommonResultVo.PostFail();
        student.setWillfirst(organizations.get(0).getOrgid());
        student.setReasonfirst(reasonFirst);

        //2.2检索填报的志愿2
        if (secondWill != null){
            String organizationSecond = secondWill.getOrganization();
            String branchSecond = secondWill.getBranch();
            String reasonSecond = secondWill.getReason();
            organizationExample.clear();
            organizationExample.createCriteria().andOrgnameEqualTo(organizationSecond)
                                                .andBranchnameEqualTo(branchSecond);
            organizations = organizationMapperExtension.selectByExample(organizationExample);
            if (organizations.size() != 1) return CommonResultVo.PostFail();
            student.setWillsecond(organizations.get(0).getOrgid());
            student.setReasonsecond(reasonSecond);
        }

        //数据重新装箱
        student.setStdid(stdId);
        student.setStdname(stdName);
        student.setMajor(majors.get(0).getMajorid());
        student.setClassnum(classNum);
        student.setStdqq(stdQQ);
        student.setStdphone(stdPhone);
        student.setIsdispensing(isDispensing);

        StudentExample studentExample = new StudentExample();
        studentExample.createCriteria().andStdidEqualTo(stdId);

        if (studentMapperExtension.selectByExample(studentExample).isEmpty()){
            int result = studentMapperExtension.insert(student);
            if (result == 1) return CommonResultVo.PostSuccess();
        } else {
            int result = studentMapperExtension.updateByExample(student, studentExample);
            if (result == 1) return CommonResultVo.PostSuccess();
        }
        return CommonResultVo.PostFail();
    }
}
