package com.jashepherd.studies.java.ocajavase8studyguide.ch01.e20_order_of_initialization;

/**
 * Chapter 1: Java Building Blocks<br/>
 * Creating Objects<br/>
 * Order of Initialization - page 19
 * <ul>
 * <li>Fields and instance initializer blocks are run in the order in which they appear in the file.</li>
 * <li>The constructor runs after all fields and instance initializer blocks have run.</li>
 * </ul>
 * <p>
 * Running this example prints this:<br>
 * <code>
 * setting field<br>
 * setting constructor<br>
 * Tiny<br>
 * </code>
 * <p>
 * We start with the main() method because that's where Java starts execution. On line 35,
 * we call the constructor of Chick. Java creates a new object. First it initializes name
 * to "Fluffy" on line 28. Next it executes the print statement in the instance initializer
 * on line 29. Once all the fields and instance initializers have run, Java returns to the
 * constructor. Line 31 changes the value of name to "Tiny" and line 32 prints another statement.
 * At this point, the constructor is done executing and goes back to the print statement
 * on line 36.
 */
public class Chick {
	private String name = "Fluffy";
	{ System.out.println("setting field"); }
	public Chick() {
		name = "Tiny";
		System.out.println("setting constructor");
	}
	public static void main(String[] args) {
		Chick chick = new Chick();
		System.out.println(chick.name);
	}
}
