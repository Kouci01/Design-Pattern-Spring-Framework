package com.example.singletonService;

import org.springframework.stereotype.Service;

@Service
public class SingletonService {
    public SingletonService() {
        System.out.println("SingletonService instance created");
    }

    public void doSomething() {
        System.out.println("Doing something...");
    }
}
