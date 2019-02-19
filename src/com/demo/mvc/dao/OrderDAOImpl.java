package com.demo.mvc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.mvc.entities.Order;

@Repository
public class OrderDAOImpl implements OrderDAO {
	
	@Autowired
	private SessionFactory factory;
	
	public List<Order> getOrders() {
		Session session = factory.getCurrentSession();
		Query query = session.createQuery("from Orders");
		List<Order> orders = query.list();
		return orders;
	}

	public void saveOrder(Order newOrder) {
		// TODO Auto-generated method stub
		
	}

	public Order getOrder(int orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteOrder(int orderID) {
		// TODO Auto-generated method stub
		
	}

}
