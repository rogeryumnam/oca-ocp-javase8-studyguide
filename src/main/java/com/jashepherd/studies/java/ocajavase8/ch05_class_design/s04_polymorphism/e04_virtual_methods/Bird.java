package com.jashepherd.studies.java.ocajavase8.ch05_class_design.s04_polymorphism.e04_virtual_methods;

/**
 * Chapter 5: Class Design<br>
 * Understanding Polymorphism<br>
 * Virtual Methods - pages 284-285
 */
public class Bird {
	public String getName() {
		return "Unknown";
	}
	public void displayInformation() {
		System.out.println("The bird name is: " + getName());
	}
}

class Peacock extends Bird {
	public String getName() {
		return "Peacock";
	}
	public static void main(String[] args) {
		Bird bird = new Peacock();
		bird.displayInformation();
	}
}
