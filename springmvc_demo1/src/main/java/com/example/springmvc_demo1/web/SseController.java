package com.example.springmvc_demo1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.Random;

/**
 * Created by myadmin on 2016/12/1.
 */
@Controller
@RequestMapping("/sse")
public class SseController {

    @RequestMapping(value = "/",produces = "text/plain;charset=UTF-8")
    public String index(){
         return "/sse/index";
    }

    @RequestMapping(value = "/push",produces = "text/event-stream;charset=UTF-8")
  public @ResponseBody String push(){
      Random random=new Random();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String data=String.format("时间:%s 线程id:%d randomid:%d \n\n",new Date().toString(),Thread.currentThread().getId(),random.nextInt(10000));
        return "data:"+data;
    }

}
