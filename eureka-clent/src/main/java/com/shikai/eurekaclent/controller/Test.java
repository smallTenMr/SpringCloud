package com.shikai.eurekaclent.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author  shikai
 * @time 2020/01/29
 */

@RestController
public class Test {

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "test")
    public String test(String name){
        return "Hello Eurake, name = "+ name +", from  port ："+port;
    }

}
