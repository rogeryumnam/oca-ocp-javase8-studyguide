package com.jashepherd.studies.java.ocajavase8studyguide.ch05_class_design.s01_class_inheritance.e05_calling_inherited_class_members;

/**
 * Chapter 5: Class Design<br>
 * Introducing Class Inheritance<br>
 * Calling Inherited Class Members - pages 244-246
 */
public class SuperVsSuper extends Super {
	public SuperVsSuper(int age) {
		super();
		super.setAge(10);
	}

	public SuperVsSuper() {
//		super;  // DOES NOT COMPILE
//		super().setAge(10);  // DOES NOT COMPILE - super keywords used incorrectly
	}
}
