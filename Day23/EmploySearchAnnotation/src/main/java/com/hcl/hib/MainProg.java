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
		System.out.println("Enter Employ Number : ");
		int empno = sc.nextInt();
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Query q = s.createQuery("from EmploySearch where empno = " + empno);
		List<EmploySearch> lst = q.list();
		for (Object ob : lst) {
			EmploySearch e = (EmploySearch)ob;
			System.out.println("Employ No : " + e.getEmpno());
			System.out.println("Employ Name : " + e.getName());
			System.out.println("Employ Department : " + e.getDept());
			System.out.println("Employ Designation : " + e.getDesig());
			System.out.println("Employ Salary : " + e.getBasic());
			System.out.println();
		}
		
	}
}
