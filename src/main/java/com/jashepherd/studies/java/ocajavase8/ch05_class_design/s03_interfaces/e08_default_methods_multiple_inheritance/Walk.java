package com.jashepherd.studies.java.ocajavase8.ch05_class_design.s03_interfaces.e08_default_methods_multiple_inheritance;

/**
 * Chapter 5: Class Design<br>
 * Implementing Interfaces<br>
 * Default Methods and Multiple Inheritance - pages 277-278
 */
public interface Walk {
	public default int getSpeed() {
		return 5;
	}
}
