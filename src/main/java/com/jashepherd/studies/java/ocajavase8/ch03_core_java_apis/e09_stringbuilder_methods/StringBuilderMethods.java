package com.jashepherd.studies.java.ocajavase8.ch03_core_java_apis.e09_stringbuilder_methods;

/**
 * Chapter 3: Core Java APIs<br>
 * Using the StringBuilder Class<br>
 * Important StringBuilder Methods - pages 114-117
 */
public class StringBuilderMethods {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder("animals");

		// charAt(), indexOf(), length(), and substring() - work exactly the same as the String class
		String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));  // sub = "anim"
		int len = sb.length();  // 7
		char ch = sb.charAt(6);  // 's'
		System.out.println(sub + " " + len + " " + ch);  // "anim 7 s"

		// append()
		StringBuilder sb1 = new StringBuilder().append(1).append('c');  // sb1 = "1c"
		sb1.append("-").append(true);  // sb1 = "1c-true"
		System.out.println(sb1);  // 1c-true

		// insert()
		StringBuilder sb2 = new StringBuilder("animals");
		sb2.insert(7, "-");  // sb = animals-
		sb2.insert(0, "-");  // sb = -animals-
		sb2.insert(4, "-");  // sb = -ani-mals-
		System.out.println(sb2);

		// delete() and deleteCharAt()
		StringBuilder sb3 = new StringBuilder("abcdef");
		sb3.delete(1, 3);         // sb3 = adef
		//sb3.deleteCharAt(5);    // throws an exception
		System.out.println(sb3);  // adef

		// reverse()
		StringBuilder sb4 = new StringBuilder("ABC");
		sb4.reverse();  // sb4 = "CBA"
		System.out.println(sb4);  // CBA

		// toString()
		String s = sb.toString();  // s = "animals"
		System.out.println(s);  // animals
	}
}
