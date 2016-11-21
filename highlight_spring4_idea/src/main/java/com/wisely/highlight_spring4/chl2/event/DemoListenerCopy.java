package com.wisely.highlight_spring4.chl2.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by myadmin on 2016/10/17.
 */
@Component
public class DemoListenerCopy implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent event) {
         System.out.println( "收到第二条消息："+event.getMsg());
    }
}
