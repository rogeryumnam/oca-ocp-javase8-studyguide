package com.jashepherd.studies.java.ocajavase8studyguide.ch04.e05_protected_access.pond.swan;

import com.jashepherd.studies.java.ocajavase8studyguide.ch04.e05_protected_access.pond.shore.Bird;  // in different package than Bird

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Applying Access Modifiers<br>
 * Protected Access - page 178
 */
public class Swan extends Bird {
	public void swim() {
		floatInWater();  // package access to superclass
		System.out.println(text);  // package access to superclass
	}
	public void helpOtherSwanSwim() {
		Swan other = new Swan();
		other.floatInWater();  // package access to superclass
		System.out.println(other.text);  // package access to superclass
	}
	public void helpOtherBirdSwim() {
		Bird other = new Bird();
//		other.floatInWater();  // DOES NOT COMPILE
//		System.out.println(other.text);  // DOES NOT COMPILE
		}
}
