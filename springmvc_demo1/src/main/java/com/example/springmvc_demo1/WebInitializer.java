package com.example.springmvc_demo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by myadmin on 2016/11/2.
 */
public class WebInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        AnnotationConfigWebApplicationContext ctx=new AnnotationConfigWebApplicationContext();
        //注册配置类并和当前servlet关联
        ctx.register(MyMvcConfig.class);
        ctx.setServletContext(servletContext);

        //注册spring mvc的Dispatcher
        ServletRegistration.Dynamic servlet=servletContext.addServlet("dispatcher",new DispatcherServlet(ctx));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
    }

    public static void main(String[] args){
        Integer num1=500,num2=500;
        System.out.println(num1==num2);
        Integer num3=50,num4=50;
        System.out.println(num3==num4);
    }
}
