package com.jashepherd.studies.java.ocajavase8.ch06_exceptions.s04_methods_throw_exceptions.e01;

/**
 * Chapter 6: Exceptions<br>
 * Calling Methods That Throw Exceptions<br>
 * pages 318-319
 */
public class E1Bunny {
	public static void main(String[] args) {
//		eatCarrot();  // DOES NOT COMPILE - checked exceptions must be handled or declared
	}
	private static void eatCarrot() throws NoMoreCarrotsException {
	}
}

class E2Bunny {
	public static void main(String[] args) throws NoMoreCarrotsException{
		eatCarrot();  // now we are good because the method declares that it might throw NoMoreCarrotsException
	}
	private static void eatCarrot() throws NoMoreCarrotsException {
	}
}

class E3Bunny {
	public static void main(String[] args) {
		try {
			eatCarrot();
		} catch (NoMoreCarrotsException e) {  // we are good here too because we catch the exception
			System.out.println("sad rabbit");
		}
	}
	private static void eatCarrot() throws NoMoreCarrotsException {
	}
}

class E4BadBunny {
	/* Java knows that eatCarrot() can’t throw a checked exception which means there’s no way for the catch
	 * block in bad() to be reached */
	/*
	public void bad() {
		try {
			eatCarrot();
		} catch (NoMoreCarrotsException e) {
			System.out.println("sad rabbit");
		}
	}
	*/
	// In comparison, good() is free to declare other exceptions
	public void good() throws NoMoreCarrotsException {
		eatCarrot();
	}
	private static void eatCarrot() {}
}

class NoMoreCarrotsException extends Exception {}
