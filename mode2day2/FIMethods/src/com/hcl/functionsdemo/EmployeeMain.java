package com.hcl.functionsdemo;

public class EmployeeMain {
	public static void main(String[] args) {
		EmployeeInterface employeeInterface = Employee::new;
		Employee employee = employeeInterface.show(1, "sai");
		System.out.println(employee.getEmpNo());
		System.out.println(employee.getName());
		
		
		
		EmployeeInterface1 employeeInterface1 = Employee::new;
		EmployeeInterface2 employeeInterface2 = Employee::new;
		Employee employee2 = employeeInterface1.show(1);
		Employee employee3 = employeeInterface2.show("sai");
		System.out.println(employee2.getEmpNo());
		System.out.println(employee3.getName());
	}
}
