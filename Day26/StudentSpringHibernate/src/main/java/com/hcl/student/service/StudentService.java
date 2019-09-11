package com.hcl.student.service;

import com.hcl.student.model.Student;

public interface StudentService {
	public boolean addStudent(Student st);
	public boolean updateStudent(Student st);
	public Student getStudent(int Rollnum);
}
