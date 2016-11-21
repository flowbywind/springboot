package com.wisely.highlight_spring4.chl.di;

import org.springframework.context.annotation.Bean;

/**
 * Created by myadmin on 2016/10/16.
 */
public class JavaConfig {

    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }

//    public UseFunctionService useFunctionService(){
//        UseFunctionService useFunctionService=new UseFunctionService();
//        useFunctionService.setFunctionService(functionService());
//        return useFunctionService;
//    }
//
    @Bean
    public UseFunctionService useFunctionService(FunctionService functionService){
        UseFunctionService useFunctionService=new UseFunctionService();
        useFunctionService.setFunctionService(functionService);
        return useFunctionService;
    }
}
