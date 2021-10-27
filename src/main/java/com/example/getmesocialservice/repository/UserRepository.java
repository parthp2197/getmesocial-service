package com.example.getmesocialservice.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.getmesocialservice.model.User;

@Repository
public class UserRepository {
	
	@Autowired
	private UserRepository userRepository;

	public User getUser() {
		User user = new User("Parth", "Canada", "url", 24);
		return user;
	}
}
