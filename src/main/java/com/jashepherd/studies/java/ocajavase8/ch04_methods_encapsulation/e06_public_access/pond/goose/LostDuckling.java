package com.jashepherd.studies.java.ocajavase8.ch04_methods_encapsulation.e06_public_access.pond.goose;

import com.jashepherd.studies.java.ocajavase8.ch04_methods_encapsulation.e06_public_access.pond.duck.DuckTeacher;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Applying Access Modifiers<br>
 * Public Access - page 180
 */
public class LostDuckling {
	public void swim() {
		DuckTeacher teacher = new DuckTeacher();
		teacher.swim();  // allowed
		System.out.println("Thanks" + teacher.name);  // allowed
	}
}
