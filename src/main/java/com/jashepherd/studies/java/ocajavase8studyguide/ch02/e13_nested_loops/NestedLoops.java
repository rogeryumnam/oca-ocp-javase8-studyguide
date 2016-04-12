package com.jashepherd.studies.java.ocajavase8studyguide.ch02.e13_nested_loops;

/**
 * Chapter 2: Operators and Statements<br/>
 * Understanding Advanced Flow Control<br/>
 * Nested Loops - page 87
 */
public class NestedLoops {
	public static void main(String... args) {
		int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
		for(int[] mySimpleArray : myComplexArray) {
			for(int i=0; i<mySimpleArray.length; i++) {
				System.out.print(mySimpleArray[i]+"\t");
			}
			System.out.println();
		}

		int x = 20;
		while(x>0) {
			do {
				x -= 2;
			} while (x>5);
			x--;
			System.out.print(x+"\t");
		}
	}
}
