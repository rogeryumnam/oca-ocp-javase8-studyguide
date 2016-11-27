package com.jashepherd.studies.java.ocajavase8.ch01_java_building_blocks.s02_main_method;

/**
 * Chapter 1: Java Building Blocks<br/>
 * Understanding the Java Class Structure<br/>
 * Writing a main() Method with parameters - page 7
 * <p>
 * This class illustrates a class with a main() method which makes use of arguments passed to it.  All arguments are treated as Strings<br/>
 * To run this program you must javac the Zoo.java class and then cd into the build directory and then execute it with the package name<br/>
 * and class name and arguments<br/>
 * <code>java com.jashepherd.studies.java.ocajavase8.ch01_java_building_blocks.s02_main_method.Zoo Bronx Zoo</code><br/>
 * Bronx<br/>
 * Zoo
 * </p>
 * <p>
 * Another example this time with a string with a space in it<br/>
 * <code>java com.jashepherd.studies.java.ocajavase8.ch01_java_building_blocks.s02_main_method.Zoo "San Diego" Zoo</code><br/>
 * San Diego<br/>
 * Zoo
 * </p>
 * <p>
 * Another example this time with too many arguments passed.  The extra arguments don't cause a problem, but they are not used in the
 * program.<br/>
 * <code>java com.jashepherd.studies.java.ocajavase8.ch01_java_building_blocks.s02_main_method.Zoo Bronx Zoo Hello</code><br/>
 * Bronx<br/>
 * Zoo
 * </p>
 * <p>
 * Another example this time with a number as an argument.  It is converted to String<br/>
 *<code>java com.jashepherd.studies.java.ocajavase8.ch01_java_building_blocks.s02_main_method.Zoo Bronx 2</code><br/>
 * Bronx<br/>
 * 2
 */
public class Zoo {
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
	}
}
