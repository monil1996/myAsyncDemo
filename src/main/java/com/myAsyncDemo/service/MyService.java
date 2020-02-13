package com.myAsyncDemo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Async("executor")
    public void m1() {
        System.out.println("method with a custom executor - " + Thread.currentThread().getName());
    }
}
