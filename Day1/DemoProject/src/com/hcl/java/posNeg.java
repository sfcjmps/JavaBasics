package com.hcl.java;

public class posNeg {
	public void check(int n){
		if(n>=0){
			System.out.println("Positive no...");
		}else{
			System.out.println("Negative no...");
		}
	}
	public static void main(String[] args) {
		int n=-12;
		posNeg obj=new posNeg();
		obj.check(n);
	}

}
