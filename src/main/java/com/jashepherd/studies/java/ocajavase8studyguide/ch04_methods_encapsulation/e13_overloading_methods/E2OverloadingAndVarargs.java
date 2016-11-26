package com.jashepherd.studies.java.ocajavase8studyguide.ch04_methods_encapsulation.e13_overloading_methods;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Overloading Methods<br>
 * Overloading and Varargs - pages 192-193
 */
public class E2OverloadingAndVarargs {
	public void fly(int[] lengths) {}
	// Java treats varargs like arrays so this method signature actually matches the one above
//	public void fly(int... lengths) {}  // DOES NOT COMPILE

	public static void main(String... args) {
		E2OverloadingAndVarargs ov = new E2OverloadingAndVarargs();
		ov.fly(new int[] {1, 2, 3});
//		ov.fly(1, 2, 3);  // only valid if calling the varargs version
	}
}
