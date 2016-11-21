package com.wisely.highlight_spring4.ch3.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by myadmin on 2016/10/22.
 */
@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat dateFormat=new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000) //5秒执行一次
    public void reportCurrentTime(){
        System.out.println(String.format("每隔五秒执行一次 %s" , dateFormat.format(new Date())));
    }

    @Scheduled(cron = "0 7 19 ? * *")
    public void fixTimeExecution(){
        System.out.println("每天定时晚七点跑任务"+dateFormat.format(new Date()));
    }

}
