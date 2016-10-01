package com.jashepherd.studies.java.ocajavase8studyguide.ch04.e23_lambda_experiments;

interface Executable {
	void execute();
}

interface Executable2 {
	int execute();
}

interface Executable3 {
	int execute(int a);
}

class Runner {
	public void run(Executable e) {
		System.out.println("Executing code block ...");
		e.execute();
	}
}

class Runner2 {
	public void run(Executable2 e) {
		System.out.println("Executing code block ...");
		int value = e.execute();
		System.out.println("Return value is " + value);
	}
}

class Runner3 {
	public void run(Executable3 e) {
		System.out.println("Executing code block ...");
		int value = e.execute(12);
		System.out.println("Return value is " + value);
	}
}

public class LambdaExperiment1 {

	public static void main(String[] args) {

		// old ways
		Runner runner = new Runner();
		runner.run(new Executable() {
			public void execute() {
				System.out.println("Hello there.");
			}
		});

		Runner2 runner2 = new Runner2();
		runner2.run(new Executable2() {
			public int execute() {
				System.out.println("Hello there.");
				return 7;
			}
		});

		Runner3 runner3 = new Runner3();
		runner3.run(new Executable3() {
			public int execute(int a) {
				System.out.println("Hello there.");
				return 7 + a;
			}
		});

		System.out.println("=========================");

		// new lambda ways
		runner.run(() -> System.out.println("Hello there."));

		System.out.println("=========================");

		runner.run(() -> {
			System.out.println("This is code passed in a lambda expression.");
			System.out.println("Hello there.");
		});

		System.out.println("=========================");

		runner2.run(() -> {
			System.out.println("This is code passed in a lambda expression.");
			System.out.println("Hello there.");
			return 8;
		});

		runner2.run(() -> {
			return 8;
		});

		runner2.run(() -> 8);

		System.out.println("=========================");

		runner3.run(a -> 8 + a);

	}

}
