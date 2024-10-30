package com.example.Adapter.adapter;

import org.springframework.stereotype.Component;

@Component
public class PaymentServiceAdapter implements PaymentProcessor{
    private StripePaymentService service;

    public PaymentServiceAdapter(){
        this.service = new StripePaymentService();
    }

    @Override
    public boolean processPayment(double amount) {
        return service.makeStripePayment(amount);
    }
}
