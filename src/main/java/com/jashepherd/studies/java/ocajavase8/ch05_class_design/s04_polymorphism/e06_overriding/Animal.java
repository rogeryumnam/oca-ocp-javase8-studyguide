package com.jashepherd.studies.java.ocajavase8.ch05_class_design.s04_polymorphism.e06_overriding;

/**
 * Chapter 5: Class Design<br>
 * Understanding Polymorphism<br>
 * Polymorphism and Method Overriding - pages 287-288
 */
public class Animal {
	public String getName() {
		return "Animal";
	}
}

class Gorilla extends Animal {
//	protected String getName() {  // DOES NOT COMPILE - overridden method cannot be less accessible than parent method
	public String getName() {
		return "Gorilla";
	}
}

class ZooKeeper {
	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println(animal.getName());
	}
}