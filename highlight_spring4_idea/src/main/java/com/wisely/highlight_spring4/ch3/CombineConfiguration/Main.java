package com.wisely.highlight_spring4.ch3.CombineConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by myadmin on 2016/10/23.
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(CombineConfiguration.class);
        DemoService demoService = context.getBean(DemoService.class);
        demoService.outputLog();
        context.close();
    }
}
