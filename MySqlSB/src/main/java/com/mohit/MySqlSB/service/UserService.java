package com.mohit.MySqlSB.service;

import java.util.List;

import com.mohit.MySqlSB.entity.UserEntity;

public interface UserService {

	UserEntity addUser(UserEntity user);

	List<UserEntity> geUsers();

}
