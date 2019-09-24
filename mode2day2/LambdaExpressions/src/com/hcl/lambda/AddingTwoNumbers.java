package com.hcl.lambda;

public class AddingTwoNumbers {
	public static void main(String[] args) {
		AddTwoNums add = (var1,var2) -> (var1 + var2);
		int res = add.add(10, 30);
		System.out.println(res);
		
		AddTwoNums add1 = (var1,var2) -> {return(var1 + var2);};
		int res1 = add.add(10, 20);
		System.out.println(res1);
	}
}
