package com.biber.sugw.service.impl;

import com.biber.sugw.dao.Organization;
import com.biber.sugw.dao.OrganizationExample;
import com.biber.sugw.dao.Student;
import com.biber.sugw.dao.StudentExample;
import com.biber.sugw.dto.GetAllStuInfoDto;
import com.biber.sugw.dto.GetStuInfoDto;
import com.biber.sugw.mappers.mapperExtension.OrganizationMapperExtension;
import com.biber.sugw.mappers.mapperExtension.StudentMapperExtension;
import com.biber.sugw.service.AdminService;
import com.biber.sugw.util.JwtUtil;
import com.biber.sugw.util.PageUtil;
import com.biber.sugw.vo.CommonResultVo;
import com.biber.sugw.vo.GetAllStuInfoVo;
import com.biber.sugw.vo.GetStuInfoVo;
import com.biber.sugw.vo.StudentVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private StudentMapperExtension studentMapperExtension;
    @Resource
    private OrganizationMapperExtension organizationMapperExtension;

    @Override
    public CommonResultVo getAllStuInfo(GetAllStuInfoDto getAllStuInfoDto) {
        String token = getAllStuInfoDto.getToken();
        if (JwtUtil.verity(token)) {
            //数据拆箱
            Integer page = getAllStuInfoDto.getPage();
            Integer pageSize = getAllStuInfoDto.getPageSize();

            //获取全部学生信息
            List<StudentVo> allWithOrganizationAndBranchAndMajor = studentMapperExtension.getAllWithOrganizationAndBranchAndMajor();
            int size = allWithOrganizationAndBranchAndMajor.size();

            //检查数据
            if (page == 0 || pageSize == 0) return CommonResultVo.FormError();
            if ((page - 1) * pageSize >= size) return CommonResultVo.FormError();

            //分页
            List<StudentVo> studentVoList = PageUtil.page(page, pageSize, allWithOrganizationAndBranchAndMajor);

            //数据装箱
            int total = allWithOrganizationAndBranchAndMajor.size();

            GetAllStuInfoVo getAllStuInfoVo = new GetAllStuInfoVo();
            getAllStuInfoVo.setTotal(total);
            getAllStuInfoVo.setStudents(studentVoList);

            return CommonResultVo.OperationSuccess(getAllStuInfoVo);
        }
        return CommonResultVo.WrongToken();
    }

    @Override
    public CommonResultVo getStuInfo(GetStuInfoDto getStuInfoDto) {
        String token = getStuInfoDto.getToken();
        if (JwtUtil.verity(token)) {
            //数据拆箱
            String keyWord = getStuInfoDto.getKeyWord();
            Integer page = getStuInfoDto.getPage();
            Integer pageSize = getStuInfoDto.getPageSize();

            //检查数据
            if (keyWord == "" || keyWord == null || page == 0 || pageSize == 0) return CommonResultVo.FormError();

            //抽出组织号
//            OrganizationExample organizationExample = new OrganizationExample();
//            organizationExample.or().andOrgnameLike(keyWord);
//            organizationExample.or().andBranchnameLike(keyWord);
//            List<Organization> organizations = organizationMapperExtension.selectByExample(organizationExample);
            List<Organization> organizations = organizationMapperExtension.findByName(keyWord);

            if (organizations.isEmpty()){
                return CommonResultVo.FormError("未找到相关信息");
            }

            List<Integer> organizationIdList = new ArrayList<>();
            for (Organization organization : organizations) {
                Integer orgid = organization.getOrgid();
                organizationIdList.add(orgid);
            }

            //筛选填写了指定组织号的学生
//            StudentExample studentExample = new StudentExample();
//            studentExample.or().andWillfirstIn(organizationIdList);
//            studentExample.or().andWillsecondIn(organizationIdList);
//            List<Student> students = studentMapperExtension.selectByExample(studentExample);
            //筛选填写了指定组织号的学生
            List<StudentVo> byWillWithOrganizationAndBranchAndMajor = studentMapperExtension.getByWillWithOrganizationAndBranchAndMajor(organizationIdList);
            int size = byWillWithOrganizationAndBranchAndMajor.size();

            //再次检查数据
            if (page == 0 || pageSize == 0) return CommonResultVo.FormError();
            if ((page - 1) * pageSize >= size) return CommonResultVo.FormError();

            //分页
            List<StudentVo> studentVoList = PageUtil.page(page, pageSize,byWillWithOrganizationAndBranchAndMajor);

            int total = byWillWithOrganizationAndBranchAndMajor.size();

            //数据装箱
            GetStuInfoVo getStuInfoVo = new GetStuInfoVo();
            getStuInfoVo.setTotal(total);
            getStuInfoVo.setStudents(studentVoList);

            return CommonResultVo.OperationSuccess(getStuInfoVo);
        }
        return CommonResultVo.WrongToken();
    }
}
