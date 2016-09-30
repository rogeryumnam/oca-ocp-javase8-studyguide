package com.jashepherd.studies.java.ocajavase8studyguide.ch04.e14_creating_constructors;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Creating Constructors<br>
 * pages 196-197
 */
public class E1Bunny {

	private String color;
	private int height;
	private int length;

	// valid constructors
	public E1Bunny() {
		System.out.println("constructor");
	}

	public E1Bunny(String color) {
		this.color = color;
	}

	public E1Bunny(int length, int theHeight) {
		length = this.length;  // backwards - no good!
		height = theHeight;    // fine because parameter name and instance var have different names
		this.color = "white";  // fine, but redundant
	}

	// bad examples
//	public bunny() {}  // DOES NOT COMPILE - constructor name does not match class name
	public void Bunny() {}  // compiles but not a constructor because it has a return type

	public static void main(String[] args) {
		E1Bunny b = new E1Bunny(1, 2);
		System.out.println(b.length + " " + b.height + " " + b.color);
	}
}
