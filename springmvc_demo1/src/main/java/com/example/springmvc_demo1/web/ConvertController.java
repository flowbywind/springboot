package com.example.springmvc_demo1.web;

import com.example.springmvc_demo1.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by myadmin on 2016/11/27.
 */
@Controller
@RequestMapping("/convert")
public class ConvertController {

    @RequestMapping(value={"/index","/"},produces = "text/plain;charset=UTF-8")
    public String index(){
        return "/convert/index";
    }

    @RequestMapping(value="/getConvertObj",produces = "application/x-wisely")
    @ResponseBody
    public DemoObj getConvertObj(@RequestBody  DemoObj obj){
        return obj;
    }

}
