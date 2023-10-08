package com.theos.springmvcsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    
    @GetMapping("/")
    public String showHome(){
        return "hello";
    }
    @GetMapping("/leaders")
    public String showLeaders(){
        return "leaders";
    }
}
