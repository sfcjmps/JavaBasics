package com.hcl.streams;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo5 {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(10,"Apple",1010f,'E'));
		list.add(new Employee(20,"Banana",2020f,'M'));
		list.add(new Employee(30,"carrot",3030f,'M'));
		list.add(new Employee(40,"Dates",4040f,'C'));
		list.add(new Employee(50,"Apricot",5050f,'M'));
		long total = list.stream().count();
		System.out.println(total);
		
		list.stream().filter((var) -> var.getSalary() > 1000 && var.getSalary() < 3500).filter(emp -> emp.getBand()=='M').forEach((var1) -> System.out.println(var1.getEmpName()));
	    //System.out.println(empsalGT3000);
	}
}
