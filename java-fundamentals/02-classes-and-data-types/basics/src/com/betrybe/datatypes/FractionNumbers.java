package com.betrybe.datatypes;

public class FractionNumbers {
    public static void main(String[] args) {
        float typeFloatA = 2000.59f;
        float typeFloatB = 1500.38f;
        System.out.println(typeFloatA - typeFloatB);    

        double typeDoubleA = 2000.59d;
        double typeDoubleB = 1500.38d;
        System.out.println(typeDoubleA - typeDoubleB);

        float doubleFloat = 2000.20d; // float can not be double (only 5 decimals)
        double flouatDouble = 2000.20f; // double can be float (10 decimals)
    }
    

}
