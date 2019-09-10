package com.hcl.java;

public class FactN0ew {
	public void check(int n){
		int f=1;
		for(int i=n;i>=1;i--){
			f=f*i;
		}
		System.out.println("factorial is"+f);
	}
	public static void main(String[] args) {
		int n=5;
		new FactN0ew().check(n);
	}

}
