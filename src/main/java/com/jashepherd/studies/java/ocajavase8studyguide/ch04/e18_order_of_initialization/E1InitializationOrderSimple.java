package com.jashepherd.studies.java.ocajavase8studyguide.ch04.e18_order_of_initialization;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Creating Constructors<br>
 * Order of Initialization - pages 202-203
 * <p>
 * <ol>
 *    <li>If there is a superclass, it initializes first.</li>
 *    <li>Static variable declarations and static initializers in the order they appear in the file.</li>
 *    <li>Instance variable declarations and instance initializers in the order they appear in the file.</li>
 *    <li>The constructor.</li>
 * </ol>
 */
public class E1InitializationOrderSimple {
	private String name = "Torchie";
	{ System.out.println(name); }                       // 3rd
	private static int COUNT = 0;
	static { System.out.println(COUNT); }               // 1st
	static { COUNT += 10; System.out.println(COUNT); }  // 2nd
	public E1InitializationOrderSimple() {
		System.out.println("constructor");               // 4th
	}
}

/**
 * output is:<br>
 * 0<br>
 * 10<br>
 * Torchie<br>
 * constructor<br>
 */
class CallInitializationOrderSimple {
	public static void main(String[] args) {
		E1InitializationOrderSimple init = new E1InitializationOrderSimple();
	}
}