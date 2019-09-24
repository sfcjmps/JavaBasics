package com.hcl.functionsdemo;

import java.util.function.Consumer;

public class MyInterfaceMain {
	public static void main(String[] args) {
		MyInterface myInterface = (a) -> {System.out.println(a);};
		myInterface.someMethod("HCL");
		
		MyInterface myInterface2 = System.out::println;
		myInterface2.someMethod("JAVA");
		
		Consumer<String> consumer = System.out::println;
		consumer.accept("Bye");
		
	}
}
