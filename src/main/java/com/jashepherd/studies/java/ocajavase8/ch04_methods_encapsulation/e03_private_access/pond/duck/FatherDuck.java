package com.jashepherd.studies.java.ocajavase8.ch04_methods_encapsulation.e03_private_access.pond.duck;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Applying Access Modifiers<br>
 * Private Access - page 174
 */
public class FatherDuck {
	private String noise = "quack";
	private void quack() {
		System.out.println(noise); // private access is ok
	}
	private void makeNoise() {
		quack(); // private access is ok
	}
}
