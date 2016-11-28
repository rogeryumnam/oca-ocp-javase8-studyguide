package com.jashepherd.studies.java.ocajavase8.ch05_class_design.s03_interfaces.e07_default_interface_methods;

/**
 * Chapter 5: Class Design<br>
 * Implementing Interfaces<br>
 * Default Interface Methods - pages 276-277
 */
public interface E3HasFins {
	public default int getNumberOfFins() {
		return 4;
	}
	public default double getLongestFinLength() {
		return 20.0;
	}
	public default boolean doFinsHaveScales() {
		return true;
	}
}
