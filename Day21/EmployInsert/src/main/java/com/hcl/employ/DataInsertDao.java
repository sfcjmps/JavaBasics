package com.hcl.employ;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

public class DataInsertDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	 public void insertEmploy() {
		 int empno;
		 String name;
		 String dept;
		 String desig;
		 int basic;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Employ No : ");
		 empno = Integer.parseInt(sc.nextLine());
		 System.out.println("Enter Employ Name : ");
		 name = sc.nextLine();
		 System.out.println("Enter Department : ");
		 dept = sc.nextLine();
		 System.out.println("Enter Designation : ");
		 desig = sc.nextLine();
		 System.out.println("Enter Salary : ");
		 basic = Integer.parseInt(sc.nextLine());
		 String cmd = "insert into employ values(?,?,?,?,?)";
		 jdbcTemplate.update(cmd,new Object[] {empno,name,dept,desig,basic});
		 System.out.println("Employ Inserted...");
	 }
}
