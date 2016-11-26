package com.jashepherd.studies.java.ocajavase8studyguide.ch01_java_building_blocks.e17_constructors;

/**
 * Chapter 1: Java Building Blocks<br/>
 * Creating Objects<br/>
 * Constructors - page 17
 * <p>
 * The purpose of a constructor is to initialize fields, although you can put any code in
 * there. Another way to initialize fields is to do so directly on the line on which they're
 * declared. This example shows both approaches:
 * <p>
 * For most classes, you don't have to code a constructor as the compiler will supply a “do nothing”
 * default constructor for you.
 */
public class Chicken {
	int numEggs = 0;  // initialize on line
	String name;
	public Chicken() {
		name = "Duke";  // initialize in constructor
	}
}
