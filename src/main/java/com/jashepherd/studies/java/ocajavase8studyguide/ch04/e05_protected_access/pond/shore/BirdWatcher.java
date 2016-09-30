package com.jashepherd.studies.java.ocajavase8studyguide.ch04.e05_protected_access.pond.shore;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Applying Access Modifiers<br>
 * Protected Access - page 177
 */
public class BirdWatcher {
	public void watchBird() {
		Bird bird = new Bird();
		bird.floatInWater();  // calling protected member
		System.out.println(bird.text);  // calling protected member
	}
}
