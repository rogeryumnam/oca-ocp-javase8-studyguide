package com.jashepherd.studies.java.ocajavase8studyguide.ch04.e20_creating_immutable_classes;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Encapsulating Data<br>
 * Return Types in Immutable Classes - Defensive Copy - page 208
 */
public class E3DefensiveCopy {
	private StringBuilder builder;
	public E3DefensiveCopy(StringBuilder b) {
		builder = new StringBuilder(b);
	}
	public StringBuilder getBuilder() {
		return new StringBuilder(builder);
	}
}

/**
 * output is:<br>
 * initial
 */
class TestE3DefensiveCopy {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("initial");
		E3DefensiveCopy notAProblem = new E3DefensiveCopy(sb);
		sb.append(" added");
		StringBuilder gotBuilder = notAProblem.getBuilder();
		gotBuilder.append(" more");
		System.out.println(notAProblem.getBuilder());
	}
}
