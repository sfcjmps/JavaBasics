package com.hcl.hib;

import java.text.Annotation;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainProg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employ e = new Employ();
		System.out.println("Enter Employ No : ");
		e.setEmpno(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Employ Name : ");
		e.setName(sc.nextLine());
		System.out.println("Enter Employ Department : ");
		e.setDept(sc.nextLine());
		System.out.println("Enter Employ Designation : ");
		e.setDesig(sc.nextLine());
		System.out.println("Enter Employ Salary : ");
		e.setBasic(Integer.parseInt(sc.nextLine()));
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(e);
		t.commit();
		System.out.println("Record Inserted..");
	}
}
