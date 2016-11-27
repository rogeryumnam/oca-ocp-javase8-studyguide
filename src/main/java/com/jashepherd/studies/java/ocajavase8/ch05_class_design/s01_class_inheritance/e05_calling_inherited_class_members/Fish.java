package com.jashepherd.studies.java.ocajavase8.ch05_class_design.s01_class_inheritance.e05_calling_inherited_class_members;

/**
 * Chapter 5: Class Design<br>
 * Introducing Class Inheritance<br>
 * Calling Inherited Class Members - pages 244-246
 */
public class Fish {
	protected int size;
	private int age;

	public Fish(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
}
