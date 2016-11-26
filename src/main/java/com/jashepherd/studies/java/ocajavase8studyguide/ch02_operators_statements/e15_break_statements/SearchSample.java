package com.jashepherd.studies.java.ocajavase8studyguide.ch02_operators_statements.e15_break_statements;

/**
 * Chapter 2: Operators and Statements<br/>
 * Understanding Advanced Flow Control<br/>
 * The break Statement - pages 88-90
 * <p>
 * Break statement example with optional labels
 */
public class SearchSample {
	public static void main(String[] args) {
		int[][] list = {{1,13,5},{1,2,5},{2,7,2}};
		int searchValue = 2;
		int positionX = -1;
		int positionY = -1;
		PARENT_LOOP: for(int i=0; i<list.length; i++) {
			for(int j=0; j<list[i].length; j++) {
				if(list[i][j]==searchValue) {
					positionX = i;
					positionY = j;
					break PARENT_LOOP;
				}
			}
		}
		if(positionX==-1 || positionY==-1) {
			System.out.println("Value "+searchValue+" not found");
		} else {
			System.out.println("Value "+searchValue+" found at: " +
					"("+positionX+","+positionY+")");
		}

		SearchSample ss = new SearchSample();
		ss.search2();
		ss.search3();
	}

	private void search2() {
		int[][] list = {{1,13,5},{1,2,5},{2,7,2}};
		int searchValue = 2;
		int positionX = -1;
		int positionY = -1;
		PARENT_LOOP: for(int i=0; i<list.length; i++) {
			for(int j=0; j<list[i].length; j++) {
				if(list[i][j]==searchValue) {
					positionX = i;
					positionY = j;
					break;
				}
			}
		}
		if(positionX==-1 || positionY==-1) {
			System.out.println("Value "+searchValue+" not found");
		} else {
			System.out.println("Value "+searchValue+" found at: " +
					"("+positionX+","+positionY+")");
		}
	}

	private void search3() {
		int[][] list = {{1,13,5},{1,2,5},{2,7,2}};
		int searchValue = 2;
		int positionX = -1;
		int positionY = -1;
		PARENT_LOOP: for(int i=0; i<list.length; i++) {
			for(int j=0; j<list[i].length; j++) {
				if(list[i][j]==searchValue) {
					positionX = i;
					positionY = j;
				}
			}
		}
		if(positionX==-1 || positionY==-1) {
			System.out.println("Value "+searchValue+" not found");
		} else {
			System.out.println("Value "+searchValue+" found at: " +
					"("+positionX+","+positionY+")");
		}
	}
}
