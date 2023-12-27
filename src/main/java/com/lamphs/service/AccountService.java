package com.lamphs.service;

import java.util.List;

import com.lamphs.entity.Account;

public interface AccountService {
	
	public Account findById(String username);

	public List<Account> getAdministrators();

	public List<Account> findAll();
}
