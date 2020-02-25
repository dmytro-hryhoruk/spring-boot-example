package com.example.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckController {

    @RequestMapping("/")
    public String isWork(){
        return "Spring is coming...";
    }
}
