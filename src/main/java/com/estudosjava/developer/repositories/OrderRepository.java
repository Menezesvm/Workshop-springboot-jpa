package com.estudosjava.developer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudosjava.developer.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>  {

}
