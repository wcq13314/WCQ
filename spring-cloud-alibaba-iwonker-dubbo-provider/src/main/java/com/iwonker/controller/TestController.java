package com.iwonker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** @author wcq
* @Description
* @Date 2020-04-09 14:38:21
* @Param 
* @return  
**/
@RequestMapping(value = "/provider")
@RestController
public class TestController {

    @Autowired
    private ConfigurableApplicationContext applicationContext;

    @Value("${server.port}")
    private Integer port;

    @GetMapping("/demo")
    public Object demo() {
        return "port= "+ port + ", name=" + applicationContext.getEnvironment().getProperty("user.name") + ", age=" + applicationContext.getEnvironment().getProperty("user.age");
    }
}
