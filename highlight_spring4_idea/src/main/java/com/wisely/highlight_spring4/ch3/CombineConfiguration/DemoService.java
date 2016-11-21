package com.wisely.highlight_spring4.ch3.CombineConfiguration;

import org.springframework.stereotype.Service;

/**
 * Created by myadmin on 2016/10/23.
 */
@Service
public class DemoService {
    public void outputLog(){
        System.out.println("测试组合注解");
    }
}
