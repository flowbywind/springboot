package com.example.springmvc_demo1;

import com.example.springmvc_demo1.domain.DemoObj;
import com.example.springmvc_demo1.interceptor.DemoInterceptor;
import com.example.springmvc_demo1.messageConvert.MyHttpMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.List;

/**
 * Created by myadmin on 2016/11/2.
 */
@ComponentScan("com.example.springmvc_demo1")
@EnableWebMvc //开启spring MVC的支持
@Configuration
public class MyMvcConfig   extends WebMvcConfigurerAdapter{

    @Bean
    public MyHttpMessageConverter myHttpMessageConverter(){
        return new MyHttpMessageConverter();
    }

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(myHttpMessageConverter());
    }

    @Bean
    public MultipartResolver multipartResolver(){
        CommonsMultipartResolver resolver=new CommonsMultipartResolver();
        resolver.setMaxUploadSize(10000000);
        return resolver;
    }


    @Bean
    public DemoInterceptor demoInterceptor(){
        return  new DemoInterceptor();
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(demoInterceptor());
    }

    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/classes/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        return viewResolver;
    }


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/assets/**"). //指的是对外暴露的路径
                addResourceLocations("classpath:/assets/");//指的是的文件放置的目录
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("/index");
    }

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        //取消忽略.后面的参数 如getparam/xx.yy
        configurer.setUseSuffixPatternMatch(false);
    }

}
