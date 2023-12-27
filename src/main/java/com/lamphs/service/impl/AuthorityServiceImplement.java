package com.lamphs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lamphs.dao.AccountDAO;
import com.lamphs.dao.AuthorityDAO;
import com.lamphs.entity.Account;
import com.lamphs.entity.Authority;
import com.lamphs.service.AuthorityService;

@Service
public class AuthorityServiceImplement implements AuthorityService{
	@Autowired
	AuthorityDAO dao;
	@Autowired
	AccountDAO acDao;

	
	public Authority create(Authority auth) {
		return dao.save(auth);
	}


	
	public List<Authority> findAll() {
		
		return dao.findAll();
	}


	
	public void delete(Integer id) {
		dao.deleteById(id);
	}
	
	public List<Authority> findAuthoritiesOfAdministrators() {
		List<Account> accounts = acDao.getAdministrators();
		return dao.authoritiesOf(accounts);
	}
}
