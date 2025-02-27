package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class LambdaFilterDemo {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "samsung A5", 17000));
		list.add(new Product(2, "Iphone 6s", 65000));
		list.add(new Product(3, "Sony xperia",25000));
		list.add(new Product(3, "Nokia Lumia",15000));
		list.add(new Product(3, "Redmi 4",26000));
		list.add(new Product(3, "Lenovo vibe",19000));
		
		list.stream().filter(p -> p.price >= 20000).forEach(x -> {
			System.out.println(x);
		});
		System.out.println("Nmaes starting with s");
		list.stream().filter(p -> p.name.startsWith("s")).forEach(x -> {
			System.out.println(x);
		});
		Product maxP = list.stream().max((p1,p2) -> p1.price >= p2.price ? 1 : -1).get();
		System.out.println("max price record " + maxP);
		
		Product minP = list.stream().min((p1,p2) -> p1.price >= p2.price ? 1 : -1).get();
		System.out.println("min price is " + minP);
	}
}
