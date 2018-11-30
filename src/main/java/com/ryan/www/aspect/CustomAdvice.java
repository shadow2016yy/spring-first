package com.ryan.www.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by Ryan on 2018/11/30.
 * 注解方式的切面
 */
@Component
@Aspect
public class CustomAdvice {
    /**
     * 表达式是规定要拦截的规则
     * 第一个*表示返回值是任意类型
     * impl后面两个..表示当前包下 所有类的所有方法
     * @param pjp
     * @return
     * @throws Throwable
     */
    @Around("execution(* com.ryan.www.service.impl..*(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕通知开启");
        Object result = pjp.proceed();
        System.out.println("环绕通知结束");
        return result;

    }

}
