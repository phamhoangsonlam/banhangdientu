package com.lamphs.service;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.lamphs.entity.Order;

public interface OrderService {
	Order create(JsonNode orderData);

	List<Order> findByUsername(String username);
	
	Order findById(Integer id);
}
