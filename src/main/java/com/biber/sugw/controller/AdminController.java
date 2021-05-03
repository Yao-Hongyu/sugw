package com.biber.sugw.controller;

import com.biber.sugw.dto.GetAllStuInfoDto;
import com.biber.sugw.dto.GetStuInfoDto;
import com.biber.sugw.service.AdminService;
import com.biber.sugw.vo.CommonResultVo;
import com.biber.sugw.vo.GetAllStuInfoVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@Api(tags = "AdminController",description = "管理员功能")
@RestController
@CrossOrigin("*")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @ApiOperation("获取所有学生信息")
    @PostMapping("/getAllStuInfo")
    public CommonResultVo getAllStuInfo(@Validated @RequestBody GetAllStuInfoDto getAllStuInfoDto,
                                        @NotNull @RequestParam @ApiParam("页码") Integer page, @NotNull @RequestParam @ApiParam("每页数量") Integer pageSize){
        if (getAllStuInfoDto == null) return CommonResultVo.FormError();

        getAllStuInfoDto.setPage(page);
        getAllStuInfoDto.setPageSize(pageSize);

        return adminService.getAllStuInfo(getAllStuInfoDto);

    }

    @ApiOperation("关键字搜索")
    @PostMapping("/getStuInfo")
    public CommonResultVo getStuInfo(@Validated @RequestBody GetStuInfoDto getStuInfoDto,@NotNull @RequestParam @ApiParam("页码") Integer page,@NotNull @RequestParam @ApiParam("每页数量") Integer pageSize){

        if (getStuInfoDto == null) return CommonResultVo.FormError();
        getStuInfoDto.setPage(page);
        getStuInfoDto.setPageSize(pageSize);

        return adminService.getStuInfo(getStuInfoDto);
    }

}
