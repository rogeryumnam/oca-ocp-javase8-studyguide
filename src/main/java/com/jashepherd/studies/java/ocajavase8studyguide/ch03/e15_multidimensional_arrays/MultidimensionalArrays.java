package com.jashepherd.studies.java.ocajavase8studyguide.ch03.e15_multidimensional_arrays;

/**
 * Chapter 3: Core Java APIs<br>
 * Understanding Java Arrays<br>
 * Multidimensional Arrays - pages 126-129
 * <p>
 * Arrays containing other arrays
 */
public class MultidimensionalArrays {

	public static void main(String... args) {

		// creating multidimensional arrays
		int[][] vars1;   // 2D array
		int vars2 [][];  // 2D array
		int[] vars3[];   // 2D array
		int[] vars4 [], space [][];  // a 2D and a 3D array

		// you can specify the size of your multidimensional array
		String[][] rectangle = new String[3][2];

		// set one of these values
		rectangle[0][1] = "set";

		// elements in the second level are all different sizes aka asymmetric multidimensional array
		int[][] differentSizes = {{1, 4}, {3}, {9, 8, 7}};

		// another way to create an asymmetric multidimensional array
		int [][] args1 = new int[4][];  // when creating multidimensional arrays, the first(outermost) array must have a size
		args1[0] = new int[5];
		args1[1] = new int[3];

		// using multidimensional arrays
		// looping through them
		int[][] twoD = new int[3][2];
		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++)
				System.out.print(twoD[i][j] + " "); // print element
			System.out.println(); // time for a new row
		}

		// looping multidimensional array this time with enhanced for (for-each)
		for (int[] outer : twoD) {
			for (int num : outer)
				System.out.print(num + " ");
			System.out.println();
		}
	}
}
