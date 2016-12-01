package com.example.springmvc_demo1.web;

import com.example.springmvc_demo1.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by myadmin on 2016/11/22.
 */
@Controller
public class AdviceController {

    @RequestMapping("/advice")
    public String getSomething(@ModelAttribute("msg") String msg, DemoObj obj) {
        throw new IllegalArgumentException("参数有误/" + "msg：" + msg +
                " demoObj.id:" + obj.getId() + " demoObj.name:" + obj.getName());
    }
}
