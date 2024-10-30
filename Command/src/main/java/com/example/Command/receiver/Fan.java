package com.example.Command.receiver;

import org.springframework.stereotype.Component;

@Component
public class Fan {
    public void turnOn(){
        System.out.println("Fan is ON");
    }
    public void turnOff(){
        System.out.println("Fan is OFF");
    }
}
