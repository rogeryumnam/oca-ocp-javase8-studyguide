package com.jashepherd.studies.java.ocajavase8studyguide.ch03.e16_arraylists;

import java.util.ArrayList;
import java.util.List;

/**
 * Chapter 3: Core Java APIs<br>
 * Understanding an ArrayList<br>
 * pages 129-134
 */
public class UnderstandingArraylists {
	public static void main(String[] args) {
		// creating ArrayLists
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList(10);
		ArrayList list3 = new ArrayList(list2);

		// creating ArrayLists with generics
		ArrayList<String> list4 = new ArrayList<String>();
		ArrayList<String> list5 = new ArrayList<>();  // as of Java 7 the type may be omitted on the right side - diamond operator

		// creating ArrayList and placing it in a List reference
		List<String> list6 = new ArrayList<>();
		//ArrayList<String> list7 = new List<>(); // DOES NOT COMPILE - List is an interface

		// using an ArrayList

		// add() - inserts new value into the ArrayList
		ArrayList list = new ArrayList();  // no type specified for ArrayList
		list.add("hawk");  // [hawk]
		list.add(Boolean.TRUE); // [hawk, true]
		System.out.println(list); // [hawk, true]

		System.out.println();

		// add() using generics
		ArrayList<String> safer = new ArrayList<>();
		safer.add("sparrow");
		//safer.add(Boolean.TRUE); // DOES NOT COMPILE - only String types allowed

		List<String> birds = new ArrayList<>();
		birds.add("hawk");          // [hawk]
		birds.add(1, "robin");      // [hawk, robin]
		birds.add(0, "blue jay");   // [blue jay, hawk, robin]
		birds.add(1, "cardinal");   // [blue jay, cardinal, hawk, robin]
		System.out.println(birds);  // [blue jay, cardinal, hawk, robin]

		System.out.println();

		// remove()
		List<String> birds1 = new ArrayList<>();
		birds1.add("hawk");  // [hawk]
		birds1.add("hawk");  // [hawk, hawk]
		System.out.println(birds1.remove("cardinal"));  // prints false
		System.out.println(birds1.remove("hawk"));  // prints true
		System.out.println(birds1.remove(0));  // prints hawk
		System.out.println(birds1);  // []

		System.out.println();

		// set()
		List<String> birds2 = new ArrayList<>();
		birds2.add("hawk");                 // [hawk]
		System.out.println(birds2.size());  // 1
		birds2.set(0, "robin");             // [robin]
		System.out.println(birds2.size());  // 1
//		birds2.set(1, "robin");             // IndexOutOfBoundsException

		System.out.println();

		// isEmpty() and size()
		List<String> birds3 = new ArrayList<>();
		System.out.println(birds3.isEmpty());  // true
		System.out.println(birds3.size());     // 0
		birds3.add("hawk");                    // [hawk]
		birds3.add("hawk");                    // [hawk, hawk]
		System.out.println(birds3.isEmpty());  // false
		System.out.println(birds3.size());     // 2

		System.out.println();

		// clear()
		List<String> birds4 = new ArrayList<>();
		birds4.add("hawk");                    // [hawk]
		birds4.add("hawk");                    // [hawk, hawk]
		System.out.println(birds4.isEmpty());  // false
		System.out.println(birds4.size());     // 2
		birds4.clear();                        // []
		System.out.println(birds4.isEmpty());  // true
		System.out.println(birds4.size());     // 0

		System.out.println();

		// contains()
		List<String> birds5 = new ArrayList<>();
		birds5.add("hawk");                            // [hawk]
		System.out.println(birds5.contains("hawk"));   // true
		System.out.println(birds5.contains("robin"));  // false

		System.out.println();

		// equals()
		List<String> one = new ArrayList<>();
		List<String> two = new ArrayList<>();
		System.out.println(one.equals(two));  // true
		one.add("a");                         // [a]
		System.out.println(one.equals(two));  // false
		two.add("a");                         // [a]
		System.out.println(one.equals(two));  // true
		one.add("b");                         // [a,b]
		two.add(0, "b");                      // [b,a]
		System.out.println(one.equals(two));  // false
	}
}
