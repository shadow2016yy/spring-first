package com.ryan.www.aspect;

import java.lang.annotation.*;

/**
 * Created by Ryan on 2018/11/14.
 */
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface BusinessLog {
    String value() default "不知道是啥子操作";


}
