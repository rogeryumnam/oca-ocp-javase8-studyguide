package com.jashepherd.studies.java.ocajavase8studyguide.ch04_methods_encapsulation.e05_protected_access.pond.goose;

import com.jashepherd.studies.java.ocajavase8studyguide.ch04_methods_encapsulation.e05_protected_access.pond.shore.Bird;
/**
 * Chapter 4: Methods and Encapsulation<br>
 * Applying Access Modifiers<br>
 * Protected Access - page 177
 * <p>
 * This is a very simple subclass. It extends the Bird class. Extending means creating a
 * subclass that has access to any protected or public members of the parent class. Running
 * this code prints floating twice: once from calling floatInWater() and once from the print
 * statement in swim(). Since Gosling is a subclass of Bird, it can access these members even
 * though it is in a different package.
 */
public class Gosling extends Bird {
	public void swim() {
		floatInWater();  // calling protected member
		System.out.println(text);  // calling protected member
	}
}
