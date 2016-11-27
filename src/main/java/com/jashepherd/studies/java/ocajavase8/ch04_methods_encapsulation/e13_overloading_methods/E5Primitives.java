package com.jashepherd.studies.java.ocajavase8.ch04_methods_encapsulation.e13_overloading_methods;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Overloading Methods<br>
 * Primitives - page 194
 */
public class E5Primitives {
	public static void main(String[] args) {
		Plane p = new Plane();
		p.fly(123);   // calls the int version - would call the long version if there was no int version
		p.fly(123L);  // calls the long version
	}
}

class Plane {
	public void fly(int i) {
		System.out.print("int ");
	}
	public void fly(long l) {
		System.out.print("long ");
	}
}
