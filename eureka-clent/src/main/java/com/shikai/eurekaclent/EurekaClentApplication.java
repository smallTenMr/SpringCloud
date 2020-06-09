package com.shikai.eurekaclent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author  shikai
 * @time 2020/01/29
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaClentApplication {

    public static void main(String[] args) {

        SpringApplication.run(EurekaClentApplication.class, args);
    }

}
