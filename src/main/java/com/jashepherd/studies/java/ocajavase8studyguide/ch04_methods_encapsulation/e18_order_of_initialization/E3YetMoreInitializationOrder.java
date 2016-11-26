package com.jashepherd.studies.java.ocajavase8studyguide.ch04_methods_encapsulation.e18_order_of_initialization;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Creating Constructors<br>
 * Order of Initialization - page 204
 * <p>
 * output is:<br>
 * 2 4 6 8 5
 */
public class E3YetMoreInitializationOrder {
	static { add(2); }                                         // 1st
	static void add(int num) { System.out.print(num + " "); }
	E3YetMoreInitializationOrder() { add(5); }                 // 5th
	static { add(4); }                                         // 2nd
	{ add(6); }                                                // 3rd
	static { new E3YetMoreInitializationOrder(); }
	{ add(8); }                                                // 4th
	public static void main(String[] args) { }
}
