package com.jashepherd.studies.java.ocajavase8.ch05_class_design.s01_class_inheritance.e07_inheriting_variables;

/**
 * Chapter 5: Class Design<br>
 * Introducing Class Inheritance<br>
 * Calling Inherited Class Members - Inheriting Variables - Hiding Variables - pages 257-258
 * <p>
 * Don't hide variables in practice. It makes the code very confusing and difficult to read.
 */
public class E2JellyFish {
	public int length = 5;
	public static void main(String... stuff) {
		E2JellyFish jellyFish = new E2JellyFish();
		E2Animal animal = new E2Animal();
		System.out.println(jellyFish.length);  // 5
		System.out.println(animal.length);     // 2
	}
}
