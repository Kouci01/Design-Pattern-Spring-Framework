package com.example.Strategy;

import org.springframework.stereotype.Component;

@Component("cryptoPayment")
public class CryptoPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Cryptocurrency.");
    }
}
