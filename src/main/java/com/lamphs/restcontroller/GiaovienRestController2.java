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

import com.lamphs.service.GiaovienService;
import com.lamphs.service.GiaovienService;
import com.lamphs.entity.Giaovien;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/giaovien")
public class GiaovienRestController2 {
	@Autowired
	GiaovienService danhMucService;
	
	@GetMapping
	public List<Giaovien> getAll() {
		return danhMucService.findAll();
	}
	
	@GetMapping("{maGV}")
	public Giaovien getOne(@PathVariable("maGV") String maGV) {
		return danhMucService.findById(maGV);
	}
	
	@PostMapping
	public Giaovien post(@RequestBody Giaovien Giaovien) {
		danhMucService.create(Giaovien);
		return Giaovien;
	}
	@PutMapping("{maGV}")
	public Giaovien put(@PathVariable("maGV") String maGV, @RequestBody Giaovien Giaovien) {
		return danhMucService.update(Giaovien);
	}
	@DeleteMapping("{maGV}")
	public void delete(@PathVariable("maGV") String maGV) {
		danhMucService.delete(maGV);
	}
}
