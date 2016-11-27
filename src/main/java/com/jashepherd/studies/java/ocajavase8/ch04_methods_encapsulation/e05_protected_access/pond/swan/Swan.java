package com.jashepherd.studies.java.ocajavase8.ch04_methods_encapsulation.e05_protected_access.pond.swan;

import com.jashepherd.studies.java.ocajavase8.ch04_methods_encapsulation.e05_protected_access.pond.shore.Bird;  // in different package than Bird

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Applying Access Modifiers<br>
 * Protected Access - page 178
 * <p>
 * Swan is not in the same package as Bird, but does extend it—which implies it has access to the protected members
 * of Bird since it is a subclass. And it does. Lines 28 and 29 refer to protected members via inheriting them.
 * <p>
 * Lines 33 and 34 also successfully use protected members of Bird. This is allowed
 * because these lines refer to a Swan object. Swan inherits from Bird so this is okay. It is sort
 * of a two-phase check. The Swan class is allowed to use protected members of Bird and we
 * are referring to a Swan object. Granted, it is a Swan object created on line 32 rather than an
 * inherited one, but it is still a Swan object.
 * <p>
 * Lines 38 and 39 do not compile. Wait a minute. They are almost exactly the same as
 * lines 33 and 34! There’s one key difference. This time a Bird reference is used. It is created
 * on line 37. Bird is in a different package, and this code isn’t inheriting from Bird, so it
 * does not get to use protected members. Say what now? We just got through saying repeatedly
 * that Swan inherits from Bird. And it does. However, the variable reference isn’t a Swan.
 * The code just happens to be in the Swan class.
 */
public class Swan extends Bird {  // but subclass of bird
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
