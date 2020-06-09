package com.shikai.eurekaclent2.eurekaclent2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author  shikai
 * @time 2020/01/29
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaClent2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClent2Application.class, args);
    }

}
