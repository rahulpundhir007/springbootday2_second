package com.example.day2_second;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class day2second {
    @GetMapping("/")
    public String day2second(){
        return "This is my home page";
    }
}
