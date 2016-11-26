package com.jashepherd.studies.java.ocajavase8studyguide.ch05_class_design.e01_extending_classes;

/**
 * Chapter 5: Class Design<br>
 * Introducing Class Inheritance<br>
 * Extending a Class - pages 235-236
 */
public class Lion extends Animal {
	private void roar() {
		System.out.println("The " + getAge() + " year old lion says: Roar!");

//		System.out.println("The " + age + " year old lion says: Roar!");  // DOES NOT COMPILE - age is private in parent class
	}
}
