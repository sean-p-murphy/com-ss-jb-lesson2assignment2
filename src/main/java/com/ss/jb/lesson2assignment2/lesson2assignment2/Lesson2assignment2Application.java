package com.ss.jb.lesson2assignment2.lesson2assignment2;
import java.util.Arrays;

public class Lesson2assignment2Application {

	public static void main(String[] args) {
		int[][] twodArray = {{6, 32, 56}, {76, 43, 28}, {99, 105, 3}};
		int[][] changeable = new int [twodArray.length][];
		for (int i = 0; i < twodArray.length; i++) {
			changeable[i] = twodArray[i].clone();
		};
		int[] biggest = new int[changeable.length];
		int index = 0;
		for (int[] arr : changeable) {
			Arrays.sort(arr);
			biggest[index] = arr[arr.length - 1];
			index++;
		};
		Arrays.sort(biggest);
		int largest = biggest[biggest.length - 1];
		int[] location = new int[2];
		int indexOne = 0;
		int indexTwo = 0;
		for (int[] arr : twodArray) {
			indexTwo = 0;
			for (int num : arr) {
				if (num == largest) {
					location[0] = indexOne;
					location[1] = indexTwo;
					break;
				}
				indexTwo++;
			};
			indexOne++;
		};
		System.out.println("The largest number is " + largest + " and it's location is [" + location[0] + ", " + location[1] + "].");
	}

}
