package com.hcl.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortStudent {
	public static void main(String[] args) {
//		Comparator<Student> d = new CityComparator(); 
		Comparator<Student> e = new CgpComparator();
		Set<Student> setstudent = new TreeSet<Student>(e);
		setstudent.add(new Student("Sai","Kumar","Delhi",7.8));
		setstudent.add(new Student("chopperla","yaswanth","Hyd",7.9));
		setstudent.add(new Student("Laksh","babbar","Chennai",6.3));
		setstudent.add(new Student("rishab","Kumar","Calcutta",8.3));
		setstudent.add(new Student("satya","sai","Kurnool",8.6));
		setstudent.add(new Student("uttam","sharma","Punjab",8.5));
		System.out.println("Student list is :");
		setstudent.forEach(System.out::println);
		
	}

}
