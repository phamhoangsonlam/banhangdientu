package com.lamphs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lamphs.dao.StudentDAO;
import com.lamphs.entity.Student;
import com.lamphs.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentDAO StudentDAO;
	@Override
	public List<Student> findAll() {
		return StudentDAO.findAll();
	}

	@Override
	public Student findById(String id) {
		return StudentDAO.findById(id).get();
	}

	@Override
	public Student create(Student Student) {
		return StudentDAO.save(Student);
	}

	@Override
	public Student update(Student Student) {
		return StudentDAO.save(Student);
	}

	@Override
	public void delete(String id) {
		StudentDAO.deleteById(id);
	}
}
