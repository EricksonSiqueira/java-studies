package com.betrybe.datatypes;

public class Primitive {
    public static void main(String[] args) {
        byte b = 9;
        short s = 30000;
        int i = 30000000;
        int integerNumber = 10;
        int a = 10, sum;
        sum = integerNumber + a; // we can declare multiple variables in the same line
        long l = 1000000000000L; // the L in the end says that this is a long
        long l2 = 100000000; // this will be like a int

        System.out.println("The most basic type " + b); // -128-127;
        System.out.println("Short " + s); // -32768-32767;
        System.out.println("Int " + i); // --2.147.483.648--2.147.483.647;
        System.out.println("The total sum is: " + sum);
        System.out.println("The biggest number " + l);
        System.out.println("Declared long int " + l2);
    }
}
