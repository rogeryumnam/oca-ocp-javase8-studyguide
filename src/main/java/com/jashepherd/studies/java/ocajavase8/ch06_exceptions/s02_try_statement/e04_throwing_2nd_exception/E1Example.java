package com.jashepherd.studies.java.ocajavase8.ch06_exceptions.s02_try_statement.e04_throwing_2nd_exception;

import java.io.FileReader;
import java.io.IOException;

/**
 * Chapter 6: Exceptions<br>
 * Using a try Statement<br>
 * Throwing a Second Exception - pages 311-313
 */
public class E1Example {
	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = read();
		} catch (IOException e) {
			try {
				if (reader != null) reader.close();
			} catch (IOException inner) {
			}
		}
	}

	private static FileReader read() throws IOException {
		// CODE GOES HERE
		return null;
	}

	void anotherExample() throws Exception {
		try {
			throw new RuntimeException();  // throws RuntimeException
		} catch (RuntimeException e) {
			throw new RuntimeException();  // catches RuntimeException and throws a new RuntimeException
		} finally {
			throw new Exception();  // catches new 2nd RuntimeException and throws a new Exception ignoring previous exceptions
		}
	}
}
