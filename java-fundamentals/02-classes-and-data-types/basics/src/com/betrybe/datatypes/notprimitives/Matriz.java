package com.betrybe.datatypes.notprimitives;

public class Matriz {
    public static void main(String[] args) {
        String[] arrayOfString = {"I'm ", "learning ", "Java", "!"};
        int[][] matriz = new int[2][3];
        int[] intArray = { 10, 20, 30 };

        matriz[0][0] = 10;
        matriz[1][0] = 20;

        System.out.println(arrayOfString[0] + arrayOfString[1] + arrayOfString[2] + arrayOfString[3]); // I'm learning Java!
        System.out.println(matriz[0][0]); // 10
        System.out.println(matriz[1][2]); // 0
        System.out.println(matriz[1][0]); // 20
        System.out.println("The length of the array is " + intArray.length);
    }
}
