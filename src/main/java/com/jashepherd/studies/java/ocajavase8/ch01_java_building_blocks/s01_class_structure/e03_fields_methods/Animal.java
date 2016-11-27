package com.jashepherd.studies.java.ocajavase8.ch01_java_building_blocks.s01_class_structure.e03_fields_methods;

/**
 * Chapter 1: Java Building Blocks<br>
 * Understanding the Java Class Structure<br>
 * Fields and Methods - page 3
 * <p>
 * This is a very simple Java class with a field and some methods
 */
public class Animal {
	String name;
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}
}
