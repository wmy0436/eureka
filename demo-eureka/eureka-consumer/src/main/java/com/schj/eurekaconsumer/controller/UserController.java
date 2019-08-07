package com.schj.eurekaconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/test")
    public  String  hello(){
        String url = "http://service-provider/test";
        return this.restTemplate.getForObject(url, String.class);
    }
}
