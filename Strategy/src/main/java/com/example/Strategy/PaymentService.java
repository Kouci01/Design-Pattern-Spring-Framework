package com.example.Strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private final ApplicationContext context;

    @Autowired
    public PaymentService(ApplicationContext context){
        this.context = context;
    }

    public void pay(String strategyName, double amount){
        PaymentStrategy paymentStrategy = (PaymentStrategy) context.getBean(strategyName);
        paymentStrategy.pay(amount);
    }
}
