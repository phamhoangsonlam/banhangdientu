package com.lamphs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lamphs.entity.Student;


public interface StudentDAO extends JpaRepository<Student, String>{

}
