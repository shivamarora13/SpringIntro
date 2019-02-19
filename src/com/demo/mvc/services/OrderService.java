package com.demo.mvc.services;

import java.util.List;

import com.demo.mvc.entities.Order;

public interface OrderService {
	
	List<Order> getOrders();
	void saveOrder(Order newOrder);
	Order getOrder(int orderId);
	void deleteOrder(int orderID);
	
}
