package com.jashepherd.studies.java.ocajavase8studyguide.ch03_core_java_apis.e13_using_arrays;

import java.util.Arrays;

/**
 * Chapter 3: Core Java APIs<br>
 * Understanding Java Arrays<br>
 * Sorting - pages 124-125
 */
public class E2SortingArrays {
	public static void main(String [] args) {
		int[] numbers = {6, 9, 1};
		Arrays.sort(numbers);  // sorts in numeric order since it is sorting an integer array
		for (int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");  // 1 6 9

		System.out.println();

		String[] strings = {"10", "9", "100"};
		Arrays.sort(strings);  // sorts in alphabetic order because it is a string array
		for (String string : strings)
			System.out.print(string + " ");  // 10 100 9
	}
}
