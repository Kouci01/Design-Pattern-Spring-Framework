package com.example.Adapter.service;

import com.example.Adapter.adapter.PaymentProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private final PaymentProcessor paymentProcessor;

    @Autowired
    public PaymentService(PaymentProcessor paymentProcessor){
        this.paymentProcessor = paymentProcessor;
    }

    public boolean processPayment(double amount) {
        return paymentProcessor.processPayment(amount);
    }
}
