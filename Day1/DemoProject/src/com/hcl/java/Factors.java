package com.hcl.java;

public class Factors {
	public void check(int n){
		for(int i=1;i<=n;i++){
			if(n%i==0){
				System.out.println("Factor"+i);	
			}
		}
	}
	public static void main(String[] args) {
		int n=10;
		new Factors().check(n);
	}
}
