package com.example.AbstractFactory.bank.config;

import com.example.AbstractFactory.bank.factory.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public AccountFactory bankASavingAccountFactory(){
        return new BankASavingAccountFactory();
    }

    @Bean
    public AccountFactory bankBSavingAccountFactory(){
        return new BankBSavingAccountFactory();
    }

    @Bean
    public AccountFactory bankACheckingAccountFactory(){
        return new BankACheckingAccountFactory();
    }

    @Bean
    public AccountFactory bankBCheckingAccountFactory(){
        return new BankBCheckingAccountFactory();
    }
}
