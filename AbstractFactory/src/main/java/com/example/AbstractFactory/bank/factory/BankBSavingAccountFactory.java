package com.example.AbstractFactory.bank.factory;

import com.example.AbstractFactory.bank.account.Account;
import com.example.AbstractFactory.bank.account.SavingAccount;

public class BankBSavingAccountFactory implements AccountFactory{
    @Override
    public Account createAccount() {
        return new SavingAccount();
    }
}
