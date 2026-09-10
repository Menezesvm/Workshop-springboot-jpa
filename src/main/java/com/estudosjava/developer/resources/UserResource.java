package com.estudosjava.developer.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudosjava.developer.entities.User;



@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Menezes", "menezesvgm@gmail.com", "12222222", "123450");
		return ResponseEntity.ok().body(u);
	}
}
