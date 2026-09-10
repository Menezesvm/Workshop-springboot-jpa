package com.estudosjava.developer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudosjava.developer.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {

}
