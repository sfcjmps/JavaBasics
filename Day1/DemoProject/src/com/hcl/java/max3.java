package com.hcl.java;

public class max3 {
	public void check(int a,int b,int c){
		if(a>b && b>c){
			System.out.println("a is max");
		}else if(b>c){
			System.out.println("b is max");
		}else{
			System.out.println("c is max");
		}
		
	}
	public static void main(String[] args) {
		int a=20,b=6,c=4;
		new max3().check(a, b, c);
	}

}
