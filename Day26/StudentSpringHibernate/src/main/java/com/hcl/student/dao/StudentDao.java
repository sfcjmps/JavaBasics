package com.hcl.student.dao;

import com.hcl.student.model.Student;

public interface StudentDao {
	public boolean addStudent(Student st);
	public boolean updateStudent(Student st);
	public Student getStudent(int Rollnum);
}
