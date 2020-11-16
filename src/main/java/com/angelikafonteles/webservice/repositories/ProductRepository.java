package com.angelikafonteles.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angelikafonteles.webservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
