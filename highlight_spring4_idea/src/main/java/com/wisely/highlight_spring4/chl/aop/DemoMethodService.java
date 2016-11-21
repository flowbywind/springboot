package com.wisely.highlight_spring4.chl.aop;

import org.springframework.stereotype.Service;

/**
 * Created by myadmin on 2016/10/16.
 */
@Service
public class DemoMethodService {
    public  void add(){
        System.out.println("demoMethodService add");
    }

    public void delete(){
        System.out.println("demoMethodService delete");
    }
}
