package com.jashepherd.studies.java.ocajavase8studyguide.ch01_java_building_blocks.s04_creating_objects.e17_constructors;

/**
 * Chapter 1: Java Building Blocks<br/>
 * Creating Objects<br/>
 * Constructors - page 17
 * <p>
 * There are two key points to note about the constructor: the name of the constructor
 * matches the name of the class, and there’s no return type.
 * <p>
 * When you see a method name beginning with a capital letter and having a return type,
 * pay special attention to it. It is not a constructor since there’s a return type. It’s a regular
 * method that won’t be called when you write new Chick()<br>
 * <code>public void Chick() { } // NOT A CONSTRUCTOR</code>
 */
public class Chick {
	public Chick() {
		System.out.println("in constructor");
	}
}
