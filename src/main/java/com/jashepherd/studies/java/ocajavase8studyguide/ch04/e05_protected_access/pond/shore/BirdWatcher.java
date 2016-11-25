package com.jashepherd.studies.java.ocajavase8studyguide.ch04.e05_protected_access.pond.shore;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Applying Access Modifiers<br>
 * Protected Access - page 177
 * <p>
 * Since Bird and BirdWatcher are in the same package, BirdWatcher can access members of the bird variable. The definition of
 * protected allows access to subclasses and classes in the same package. This example uses the same package part of that
 * definition.
 */
public class BirdWatcher {
	public void watchBird() {
		Bird bird = new Bird();
		bird.floatInWater();  // calling protected member
		System.out.println(bird.text);  // calling protected member
	}
}
