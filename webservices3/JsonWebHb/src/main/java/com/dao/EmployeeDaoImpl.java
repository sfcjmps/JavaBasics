package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public List<Employee> getAllEmployees() {
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Query q = s.createQuery("from Employee");
		List<Employee> employees = q.list();
		return employees;
	}

}
