package com.jashepherd.studies.java.ocajavase8.ch01_java_building_blocks.s07_default_initialization_vars;

/**
 * Chapter 1: Java Building Blocks<br/>
 * Understanding Default Initialization of Variables<br/>
 * Local Variables - pages 29-31
 * <p>
 * A local variable is a variable defined within a method. Local variables must be initialized
 * before use. They do not have a default value and contain garbage data until initialized. The
 * compiler will not let you read an uninitialized value.
 * <p>
 * Variables that are not local variables are known as instance variables or class variables.
 * Instance variables are also called fields. Class variables are shared across multiple objects.
 * You can tell a variable is a class variable because it has the keyword static before it.
 */
public class DefaultInitialization {

	// local variable initialization (or lack thereof) example
	public int valid() {
		int y = 10;
		int x;  // x is declared here
		// int reply = x + y;  // DOES NOT COMPILE - x is not initialized
		x = 3;  // x is initialized here
		int reply = x + y;
		return reply;
	}

	public void findAnswer(boolean check) {
		int answer;
		int onlyOneBranch;
		if (check) {
			onlyOneBranch = 1;
			answer = 1;
		} else {
			answer = 2;
		}
		System.out.println(answer);
		// System.out.println(onlyOneBranch);  // DOES NOT COMPILE - might not be initialized
	}

	// instance and class(static) variable initialization - same rules apply to both
	boolean b;  // defaults to false
	byte aByte; // defaults to 0
	short s;    // defaults to 0
	int i;      // defaults to 0
	long l;     // defaults to 0
	float f;    // defaults to 0.0
	double d;   // defaults to 0.0
	char c;     // defaults to '\u0000'
	Object o;   // defaults to null - goes for any/all object reference vars

	public static void main(String[] args) {
		DefaultInitialization di = new DefaultInitialization();
		System.out.println(di.c);
	}
}
