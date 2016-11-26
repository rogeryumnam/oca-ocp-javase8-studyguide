package com.jashepherd.studies.java.ocajavase8studyguide.ch01_java_building_blocks.s08_variable_scope;

/**
 * Chapter 1: Java Building Blocks<br/>
 * Understanding Variable Scope<br/>
 * pages 33-34
 */
public class A2Mouse {
	static int MAX_LENGTH = 5;      // class variable
	int length;                     // instance variable
	public void grow(int inches) {  // method parameter aka local variable
		if (length < MAX_LENGTH) {
			int newSize = length + inches; // another local variable
			length = newSize;
		}
	}
}
