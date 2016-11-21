package com.wisely.highlight_spring4.chl.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by myadmin on 2016/10/16.
 */
//@Service
public class UseFunctionService {
//    @Autowired
    public FunctionService functionService;

    public void setFunctionService(FunctionService functionService){
        this.functionService=functionService;
    }

    public String SayHello(String word){
       return  functionService.sayHello(word);
    }
}
