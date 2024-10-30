package com.example.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObservers(String weatherUpdate) {
        for (Observer observer : observerList) {
            observer.update(weatherUpdate);
        }
    }

    public void setWeatherUpdate(String weatherUpdate) {
        System.out.println("WeatherStation: New weather update available!");
        notifyObservers(weatherUpdate);
    }
}
