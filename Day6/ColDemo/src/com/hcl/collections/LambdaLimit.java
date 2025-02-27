package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class LambdaLimit {
	public static void main(String[] args) {
		List<Integer> lstdata = new ArrayList<Integer>();
		lstdata.add(new Integer(42));
		lstdata.add(new Integer(25));
		lstdata.add(new Integer(36));
		lstdata.add(new Integer(48));
		lstdata.add(new Integer(96));
		lstdata.add(new Integer(12));
		lstdata.stream().limit(3).forEach(p -> {
			System.out.println(p);
		});
		System.out.println("After skipping two records");
		lstdata.stream().skip(2).forEach(p -> {
			System.out.println(p);
		});
		System.out.println("Filter data");
		lstdata.stream().filter(p -> p > 15 ).forEach(x -> {
			System.out.println(x);
		});
		
	}

}
