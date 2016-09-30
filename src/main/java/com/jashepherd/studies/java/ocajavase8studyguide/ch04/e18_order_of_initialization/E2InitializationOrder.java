package com.jashepherd.studies.java.ocajavase8studyguide.ch04.e18_order_of_initialization;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Creating Constructors<br>
 * Order of Initialization - pages 203-204
 * <p>
 * output is:<br>
 * 0<br>
 * read to constructor<br>
 * Torchie<br>
 * 1<br>
 * constructor<br>
 */
public class E2InitializationOrder {
	private String name = "Torchie";
	{ System.out.println(name); }                // 3rd
	private static int COUNT = 0;
	static { System.out.println(COUNT); }        // 1st
	{ COUNT++; System.out.println(COUNT); }      // 4th
	public E2InitializationOrder() {
		System.out.println("constructor");        // 5th
	}
	public static void main(String[] args) {
		System.out.println("read to construct");  // 2nd
		new E2InitializationOrder();
	}
}
