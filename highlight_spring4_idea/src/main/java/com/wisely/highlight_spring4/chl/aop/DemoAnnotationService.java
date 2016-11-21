package com.wisely.highlight_spring4.chl.aop;

import org.springframework.stereotype.Service;

/**
 * Created by myadmin on 2016/10/16.
 */
@Service
public class DemoAnnotationService {
    @Action(name="注解式拦截的add操作")
    public void add(){
        System.out.println("DemoAnnotationService add");
    }
}
