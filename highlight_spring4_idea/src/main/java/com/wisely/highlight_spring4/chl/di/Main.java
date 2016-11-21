package com.wisely.highlight_spring4.chl.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by myadmin on 2016/10/16.
 */
public class Main {

    public static void main(String[] args){
        //使用AnnotationConfigApplicationContext作为Spring容器
//        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DiConfig.class);
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService=context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.SayHello("java config"));
        context.close();
    }
}
