package com.jashepherd.studies.java.ocajavase8studyguide.ch04.e12_passing_data_among_methods;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Passing Data Among Methods<br>
 * pages 188-189
 * <p>
 * Java is pass-by-value aka pass-by-copy of value
 */
public class PassingData {
	public static void main(String[] args) {
		int num = 4;
		newNumber(5);
		System.out.println(num);  // 4

		String name = "Webby";
		speak(name);
		System.out.println(name);  // Webby

		StringBuilder sb = new StringBuilder();
		stringBuilderSpeak(sb);
		System.out.println(sb);  // Webby
	}
	public static void newNumber(int num) {
		num = 8;  // different var than the num defined in the main() method - does not affect that value
	}
	public static void speak(String name) {
		name = "Sparky";  // again different var than the name defined in the main() method
	}
	public static void stringBuilderSpeak(StringBuilder s) {  // refers to the same object defined in main() method
		s.append("Webby");  // affects the sb object defined in main() method
	}
}
