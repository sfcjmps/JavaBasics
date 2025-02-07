package com.hcl.collections;




public class Lambda2 {
	public static void main(String[] args) {
		IHello h1 = () -> {
			System.out.println("Hello from Rishab");
		};
		IHello h2 = () -> {
			System.out.println("Hello from Lakshmi");
		};
		IHello h3 = () -> {
			System.out.println("Hello from Laksh");
		};
		IHello[] arr = new IHello[]{ h1,h2,h3};
		for (IHello iHello : arr) {
			iHello.sayhello();
		}
		
//		h1.sayhello();
//		h2.sayhello();
//		h3.sayhello();
		
		ICalc ad = (a,b) -> {
			System.out.println("Sum");
			return a+b;
		};
		
		ICalc ad1 = (a,b) -> (a+b);
		ICalc ad2 = (a,b) -> (a*b);
		System.out.println(ad1.calc(12, 5));
		System.out.println(ad.calc(12, 5));
		System.out.println(ad2.calc(4, 5));
		
	}
}
