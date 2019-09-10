package com.hcl.java;
enum Test{
	A,B,X,Y,P,C,N;
	private Test(){
		System.out.println("HI");
	}
}
public class P13 {
	public static void main(String[] args) {
		Test t=Test.A;
	}

}
