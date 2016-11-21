package com.wisely.highlight_spring4.chl2.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by myadmin on 2016/10/17.
 */
public class Main {
    public static  void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanWayService wayService=context.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService=context.getBean(JSR250WayService.class);
        context.close();
    }
}
