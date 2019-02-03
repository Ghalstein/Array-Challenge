package com.basics1;

import java.util.Arrays;

public class OneArray {
    private int[] array = new int[10];
    public OneArray(){
        this.array = array;
    }
    // Generates a random array
    public int[] arrayGen(){
        for(int i = 0; i<10; i++){
            array[i] = (int)(Math.random()*100);
        }
        return array;
    }
    // prints array
    public String printArray(int[] array){
        String printedArray = "";
        for(int i = 0; i<array.length; i++){
            printedArray += array[i]+" ";
        }
        return printedArray;
    }
    // averages the contents of the array
    public double average(int[] array){
        double sum = 0;
        for(int i = 0; i<array.length; i++) {
            sum += array[i];
        }
        return sum/array.length;
    }
    // sorts the array in least to greatest order and selects the last number in the array
    public int max(int[] array){
        Arrays.sort(array);
        return array[array.length-1];
    }
    // sorts the array in least to greatest order and selects the first number in the array
    public int min(int[] array){
        Arrays.sort(array);
        return array[0];
    }
    // sorts the array
    public int[] sort(int[] array){
        for(int i = 1; i<array.length; i++)
            for( int j = i; j>0; j--){
                if(array[j] < array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        return array;
    }
    // reverses the array
    public int[] reverseArray(int[] array){
        for(int i = 0; i<array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-i-1] = temp;
        }
        return array;
    }
}
