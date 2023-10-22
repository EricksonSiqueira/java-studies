package com.betrybe.datatypes.notprimitives;

public class Bank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.showMessage();
        account.deposit(500);

        double convertedValue = account.convertMoney(30, 5);    
    }
}
