package com.basics1;

public class Main {

    public static void main(String[] args) {
    System.out.println("Part I: One Dimensional Arrays"); // One dimensional arrays section
	OneArray oneArray = new OneArray();
	int[] array = oneArray.arrayGen();
	System.out.println(oneArray.printArray(array));
	System.out.println("The average of the array is " + oneArray.average(array) + "."); //prints the average of the array set
	System.out.println("The max of this array is " + oneArray.max(array) + " and the min is " + oneArray.min(array) +"."); // prints the max and min of array set
    // You can sort the array using the method from the Arrays library: Arrays.sort(). However I made my own sort method:
    int[] sortedArray = oneArray.sort(array); // created a sorted array variable
    System.out.println("The sorted array is: " + oneArray.printArray(sortedArray)); // prints sorted array
    System.out.println("The reversed array is: " + oneArray.printArray(oneArray.reverseArray(sortedArray))); // prints reverse sorted array

    System.out.println("Part II: Two Dimensional Arrays"); // Two dimensional arrays section
    TwoArray twoArray = new TwoArray();
    int[][] arr = twoArray.arrGen();
    System.out.println(twoArray.printArray(arr));
    System.out.println("The sum is " + twoArray.sumArr(arr));
    System.out.println("The minimum value of the array is " + twoArray.min(arr));
    System.out.println(twoArray.findOdds(arr));
    }
}
