package com.angelikafonteles.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angelikafonteles.webservice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
