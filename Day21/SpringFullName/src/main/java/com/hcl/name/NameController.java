package com.hcl.name;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class NameController {
	@RequestMapping("/Name")
	public ModelAndView name(HttpServletRequest req , HttpServletResponse res) {
		String fname = req.getParameter("firstName");
		String lname = req.getParameter("lastName");
		String result = fname + " " + lname;
		return new ModelAndView("Result" , "result" , result);
				
	}
}
