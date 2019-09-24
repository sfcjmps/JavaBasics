package com.hcl.functionsdemo;

public class Employee {
	private int empNo;
	private String name;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empNo, String name) {
		super();
		this.empNo = empNo;
		this.name = name;
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

	public Employee(int empNo) {
		super();
		this.empNo = empNo;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
