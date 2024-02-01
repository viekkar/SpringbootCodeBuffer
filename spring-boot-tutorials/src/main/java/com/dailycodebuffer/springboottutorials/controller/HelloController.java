package com.dailycodebuffer.springboottutorials.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloWord(){
        return "Welcome to the dailyCodeBuffer";
    }
}
