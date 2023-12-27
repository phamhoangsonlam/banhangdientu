package com.lamphs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lamphs.dao.GiaovienDAO;
import com.lamphs.entity.Giaovien;
import com.lamphs.service.GiaovienService;
@Service
public class GiaovienServiceImpl implements GiaovienService {
	@Autowired
	GiaovienDAO giaovienDAO;
	@Override
	public List<Giaovien> findAll() {
		return giaovienDAO.findAll();
	}

	@Override
	public Giaovien findById(String maGV) {
		return giaovienDAO.findById(maGV).get();
	}

	@Override
	public Giaovien create(Giaovien Giaovien) {
		return giaovienDAO.save(Giaovien);
	}

	@Override
	public Giaovien update(Giaovien Giaovien) {
		return giaovienDAO.save(Giaovien);
	}

	@Override
	public void delete(String maGV) {
		giaovienDAO.deleteById(maGV);
	}
}
