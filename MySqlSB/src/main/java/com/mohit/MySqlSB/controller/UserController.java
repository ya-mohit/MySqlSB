package com.mohit.MySqlSB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mohit.MySqlSB.entity.UserEntity;
import com.mohit.MySqlSB.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/")
	UserEntity addUser(@RequestBody UserEntity user) {
		return userService.addUser(user);
	}
	
	
}