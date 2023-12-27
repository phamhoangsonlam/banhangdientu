package com.lamphs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lamphs.entity.Category;

public interface CategoryDAO extends JpaRepository<Category, String>{

}
