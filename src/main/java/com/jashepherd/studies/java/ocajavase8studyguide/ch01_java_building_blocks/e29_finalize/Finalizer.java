package com.jashepherd.studies.java.ocajavase8studyguide.ch01_java_building_blocks.e29_finalize;

/**
 * Chapter 1: Java Building Blocks<br/>
 * Destroying Objects<br/>
 * finalize() - pages 38-39
 * <p>
 * No output is produced.  This is because the program exits before there is any need to
 * run the garbage collector.
 * <p>
 * The main thing to understand about finalize() method is that it may be called 0 or 1 time,
 * but never twice.
 */
public class Finalizer {
	protected void finalize() {
		System.out.println("Calling finalize");
	}
	public static void main(String[] args) {
		Finalizer f = new Finalizer();
	}
}
