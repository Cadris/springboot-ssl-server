package com.sayan.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sayan.model.User;
import com.sayan.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User save(User user) {
		userRepository.save(user);
		return user;
	}
	
	public List<User> saveAll(List<User> users) {
		userRepository.saveAll(users);
		return users;
	}
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	public User getUserById(Long id) {
		return userRepository.findById(id).orElse(null);
	}
	
	public User updateUser(User user) {
		Optional<User> optionalUser = userRepository.findById(user.getUserId());
		
		if(optionalUser.isPresent()) {
			User oldUser = optionalUser.get();
			
			oldUser.setUserAddress(null);
			
			userRepository.save(oldUser);
		}
	}
	
}
