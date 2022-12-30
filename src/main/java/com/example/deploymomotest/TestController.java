package com.example.deploymomotest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String healthCheck(){
        System.out.println("hi");
        return "health ok";
    }
}
