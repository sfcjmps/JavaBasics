package com.hcl.boxing;

public class TimeZone {
	int hrs,min;
	public TimeZone() {
	
	}
	public TimeZone(int hrs, int min) {
		this.hrs = hrs;
		this.min = min;
	}
	public TimeZone add(TimeZone t1,TimeZone t2){
		TimeZone t3=new TimeZone();
		t3.hrs=t1.hrs+t2.hrs;
		t3.min=t1.min+t2.min;
		if(t3.min>=60){
			t3.hrs++;
			t3.min=t3.min%60;
		}
		return t3;
	}
	@Override
	public String toString() {
		return "TimeZone [hrs=" + hrs + ", min=" + min + "]";
	}
	public static void main(String[] args) {
		TimeZone t1=new TimeZone(3,40);
		TimeZone t2=new TimeZone(2,35);
		TimeZone t3=new TimeZone().add(t1, t2);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
		
		
		
	}
	
	
	

}
