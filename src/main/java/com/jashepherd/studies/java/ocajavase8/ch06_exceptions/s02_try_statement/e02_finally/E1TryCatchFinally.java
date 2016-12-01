package com.jashepherd.studies.java.ocajavase8.ch06_exceptions.s02_try_statement.e02_finally;

/**
 * Chapter 6: Exceptions<br>
 * Using a try Statement<br>
 * Adding a finally Block - pages 307-309
 */
public class E1TryCatchFinally {
	void explore() {
		try {
			seeAnimals();
			fall();
		} catch (RuntimeException e) {
			getHugFromDaddy();
		} finally {
			seeMoreAnimals();
		}
		goHome();
	}

	void fall() {
		throw new RuntimeException();
	}

	void getHugFromDaddy() {
		System.out.println("It's alright honey.");
	}

	void goHome() {
		System.out.println("Let's go home");
	}

	void seeAnimals() {
		System.out.println("Look at all the animals");
	}

	void seeMoreAnimals() {
		System.out.println("Look at all the animals");
	}
}


class BadTryCatchFinally {
	void explore() {
		/*
		try {  // DOES NOT COMPILE - catch and finally blocks in wrong order
			fall();
		} finally {
			System.out.println("all better");
		} catch (Exception e) {
			System.out.println("get up");
		}

		try {  // DOES NOT COMPILE - must have at least a catch or finally clause
			fall();
		}
		*/

		// all's good here
		try {
			fall();
		} finally {
			System.out.println("all better");
		}
	}

	void fall() {
		throw new RuntimeException();
	}
}