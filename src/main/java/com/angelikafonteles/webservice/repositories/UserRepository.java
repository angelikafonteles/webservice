package com.angelikafonteles.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angelikafonteles.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
