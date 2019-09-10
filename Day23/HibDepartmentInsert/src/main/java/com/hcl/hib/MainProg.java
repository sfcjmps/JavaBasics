package com.hcl.hib;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainProg {
	public static void main(String[] args) {
		Department d = new Department();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Department No : ");
		d.setDeptno(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Department Name : ");
		d.setDname(sc.nextLine());
		System.out.println("Enter Department Location : ");
		d.setLoc(sc.nextLine());
		System.out.println("Enter Department Head : ");
		d.setHead(sc.nextLine());
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(d);
		t.commit();
		System.out.println("Record Inerted....");
	}
}
