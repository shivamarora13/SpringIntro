package com.demo.mvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.mvc.entities.Order;
import com.demo.mvc.services.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/list")
	public String listOrder(Model model) {
		List<Order> orders = orderService.getOrders();
		model.addAttribute(orders);
		System.out.println("************************");
		System.out.println(model);
		return "list-orders";
	};
	
	@GetMapping("/newOrder")
	public String newOrder(Model model) {
		return null;
	}
	
	@PostMapping("/saveOrder")
	public String saveOrder(@ModelAttribute("order") Order order) {
		return null;
	}
	
	@GetMapping("/viewOrder")
	public String viewOrder(@RequestParam("orderId") int orderId, Model model) {
		return null;
	}
	
	@GetMapping("/deleteOrder")
	public String deleteOrder(@RequestParam("orderId") int orderId, Model model) {
		return null;
	}

}
