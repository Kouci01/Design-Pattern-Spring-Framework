package com.example.Strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyApplication implements CommandLineRunner {
    @Autowired
    private PaymentService paymentService;

    public static void main(String[] args) {
        SpringApplication.run(StrategyApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        paymentService.pay("creditCardPayment", 100.0);
        paymentService.pay("paypalPayment", 150.0);
        paymentService.pay("cryptoPayment", 200.0);
    }
}
