package com.mszlu.blog.common.aop;

import org.springframework.scheduling.support.SimpleTriggerContext;

import java.lang.annotation.*;

/**
 * @author LinCai
 * @create 2021-09-27 14:29
 * @Target Type 代表可以放在类上面 Method 代表可以放在方法上
 */

@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogAnnotation {

    String module() default "";

    String operator() default "";
}
