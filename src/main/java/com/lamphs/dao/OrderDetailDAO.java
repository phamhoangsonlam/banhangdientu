package com.lamphs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lamphs.entity.OrderDetail;

public interface OrderDetailDAO extends JpaRepository<OrderDetail, Integer>{

}
