package com.jashepherd.studies.java.ocajavase8.ch04_methods_encapsulation.e15_overloading_constructors;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Overloading Constructors<br>
 * pages 199-200
 */
public class Hamster {
	private String color;
	private int weight;
	public Hamster(int weight) {  // first constructor
		this.weight = weight;  // duplicate code
		color = "brown";
	}
	public Hamster(int weight, String color) {  // second constructor
		this.weight = weight;  // duplicate code
		this.color = color;
	}
}

class Hamster1 {
	private String color;
	private int weight;
	public Hamster1(int weight) {
		this(weight, "brown");  // calls the 2nd constructor - if used, this() must be first statement in constructor
	}
	public Hamster1(int weight, String color) {
		this.weight = weight;
		this.color = color;
	}
}