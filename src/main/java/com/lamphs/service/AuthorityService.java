package com.lamphs.service;

import java.util.List;

import com.lamphs.entity.Authority;

public interface AuthorityService {

	public  List<Authority> findAuthoritiesOfAdministrators();

	public Authority create(Authority auth);
	
	public List<Authority> findAll();
	
	public void delete(Integer id);

}
