package com.hcl.collections;
@FunctionalInterface
interface ICToF {
	Double calc(double c);
}
public class Lambda3 {
	public static void main(String[] args) {
		ICToF c1 = (c) -> {
			double f = ((9*c)/5) + 32;
			return f;
		};
		ICToF k1 = (c) -> {
			double k = c+273;
			return k;
		};
		System.out.println(c1.calc(37));
		System.out.println(k1.calc(37));
	}

}
