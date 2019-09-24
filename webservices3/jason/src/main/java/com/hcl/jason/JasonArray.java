package com.hcl.jason;

import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JasonArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JSONObject object = new JSONObject();
		for (int i = 0; i < 3; i++) {
			JSONArray arr = new JSONArray();  
			  arr.add(sc.nextLine());    
			  arr.add(new Integer(Integer.parseInt(sc.nextLine())));    
			  arr.add(new Double(Double.parseDouble(sc.nextLine())));
			  object.put(i, arr);
		}
		System.out.println(object);
	}
}
