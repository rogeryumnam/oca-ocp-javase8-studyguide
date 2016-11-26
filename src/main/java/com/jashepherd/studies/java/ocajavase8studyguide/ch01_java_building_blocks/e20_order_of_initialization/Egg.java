package com.jashepherd.studies.java.ocajavase8studyguide.ch01_java_building_blocks.e20_order_of_initialization;

/**
 * Chapter 1: Java Building Blocks<br/>
 * Creating Objects<br/>
 * Order of Initialization - page 20
 * <p>
 * Fields and blocks are run first in order, setting number to 3 and then 4.
 * Then the constructor runs, setting number to 5.
 */
public class Egg {
	public Egg() {
		number = 5;
	}
	public static void main(String[] args) {
		Egg egg = new Egg();
		System.out.println(egg.number);
	}
	private int number = 3;
	{ number = 4; }
}
