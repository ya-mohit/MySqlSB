package com.mohit.MySqlSB.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohit.MySqlSB.entity.UserEntity;
import com.mohit.MySqlSB.repository.UserRepository;
import com.mohit.MySqlSB.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserEntity addUser(UserEntity user) {
		return userRepository.save(user);
	}

	
}
