package com.jashepherd.studies.java.ocajavase8.ch02_operators_statements.e14_labels;

/**
 * Chapter 2: Operators and Statements<br/>
 * Understanding Advanced Flow Control<br/>
 * Adding Optional Labels - pages 87-88
 * <p>
 * In this program the labels are shown but not used
 */
public class Labels {
	static public void main(String args[]) {
		int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
		OUTER_LOOP: for(int[] mySimpleArray : myComplexArray) {
			INNER_LOOP: for(int i=0; i<mySimpleArray.length; i++) {
				System.out.print(mySimpleArray[i]+"\t");
			}
			System.out.println();
		}
	}
}
