package com.om.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.om.entities.UserEntity;

@Repository
public interface IUserRepo extends CrudRepository<UserEntity, Integer>{
	
}
