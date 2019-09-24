package com.hcl.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class gfd {
public static void main(String[] args) {
	String name = "Sai";
	List<String> lst = Arrays.asList("sai","Srthf","Raghu");
	lst.stream().filter((a)->a.toLowerCase().startsWith("S".toLowerCase())).forEach(b->System.out.println(b));
//	System.out.println(name.toLowerCase());
}
}
