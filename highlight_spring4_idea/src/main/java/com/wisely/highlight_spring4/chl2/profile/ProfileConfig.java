package com.wisely.highlight_spring4.chl2.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by myadmin on 2016/10/17.
 */
@Configuration
public class ProfileConfig {


    @Bean
  @Profile("dev")
  public DemoBean devDemoBean(){
      return new DemoBean("from development profile");
  }

  @Bean
  @Profile("prod")
  public  DemoBean prodDemoBean(){
      return new DemoBean("from production profile");
  }

}
