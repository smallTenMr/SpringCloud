package com.shikai.eurekaribbon.ribbon.ctr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author  shikai
 * @time 2020/01/29
 */

@RestController
public class Test {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "ribbonTest")
    public void ribbonTest(){
        String forObject = restTemplate.getForObject("http://EUREKACLIENT/test?name=" + "shikai", String.class);
        System.out.println(forObject);
    }
}
