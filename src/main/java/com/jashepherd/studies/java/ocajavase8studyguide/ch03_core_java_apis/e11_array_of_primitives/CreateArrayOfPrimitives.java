package com.jashepherd.studies.java.ocajavase8studyguide.ch03_core_java_apis.e11_array_of_primitives;

/**
 * Chapter 3: Core Java APIs<br>
 * Understanding Java Arrays<br>
 * Creating an Array of Primitives - pages 119-121
 */
public class CreateArrayOfPrimitives {
	char[] letters;  // create a char array

	// create an int array with a size of 3 with all values default of the type int which is 0
	int[] numbers1 = new int[3];

	// create an int array and specify all the values it should start out with
	int[] numbers2 = new int[] {42, 55, 99};

	// this can be reduced to following
	int[] numbers3 = {42, 55, 99};  // also called anonymous array because you don't specify type or size

	// all valid examples of various ways of creating an array all doing the exact same thing.  Most people use the 1st one.
	int[] numAnimals;
	int [] numAnimals2;
	int numAnimals3[];
	int numAnimals4 [];

	// multiple "Arrays" in declarations
	int[] ids, types;  // two variables that are int arrays
	int ids2[], types2;  // two variables - ids2 is an int array and types2 is an int
}
