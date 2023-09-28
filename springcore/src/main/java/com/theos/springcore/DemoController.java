package com.theos.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    
    private Coach mycoach;

    @Autowired
    public DemoController(Coach theCoach){
        mycoach=theCoach;
    }
    
    @GetMapping("/dailyworkout")
    public String dailyWorkOut(){
        return mycoach.getdailywork();
    }
}