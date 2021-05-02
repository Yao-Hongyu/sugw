package com.biber.sugw.controller;

import com.biber.sugw.dto.PostDto;
import com.biber.sugw.service.PostService;
import com.biber.sugw.vo.CommonResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin("*")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping("/post")
    public CommonResultVo save(@Valid @RequestBody PostDto postDto){
        if (postDto!=null){
            return postService.save(postDto);
        } else {
            return CommonResultVo.PostFail();
        }
    }

}
