package com.hcl.lambda;

import java.util.Scanner;

public class WithLambdaExpression {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg = sc.nextLine();
		MyInterface1 myInterface = (String msg1) -> {System.out.println(msg);};
		myInterface.sayMessage1(msg);
	}
}
