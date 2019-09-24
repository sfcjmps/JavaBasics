package com.hcl.java8streams.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.java8streams.model.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	
	@Autowired
	private SessionFactory SessionFactory;
	
	@Override
	public List<Employee> getAllEmployees() {
		return SessionFactory.getCurrentSession().createQuery("from Employee").list();
	}

	@Override
	public List<Employee> getEmployee(String empname,char band,String salary) {
		List<Employee> list = SessionFactory.getCurrentSession().createQuery("from Employee").list();
		list = list.stream().filter((a) -> a.getempname().toLowerCase().startsWith(empname.toLowerCase())).collect(Collectors.toList());
		if (band != ' ') {
			list = list.stream().filter((b) ->b.getBand()== band).collect(Collectors.toList());
		}
		if (salary != " ") {
			list = list.stream().filter(c -> c.getSalary() >= Integer.parseInt(salary)).collect(Collectors.toList());
		}
		return list;
	}
}
