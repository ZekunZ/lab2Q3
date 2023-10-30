package com.zekun.comp367.lab2q3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // add code for the "/hello" endpoint
    @GetMapping("/")
    public String sayHello() {
        return "Welcome to COMP367";
    }
}
