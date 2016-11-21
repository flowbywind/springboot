package com.wisely.highlight_spring4.chl2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by myadmin on 2016/10/17.
 */
public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig config=context.getBean(ElConfig.class);
        config.outputResource();
        context.close();
    }
}
