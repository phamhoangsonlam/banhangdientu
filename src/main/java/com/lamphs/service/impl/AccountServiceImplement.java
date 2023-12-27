package com.lamphs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lamphs.dao.AccountDAO;
import com.lamphs.entity.Account;
import com.lamphs.service.AccountService;

@Service
public class AccountServiceImplement implements AccountService{
	@Autowired
	AccountDAO accountDAO;
	
	@Override
	public Account findById(String username) {
		Account account = accountDAO.findById(username).get();
		return account;
	}

	public List<Account> getAdministrators() {
		return accountDAO.getAdministrators();
	}

	public List<Account> findAll() {
		return accountDAO.findAll();
	}
}
