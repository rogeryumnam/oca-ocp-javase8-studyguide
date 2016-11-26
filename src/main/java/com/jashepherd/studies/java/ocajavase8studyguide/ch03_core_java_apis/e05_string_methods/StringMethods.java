package com.jashepherd.studies.java.ocajavase8studyguide.ch03_core_java_apis.e05_string_methods;

/**
 * Chapter 3: Core Java APIs<br>
 * Creating and Manipulating Strings<br>
 * Important String Methods - pages 105-110
 */
public class StringMethods {
	public static void main(String[] args) {
		String string = "animals";

		// length()
		System.out.println(string.length());  // 7

		// concat() - rarely used but can but used instead of +
		System.out.println(string.concat(" afoot."));  // animals afoot.
		System.out.println(string + " afoot.");        // animals afoot.

		// charAt()
		System.out.print(string.charAt(0));  // a
		System.out.println(string.charAt(6));  // s
		// System.out.print(string.charAt(7));  // throws runtime exception

		// indexOf()
		System.out.println(string.indexOf('a'));     // 0
		System.out.println(string.indexOf("al"));    // 4
		System.out.println(string.indexOf('a', 4));  // 4
		System.out.println(string.indexOf("al", 5)); // -1

		// substring()
		System.out.println(string.substring(3));    // mals
		System.out.println(string.substring(string.indexOf('m'))); // mals
		System.out.println(string.substring(3, 4)); // m
		System.out.println(string.substring(3, 7)); // mals
		// less obvious examples
		System.out.println(string.substring(3, 3)); // empty string
		//System.out.println(string.substring(3, 2)); // throws exception
		//System.out.println(string.substring(3, 8)); // throws exception

		// toLowerCase() and toUpperCase()
		System.out.println(string.toUpperCase());    // ANIMALS
		System.out.println("Abc123".toLowerCase());  // abc123

		// equals() and equalsIgnoreCase()
		System.out.println("abc".equals("ABC"));   // false
		System.out.println("ABC".equals("ABC"));   // true
		System.out.println("abc".equalsIgnoreCase("ABC"));  // true

		// startsWith() and endsWith()
		System.out.println("abc".startsWith("a")); // true
		System.out.println("abc".startsWith("A")); // false
		System.out.println("abc".endsWith("c"));   // true
		System.out.println("abc".endsWith("a"));   // false

		// contains()
		System.out.println("abc".contains("b")); // true
		System.out.println("abc".contains("B")); // false

		// replace()
		System.out.println("abcabc".replace('a', 'A')); // AbcAbc
		System.out.println("abcabc".replace("a", "A")); // AbcAbc

		// trim()
		System.out.println("   abc   ".trim()); // abc
		System.out.println("\t a b c\n".trim()); // a b c

	}
}
