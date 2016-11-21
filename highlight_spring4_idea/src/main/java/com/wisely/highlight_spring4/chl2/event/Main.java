package com.wisely.highlight_spring4.chl2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by myadmin on 2016/10/17.
 */
public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher=context.getBean(DemoPublisher.class);
        demoPublisher.publish("hello world");
        context.close();
    }
}
