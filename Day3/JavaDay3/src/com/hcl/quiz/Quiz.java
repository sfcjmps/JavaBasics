package com.hcl.quiz;
class Employ{
	String name;
	public Employ(String name){
		this.name=name;
	}
	@Override
	public String toString() {
		return "Employ [name=" + name + "]";
	}
}
class HrEmploy extends Employ{
	public HrEmploy(String name){
		super(name);
	}
}
class JavaEmploy extends Employ{
	public JavaEmploy(String name){
		super(name);
	}
}
public class Quiz {
	public static void main(String[] args) {
		Employ[] arrEmploy=new Employ[]{
				new HrEmploy("Sagar"),
				new JavaEmploy("Niveditha"),
				new HrEmploy("Lakshmi"),
				new JavaEmploy("Gupta"),
				new HrEmploy("Pramod"),
				new JavaEmploy("Sakshi"),
				new HrEmploy("Aakash"),
				new JavaEmploy("Shafiq"),
				new JavaEmploy("Sajid"),
				new JavaEmploy("Praveen"),
				new HrEmploy("Vahid"),
		};
//		for (Employ employ : arrEmploy) {
//			if((employ.getClass().getSimpleName()).equals("JavaEmploy")){
//				System.out.println(employ);
//			}
//		}
		for(Employ employ:arrEmploy){
			if(employ instanceof JavaEmploy){
			System.out.println(employ);
			}
		}
	}
}
