package com.wisely.highlight_spring4.chl2.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by myadmin on 2016/10/17.
 */
public class DemoEvent extends   ApplicationEvent {

    private static final long serialVersionUID=1L;
    private String msg;
    public DemoEvent(Object source,String msg){
        super(source);
        this.msg=msg;
    }

    public String getMsg(){
        return this.msg;
    }

    public void setMsg(String msg){
        this.msg=msg;
    }

}
