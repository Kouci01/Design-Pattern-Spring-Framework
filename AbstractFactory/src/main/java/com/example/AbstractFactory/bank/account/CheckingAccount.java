package com.example.AbstractFactory.bank.account;

public class CheckingAccount implements Account{
    @Override
    public void accountType() {
        System.out.println("This is a Checking Account");
    }
}
