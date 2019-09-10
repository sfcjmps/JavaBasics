package com.hcl.hib;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainProg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Department No : ");
		int deptno = sc.nextInt();
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Query q = s.createQuery("from Department where deptno = " + deptno);
		List<Department> lst = q.list();
		Department d = lst.get(0);
		if (d != null) {
			System.out.println("Department No : " + d.getDeptno());
			System.out.println("Department Name : " + d.getDname());
			System.out.println("Department Location : " + d.getLoc());
			System.out.println("Department Head : " + d.getHead());
		} else {
			System.out.println("Record Not Found..");
		}
	}
}
