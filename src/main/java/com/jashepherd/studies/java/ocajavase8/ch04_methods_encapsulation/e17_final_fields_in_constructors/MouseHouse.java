package com.jashepherd.studies.java.ocajavase8.ch04_methods_encapsulation.e17_final_fields_in_constructors;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Creating Constructors<br>
 * Final Fields - page 202
 * <p>
 * By the time the constructor completes, all final instance variables must have been set
 */
public class MouseHouse {
	private final int volume;
	private final String name = "The Mouse House";
	public MouseHouse(int length, int width, int height) {
		volume = length * width * height;
	}
}
