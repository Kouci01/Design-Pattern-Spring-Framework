package com.example.AbstractFactory;

import com.example.AbstractFactory.bank.account.Account;
import com.example.AbstractFactory.bank.config.AppConfig;
import com.example.AbstractFactory.bank.factory.AccountFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AbstractFactoryApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        AccountFactory bankASavingFactory = (AccountFactory) context.getBean("bankASavingAccountFactory");
        Account bankASaving = bankASavingFactory.createAccount();
        bankASaving.accountType();

        AccountFactory bankACheckingFactory = (AccountFactory) context.getBean("bankACheckingAccountFactory");
        Account bankAChecking = bankACheckingFactory.createAccount();
        bankAChecking.accountType();

        AccountFactory bankBSavingFactory = (AccountFactory) context.getBean("bankBSavingAccountFactory");
        Account bankBSaving = bankBSavingFactory.createAccount();
        bankBSaving.accountType();

        AccountFactory bankBCheckingFactory = (AccountFactory) context.getBean("bankBCheckingAccountFactory");
        Account bankBChecking = bankBCheckingFactory.createAccount();
        bankBChecking.accountType();


    }

}
