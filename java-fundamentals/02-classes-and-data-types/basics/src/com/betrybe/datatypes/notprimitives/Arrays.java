package com.betrybe.datatypes.notprimitives;

public class Arrays {
    public static void main(String[] args) {
        int[] intArray = new int[9];
        intArray[0] = 40;
        intArray[1] = 55;
        intArray[2] = 63;
        intArray[3] = 17;
        intArray[4] = 22;
        intArray[5] = 68;
        intArray[6] = 89;
        intArray[7] = 97;
        intArray[8] = 89;

        System.out.println(intArray[8]); // 89
        System.out.println(intArray[2]); // 63

        // intArray[9] = 89; this breakes since there is only 9 spaces on the array
    }
}
