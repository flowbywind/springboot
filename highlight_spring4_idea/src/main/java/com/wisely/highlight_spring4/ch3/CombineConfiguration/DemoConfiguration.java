package com.wisely.highlight_spring4.ch3.CombineConfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by myadmin on 2016/10/23.
 */
@EnableAsync
@EnableScheduling
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch3.CombineConfiguration")
public class DemoConfiguration {
}
