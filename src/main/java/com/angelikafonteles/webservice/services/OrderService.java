package com.angelikafonteles.webservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angelikafonteles.webservice.entities.Order;
import com.angelikafonteles.webservice.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repo;
	
	public List<Order> findAll(){
		return repo.findAll();
	}

	public Order findById(Long id) {
		Optional<Order> obj = repo.findById(id);
		return obj.get();
	}
}
