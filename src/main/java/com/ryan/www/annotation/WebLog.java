package com.ryan.www.annotation;

import java.lang.annotation.*;

/**
 * created by  Ryan on  2020-06-22-22:05
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface WebLog {
    /**
     * 日志描述信息
     * @return
     */
    String description() default "";
}
