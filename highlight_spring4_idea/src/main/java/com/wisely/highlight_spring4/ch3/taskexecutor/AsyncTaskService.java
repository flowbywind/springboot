package com.wisely.highlight_spring4.ch3.taskexecutor;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by myadmin on 2016/10/22.
 */

@Service
@Async
@EnableAspectJAutoProxy
public class AsyncTaskService {

    public void executeAsyncTask(Integer i) throws InterruptedException {
        System.out.println(new Date().toString()+"执行异步任务："+Thread.currentThread().getName()+" " +i);
        Thread.sleep(1000);
    }

    public void executeAsyncTaskPlus(Integer i){
        System.out.println(new Date().toString()+"执行异步任务："+Thread.currentThread().getName()+" "+i);
    }

}
