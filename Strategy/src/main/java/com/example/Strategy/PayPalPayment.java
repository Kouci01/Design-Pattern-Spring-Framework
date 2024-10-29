package com.example.Strategy;

import org.springframework.stereotype.Component;

@Component("paypalPayment")
public class PayPalPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Paid "+amount+" using PayPal.");
    }
}
