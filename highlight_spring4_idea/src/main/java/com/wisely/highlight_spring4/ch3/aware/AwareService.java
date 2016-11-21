package com.wisely.highlight_spring4.ch3.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by myadmin on 2016/10/20.
 */
//实现BeanNameAware、ResourceLoaderAware,获得bean名称和资源加载的服务
@Service
public class AwareService implements BeanNameAware ,ResourceLoaderAware  {

    private String beanName;
    private ResourceLoader loader;

    //实现BeanNameAware 需实现setBeanName方法
    @Override
    public void setBeanName(String s) {
        this.beanName=s;
    }

    //实现ResourceLoaderAware资源加载服务，需实现setResourceLoader
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader=resourceLoader;
    }

    public void outputResult(){
        System.out.println("bean的名称为:"+beanName);
        Resource resource=loader.getResource("classpath:com/wisely/highlight_spring4/ch3/aware/test.txt");
        try{
            System.out.println("ResourceLoader加载的文件内容为："+ IOUtils.toString(resource.getInputStream()));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
