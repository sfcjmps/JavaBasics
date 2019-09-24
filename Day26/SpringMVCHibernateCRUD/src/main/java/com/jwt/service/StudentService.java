package com.jwt.service;

import java.util.List;

import com.jwt.model.Student;

public interface StudentService {
	
	public void addStudent(Student Student);

	public List<Student> getAllStudents();

	public void deleteStudent(Integer Rollnum);

	public Student getStudent(int Rollnum);

	public Student updateStudent(Student Student);
}
