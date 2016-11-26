package com.jashepherd.studies.java.ocajavase8studyguide.ch02_operators_statements.e12_for_statements;

/**
 * Chapter 2: Operators and Statements<br/>
 * Understanding Java Statements<br/>
 * The Enhanced for Statement - pages 83-86
 * <p>
 * Also could be called the for-each loop
 */
public class A2EnhancedFor {
	static public void main(String args[]) {

		// outputs: Lisa, Kevin, Roger,
		final String[] names = new String[3];
		names[0] = "Lisa";
		names[1] = "Kevin";
		names[2] = "Roger";
		for(String name : names) {
			System.out.print(name + ", ");
		}
		System.out.println();

		// outputs: Lisa, Kevin, Roger,
		java.util.List<String> values = new java.util.ArrayList<String>();
		values.add("Lisa");
		values.add("Kevin");
		values.add("Roger");
		for(String value : values) {
			System.out.print(value + ", ");
		}
		System.out.println();

		// Bad examples
		/*
		String names = "Lisa";
		for(String name : names) { // DOES NOT COMPILE - not a collection or array
			System.out.print(name + " ");
		}
		*/

		/*
		String[] moreNames = new String[3];
		for(int name : moreNames) { // DOES NOT COMPILE - data type mismatch
			System.out.print(name + " ");
		}
		*/

		// comparing for and for-each(Enhanced for) loops
		// for an array
		// enhanced
		for(String name : names) {
			System.out.print(name + ", ");
		}
		// basic
		for(int i=0; i < names.length; i++) {
			String name = names[i];
			System.out.print(name + ", ");
		}

		// for a collection
		// enhanced
		for(String value : values) {
			System.out.print(value + ", ");
		}
		// basic
		for(java.util.Iterator<String> i = values.iterator(); i.hasNext(); ) {
			String value = i.next();
			System.out.print(value + ", ");
		}

		System.out.println();

		// print comma only between elements not at the end - regular for loop
		java.util.List<String> names1 = new java.util.ArrayList<String>();
		names1.add("Lisa");
		names1.add("Kevin");
		names1.add("Roger");
		for(int i=0; i<names1.size(); i++) {
			String name = names1.get(i);
			if(i>0) {
				System.out.print(", ");
			}
			System.out.print(name);
		}

		System.out.println();

		int[] values1 = new int[3];
		values1[0] = 10;
		values1[1] = new Integer(5);
		values1[2] = 15;
		for(int i=1; i<values1.length; i++) {
			System.out.print(values1[i]-values1[i-1] + ", ");
		}
	}
}
