package com.mohit.MySqlSB.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mohit.MySqlSB.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{

}
