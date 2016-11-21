package com.wisely.highlight_spring4.chl.di;

import org.springframework.stereotype.Service;

/**
 * Created by myadmin on 2016/10/16.
 */
//@Service
public class FunctionService {
    public String sayHello(String word){
        return "hello "+word+" !";
    }
}
