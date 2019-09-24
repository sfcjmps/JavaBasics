package com.hcl.lambda;

public class WithoutLambdaExpression{
	public static void main(String[] args) {
		MyInterface myInterface = new MyInterface() {
			
			@Override
			public void sayMessage() {
				System.out.println("Welcome To MyInterface");
			}
		};
		myInterface.sayMessage();
	}
}
