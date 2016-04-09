package com.jashepherd.studies.java.ocajavase8studyguide.ch02.e09_if_else_statements;

/**
 * Chapter 2: Operators and Statements<br/>
 * Understanding Java Statements<br/>
 * The if-then-else Statement - pages 68-70
 */
public class IfElseStatements {
	public static void main(String... args) {

		int hourOfDay = 3;

		// as just if statements
		if(hourOfDay < 11) {
			System.out.println("Good Morning");
		}
		if(hourOfDay >= 11) {
			System.out.println("Good Afternoon");
		}

		// as an if-else statement
		if(hourOfDay < 11) {
			System.out.println("Good Morning");
		} else {
			System.out.println("Good Afternoon");
		}

		if(hourOfDay < 11) {
			System.out.println("Good Morning");
		} else if(hourOfDay < 15) {
			System.out.println("Good Afternoon");
		} else {
			System.out.println("Good Evening");
		}

		if(hourOfDay < 16) {
			System.out.println("Good Afternoon");
		} else if(hourOfDay < 11) {
			System.out.println("Good Morning"); // UNREACHABLE CODE
		} else {
			System.out.println("Good Evening");
		}

		/*
		int x = 1;
		if(x) { // DOES NOT COMPILE - not boolean
			// do some work
		}
		*/

		/*
		int x = 1;
		if(x = 5) { // DOES NOT COMPILE - assignment; not equality
			// do some work
		}
		 */
	}
}
