package com.wisely.highlight_spring4.chl.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;

/**
 * Created by myadmin on 2016/10/16.
 */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.chl.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}
