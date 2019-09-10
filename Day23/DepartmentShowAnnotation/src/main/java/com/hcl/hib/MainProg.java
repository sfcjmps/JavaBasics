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
		for (Object ob : lst) {
			Department d = (Department)ob;
			System.out.println("Department No : " + d.getDeptno());
			System.out.println("Department Name : " + d.getDname());
			System.out.println("Department Location : " + d.getLoc());
			System.out.println("Department Head : " + d.getHead());
			System.out.println();
		}
	}
}
