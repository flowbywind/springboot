package com.wisely.highlight_spring4.chl2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by myadmin on 2016/10/17.
 */
@Service
public class DemoService {

    @Value("其他类的属性")
    private String another;

    public String getAnother(){
        return this.another;
    }

    public void setAnother(String another){
        this.another=another;
    }

}
