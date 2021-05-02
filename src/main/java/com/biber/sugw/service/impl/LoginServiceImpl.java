package com.biber.sugw.service.impl;

import com.biber.sugw.dao.Admin;
import com.biber.sugw.dao.AdminExample;
import com.biber.sugw.dto.LoginDto;
import com.biber.sugw.dto.TokenDto;
import com.biber.sugw.mappers.mapperExtension.AdminMapperExtension;
import com.biber.sugw.service.LoginService;
import com.biber.sugw.util.EncryptUtil;
import com.biber.sugw.util.JwtUtil;
import com.biber.sugw.vo.CommonResultVo;
import com.biber.sugw.vo.LoginVo;
import com.biber.sugw.vo.RoleVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private AdminMapperExtension adminMapperExtension;

    @Override
    public CommonResultVo login(LoginDto loginDto) {
        //数据拆箱
        String username = loginDto.getUsername();
        String password = loginDto.getPassword();

        password = EncryptUtil.md5Encrypt(password);

        //查询管理员是否存在
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria().andUsernameEqualTo(username)
                                     .andPasswordEqualTo(password);
        List<Admin> admins = adminMapperExtension.selectByExample(adminExample);
        if (admins.size() != 1) return CommonResultVo.LoginFail();

        //签发token
        String token = JwtUtil.sign(username);
        LoginVo loginVo = new LoginVo();
        loginVo.setToken(token);
        return CommonResultVo.LoginSuccess(loginVo);
    }

    @Override
    public CommonResultVo getRole(TokenDto tokenDto) {
        String token = tokenDto.getToken();
        if (JwtUtil.verity(token)){
            String username = JwtUtil.decode(token);
            if (username != null){
                AdminExample adminExample = new AdminExample();
                adminExample.createCriteria().andUsernameEqualTo(username);
                List<Admin> admins = adminMapperExtension.selectByExample(adminExample);
                if (admins.size() == 1){
                    RoleVo roleVo = new RoleVo();
                    Admin admin = admins.get(0);

                    String role = admin.getRole();

                    roleVo.setRole(role);
                    roleVo.setName(username);
                    return CommonResultVo.getRoleSuccess(roleVo);
                }
            }
        }
        return CommonResultVo.WrongToken();
    }
}
