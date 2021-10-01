package com.mszlu.blog.utils;

import com.mszlu.blog.dao.pojo.SysUser;
import org.aspectj.weaver.ast.Var;

/**
 * @author LinCai
 * @create 2021-09-26 8:21
 */
public class UserThreadlocal {

    private UserThreadlocal(){}
    //TODO 线程变量隔离
    private static final ThreadLocal<SysUser> LOCAL = new ThreadLocal<>();

    public static void put(SysUser sysUser) {
        LOCAL.set(sysUser);
    }

    public static SysUser get(){
        return LOCAL.get();
    }

    public static void remove(){
        LOCAL.remove();
    }


}
