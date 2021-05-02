package com.biber.sugw.controller;

import com.biber.sugw.dto.LoginDto;
import com.biber.sugw.dto.TokenDto;
import com.biber.sugw.service.LoginService;
import com.biber.sugw.vo.CommonResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public CommonResultVo login(@Validated @RequestBody LoginDto loginDto){
        if (loginDto != null){
            return loginService.login(loginDto);
        } else {
            return CommonResultVo.LoginFail();
        }
    }

    @PostMapping("/getRole")
    public CommonResultVo getRole(@Validated @RequestBody TokenDto tokenDto){
        if (tokenDto != null){
            return loginService.getRole(tokenDto);
        } else {
            return CommonResultVo.WrongToken();
        }
    }

}
