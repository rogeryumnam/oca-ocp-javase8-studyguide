package com.jashepherd.studies.java.ocajavase8studyguide.ch04_methods_encapsulation.e20_creating_immutable_classes;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Encapsulating Data<br>
 * Return Types in Immutable Classes - pages 207-208
 */
/* When you are writing an immutable class, be careful about the return types. On the
 * surface, this class appears to be immutable since there is no setter: */
public class E2NotImmutable {
	private StringBuilder builder;
	public E2NotImmutable(StringBuilder b) {
		builder = b;
	}
	public StringBuilder getBuilder() {
		return builder;
	}
}

/**
 * output is:<br>
 * initial added more
 */
class TestE2NotImmutable {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("initial");
		E2NotImmutable problem = new E2NotImmutable(sb);
		sb.append(" added");
		StringBuilder gotBuilder = problem.getBuilder();
		gotBuilder.append(" more");
		System.out.println(problem.getBuilder());  // initial added more
	}
}
