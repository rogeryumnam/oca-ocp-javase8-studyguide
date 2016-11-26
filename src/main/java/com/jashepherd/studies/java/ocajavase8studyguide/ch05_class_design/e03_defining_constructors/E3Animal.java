package com.jashepherd.studies.java.ocajavase8studyguide.ch05_class_design.e03_defining_constructors;

/**
 * Chapter 5: Class Design<br>
 * Introducing Class Inheritance<br>
 * Defining Constructors - pages 238-240
 * <p>
 * If the parent class has more than one constructor, the child class may use any valid
 * parent constructor in its definition
 */
public class E3Animal {
	private int age;
	private String name;
	public E3Animal(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public E3Animal(int age) {
		super();
		this.age = age;
		this.name = null;
	}
}
