package com.wisely.highlight_spring4.chl2.profile;

import com.wisely.highlight_spring4.chl2.scope.DemoSingletonService;

/**
 * Created by myadmin on 2016/10/17.
 */
public class DemoBean {

    private String content;
    public DemoBean(String content){
        super();
        this.content=content;
    }

    public String getContext(){
        return this.content;
    }

    public void setContent(String content){
        this.content=content;
    }
}
