package com.myAsyncDemo.controller;

import com.myAsyncDemo.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    MyService myService;

    @GetMapping("/m1")
    public String m1() {
        myService.m1();
        return "Hello";
    }
}
