package com.lamphs.service;

import java.util.List;

import com.lamphs.entity.Student;

public interface StudentService {
	public List<Student> findAll() ;
	
	public Student findById(String id) ;

	public Student create(Student Student) ;

	public Student update(Student Student) ;

	public void delete(String id) ;
}
