package com.wisely.highlight_spring4.chl.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by myadmin on 2016/10/16.
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut("@annotation(com.wisely.highlight_spring4.chl.aop.Action)")
    public void annotationPointCut(){};

//    @After("annotationPointCut()")
    @After("@annotation(com.wisely.highlight_spring4.chl.aop.Action)")
    public void aftet(JoinPoint joinPoint){
        MethodSignature signature=(MethodSignature)joinPoint.getSignature();
        Method method=signature.getMethod();
        Action action=method.getAnnotation(Action.class);
        System.out.println("注解式拦截 "+action.name());
    }

    @Before("execution(* com.wisely.highlight_spring4.chl.aop.DemoMethodService.*(..))")
    public  void before(JoinPoint joinPoint){
        MethodSignature signature=(MethodSignature) joinPoint.getSignature();
        Method method=signature.getMethod();
        System.out.println("方法规则式拦截，"+ method.getName());
    }
}
