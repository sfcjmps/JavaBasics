package com.hcl.beans;

import java.util.List;

public class Faculty {
	private String fName;
	private List<Student> students;
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public void teaching() {
		System.out.println("Faculty : " + fName + " Sharing Lunch With The Following Students");
		for (Student student : students) {
			student.display();
		}
	}
}
