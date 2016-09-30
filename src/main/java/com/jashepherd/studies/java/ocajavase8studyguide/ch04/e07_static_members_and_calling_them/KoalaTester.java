package com.jashepherd.studies.java.ocajavase8studyguide.ch04.e07_static_members_and_calling_them;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Designing Static Methods and Fields & Calling a Static Variable or Method<br>
 * pages 181-183
 */
public class KoalaTester {
	public static void main(String[] args) {
		System.out.println(Koala.count);
		Koala.main(new String[0]);  // call static method

		// you can use instance of the object to call static members
		Koala k = new Koala();
		System.out.println(k.count);  // k is a Koala
		k = null;
		System.out.println(k.count);  // k is still a Koala
		// the above prints 0 twice

		// one more time to drive the point home
		Koala.count = 4;
		Koala koala1 = new Koala();
		Koala koala2 = new Koala();
		koala1.count = 6;
		koala2.count = 5;
		System.out.println(Koala.count);  // 5 - there is only one static count even though there are multiple instances
	}
}
