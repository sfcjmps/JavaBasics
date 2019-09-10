package com.hcl.java;

public class ctoK {
	public void calc(double c){
		double k;
		k=c+273.15;
		System.out.println("kelvin is" + k);
	}
	public static void main(String[] args) {
		double c=37;
		ctoK obj=new ctoK();
		obj.calc(c);
		
	}

}
