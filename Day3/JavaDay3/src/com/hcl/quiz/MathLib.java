package com.hcl.quiz;

public class MathLib {
	public void power(int a,int b){
		int sum=1;
		for (int i=1;i<=b;i++) {
			sum=sum*a;		}
		System.out.println(sum);
	}
	public void max(int a,int b){
		if(a>b){
			System.out.println(a + "is max");
		}else{
			System.out.println(b + "is max");
		}
	}
		public void Sqrt(int a){
			double t;
			double squareRoot = a/2;
			do {
				t = squareRoot;
				squareRoot = (t + (a/t)) / 2;
			} while ((t - squareRoot) != 0);
			System.out.println(t);
		}
	public static void main(String[] args) {
		new MathLib().power(3,3);
		new MathLib().max(6,3);
		new MathLib().Sqrt(2);	
	}
}
