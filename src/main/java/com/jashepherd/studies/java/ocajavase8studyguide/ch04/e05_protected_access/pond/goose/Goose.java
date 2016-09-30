package com.jashepherd.studies.java.ocajavase8studyguide.ch04.e05_protected_access.pond.goose;

import com.jashepherd.studies.java.ocajavase8studyguide.ch04.e05_protected_access.pond.shore.Bird;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Applying Access Modifiers<br>
 * Protected Access - page 179
 */
public class Goose extends Bird {
	public void helpGooseSwim() {
		Goose other = new Goose();
		other.floatInWater();
		System.out.println(other.text);
	}
	public void helpOtherGooseSwim() {
		Bird other = new Goose();
//		other.floatInWater();  // DOES NOT COMPILE
//		System.out.println(other.text);  // DOES NOT COMPILE
	}
}
