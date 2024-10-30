package com.example.Proxy.service;

import org.springframework.stereotype.Service;

@Service
public class SlowDataServiceImpl implements DataService {

    @Override
    public String fetchData(String param) {
        try {
            Thread.sleep(3000); // 3 seconds delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Data for " + param;
    }
}
