package com.hcl.java;

class Test{
	public void sayHello(){
		System.out.println("Hello From HCL...");
	}
	private void venue(){
		System.out.println("At BTM Layout...");
	}
	void Trainer(){
		System.out.println("Trainer Prasanna...");
	}
}
public class Demo {
	public static void main(String[] args) {
		Test obj=new Test();
		obj.sayHello();
		obj.Trainer();
	}
}
