package com.hcl.lambda;

public class MultipleMethods{
	public static void main(String[] args) {
		String ms = "hai";
		MultipleMethodsInheritance m = (ms1) -> {System.out.println(ms);return ms1;};
		m.sayHello(ms);
		
		System.out.println(MultipleMethodsInheritance.add(10, 20));
		
		System.out.println(m.defaultMethod(20));
		
//		MultipleMethodsInheritance m2 = (ms1) -> {System.out.println(ms);return ms1;};
		System.out.println((m.sayHello(ms)).equals("hai"));
		
}}
