package com.hcl.boxing;

public class Demo1 {
	public int sum(){
		return 5;
	}
	public int sum(int x){
		return x+5;
	}
	public int sum(int x,int y){
		return x+y;
	}
	public static void main(String[] args) {
		Demo1 obj=new Demo1();
		int res=obj.sum();
		System.out.println("sum is " +res);
		res=obj.sum(73);
		System.out.println("sum is " +res);
		res=obj.sum(2,4);
		System.out.println("sum is " +res);
		}
}
