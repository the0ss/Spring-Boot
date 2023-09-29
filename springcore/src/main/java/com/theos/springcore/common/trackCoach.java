package com.theos.springcore.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Lazy
public class trackCoach implements Coach {

    public trackCoach(){
        System.out.println("In Constructor "+ getClass().getSimpleName());
    }
    @PostConstruct
    public void startupstuff(){
        System.out.println("In startupstuff "+ getClass().getSimpleName());
    }
    @PreDestroy
    public void destroystuff(){
        System.out.println("In destroystuff "+ getClass().getSimpleName());
    }
    @Override
    public String getdailywork() {
        return "run for 15 min daily";
    }
    
}
