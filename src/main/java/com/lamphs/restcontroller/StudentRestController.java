package com.lamphs.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lamphs.service.StudentService;
import com.lamphs.entity.Student;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/danhmuc")
public class StudentRestController {
	@Autowired
	StudentService danhMucService;
	
	@GetMapping
	public List<Student> getAll() {
		return danhMucService.findAll();
	}
	
	@GetMapping("{id}")
	public Student getOne(@PathVariable("id") String id) {
		return danhMucService.findById(id);
	}
	
	@PostMapping
	public Student post(@RequestBody Student Student) {
		danhMucService.create(Student);
		return Student;
	}
	@PutMapping("{id}")
	public Student put(@PathVariable("id") String id, @RequestBody Student Student) {
		return danhMucService.update(Student);
	}
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") String id) {
		danhMucService.delete(id);
	}
}
