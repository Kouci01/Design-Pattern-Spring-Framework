package com.example.AbstractFactory.bank.factory;

import com.example.AbstractFactory.bank.account.Account;
import com.example.AbstractFactory.bank.account.CheckingAccount;

public class BankACheckingAccountFactory implements AccountFactory{
    @Override
    public Account createAccount() {
        return new CheckingAccount();
    }
}
