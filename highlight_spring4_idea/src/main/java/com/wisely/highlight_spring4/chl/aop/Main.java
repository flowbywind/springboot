package com.wisely.highlight_spring4.chl.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by myadmin on 2016/10/16.
 */
public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService=context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService=context.getBean(DemoMethodService.class);

        demoAnnotationService.add();
        demoMethodService.add();
        demoMethodService.delete();
        context.close();
    }
}
