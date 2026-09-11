package com.estudosjava.developer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudosjava.developer.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>  {

}
