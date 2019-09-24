package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.StudentDao;
import com.jwt.model.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao StudentDAO;

	@Override
	@Transactional
	public void addStudent(Student Student) {
		StudentDAO.addStudent(Student);
	}

	@Override
	@Transactional
	public List<Student> getAllStudents() {
		return StudentDAO.getAllStudents();
	}

	@Override
	@Transactional
	public void deleteStudent(Integer Rollnum) {
		StudentDAO.deleteStudent(Rollnum);
	}

	public Student getStudent(int Rollnum) {
		return StudentDAO.getStudent(Rollnum);
	}

	public Student updateStudent(Student Student) {
		// TODO Auto-generated method stub
		return StudentDAO.updateStudent(Student);
	}

	public void setStudentDAO(StudentDao StudentDAO) {
		this.StudentDAO = StudentDAO;
	}

}
