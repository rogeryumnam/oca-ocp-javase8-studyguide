package com.jashepherd.studies.java.ocajavase8.ch06_exceptions.s02_try_statement.e02_finally;

/**
 * Chapter 6: Exceptions<br>
 * Using a try Statement<br>
 * Adding a finally Block - pages 307-309
 */
public class E2AnotherTryCatchFinallyExample {
	void example() {
		String s = "";
		try {
			s += "t";
		} catch (Exception e) {
			s += "c";
		} finally {
			s += "f";
		}
		s += "a";
		System.out.println(s);  // tfa
	}
}


class FinallyNotRun {
	/* one exception where finally block won't run. When System.exit is called in the try or catch block,
	finally does not run */
	void example() {
		try {
			fall();
			System.exit(0);
		} catch (Exception e) {
			System.out.println("Get up");
		} finally {
			System.out.println("See more animals");
		}
	}

	void fall() {
		System.out.println("fall down");
	}
}