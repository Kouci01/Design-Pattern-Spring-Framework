package com.example.Proxy.controller;

import com.example.Proxy.service.DataService;
import com.example.Proxy.service.DataServiceProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
    private final DataService dataService;

    public DataController(DataServiceProxy dataService){
        this.dataService = dataService;
    }

    @GetMapping("/data")
    public String getData(@RequestParam String param) {
        return dataService.fetchData(param);
    }
}
