package com.om.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.om.entities.UserEntity;

@Repository
public interface IUserRepo extends JpaRepository<UserEntity, Integer>{
	
}
