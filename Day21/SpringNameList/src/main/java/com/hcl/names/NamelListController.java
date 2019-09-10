package com.hcl.names;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NamelListController {
	@RequestMapping("/names")
	public ModelAndView nameList() {
		List<String> lst = new ArrayList<String>();
		lst.add("Sai");
		lst.add("Kumar");
		lst.add("Yash");
		lst.add("Laksh");
		lst.add("Uttam");
		return new ModelAndView("ShowPage" , "lists", lst);
	}
}
