package com.example.springmvc_demo1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * Created by myadmin on 2016/12/2.
 */
@Controller
public class AsyncController {

    public DeferredResult<String> deferredCall(){
        return new DeferredResult<String>();
    }
}
