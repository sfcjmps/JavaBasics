package com.hcl.employ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("employshow.xml");
		DataQueryDao d = (DataQueryDao)ctx.getBean("myDao");
		d.searchEmploy();
	}
}
