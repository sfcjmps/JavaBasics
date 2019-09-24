package com.jwt.dao;

import java.util.List;
import com.jwt.model.Student;

public interface StudentDao {

	public void addStudent(Student Student);

	public List<Student> getAllStudents();

	public void deleteStudent(Integer Rollnum);

	public Student updateStudent(Student Student);

	public Student getStudent(int Rollnum);
}
