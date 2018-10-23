package com.ander.annotation;

import java.lang.annotation.*;

/**
 * @see  https://blog.csdn.net/yixiaogang109/article/details/7328466
 *
 * 具体原 注解 含义
 */
@Target(ElementType.METHOD)

@Retention(RetentionPolicy.RUNTIME)

@Documented
public @interface SysLogAnnotation {

    String value() default "";

}
