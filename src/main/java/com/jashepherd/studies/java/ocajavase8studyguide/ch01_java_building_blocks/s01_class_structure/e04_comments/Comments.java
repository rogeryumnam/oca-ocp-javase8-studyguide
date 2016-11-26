package com.jashepherd.studies.java.ocajavase8studyguide.ch01_java_building_blocks.s01_class_structure.e04_comments;

/**
 * Chapter 1: Java Building Blocks<br>
 * Understanding the Java Class Structure<br>
 * Comments - pages 4-5
 * <p>
 * This class illustrates the three types of comments: single-line, multiple-line, and Javadoc.
 * <p>
 * This very comment is a Javadoc kind of comment
 */
public class Comments {
	// comment until end of line

	/* Multiple
	 * line comment
	 */

	/**
	 * This is Javadoc for the method go().  Javadoc can be placed at classes, fields, and methods
	 */
	void go() {
		System.out.println("Hello World!");
	}
}
