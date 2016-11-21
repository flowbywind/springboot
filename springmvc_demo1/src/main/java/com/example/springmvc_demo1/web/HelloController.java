package com.example.springmvc_demo1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by myadmin on 2016/11/2.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
   @RequestMapping("/index")
   public String hello(){
       return "index";
   }
}
