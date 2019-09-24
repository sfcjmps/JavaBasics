package com.hcl.jason;

import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JasonArray1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JSONArray arr = new JSONArray();
		for (int i = 0; i < 3; i++) {
			JSONObject object = new JSONObject();
			object.put("Name", sc.nextLine());
			object.put("age", new Integer(Integer.parseInt(sc.nextLine())));
			object.put("salary", new Integer(Integer.parseInt(sc.nextLine())));
			arr.add(object);
		}
		System.out.println(arr);
	}
}
