package com.hcl.boxing;

public class Studentsearch {
	public Student show(int sno){
		Student obj=null;
		if(sno==1){
			obj=new Student();
			obj.sno=123;
			obj.name="sai";
			obj.city="delhi";
			obj.cgp=8.6;
		}
		if(sno==2){
			obj=new Student();
			obj.sno=124;
			obj.name="kumar";
			obj.city="delhi";
			obj.cgp=7.8;
		}
		return obj;
	}
	public static void main(String[] args) {
		Studentsearch obj1=new Studentsearch();
		Student res=obj1.show(5);
		if(res!=null){
			System.out.println(res);
		}else{
			System.out.println("student not found");
		}
	}

}
