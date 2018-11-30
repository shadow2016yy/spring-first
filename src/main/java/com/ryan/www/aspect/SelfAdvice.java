package com.ryan.www.aspect;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by Ryan on 2018/11/30.
 * 前置通知 后置通知
 */
public class SelfAdvice implements MethodBeforeAdvice, AfterReturningAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(String.format("方法：%s开始执行",method.getName()));
    }

    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println(String.format("方法：%s执行结束",method.getName()));
    }
}
