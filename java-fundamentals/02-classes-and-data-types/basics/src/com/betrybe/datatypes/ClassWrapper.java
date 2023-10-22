package com.betrybe.datatypes;

public class ClassWrapper {
    public static void main(String[] args) {
        Integer value = 7; // autoboxing
        int anotherValue = value; // unboxing

        System.out.println(
            Integer.toBinaryString(anotherValue)
        );

    }
}
