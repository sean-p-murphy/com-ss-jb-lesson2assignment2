package com.ss.jb.lesson2assignment2.lesson2assignment2;
import java.util.Arrays;

public class Lesson2assignment2Application {

	public static void main(String[] args) {
		int[][] twodArray = {{6, 32, 56}, {76, 43, 28}, {99, 105, 3}};
		int[] biggest = new int[twodArray.length];
		int index = 0;
		for (int[] arr : twodArray) {
			Arrays.sort(arr);
			biggest[index] = arr[arr.length - 1];
			index++;
		};
		System.out.println("The largest number is " + biggest[biggest.length - 1]);
	}

}
