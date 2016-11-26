package com.jashepherd.studies.java.ocajavase8studyguide.ch01_java_building_blocks.s04_creating_objects.e18_reading_writing_fields;

/**
 * Chapter 1: Java Building Blocks<br/>
 * Creating Objects<br/>
 * Reading and Writing Object Fields - page 18
 * <p>
 * Lines 12 and 13 both write to fields. Line 14 does both read and write. It reads the fields first and last. It
 * then writes the field full.
 */
public class Name {
	String first = "Theodore";
	String last = "Moose";
	String full = first + last;
}
