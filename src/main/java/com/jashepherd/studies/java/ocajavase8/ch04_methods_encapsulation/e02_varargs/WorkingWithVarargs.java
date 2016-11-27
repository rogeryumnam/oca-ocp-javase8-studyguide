package com.jashepherd.studies.java.ocajavase8.ch04_methods_encapsulation.e02_varargs;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Working with Varargs<br>
 * pages 172-173
 */
public class WorkingWithVarargs {

	// vararg examples
	public void walk1(int... nums) { }
	public void walk2(int start, int... nums) { }
//	public void walk3(int... nums, int start) { }     // DOES NOT COMPILE - must be last
//	public void walk4(int... start, int... nums) { }  // DOES NOT COMPILE - cannot have multiple varargs

	/* When calling a method with a vararg parameter, you have a choice. You can pass in an array,
	 * or you can list the elements of the array and let Java create it for you. You can even omit
	 * the vararg values in the method call and Java will create an array of length zero for you.*/
	public static void walk(int start, int... nums) {
		System.out.println(nums.length);
	}

	public static void main(String[] args) {
		walk(1);                    // 0
		walk(1, 2);                 // 1
		walk(1, 2, 3);              // 2
		walk(1, new int[] {4, 5});  // 2

//		walk(1, {4, 5});  // DOES NOT COMPILE - cannot initialize array like this, must use 'new'

//		walk(1, null);  // throws a NullPointerException

		// Accessing a vararg parameter is also just like accessing an array. It uses array indexing.
		run(11, 22);  // 22
	}

	public static void run(int... nums) {
		System.out.println(nums[1]);  // 22
	}
}
