package com.basics1;

import java.util.Arrays;

public class TwoArray {
    public TwoArray() {
        this.array = array;
    }

    private int[][] array = new int[2][5];

    // generates a random 2-d array
    public int[][] arrGen() {
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 5; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        return array;
    }

    // prints array
    public String printArray(int[][] array) {
        String printedArr = "";
        for (int i = 0; i < array.length; i++) {
            if (i > i - 1 && i != 0) {
                printedArr += "\n";
            }
            for (int j = 0; j < array[i].length; j++) {
                printedArr += array[i][j] + " ";
            }
        }
        return printedArr;
    }
    // adds up the numbers in the array
    public int sumArr(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        return sum;
    }

    // traverses through the array comparing every value to find the min
    public int min(int[][] array) {
        int min = array[0][0];
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        return min;
    }

    // Traverses through the array and testing for odd values
    public String findOdds(int[][] array) {
        String odds = "The odd numbers in the array include:";
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 != 0) {
                    odds += "\n" + array[i][j] + " at index [" + i + "]" + "[" + j + "]";
                }
            }
        return odds;
    }
}
