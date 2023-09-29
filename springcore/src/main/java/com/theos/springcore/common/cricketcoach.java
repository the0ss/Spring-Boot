package com.theos.springcore;

import org.springframework.stereotype.Component;

@Component
public class cricketcoach implements Coach {

    @Override
    public String getdailywork() {
        return "do bowling practice daily 15 min";
    }
    
}
