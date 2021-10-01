package com.mszlu.blog.controller;

import com.mszlu.blog.Service.SysUserService;
import com.mszlu.blog.vo.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author LinCai
 * @create 2021-09-24 16:25
 */
@RestController
@RequestMapping("users")
public class UsersController {

    @Resource
    private SysUserService sysUserService;

    @GetMapping("currentUser")
    public Result currentUser(@RequestHeader("Authorization") String token){
        return sysUserService.findUserByToken(token);
    }

}
