package com.hcl.student.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.student.model.Student;
import com.hcl.student.service.StudentService;
@Controller
public class StudentController {
	@Autowired
	StudentService s;
	@RequestMapping(value = "/getStudent", method = RequestMethod.POST)
	public String getStudent(int Rollnum, Model model) {
		return "getStudent";
	}
	@RequestMapping(value = "addStudent", method = RequestMethod.POST)
	public ModelAndView addStudent(Student st, Model model) {
		boolean res=s.addStudent(st);
		if (res==true) {
			return new ModelAndView("home","result","Added Successfully");
		} else {
			return new ModelAndView("home","result","Not Added");
		}
	}
	@RequestMapping(value = "/updateStudent", method = RequestMethod.POST)
	public String updateStudent(Student st, Model model) {
		return "updateStudent";
	}
}
