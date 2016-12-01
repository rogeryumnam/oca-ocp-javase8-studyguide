package com.jashepherd.studies.java.ocajavase8.ch06_exceptions.s03_common_exceptions.e01_runtime_exceptions;

/**
 * Chapter 6: Exceptions<br>
 * Recognizing Common Exception Types<br>
 * Runtime Exceptions - pages 314-316
 */
public class RuntimeExceptions {
	// Runtime Exceptions

	public static void main(String[] args) {

		// ArithmeticException
		int answer = 11 / 0;  // Exception in thread "main" java.lang.ArithmeticException: / by zero


		// ArrayIndexOutOfBoundsException
		int[] countsOfMoose = new int[3];
		System.out.println(countsOfMoose[-1]);  // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: -1

		int total = 0;
		int[] countsOfMoose2 = new int[3];
		for (int i = 0; i <= countsOfMoose2.length; i++)  // for loop should use < instead of <=
			total += countsOfMoose2[i];  // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3


		// ClassCastException
		String type = "moose";
//		Integer number = (Integer) type;  // DOES NOT COMPILE

		String type2 = "moose";
		Object obj = type2;

		// Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
		Integer number = (Integer) obj;


		// NumberFormatException
		Integer.parseInt("abc");  // Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"

	}


	// IllegalArgumentException
	int numberEggs;
	public void setNumberEggs(int numberEggs) {
		if (numberEggs < 0)
			// Exception in thread "main" java.lang.IllegalArgumentException: # eggs must not be negative
			throw new IllegalArgumentException("# eggs must not be negative");
		this.numberEggs = numberEggs;
	}


	// NullPointerException
	String name;
	public void printLength() throws NullPointerException {
		System.out.println(name.length());  // Exception in thread "main" java.lang.NullPointerException
	}

}
