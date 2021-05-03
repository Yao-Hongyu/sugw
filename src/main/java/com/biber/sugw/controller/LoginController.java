package com.biber.sugw.controller;

import com.biber.sugw.dto.LoginDto;
import com.biber.sugw.dto.TokenDto;
import com.biber.sugw.service.LoginService;
import com.biber.sugw.vo.CommonResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Api(tags = "LoginController",description = "管理员登录功能")
@RestController
@CrossOrigin("*")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @ApiOperation("管理员登录")
    @PostMapping("/login")
    public CommonResultVo login(@Validated @RequestBody LoginDto loginDto){
        if (loginDto != null){
            return loginService.login(loginDto);
        } else {
            return CommonResultVo.LoginFail();
        }
    }

    @ApiOperation("管理员获取角色")
    @PostMapping("/getRole")
    public CommonResultVo getRole(@Validated @RequestBody TokenDto tokenDto){
        if (tokenDto != null){
            return loginService.getRole(tokenDto);
        } else {
            return CommonResultVo.WrongToken();
        }
    }

}
