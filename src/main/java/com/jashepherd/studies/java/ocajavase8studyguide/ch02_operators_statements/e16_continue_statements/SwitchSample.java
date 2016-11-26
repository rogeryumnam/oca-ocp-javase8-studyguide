package com.jashepherd.studies.java.ocajavase8studyguide.ch02_operators_statements.e16_continue_statements;

/**
 * Chapter 2: Operators and Statements<br/>
 * Understanding Advanced Flow Control<br/>
 * The continue Statement - pages 90-91
 * <p>
 * continue statement example with optional label
 */
public class SwitchSample {
	public static void main(String[] args) {

		// outputs 1a 3a 4a
		FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
			for (char x = 'a'; x <= 'c'; x++) {
				if (a == 2 || x == 'b')
					continue FIRST_CHAR_LOOP;
				System.out.print(" " + a + x);
			}
		}

		System.out.println();
		SwitchSample ss = new SwitchSample();
		ss.method1();
		System.out.println();
		ss.method2();
	}

	// outputs 1a 1c 3a 3c 4a 4c
	void method1() {
		FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
			for (char x = 'a'; x <= 'c'; x++) {
				if (a == 2 || x == 'b')
					continue;
				System.out.print(" " + a + x);
			}
		}
	}

	// outputs 1a 1b 1c 2a 2b 2c 3a 3b 3c 4a 4b 4c
	void method2() {
		for (int a = 1; a <= 4; a++) {
			for (char x = 'a'; x <= 'c'; x++) {
				System.out.print(" " + a + x);
			}
		}
	}
}
