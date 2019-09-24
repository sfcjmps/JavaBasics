package com.hcl.lambda;

public class MyMax1 {
	public static void main(String[] args) {
		MyMax myMax = (var1,var2) -> {int max = var1>var2?var1:var2;return max;};
		int res = myMax.myMax(10, 565);
		System.out.println(res);
	}
}
