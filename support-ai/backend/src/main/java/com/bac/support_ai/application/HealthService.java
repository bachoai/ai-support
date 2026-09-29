package com.bac.support_ai.application;

import org.springframework.stereotype.Service;

@Service 
public class HealthService {
    public String getHealthMessage(){
        return "Đang chạy";
    }
    public String greeting(String name){
        return "hello " + name + "!";
    }
}
