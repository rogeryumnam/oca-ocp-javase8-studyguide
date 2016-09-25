package com.jashepherd.studies.java.ocajavase8studyguide.ch03.e13_using_arrays;

import java.util.*;

/**
 * Chapter 3: Core Java APIs<br>
 * Understanding Java Arrays<br>
 * Searching - pages 125-126
 * <p>
 * Array must be sorted first in order to be searched
 */
public class E3SearchingArrays {
	public static void main(String... args) {
		int[] numbers = {2, 4, 6, 8};
		System.out.println(Arrays.binarySearch(numbers, 2));  // 0
		System.out.println(Arrays.binarySearch(numbers, 4));  // 1
		System.out.println(Arrays.binarySearch(numbers, 1));  // -1
		System.out.println(Arrays.binarySearch(numbers, 3));  // -2
		System.out.println(Arrays.binarySearch(numbers, 9));  // -5

		// searching an unsorted array gives unpredictable result
		int[] numbers2 = new int[] {3,2,1};
		System.out.println(Arrays.binarySearch(numbers2, 2));
		System.out.println(Arrays.binarySearch(numbers2, 3));
	}
}
