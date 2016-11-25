package com.jashepherd.studies.java.ocajavase8studyguide.ch04.e05_protected_access.pond.duck;

import com.jashepherd.studies.java.ocajavase8studyguide.ch04.e05_protected_access.pond.goose.Goose;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Applying Access Modifiers<br>
 * Protected Access - page 179
 * <p>
 * This code does not compile because we are not in the Goose class. The floatInWater()
 * method is declared in Bird. GooseWatcher is not in the same package as Bird, nor does it
 * extend Bird. Goose extends Bird. That only lets Goose refer to floatInWater() and not
 * callers of Goose.
 */
public class GooseWatcher {
	public void watch() {
		Goose goose = new Goose();
//		goose.floatInWater();  // DOES NOT COMPILE
	}
}
