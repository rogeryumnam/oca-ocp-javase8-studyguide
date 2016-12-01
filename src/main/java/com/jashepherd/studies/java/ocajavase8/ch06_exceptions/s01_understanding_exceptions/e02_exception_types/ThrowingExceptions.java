package com.jashepherd.studies.java.ocajavase8.ch06_exceptions.s01_understanding_exceptions.e02_exception_types;

/**
 * Chapter 6: Exceptions<br>
 * Understanding Exceptions<br>
 * Throwing an Exception - pages 304-305
 * <p>
 * Two types of exceptions (for OCA exam at least)
 * <ul>
 *     <li>Exceptions thrown from bad code</li>
 *     <li>Explicitly requesting Java to throw an exception</li>
 * </ul>
 */
public class ThrowingExceptions {

	// Exceptions thrown from bad code
	public static void main(String[] args) {
		String[] animals = new String[0];
		System.out.println(animals[0]);  // throws ArrayIndexOutOfBoundsException
	}

	// Explicitly requesting Java to throw an exception
	public void test() throws Exception {
		int x = 1;
		switch (x) {
			case 1:
				throw new Exception();
			case 2:
				throw new Exception("Ow! I fell.");
			case 3:
				throw new RuntimeException();
			case 4:
				throw new RuntimeException("Ow! I fell.");
		}
	}
}
