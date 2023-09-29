package com.theos.springcore.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.theos.springcore.common.Coach;

@RestController
public class DemoController {
    
    private Coach mycoach;

    @Autowired
    public DemoController(@Qualifier("aqua")Coach theCoach){
        System.out.println("In constructor "+ getClass().getSimpleName());
        mycoach=theCoach;
    }
    
    @GetMapping("/dailyworkout")
    public String dailyWorkOut(){
        return mycoach.getdailywork();
    }
}
