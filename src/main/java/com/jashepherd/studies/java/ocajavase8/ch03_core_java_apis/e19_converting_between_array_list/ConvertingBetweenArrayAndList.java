package com.jashepherd.studies.java.ocajavase8.ch03_core_java_apis.e19_converting_between_array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Chapter 3: Core Java APIs<br>
 * Understanding an ArrayList<br>
 * Converting Between array and List - pages 136-137
 */
public class ConvertingBetweenArrayAndList {
	public static void main(String[] args) {

		// turn an ArrayList into an array
		List<String> list = new ArrayList<>();
		list.add("hawk");
		list.add("robin");
		Object[] objectArray = list.toArray();  // convert ArrayList to an object array
		System.out.println(objectArray.length); // 2

		// specifying a size of 0 for the parameter Java will create a new array of the proper size for the return value
		String[] stringArray = list.toArray(new String[0]);  // convert ArrayList to a String array
		System.out.println(stringArray.length); // 2

		// convert array to a List
		String[] array = { "hawk", "robin" };       // [hawk, robin]
		List<String> list1 = Arrays.asList(array);  // returns fixed size list
		System.out.println(list1.size());           // 2
		list1.set(1, "test");                       // [hawk, test]
		array[0] = "new";                           // [new, test]
		for (String b : array)
			System.out.print(b + " ");               // new test
		list1.remove(1);                            // throws UnsupportedOperation Exception

		/* cool trick - asList() takes varargs, which let you pass in an array or just type out the String values.
		 * This is handy when testing because you can easily create and populate a List on one line.*/
		List<String> list2 = Arrays.asList("one", "two");
	}
}
