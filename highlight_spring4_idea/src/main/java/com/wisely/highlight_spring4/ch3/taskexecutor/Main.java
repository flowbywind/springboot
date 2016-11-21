package com.wisely.highlight_spring4.ch3.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

/**
 * Created by myadmin on 2016/10/22.
 */
public class Main {
    public static void main(String[] args) throws  Exception{
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService=context.getBean(AsyncTaskService.class);
        long begin= new Date().getTime();
        System.out.println(new Date().toString());
        for(int i=0;i<10;i++){
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }
        long end=new Date().getTime();
        System.out.println("耗时："+(end-begin));
        context.close();
    }
}
