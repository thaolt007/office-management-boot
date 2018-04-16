package com.om.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.om.entity.UserEntity;

public interface IUserRepo extends JpaRepository<UserEntity, Integer>{
	UserEntity getUserByUserName(String username);
	void saveUser(UserEntity user);
}
