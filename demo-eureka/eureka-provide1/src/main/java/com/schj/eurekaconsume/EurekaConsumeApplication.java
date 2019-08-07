package com.schj.eurekaconsume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaConsumeApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumeApplication.class, args);
    }

}
