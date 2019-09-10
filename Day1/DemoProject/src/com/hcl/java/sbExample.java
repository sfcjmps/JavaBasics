package com.hcl.java;

public class sbExample {
	public void show(int age,String name,String course,String city){
		
		StringBuilder sbError=new StringBuilder();
		boolean isvalid=true;
		/*validation for age*/
		if(age<=20){
			sbError.append("Age must be greater than 20" +"\r\n");
			isvalid=false;
		}
		if(name.indexOf(' ')==-1){
			sbError.append("Name contains both first name nad last name" +"\r\n");
			isvalid=false;
		}
		if(!course.equalsIgnoreCase("Java")){
			sbError.append("Only Java course allowed" +"\r\n");
			isvalid=false;
		}
		if(isvalid==true){
		System.out.println("Age "+age);
		System.out.println("Name "+name);
		System.out.println("Course "+course);
		System.out.println("City "+city);
		}else{
			System.out.println(sbError);
		}
	}

	public static void main(String[] args) {
		int age;
		String name;
		String course;
		String city;
		age=11;
		name="Ram";
		course="JAVA";
		city="Delhi";
		new sbExample().show(age,name,course,city);
	}
}
