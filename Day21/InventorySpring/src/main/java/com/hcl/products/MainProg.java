package com.hcl.products;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("product.xml");
		OrderLogic l = (OrderLogic)ctx.getBean("orderlogic");
		l.display();
	}
}
