package com.wisely.highlight_spring4.chl2.prepost;

/**
 * Created by myadmin on 2016/10/17.
 */
public class BeanWayService {
    public void init(){
        System.out.println("@Bean-init-method");
    }

    public BeanWayService(){
        super();
        System.out.println("初始化构造函数-BeanwayService");
    }

    public void destroy(){
        System.out.println("@Bean-destroy-method");
    }

}
