package com.wisely.highlight_spring4.chl2.profile;

import com.wisely.highlight_spring4.chl2.Profile;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by myadmin on 2016/10/17.
 */
public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev");//先将活动的Profile设定dev
        context.register(ProfileConfig.class); //后置注册Bean配置类，不然会报Bean未定义错误
        context.refresh();//刷新容器
        DemoBean demoBean=context.getBean(DemoBean.class);
        System.out.println(demoBean.getContext());
        context.close();
    }
}
