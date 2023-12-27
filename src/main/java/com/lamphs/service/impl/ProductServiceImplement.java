package com.lamphs.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lamphs.dao.ProductDAO;
import com.lamphs.entity.Product;
import com.lamphs.service.ProductService;

@Service
public class ProductServiceImplement implements ProductService{
	@Autowired
	ProductDAO productdao;

	@Override
	public List<Product> findAll() {
		return productdao.findAll();
	}

	@Override
	public Product findById(Integer id) {
		return productdao.findById(id).get();
	}

	@Override
	public List<Product> findByCategoryId(String cid) {
		return productdao.findByCategoryId(cid);
	}

	@Override
	public Product create(Product product) {
		return productdao.save(product);
	}

	@Override
	public Product update(Product product) {
		return productdao.save(product);
	}

	@Override
	public void delete(Integer id) {
	 productdao.deleteById(id);
	}
}
