package com.ryan.www.annotation;

import java.lang.annotation.*;

/**
 * Created by Ryan on 2019/4/21.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface HandlerType {
    String value();
}
