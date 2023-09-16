package com.heroku.java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class user {
    @GetMapping(value="/")
    public String getMethodName() {
        return "hello world";
    }
    
}
