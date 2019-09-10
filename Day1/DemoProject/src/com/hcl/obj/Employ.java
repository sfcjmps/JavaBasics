package com.hcl.obj;

public class Employ {
	int empno;
	String name;
	int basic;
	
	public Employ[] showEmploy(){
		Employ[] arrEmploy=new Employ[3];
		
		arrEmploy[0]=new Employ();
		arrEmploy[0].empno=1;
		arrEmploy[0].name="priyaDarshini";
		arrEmploy[0].basic=83444;
		
		arrEmploy[1]=new Employ();
		arrEmploy[1].empno=2;
		arrEmploy[1].name="Anubhav";
		arrEmploy[1].basic=84546;
		
		arrEmploy[2]=new Employ();
		arrEmploy[2].empno=2;
		arrEmploy[2].name="raghu";
		arrEmploy[2].basic=25655;
		
		return arrEmploy;
	}
	public static void main(String[] args) {
		Employ[] result=new Employ().showEmploy();
		for (Employ e: result) {
			System.out.println(e.empno + " " + e.name + " " + e.basic);
		}	
	}
}
