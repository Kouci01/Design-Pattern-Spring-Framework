package com.example.Observer;

import org.springframework.stereotype.Component;

@Component
public class AppWebObserver implements Observer {
    public AppWebObserver(WeatherStation weatherStation){
        weatherStation.addObserver(this);
    }

    @Override
    public void update(String weatherUpdate) {
        System.out.println("Web App: Received weather update - " + weatherUpdate);
    }
}
