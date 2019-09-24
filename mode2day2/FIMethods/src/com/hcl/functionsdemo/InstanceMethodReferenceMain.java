package com.hcl.functionsdemo;

public class InstanceMethodReferenceMain {
	public static void main(String[] args) {
		InstanceInterface instanceInterface = () -> {System.out.println("HAI");};
		instanceInterface.myInterface();
		
		InstanceMethodReference instanceMethodReference = new InstanceMethodReference();
		InstanceInterface instanceInterface2 = instanceMethodReference::saySomething;
		instanceMethodReference.saySomething();
		instanceInterface2.myInterface();
		
		
		
	}
}
