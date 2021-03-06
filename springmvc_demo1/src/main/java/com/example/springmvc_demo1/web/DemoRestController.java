package com.example.springmvc_demo1.web;

import com.example.springmvc_demo1.domain.DemoObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by myadmin on 2016/11/18.
 */
@RestController
@RequestMapping("/rest")
public class DemoRestController {

    @RequestMapping(value = "/getjson", produces = {"application/json;charset=UTF-8"})
    public DemoObj getjson(DemoObj obj) {
        return new DemoObj(obj.getId() + 1, obj.getName() + "test");
    }

    @RequestMapping(value = "/getxml", produces = {"application/xml;charset=UTF-8"})
    public DemoObj getxml(DemoObj obj) {
        return new DemoObj(obj.getId() + 2, obj.getName() + "test2");
    }
}
