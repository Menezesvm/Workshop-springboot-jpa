package com.estudosjava.developer.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudosjava.developer.entities.OrderItem;
import com.estudosjava.developer.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>  {

}
