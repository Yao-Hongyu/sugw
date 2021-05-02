package com.biber.sugw.service;

import com.biber.sugw.dto.PostDto;
import com.biber.sugw.vo.CommonResultVo;

public interface PostService {

    /**
     * 1.提交志愿
     */

    public CommonResultVo save(PostDto postDto);

}
