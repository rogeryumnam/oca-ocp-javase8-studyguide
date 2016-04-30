package com.jashepherd.studies.java.ocajavase8studyguide.ch03.e09_stringbuilder_methods;

/**
 * Chapter 3: Core Java APIs<br>
 * Using the StringBuilder Class<br>
 * Important StringBuilder Methods - pages 114-117
 */
public class StringBuilderMethods {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder("animals");

		// charAt(), indexOf(), length(), and substring() - work exactly the same as the String class
		String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
		int len = sb.length();
		char ch = sb.charAt(6);
		System.out.println(sub + " " + len + " " + ch);

		// append()
		StringBuilder sb1 = new StringBuilder().append(1).append('c');
		sb1.append("-").append(true);
		System.out.println(sb1);  // 1c-true

		// insert()
		StringBuilder sb2 = new StringBuilder("animals");
		sb2.insert(7, "-");  // sb = animals-
		sb2.insert(0, "-");  // sb = -animals-
		sb2.insert(4, "-");  // sb = -ani-mals-
		System.out.println(sb2);

		// delete() and deleteCharAt()
		StringBuilder sb3 = new StringBuilder("abcdef");
		sb3.delete(1, 3);         // sb = adef
		//sb3.deleteCharAt(5);    // throws an exception
		System.out.println(sb3);  // adef

		// reverse()
		StringBuilder sb4 = new StringBuilder("ABC");
		sb4.reverse();
		System.out.println(sb4);  // CBA

		// toString()
		String s = sb.toString();
		System.out.println(s);
	}
}
