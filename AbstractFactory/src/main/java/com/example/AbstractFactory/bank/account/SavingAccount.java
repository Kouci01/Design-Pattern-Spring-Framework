package com.example.AbstractFactory.bank.account;

public class SavingAccount implements Account{
    @Override
    public void accountType() {
        System.out.println("This is a Saving Account");
    }
}
