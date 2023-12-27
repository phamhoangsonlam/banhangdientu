package com.lamphs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lamphs.dao.RoleDAO;
import com.lamphs.entity.Role;
import com.lamphs.service.RoleService;

@Service
public class RoleServiceImplement implements RoleService{
	@Autowired
	RoleDAO roleDAO;

	public List<Role> findAll() {
		return roleDAO.findAll();
	}
}
