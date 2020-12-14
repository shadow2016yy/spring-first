package com.ryan.www.aspect;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

/**
 * created by  Ryan on  2020-06-22-22:09
 */
@Aspect
@Component
public class WebLogAspect {

    /**
     * @param pjp
     * @return
     * @throws Throwable
     */
    @Around("@annotation(com.ryan.www.annotation.WebLog)")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("注解环绕通知开启");
        System.out.println("前置通知开启");
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        System.out.println("==============");
        System.out.println("请求路径"+request.getRequestURL().toString());
        System.out.println("请求方法"+request.getMethod());
        System.out.println("请求ip"+request.getRemoteAddr());
        System.out.println("请求参数"+ JSON.toJSONString(pjp.getArgs()));
        Signature signature = pjp.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Object target = pjp.getTarget();
        Class<?> clazz = target.getClass();
        Method method = clazz.getMethod(methodSignature.getName(), methodSignature.getParameterTypes());
        String className = clazz.getName().substring( clazz.getName().lastIndexOf(".")+1);
        String completeName=className+"."+method.getName();
        Object[] args = pjp.getArgs();
        System.out.println(completeName+"入参是:"+args);
        Object result = pjp.proceed();
        System.out.println(completeName+"结果是:"+result);
        System.out.println("注解环绕通知结束");
        return result;
    }


}
