package com.schj.eurekaprovide.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 生产者用户control
 *
 */
@RestController
public class UserController {

    @GetMapping("test")
    public String test (){
        return  "test1: ";
    }


}
