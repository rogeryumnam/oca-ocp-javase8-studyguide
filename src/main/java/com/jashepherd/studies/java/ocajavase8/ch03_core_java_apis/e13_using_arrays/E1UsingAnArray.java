package com.jashepherd.studies.java.ocajavase8.ch03_core_java_apis.e13_using_arrays;

/**
 * Chapter 3: Core Java APIs<br>
 * Understanding Java Arrays<br>
 * Using an Array - pages 123-124
 */
public class E1UsingAnArray {
	public static void main(String args[]) {
		String[] mammals = {"monkey", "chimp", "donkey"};
		System.out.println(mammals.length);  // 3
		System.out.println(mammals[0]);  // monkey
		System.out.println(mammals[1]);  // chimp
		System.out.println(mammals[2]);  // donkey

		// understand length
		String[] birds = new String[6];
		System.out.println(birds.length);  // 6

		// it is very common to use a loop when reading from or writing to an array
		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 5;
		}
		System.out.println(java.util.Arrays.toString(numbers));

		// all the following throw ArrayIndexOutOfBoundsException
		numbers[10] = 3;  // array out of bounds because arrays start index at 0
		numbers[numbers.length] = 5;  // again out of bounds because there is no index 10
		for (int i = 0; i <= numbers.length; i++) {  // out of bounds because <=, use < instead
			numbers[i] = i + 5;
		}
	}
}
