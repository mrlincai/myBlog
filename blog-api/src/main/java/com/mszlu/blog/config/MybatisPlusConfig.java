package com.mszlu.blog.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author LinCai
 * @create 2021-09-21 17:24
 * Configuration -> 让spring可以扫描到下面这个类
 * MapperScan -> mybatis的扫包(后面要改mapper路径)
 * MybatisPlusInterceptor -> 拦截器 -> 分页插件
 */
@Configuration
@MapperScan("com.mszlu.blog.dao.mapper")
public class MybatisPlusConfig {

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return interceptor;
    }

}
