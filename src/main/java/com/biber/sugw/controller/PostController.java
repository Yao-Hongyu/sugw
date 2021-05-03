package com.biber.sugw.controller;

import com.biber.sugw.dto.PostDto;
import com.biber.sugw.service.PostService;
import com.biber.sugw.vo.CommonResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Api(tags = "PostController",description = "提交志愿功能")
@RestController
@CrossOrigin("*")
public class PostController {

    @Autowired
    private PostService postService;

    @ApiOperation("提交志愿")
    @PostMapping("/post")
    public CommonResultVo save(@Valid @RequestBody PostDto postDto){
        if (postDto!=null){
            return postService.save(postDto);
        } else {
            return CommonResultVo.PostFail();
        }
    }

}
