package com.example.deploymomotest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String healthCheck(){
        return "안되는거 : 자동 빌드, 도커허브에서 이미지 Pull";
    }
}
