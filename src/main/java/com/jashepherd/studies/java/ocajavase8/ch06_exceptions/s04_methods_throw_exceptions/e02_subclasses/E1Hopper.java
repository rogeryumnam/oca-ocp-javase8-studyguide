package com.jashepherd.studies.java.ocajavase8.ch06_exceptions.s04_methods_throw_exceptions.e02_subclasses;

/**
 * Chapter 6: Exceptions<br>
 * Calling Methods That Throw Exceptions<br>
 * Subclasses - pages 319-321
 */
public class E1Hopper {
	public void hop() {}
}

class E1Bunny extends E1Hopper {
//	public void hop() throws CanNotHopException {}  // DOES NOT COMPILE - subclass cannot add new exceptions
}

class E2Hopper {
	public void hop() throws CanNotHopException {}
}

class E2Bunny extends E2Hopper {
	public void hop() {}  // allowed - subclass can declare fewer exceptions than superclass or interface
}

class E3Hopper {
	public void hop() throws Exception {}
}

class E3Bunny extends E3Hopper {
	public void hop() throws CanNotHopException {}  // allowed - subclass allowed to declare a subclass of parent's thrown exception
}


class E4Hopper {
	public void hop() {}
}

class E4Bunny extends E4Hopper {
	public void hop() throws IllegalStateException {}  // legal - runtime exceptions are allowed to be thrown even when not declared
}

class CanNotHopException extends Exception {}
