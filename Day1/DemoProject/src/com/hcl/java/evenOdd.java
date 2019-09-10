package com.hcl.java;

public class evenOdd {
	public void check(int n){
		if(n%2==0){
			System.out.println("even no...");
		}else{
			System.out.println("odd no...");
		}
	}
	public static void main(String[] args) {
		int n=12;
		new evenOdd().check(n);
	}

}
