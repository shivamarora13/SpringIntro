package com.demo.mvc.entities;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	private String customer;
	
	private int price;
	
	@Column(name="date_of_order")
	private Date dateOfOrder;
	
}
