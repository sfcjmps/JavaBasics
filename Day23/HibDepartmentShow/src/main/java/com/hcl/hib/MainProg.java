package com.hcl.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainProg {
	public static void main(String[] args) {
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Query q = s.createQuery("from Department");
		List<Department> lst = q.list();
		for (Department department : lst) {
			System.out.println("Department No : " + department.getDeptno());
			System.out.println("Department Name : " + department.getDname());
			System.out.println("Department Loc : " + department.getLoc());
			System.out.println("Department Head : " + department.getHead());
			System.out.println("*****************************************");
		}
	}
}
