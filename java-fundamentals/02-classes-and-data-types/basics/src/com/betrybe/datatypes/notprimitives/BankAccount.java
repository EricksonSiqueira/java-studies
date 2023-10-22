package com.betrybe.datatypes.notprimitives;

public class BankAccount {

    void showMessage() {
        System.out.println("Bank Account acessed");
    }

    void deposit(double value) {
        System.out.println("Value received");
        System.out.println(value);
    }

    double convertMoney(float total, float exchangeRate) {
        return total * exchangeRate;
    }
}
