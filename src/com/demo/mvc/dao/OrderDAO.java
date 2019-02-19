package com.demo.mvc.dao;

import java.util.List;

import com.demo.mvc.entities.Order;

public interface OrderDAO {
	
	List<Order> getOrders();
	void saveOrder(Order newOrder);
	Order getOrder(int orderId);
	void deleteOrder(int orderID);
	
}
