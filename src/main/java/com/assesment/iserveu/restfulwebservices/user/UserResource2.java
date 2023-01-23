package com.assesment.iserveu.restfulwebservices.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import jakarta.validation.Valid;





@RestController
public class UserResource2 {
	@Autowired
		public UserDaoService2 service;
	
	
		
		
		@GetMapping("/users_details")
		public List<User2> retrieveAllUsers() {
			return service.findAll();

		}
		@DeleteMapping("/users_details/{id}")
		public void deleteUser(@PathVariable int id) {
			service.deleteById(id);

		}
		@PostMapping("/users_details")
		public void createUser(@Valid @RequestBody User2 user) {
			 service.save(user);
		
		}
		@GetMapping("/users_details/{id}")
		public User2 retrieveById(@PathVariable int id) {
			return service.findOne(id);
		}

}

