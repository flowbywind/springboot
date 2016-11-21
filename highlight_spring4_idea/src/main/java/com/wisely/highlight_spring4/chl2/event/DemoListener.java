package com.wisely.highlight_spring4.chl2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by myadmin on 2016/10/17.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    public void onApplicationEvent(DemoEvent demoEvent){
        String msg=demoEvent.getMsg();
        System.out.println("我(bean-demo-listener)接收到了beam-demo-publish发布的消息"+msg);
    }
}
