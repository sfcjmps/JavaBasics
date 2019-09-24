package com.hcl.java8streams.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.java8streams.model.Employee;
import com.hcl.java8streams.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService EmployeeService;
	
	@RequestMapping(value = "/")
	public ModelAndView employeeList(ModelAndView model) {
		List<Employee> employeeList = EmployeeService.getAllEmployees();
		model.addObject("employeeList",employeeList);
		model.setViewName("employeehome");
		return model;
	}
	
	@RequestMapping(value = "/searchemployee", method = RequestMethod.POST)
	public ModelAndView employee(ModelAndView model, HttpServletRequest req) {
		List<Employee> lst = EmployeeService.getEmployee(req.getParameter("empname"),req.getParameter("band"),req.getParameter("salary"));
		model.addObject("employeeList",lst);
		model.setViewName("employeehome");
		return model;
	}
}
