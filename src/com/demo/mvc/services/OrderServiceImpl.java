package com.demo.mvc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.mvc.dao.OrderDAO;
import com.demo.mvc.entities.Order;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderDAO orderDao;

	@Transactional
	public List<Order> getOrders() {
		return orderDao.getOrders();
	}

	@Transactional
	public void saveOrder(Order newOrder) {
		orderDao.saveOrder(newOrder);
	}

	@Transactional
	public Order getOrder(int orderId) {
		return orderDao.getOrder(orderId);
	}

	@Transactional
	public void deleteOrder(int orderID) {
		orderDao.deleteOrder(orderID);
	}

}
