package com.example.Adapter.adapter;

public class StripePaymentService {
    public boolean makeStripePayment(double amount) {
        // Simulate Stripe payment processing
        System.out.println("Processing payment with Stripe: $" + amount);
        return true;
    }
}
