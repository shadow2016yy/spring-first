package com.ryan.www.aspect;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;

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
        Signature signature = pjp.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Object target = pjp.getTarget();
        Class<?> clazz = target.getClass();
        Method method = clazz.getMethod(methodSignature.getName(), methodSignature.getParameterTypes());
        String className = clazz.getName().substring( clazz.getName().lastIndexOf(".")+1);
        String completeName=className+"."+method.getName();
        Object[] args = pjp.getArgs();
        System.out.println(completeName+"入参是:"+getCompleteParam(args));
        Object result = pjp.proceed();
        System.out.println(completeName+"结果是:"+result);
        System.out.println("环绕通知结束");
        return result;
    }

    private Object getCompleteParam( Object[] args){
        if (Objects.isNull(args)||args.length==0){
            return "方法入参为空";
        }
        StringBuffer result=new StringBuffer();
        for (Object obj:args){
            result.append(JSON.toJSONString(obj));
        }
        return result.toString();
    }

}
