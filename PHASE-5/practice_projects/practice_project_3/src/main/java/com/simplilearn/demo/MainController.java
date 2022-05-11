package com.simplilearn.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String hello(){
        return "I am SpringBoot App, Deployed on AWS";
    }

    @RequestMapping("/protected")
    public String protectedHello(){
        return "Hello World, i was protected";
    }

    @RequestMapping("/admin")
    public String admin(){
        return "Hello World from admin";
    }

}