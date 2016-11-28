package com.jashepherd.studies.java.ocajavase8.ch05_class_design.s03_interfaces.e08_default_methods_multiple_inheritance;

/**
 * Chapter 5: Class Design<br>
 * Implementing Interfaces<br>
 * Default Methods and Multiple Inheritance - pages 277-278
 */
public class Cat {}
/*
public class Cat implements Walk, Run {  // DOES NOT COMPILE - ambiguous, Walk and Run both have default method getSpeed()
	public static void main(String[] args) {
		System.out.println(new Cat().getSpeed());
	}
}
*/