package com.example.Observer;

import org.springframework.stereotype.Component;

@Component
public class SmartphoneAppObserver implements Observer {
    public SmartphoneAppObserver(WeatherStation weatherStation){
        weatherStation.addObserver(this);
    }

    @Override
    public void update(String weatherUpdate) {
        System.out.println("Smartphone App: Received weather update - " + weatherUpdate);
    }
}
