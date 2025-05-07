package com.pcs.trainnning.example.sample.controller;

import com.pcs.trainnning.example.sample.service.HelloWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @Autowired
    private HelloWordService helloWordService;

    private String name = "default";

    @GetMapping("/hello")
    public String hello(){
        return helloWordService.hello();
    }

    @GetMapping("/hello/{name}")
    public String helloName(@PathVariable("name") String name){
        return helloWordService.hello(name);
    }

    @GetMapping("/helloWithRequest")
    public String helloByRequestParam(@RequestParam("name") String name, @RequestParam("lastName") String lastName){
        return helloWordService.hello(name) + " "+ lastName;
    }

    @GetMapping("/name")
    public String getName(){
        return name;
    }


    @PostMapping("/name/{nameVariable}")
    public void saveName(@PathVariable("nameVariable") String nameVariable){
        this.name = nameVariable;
    }

    @PutMapping("/name/{nameVariable}")
    public void updateName(@PathVariable("nameVariable") String nameVariable){
        this.name = nameVariable;
    }

    @DeleteMapping("/name")
    public void deleteName(){
        this.name = "default";
    }

}
