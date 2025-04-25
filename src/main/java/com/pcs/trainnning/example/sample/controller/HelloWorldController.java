package com.pcs.trainnning.example.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello PCS";
    }

    @GetMapping("/hello/{name}")
    public String helloName(@PathVariable("name") String name){
        return "hello "+name;
    }

    @GetMapping("/helloWithRequest")
    public String helloByRequestParam(@RequestParam("name") String name){
        return "Hello "+name;
    }

}
