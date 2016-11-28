package com.jashepherd.studies.java.ocajavase8.ch05_class_design.s04_polymorphism.e03_casting_objects;

/**
 * Chapter 5: Class Design<br>
 * Understanding Polymorphism<br>
 * Casting Objects - pages 282-283
 * <p>
 * Bad example
 */
public class E2Bird {}

class Fish {
	public static void main(String[] args) {
		Fish fish = new Fish();
//		E2Bird bird = (E2Bird) fish;  // DOES NOT COMPILE - fish does not extend E2Bird
	}
}
