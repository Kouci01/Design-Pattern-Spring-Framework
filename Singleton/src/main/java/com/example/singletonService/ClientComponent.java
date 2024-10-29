package com.example.singletonService;

import org.springframework.stereotype.Component;

@Component
public class ClientComponent {
    private final SingletonService singletonService;

    public ClientComponent(SingletonService singletonService){
        this.singletonService = singletonService;
    }

    public void execute(){
        singletonService.doSomething();
    }
}
