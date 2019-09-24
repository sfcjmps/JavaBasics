package com.hcl.functionsdemo;

public interface MethodReferenceStatic {
	public String sayHello(Integer str);
	
	public static String someMethod(Integer num) {
		return "WELCOME STATIC : " + num;
	}
}
