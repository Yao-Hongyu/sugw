package com.biber.sugw.controller;

import com.biber.sugw.dto.GetAllStuInfoDto;
import com.biber.sugw.dto.GetStuInfoDto;
import com.biber.sugw.service.AdminService;
import com.biber.sugw.vo.CommonResultVo;
import com.biber.sugw.vo.GetAllStuInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@RestController
@CrossOrigin("*")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/getAllStuInfo")
    public CommonResultVo getAllStuInfo(@Validated @RequestBody GetAllStuInfoDto getAllStuInfoDto,
                                        @NotNull @RequestParam Integer page,@NotNull @RequestParam Integer pageSize){
        if (getAllStuInfoDto == null) return CommonResultVo.FormError();

        getAllStuInfoDto.setPage(page);
        getAllStuInfoDto.setPageSize(pageSize);

        return adminService.getAllStuInfo(getAllStuInfoDto);

    }

    @PostMapping("/getStuInfo")
    public CommonResultVo getStuInfo(@Validated @RequestBody GetStuInfoDto getStuInfoDto,@NotNull @RequestParam Integer page,@NotNull @RequestParam Integer pageSize){

        if (getStuInfoDto == null) return CommonResultVo.FormError();
        getStuInfoDto.setPage(page);
        getStuInfoDto.setPageSize(pageSize);

        return adminService.getStuInfo(getStuInfoDto);
    }

}
