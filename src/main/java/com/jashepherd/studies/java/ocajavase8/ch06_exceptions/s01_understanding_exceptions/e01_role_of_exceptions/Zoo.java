package com.jashepherd.studies.java.ocajavase8.ch06_exceptions.s01_understanding_exceptions.e01_role_of_exceptions;

/**
 * Chapter 6: Exceptions<br>
 * Understanding Exceptions<br>
 * The Role of Exceptions - pages 300-301
 * <p>
 * Try to call this program without enough arguments and you will get an exception
 * <p>
 * <code>
 *     javac Zoo.java<br>
 *     java Zoo Arg1
 * </code>
 * <p>
 * This will cause an exception, something like the following: <br>
 * <code>
 *     ZooException in thread "main"<br>
 *     java.lang.ArrayIndexOutOfBoundsException: 1
 *     at mainmethod.Zoo.main(Zoo.java:7)
 * </code>
 */
public class Zoo {
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
	}
}

// throws vs. throw
class ThrowThrowsExample {
	void fall() throws Exception {  // throws - method declares that it might throw an exception
		throw new Exception();  // throw - statement that actually throws an exception
	}
}
