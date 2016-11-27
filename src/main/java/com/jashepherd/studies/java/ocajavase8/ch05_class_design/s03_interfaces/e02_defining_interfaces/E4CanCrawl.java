package com.jashepherd.studies.java.ocajavase8.ch05_class_design.s03_interfaces.e02_defining_interfaces;

/**
 * Chapter 5: Class Design<br>
 * Implementing Interfaces<br>
 * Defining an Interface - pages 267-268
 * <p>
 * Examples of invalid interfaces and interface methods
 */
public interface E4CanCrawl {}

/*
private final interface E4CanCrawl {    // DOES NOT COMPILE - interfaces cannot be marked final and must be public or default
	private void dig(int depth);        // DOES NOT COMPILE - interface methods cannot be marked private
	protected abstract double depth();  // DOES NOT COMPILE - interface methods must be public and abstract
	public final void surface();        // DOES NOT COMPILE - interface methods cannot be marked final
}
*/