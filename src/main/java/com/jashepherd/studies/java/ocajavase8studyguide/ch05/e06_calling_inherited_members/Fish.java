package com.jashepherd.studies.java.ocajavase8studyguide.ch05.e06_calling_inherited_members;

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
