package com.jashepherd.studies.java.ocajavase8.ch01_java_building_blocks.s04_creating_objects.e19_instance_initializer_blocks;

/**
 * Chapter 1: Java Building Blocks<br/>
 * Creating Objects<br/>
 * Instance Initializer Blocks - page 18
 * <p>
 * The code between the braces is called a code block.
 * <p>
 * Sometimes code blocks are inside a method. These are run when the method is called.
 * Other times, code blocks appear outside a method. These are called instance initializers.
 * <p>
 * In this class there are three code blocks and one instance initializer. Counting code blocks is easy:
 * you just count the number of pairs of braces. If there aren't the same number of open ({)
 * and close (}) braces, the code doesn't compile. It doesn't matter that one set of braces is
 * inside the main() method, it still counts.
 * <p>
 * When counting instance initializers, keep in mind that it does matter whether the braces
 * are inside a method. There's only one pair of braces outside a method. Line 26 is an instance
 * initializer.
 */
public class InstanceInitializerBlocks {
	public static void main(String[] args) {
		{ System.out.println("Feathers"); }
	}
	{ System.out.println("Snowy"); }
}
