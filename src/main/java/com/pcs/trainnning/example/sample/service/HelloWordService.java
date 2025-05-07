package com.pcs.trainnning.example.sample.service;

import org.springframework.stereotype.Component;

//@Component
public class HelloWordService {

    public String hello(){
        return "Hello PCS";
    }

    public String hello(String name){
        return "hello "+name;
    }

}
