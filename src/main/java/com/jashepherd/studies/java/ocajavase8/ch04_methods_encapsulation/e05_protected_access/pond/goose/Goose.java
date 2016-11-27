package com.jashepherd.studies.java.ocajavase8.ch04_methods_encapsulation.e05_protected_access.pond.goose;

import com.jashepherd.studies.java.ocajavase8.ch04_methods_encapsulation.e05_protected_access.pond.shore.Bird;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Applying Access Modifiers<br>
 * Protected Access - page 179
 * <p>
 * The first method is fine. In fact, it is equivalent to the Swan example. Goose extends
 * Bird. Since we are in the Goose subclass and referring to a Goose reference, it can access
 * protected members. The second method is a problem. Although the object happens to be
 * a Goose, it is stored in a Bird reference. We are not allowed to refer to members of the Bird
 * class since we are not in the same package and Bird is not a subclass of Bird.
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
