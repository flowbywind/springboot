package com.wisely.highlight_spring4.ch3.fortest;

/**
 * Created by myadmin on 2016/10/26.
 */
public class TestBean {

    private String content;

    public TestBean(String content){
        this.content=content;
    }

    public void setContent(String content){
        this.content=content;
    }

    public String getContent(){
        return this.content;
    }
}
