package com.wisely.highlight_spring4.ch3.enable;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by myadmin on 2016/10/25.
 */
@EnableAspectJAutoProxy
@EnableAsync(mode=AdviceMode.ASPECTJ)
@EnableScheduling
@EnableCaching
public class TestClass {

}
