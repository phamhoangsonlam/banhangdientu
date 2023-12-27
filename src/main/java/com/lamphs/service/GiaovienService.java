package com.lamphs.service;

import java.util.List;

import com.lamphs.entity.Giaovien;

public interface GiaovienService {
	public List<Giaovien> findAll() ;
	
	public Giaovien findById(String maGV) ;

	public Giaovien create(Giaovien Giaovien) ;

	public Giaovien update(Giaovien Giaovien) ;

	public void delete(String maGV) ;
}
