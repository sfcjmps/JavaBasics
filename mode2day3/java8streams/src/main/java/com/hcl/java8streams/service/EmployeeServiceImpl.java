package com.hcl.java8streams.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.java8streams.dao.EmployeeDao;
import com.hcl.java8streams.model.Employee;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao EmployeeDao;
	
	@Override
	@Transactional
	public List<Employee> getAllEmployees() {
		return EmployeeDao.getAllEmployees();
	}

	@Override
	public List<Employee> getEmployee(String empname,String band,String salary) {
		if (band != "" && salary != "") {
		return EmployeeDao.getEmployee(empname,band.charAt(0),salary);
		} else if (salary != ""){
			return EmployeeDao.getEmployee(empname, ' ',salary);
		} else if (band != ""){
			return EmployeeDao.getEmployee(empname, band.charAt(0), " ");
		} else {
			return EmployeeDao.getEmployee(empname, ' ', " ");
		}
	}

}
