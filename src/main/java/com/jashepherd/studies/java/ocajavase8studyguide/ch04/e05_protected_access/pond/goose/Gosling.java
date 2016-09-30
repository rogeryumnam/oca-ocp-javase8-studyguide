package com.jashepherd.studies.java.ocajavase8studyguide.ch04.e05_protected_access.pond.goose;

import com.jashepherd.studies.java.ocajavase8studyguide.ch04.e05_protected_access.pond.shore.Bird;
/**
 * Chapter 4: Methods and Encapsulation<br>
 * Applying Access Modifiers<br>
 * Protected Access - page 177
 */
public class Gosling extends Bird {
	public void swim() {
		floatInWater();  // calling protected member
		System.out.println(text);  // calling protected member
	}
}
