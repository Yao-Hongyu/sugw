package com.biber.sugw.service;

import com.biber.sugw.dto.LoginDto;
import com.biber.sugw.dto.TokenDto;
import com.biber.sugw.vo.CommonResultVo;

public interface LoginService {

    /**
     * 1.以管理员身份登录
     */
    public CommonResultVo login(LoginDto loginDto);


    /**
     * 2.验证token
     */
    public CommonResultVo getRole(TokenDto tokenDto);

}
