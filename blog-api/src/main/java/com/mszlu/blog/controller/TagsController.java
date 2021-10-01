package com.mszlu.blog.controller;

import com.mszlu.blog.Service.TagService;
import com.mszlu.blog.vo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author LinCai
 * @create 2021-09-23 0:10
 */
@RestController
@RequestMapping("tags")
public class TagsController {

    @Resource
    private TagService tagService;

    @GetMapping("hot")
    public Result hot(){
        int limit = 6;
        return tagService.hots(limit);

    }

    @GetMapping
    public Result findAll(){
        return tagService.findAll();

    }

    @GetMapping("detail")
    public Result findAllDetail(){
        return tagService.findAllDetail();

    }

    ///tags/detail/{id}
    @GetMapping("detail/{id}")
    public Result findDetailById(@PathVariable("id") Long id){
        return tagService.findDetailById(id);

    }
}
