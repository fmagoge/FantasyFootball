package com.fmagoge.fantasyfootball.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fmagoge.fantasyfootball.entity.User;
import com.fmagoge.fantasyfootball.services.UserService;

@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/{id}")
	private User getUser(@PathVariable(value = "id") int id) {
		return userService.getUserById(id);
	}

	@GetMapping
	private List<User> getUsers() {
		return userService.getAllUsers();
	}

	@PostMapping
	private void saveUser(@RequestBody User user) {
		userService.saveUser(user);
	}

	@DeleteMapping("/{id}")
	private void deleteUser(@PathVariable(value = "id") int id) {
		userService.deleteUser(id);
	}
}
