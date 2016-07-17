package com.jashepherd.studies.java.ocajavase8studyguide.ch01.e18_reading_writing_fields;

/**
 * Chapter 1: Java Building Blocks<br/>
 * Creating Objects<br/>
 * Reading and Writing Object Fields - page 18
 * <p>
 * It’s possible to read and write instance variables directly from the caller. In this example,
 * a mother swan lays eggs.
 * <p>
 * Reading a variable is known as getting it. The class gets numberEggs directly to print it
 * out. Writing to a variable is known as setting it. This class sets numberEggs to 1.
 */
public class Swan {
	int numberEggs;  // instance variable
	public static void main(String[] args) {
		Swan mother = new Swan();
		mother.numberEggs = 1;  // write/set variable
		System.out.println(mother.numberEggs);  // read/get variable
	}
}
