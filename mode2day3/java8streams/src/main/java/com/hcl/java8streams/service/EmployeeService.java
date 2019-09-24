package com.hcl.java8streams.service;

import com.hcl.java8streams.model.Employee;

import java.util.List;

public interface EmployeeService {
	public List<Employee> getAllEmployees();
	
	public List<Employee> getEmployee(String empname,String band,String salary);
}
