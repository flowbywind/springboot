package com.wisely.highlight_spring4.chl2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by myadmin on 2016/10/17.
 */
public class JSR250WayService {
    @PostConstruct
    public  void init(){
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService(){
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }
    @PreDestroy
    public void destroys(){
        System.out.println("jsr250-destroy-method");
    }
}
