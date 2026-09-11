package com.estudosjava.developer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudosjava.developer.entities.Category;
import com.estudosjava.developer.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>  {

}
