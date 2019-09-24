package com.hcl.model;

public class Employee {
	private long empno;
	private String name;
	private long salary;
	private String band;
	private String dateofjoin;
	
	public long getEmpno() {
		return empno;
	}
	public void setEmpno(long empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	public String getDateofjoin() {
		return dateofjoin;
	}
	public void setDateofjoin(String dateofjoin) {
		this.dateofjoin = dateofjoin;
	}
//	@Override
//	public String toString() {
//		return "Employee [empno=" + empno + ", name=" + name + ", salary=" + salary + ", band=" + band + ", dateofjoin="
//				+ dateofjoin + "]";
//	}
	
	
}
