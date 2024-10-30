package com.example.Observer;

import org.springframework.stereotype.Component;

@Component
public class EmailNotifierObserver implements Observer {
    public EmailNotifierObserver(WeatherStation weatherStation){
        weatherStation.addObserver(this);
    }

    @Override
    public void update(String weatherUpdate) {
        System.out.println("Email Notifier: Received weather update - " + weatherUpdate);
    }
}
