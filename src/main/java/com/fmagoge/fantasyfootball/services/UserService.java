package com.fmagoge.fantasyfootball.services;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fmagoge.fantasyfootball.entity.User;
import com.fmagoge.fantasyfootball.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User	getUserById(int id) {
		return userRepository.findById(id).orElse(null);
	}
	
	
	public List<User> getAllUsers() {
		return StreamSupport.stream(userRepository.findAll().spliterator(), false).collect(Collectors.toList());
	}
	
	public void saveUser(User user) {
		userRepository.save(user);
	}
	
	public void deleteUser(int id) {
			userRepository.delete(userRepository.findById(id).orElse(null));
	}
}
