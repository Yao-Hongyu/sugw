package com.biber.sugw.service;

import com.biber.sugw.dto.GetAllStuInfoDto;
import com.biber.sugw.dto.GetStuInfoDto;
import com.biber.sugw.vo.CommonResultVo;

public interface AdminService {

    /**
     * 1.全表查询
     */
    public CommonResultVo getAllStuInfo(String token,Integer page,Integer pageSize);

    /**
     * 2.关键字查询
     */
    public CommonResultVo getStuInfo(String token,String keyWord,Integer page,Integer pageSize);

}
