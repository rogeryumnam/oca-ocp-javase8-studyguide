package com.jashepherd.studies.java.ocajavase8.ch06_exceptions.s02_try_statement.e01;

/**
 * Chapter 6: Exceptions<br>
 * Using a try Statement<br>
 * pages 305-307
 */
public class TryStatement {
	void explore() {
		try {
			fall();
			System.out.println("never get here");
		} catch (RuntimeException e) {
			getUp();
		}
		seeAnimals();
	}

	void fall() {
		throw new RuntimeException();
	}

	void getUp() {
		System.out.println("Get back on your feet");
	}

	void seeAnimals() {
		System.out.println("Look at all the animals");
	}
}


class BadTryStatements {

	void testTry() {
		/* DOES NOT COMPILE - try block required braces, even if only one line (unlike if statements)
		try
			fall();
		catch (Exception e) {
			System.out.println("get up");
		}
		*/

		// should look like this
		try {
			fall();
		} catch (Exception e) {
			System.out.println("get up");
		}
	}

	void testTry2() {
		/* DOES NOT COMPILE - catch or finally block required
		try {
			fall();
		}
		*/
	}

	void fall() {
		System.out.println("fall down");
	}
}