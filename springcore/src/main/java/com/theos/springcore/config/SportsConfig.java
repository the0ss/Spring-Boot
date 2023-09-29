package com.theos.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.theos.springcore.common.Coach;
import com.theos.springcore.common.SwimCoach;

@Configuration
public class SportsConfig {
    
    @Bean("aqua")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
