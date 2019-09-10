package com.hcl.hib;

import java.util.Iterator;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainPog {
	public static void main(String[] args) {
		EmployInsert e = new EmployInsert();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ Name : ");
		e.setName(sc.nextLine());
		System.out.println("Enter Employ Department : ");
		e.setDept(sc.nextLine());
		System.out.println("Enter Employ Designation : ");
		e.setDesig(sc.nextLine());
		System.out.println("Enter Employ Salary");
		e.setBasic(Integer.parseInt(sc.nextLine()));
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		int empno = 0;
		Query q = s.createQuery("Select max(empno) from EmployInsert");
		for(Iterator it = q.iterate();it.hasNext();) {
			empno = (Integer)it.next();
		}
		empno++;
		System.out.println(empno);
		e.setEmpno(empno);
		//Query w = s.createQuery("insert into EmployInsert values(?,?,?,?,?)");
		Transaction t = s.beginTransaction();
		s.save(e);
		t.commit();
		System.out.println("Record Inserted....");
	}
}
