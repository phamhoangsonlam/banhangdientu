package com.lamphs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lamphs.entity.Role;

public interface RoleDAO extends JpaRepository<Role, String>{

}
