package com.example.springmvc_demo1.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * Created by myadmin on 2016/11/21.
 */

public class DemoInterceptor extends HandlerInterceptorAdapter {

    private static final String StartTimeTag = "StartTime";
    private static final String HandlingTimeTag = "handlingTime";

    public DemoInterceptor(){
    }

    /**
     * 请求发生前执行
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        long startTime = System.currentTimeMillis();
        request.setAttribute(StartTimeTag, startTime);
        return true;
    }

    /**
     * 请求完成后执行
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        long startTime = (Long) request.getAttribute(StartTimeTag);
        request.removeAttribute(StartTimeTag);
        long endTime = System.currentTimeMillis();
        System.out.println("本次请求处理时间为：" + (endTime - startTime) + "ms");
        request.setAttribute(HandlingTimeTag, endTime - startTime);
    }
}
