package com.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.model.Employee;

@Path("/employees")
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeServiceImpl implements EmployeeService{
	EmployeeDao employeeDao = new EmployeeDaoImpl();
	@Override
	@GET
	@Path("/get")
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}
}
