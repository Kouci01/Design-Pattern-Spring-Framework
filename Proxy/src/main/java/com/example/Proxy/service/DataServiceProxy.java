package com.example.Proxy.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DataServiceProxy implements DataService {

    private final DataService dataService;
    private final Map<String, String> cache = new HashMap<>();

    public DataServiceProxy(SlowDataServiceImpl dataService){
        this.dataService = dataService;
    }

    @Override
    public String fetchData(String param) {
        if (cache.containsKey(param)) {
            return "Cached: " + cache.get(param);
        }

        // If not cached, fetch data and cache it
        String result = dataService.fetchData(param);
        cache.put(param, result);
        return result;
    }
}
