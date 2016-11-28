package com.jashepherd.studies.java.ocajavase8.ch05_class_design.s03_interfaces.e07_default_interface_methods;

/**
 * Chapter 5: Class Design<br>
 * Implementing Interfaces<br>
 * Default Interface Methods - pages 274-275
 * <p>
 * Example of a default interface method
 */
public interface E1IsWarmBlooded {
	boolean hasScales();
	public default double getTemperature() {
		return 10.0;
	}
}
