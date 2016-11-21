package com.wisely.highlight_spring4.chl2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by myadmin on 2016/10/17.
 */
public class Main {
    public static  void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);

        DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService s2 = context.getBean(DemoSingletonService.class);

        System.out.println("single equal "+s1.equals(s2));

        System.out.println("prototye equal "+p1.equals(p2));

    }

}
