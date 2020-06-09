package com.shikai.eurekaservice.ctr;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author  shik
 * @time 2020/01/29
 */

@RestController
public class ServiceCtr {

    @GetMapping(value = "service1")
    public String servive1(){
        RestTemplate restTemplate = new RestTemplate();
        return  restTemplate.getForObject("https://www.baidu.com/",String.class);
    }
}
