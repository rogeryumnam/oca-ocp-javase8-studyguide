package com.jashepherd.studies.java.ocajavase8studyguide.ch02_operators_statements.e11_while_statements;

/**
 * Chapter 2: Operators and Statements<br/>
 * Understanding Java Statements<br/>
 * The while Statement - pages 76-78
 */
public class A1WhileStatements {

	int roomInBelly = 5;

	static public void main(String[] args) {
		A1WhileStatements ws = new A1WhileStatements();
		ws.eatCheese(6);

		// watch out for infinite loops
		int x = 2;
		int y = 5;
		while (x < 10) {
			y++;
		}
	}

	public void eatCheese(int bitesOfCheese) {
		while (bitesOfCheese > 0 && roomInBelly > 0) {
			bitesOfCheese--;
			roomInBelly--;
		}
		System.out.println(bitesOfCheese + " pieces of cheese left");
	}
}
