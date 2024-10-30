package com.example.Observer;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class WeatherUpdateNotifier {
    private final WeatherStation weatherStation;

    public WeatherUpdateNotifier(WeatherStation weatherStation){
        this.weatherStation = weatherStation;
    }

    @PostConstruct
    public void startWeatherUpdates() {
        weatherStation.setWeatherUpdate("Sunny, 25°C");
        weatherStation.setWeatherUpdate("Cloudy, 22°C");
        weatherStation.setWeatherUpdate("Rainy, 18°C");
    }
}
