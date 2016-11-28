package com.jashepherd.studies.java.ocajavase8.ch05_class_design.s03_interfaces.e07_default_interface_methods;

/**
 * Chapter 5: Class Design<br>
 * Implementing Interfaces<br>
 * Default Interface Methods - pages 276-277
 */
public interface E3SharkFamily extends E3HasFins {
	public default int getNumberOfFins() {  // overrides parent interface default method with a new implementation
		return 8;
	}
	public double getLongestFinLength();  // replaces default method with a new abstract method which must be implemented when inherited

	/*
	public boolean doFinsHaveScales() {  // DOES NOT COMPILE - should be marked as default since it has body
		return false;
	}
	*/
}
