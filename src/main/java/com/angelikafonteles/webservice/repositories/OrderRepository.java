package com.angelikafonteles.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angelikafonteles.webservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
