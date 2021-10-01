package com.mszlu.blog.common.cache;

import java.lang.annotation.*;

/**
 * @author LinCai
 * @create 2021-09-27 23:41
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Cache {

    long expire() default 1 * 60 * 1000;

    //缓存标识 key
    String name() default "";
}
