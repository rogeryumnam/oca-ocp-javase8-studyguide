package com.jashepherd.studies.java.ocajavase8studyguide.ch04.e05_protected_access.pond.duck;

import com.jashepherd.studies.java.ocajavase8studyguide.ch04.e05_protected_access.pond.goose.Goose;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Applying Access Modifiers<br>
 * Protected Access - page 179
 */
public class GooseWatcher {
	public void watch() {
		Goose goose = new Goose();
//		goose.floatInWater();  // DOES NOT COMPILE
	}
}
