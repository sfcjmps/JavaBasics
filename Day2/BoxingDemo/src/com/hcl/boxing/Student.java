package com.hcl.boxing;

public class Student {
	int sno;
	String name;
	String city;
	double cgp;
	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		long temp;
//		temp = Double.doubleToLongBits(cgp);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		result = prime * result + ((city == null) ? 0 : city.hashCode());
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + sno;
//		return result;
//	}

	@Override
	public boolean equals(Object obj) {
		Student s=(Student)obj;
		if(s.city.equals(city)&&s.cgp==cgp){
			return true;
		} else{
			return false;
		}
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", city=" + city + ", cgp=" + cgp + "]";
	}
	

}
