package com.jashepherd.studies.java.ocajavase8.ch06_exceptions.s02_try_statement.e03_catching_exceptions;

/**
 * Chapter 6: Exceptions<br>
 * Using a try Statement<br>
 * Catching Various Types of Exceptions - pages 309-311
 */
public class E1Examples {
	public void visitPorcupine() {
		try {
			seeAnimal();
		} catch (E1AnimalsOutForWalk e) {
			System.out.println("try back later");
		} catch (E1ExhibitClosed e) {
			System.out.println("not today");
		}
	}

	// order can matter, but in this case the catch blocks can be reversed because the exceptions don't inherit from each other
	public void visitPorcupine2() {
		try {
			seeAnimal();
		} catch (E1ExhibitClosed e) {
			System.out.println("not today");
		} catch (E1AnimalsOutForWalk e) {
			System.out.println("try back later");
		}
	}

	// in this case order matters - more specific exceptions must be caught first
	public void visitMonkeys() {
		try {
			seeAnimal();
		} catch (E1ExhibitClosedForLunch e) {  // subclass exception
			System.out.println("try back later");
		} catch (E1ExhibitClosed e) {  // superclass exception
			System.out.println("not today");
		}
	}

	// bad excample where catch statements are in the wrong order
	public void visitMonkeys2() {
		try {
			seeAnimal();
		} catch (E1ExhibitClosed e) {
			System.out.println("not today");
		} /*catch (E1ExhibitClosedForLunch e) {  // DOES NOT COMPILE - more specific exception caught after broader exception
			System.out.println("try back later");
		} */
	}

	// another bad example, again catch statements in wrong order
	public void visitSnakes() {
		try {
			seeAnimal();
		} catch (RuntimeException e) {
			System.out.println("runtime exception");
		} /*catch (E1ExhibitClosed e) {  // DOES NOT COMPILE - E1ExhibitClosed is subclass of runtime exception - wrong order
			System.out.println("not today");
		}*/ catch (Exception e) {
			System.out.println("exception");
		}
	}

	void seeAnimal() {
		System.out.println("look at the animal");
	}
}
